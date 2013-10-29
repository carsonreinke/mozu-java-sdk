package com.mozu.api.security;

import java.io.IOException;

import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;
import org.joda.time.DateTime;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mozu.api.ApiContext;
import com.mozu.api.ApiError;
import com.mozu.api.ApiException;
import com.mozu.api.Headers;
import com.mozu.api.contracts.appdev.AppAuthInfo;
import com.mozu.api.contracts.appdev.AuthTicket;
import com.mozu.api.contracts.appdev.AuthTicketRequest;
import com.mozu.api.urls.platform.applications.AuthTicketUrl;
import com.mozu.api.utils.ConfigProperties;

public class Authentication {
	private static volatile Authentication auth;
	
	protected static Object lockObj = new Object();

	private AppAuthInfo appAuthInfo = null;
	
	private HttpHost proxyHttpHost = null;
	
	private ApiContext apiContext = null;
	
	private AuthTicket appAuthTicket = null;
	
	private RefreshInterval refreshInterval = null;

	private Authentication(AppAuthInfo appAuthInfo, String baseUrl) {
		this (appAuthInfo, baseUrl, null, null);
	}

	private Authentication(AppAuthInfo appAuthInfo, String baseUrl, RefreshInterval refreshInterval, HttpHost proxyHttpHost) {
		apiContext = new ApiContext(baseUrl);
		this.appAuthInfo = appAuthInfo;
		this.refreshInterval = refreshInterval;
		this.proxyHttpHost = proxyHttpHost;
	}
	
	/**
	 * Initialize from mozu_config.properties file
	 * @throws ApiException
	 */
    public static void initialize() throws ApiException {
    	HttpHost proxyHttpHost = null;
    	String proxyHost = ConfigProperties.getStringProperty(ConfigProperties.PROXY_HOST);
    	if (StringUtils.isNotBlank(proxyHost)) {
        	int proxyPort = ConfigProperties.getIntProperty(ConfigProperties.PROXY_PORT);
    		proxyHttpHost = new HttpHost(proxyHost, proxyPort);
    	}
    	
    	AppAuthInfo appAuthInfo = new AppAuthInfo();
    	appAuthInfo.setApplicationId(ConfigProperties.getStringProperty(ConfigProperties.APP_ID));
    	appAuthInfo.setSharedSecret(ConfigProperties.getStringProperty(ConfigProperties.SHARED_SECRET));
    	
    	initialize(appAuthInfo, ConfigProperties.getStringProperty(ConfigProperties.MOZU_BASE_URL), 
    			null, proxyHttpHost);
	}
	
	
    public static void initialize(AppAuthInfo appAuthInfo, String baseAppAuthUrl) throws ApiException {
    	initialize(appAuthInfo, baseAppAuthUrl, null, null);
	}

    public static void initialize(AppAuthInfo appAuthInfo, String baseAppAuthUrl, RefreshInterval refreshInterval, HttpHost httpProxyHost) throws ApiException
    {
        if (auth == null)
        {
            synchronized (lockObj)
            {
                if (auth == null)
                {
                	auth = new Authentication(appAuthInfo, baseAppAuthUrl, refreshInterval, httpProxyHost);
                	auth.authenticateApp();
                }
            }
        }
    }
    
    public static void invalidateAuth () {
    	auth = null;
    }
	
	public void authenticateApp() throws ApiException {
        String resourceUrl = apiContext.getBaseUrl() + AuthTicketUrl.authenticateAppUrl();

        Request client = Request.Post(resourceUrl);

		ObjectMapper mapper = new ObjectMapper();
		try {
			client.bodyString(mapper.writeValueAsString(this.appAuthInfo), ContentType.APPLICATION_JSON);
		} catch (JsonProcessingException jpe) {
			throw new ApiException("JSON error proccessing authentication: " + jpe.getMessage()); 
		}

		if (proxyHttpHost != null) {
			client.viaProxy(proxyHttpHost);
		}
		
		HttpResponse response = null;
		try {
			response = client.execute().returnResponse();
		} catch (IOException ioe) {
			throw new ApiException("IO Exception occurred while authenticating application: " + ioe.getMessage());
		}
        ensureSuccess(response);

		try {
			appAuthTicket = mapper.readValue(response.getEntity().getContent(), AuthTicket.class);
		} catch (JsonParseException jpe) {
			throw new ApiException("JSON error while deserializing Auth ticket : " + jpe.getMessage());
		} catch (IOException ioe) {
			throw new ApiException("IO Exception occurred while authenticating application: " + ioe.getMessage());
		}

        setRefreshIntervals(true);
	}
		
    private void setRefreshIntervals(boolean updateRefreshTokenInterval)
    {
        if (refreshInterval == null) {
            refreshInterval = new RefreshInterval (new DateTime().minus(appAuthTicket.getAccessTokenExpiration().getTime()).getMillis() - 180000, new DateTime().minus(appAuthTicket.getRefreshTokenExpiration().getTime()).getMillis() - 180000);
        }

        refreshInterval.setAccessTokenExpiration (
            new DateTime().plus(refreshInterval.getAccessTokenExpirationInterval()));

        if (updateRefreshTokenInterval) {
            refreshInterval.setRefreshTokenExpiration (
                 new DateTime().plus(refreshInterval.getRefreshTokenExpirationInterval()));
        }
    }
    /**
     * jh the application auth ticket using the refresh token
     */
    public void refreshAppAuthTicket() throws ApiException {

        String resourceUrl = AuthTicketUrl.refreshAppAuthTicketUrl();

        Request client = Request.Put(resourceUrl);

        AuthTicketRequest authTicketRequest = new AuthTicketRequest (); 
        authTicketRequest.setRefreshToken(appAuthTicket.getRefreshToken());
		ObjectMapper mapper = new ObjectMapper();
		try {
			client.bodyString(mapper.writeValueAsString(authTicketRequest), ContentType.APPLICATION_JSON);
		} catch (JsonProcessingException jpe) {
			throw new ApiException("JSON error proccessing authentication: " + jpe.getMessage()); 
		}

		HttpResponse response = null;
		try {
			response = client.execute().returnResponse();
		} catch (IOException ioe) {
			throw new ApiException("IO Exception occurred while authenticating application: " + ioe.getMessage());
		}
        ensureSuccess(response);

		try {
			appAuthTicket = mapper.readValue(response.getEntity().getContent(), AuthTicket.class);
		} catch (JsonParseException jpe) {
			throw new ApiException("JSON error while deserializing Auth ticket : " + jpe.getMessage());
		} catch (IOException ioe) {
			throw new ApiException("IO Exception occurred while authenticating application: " + ioe.getMessage());
		}

        setRefreshIntervals(false);
    }
    /**
     * Ensure that the auth ticket is valid.  If not, then make it so.  Will be used when not using timers to keep the auth ticket alive (i.e. "on demand" mode).
     * @throws ApiException 
    */ 
    public void ensureAuthTicket() throws ApiException { 
        synchronized (lockObj) 
        {
            if (appAuthTicket == null || refreshInterval.getAccessTokenExpiration().isBeforeNow())
                authenticateApp();
            else if (refreshInterval.getAccessTokenExpiration().isBeforeNow())
                refreshAppAuthTicket();
        }
    }
	
    public static void addAuthHeader(Request requestMsg) throws ApiException
    {
        if (auth == null)
            throw new ApiException("AppAuthTicketKeepAlive Not Initialized");

        auth.ensureAuthTicket();
        requestMsg.addHeader(Headers.X_VOL_APP_CLAIMS, auth.getAppAuthTicket().getAccessToken());
    }
	
	public AuthTicket getAppAuthTicket() {
		return this.appAuthTicket;
	}
	
	public HttpHost getProxyHttpHost() {
		return proxyHttpHost;
	}

	public void setProxyHttpHost(HttpHost proxyHttpHost) {
		this.proxyHttpHost = proxyHttpHost;
	}

	private void ensureSuccess(HttpResponse response) throws ApiException {
		int statusCode = response.getStatusLine().getStatusCode();

		if (statusCode < 200 || statusCode > 300) {
			ObjectMapper mapper = new ObjectMapper();
			try {
				ApiError apiError = mapper.readValue(response.getEntity().getContent(), ApiError.class);
				throw new ApiException("Mozu Error: "
						+ apiError.getExceptionDetail().getMessage(), apiError);
			} catch (JsonProcessingException jpe) {
				throw new ApiException("Mozu Error: Unable to deserialize JSON: "
						+ jpe.getMessage());
			} catch (IOException ioe) {
				throw new ApiException("Mozu Error: IO Exception deserializing JSON: "
						+ ioe.getMessage());
			}
		}
	}

	
}
