package com.mozu.api;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.resources.platform.TenantResource;
import com.mozu.api.security.AppAuthenticator;
import com.mozu.api.security.AuthTicket;
import com.mozu.api.security.AuthenticationProfile;
import com.mozu.api.security.UserAuthenticator;
import com.mozu.api.utils.ConfigProperties;
import com.mozu.api.utils.HttpHelper;
import com.mozu.api.utils.JsonUtils;

public class MozuClient<TResult> {
    private static final ObjectMapper mapper = JsonUtils.initObjectMapper();

    static private HttpHost proxyHttpHost = HttpHelper.getProxyHost();

    private ApiContext apiContext = null;
    private String baseAddress = null;
    private HttpResponse httpResponseMessage = null;
    private String httpContent = null;
    private InputStream streamContent = null;
    private String verb = null;
    private MozuUrl resourceUrl = null;
    private Request request = null;
    private HashMap<String, String> headers = new HashMap<String, String>();
    private final Class<TResult> responseType;

    public MozuClient() {
        this.responseType = null;
    }

    public MozuClient(Class<TResult> responseType) throws Exception {
        this.responseType = responseType;
    }

    public void setContext(ApiContext apiContext) {
        this.apiContext = apiContext;

        if (apiContext.getTenantId() > 0) {
            addHeader(Headers.X_VOL_TENANT, String.valueOf(apiContext.getTenantId()));
        }

        if (apiContext.getSiteId() != null && apiContext.getSiteId() > 0) {
            addHeader(Headers.X_VOL_SITE, String.valueOf(apiContext.getSiteId()));
        }

        if (apiContext.getMasterCatalogId() != null && apiContext.getMasterCatalogId() > 0) {
            addHeader(Headers.X_VOL_MASTER_CATALOG, String.valueOf(apiContext.getMasterCatalogId()));
        }

        if (apiContext.getCatalogId() != null && apiContext.getCatalogId() > 0) {
            addHeader(Headers.X_VOL_CATALOG, String.valueOf(apiContext.getCatalogId()));
        }

    }

    public void setUserAuth(AuthTicket authTicket) {
    
    	AuthenticationProfile authProfile = UserAuthenticator.ensureAuthTicket(authTicket);
    	if (authProfile != null) {
    		authTicket.setAccessToken(authProfile.getAuthTicket().getAccessToken());
    		authTicket.setAccessTokenExpiration(authProfile.getAuthTicket().getAccessTokenExpiration());
    	}
    	addHeader(Headers.X_VOL_USER_CLAIMS, authTicket.getAccessToken());
    }
    
    public void setBaseAddress(String baseAddress) {
        this.baseAddress = baseAddress;
    }

    public void addHeader(String header, String value) {
        headers.put(header, value);
    }

    public void setVerb(String verb) {
        this.verb = verb;
    }

    public void setResourceUrl(MozuUrl resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    public <TBody> void setBody(TBody body) throws JsonProcessingException {
        httpContent = mapper.writeValueAsString(body);
    }

    public void setBody(InputStream body) throws JsonProcessingException {
        streamContent = body;
    }

    public void setBody(String body) {
        httpContent = body;
    }

    public String getStringResult() throws Exception {
        return stringContent();
    }

    @SuppressWarnings("unchecked")
    public TResult getResult() throws Exception {
        TResult tResult = null;
        if (responseType != null) {
            String className = responseType.getName();
            if (className.equals(java.io.InputStream.class.getName())) {
                tResult = (TResult) httpResponseMessage.getEntity().getContent();
            } else {
                tResult = deserialize(getStringResult(), responseType);
            }
        }
        return tResult;
    }

    public HttpResponse getResponse() {
        return httpResponseMessage;
    }

    public Request getRequest() throws Exception {
        return buildRequest();
    }

    protected void validateContext() throws Exception {
        if (resourceUrl.getLocation() == MozuUrl.UrlLocation.TENANT_POD) {
            if (apiContext.getTenantId() <= 0)
                throw new ApiException("TenantId is missing");

            if (StringUtils.isBlank(apiContext.getTenantUrl())) {
                TenantResource tenantResource = new TenantResource();
                Tenant tenant = tenantResource.getTenant(apiContext.getTenantId(), null);

                if (tenant == null)
                    throw new ApiException("Tenant " + apiContext.getTenantId() + " Not found");
                baseAddress = HttpHelper.getUrl(tenant.getDomain());
            } else {
                baseAddress = apiContext.getTenantUrl();
            }
        } else {
            if (StringUtils.isBlank(AppAuthenticator.getInstance().getBaseUrl()))
                throw new ApiException("Authentication.Instance.BaseUrl is missing");

            baseAddress = AppAuthenticator.getInstance().getBaseUrl();
        }
    }

    public void executeRequest() throws Exception {
        validateContext();

        buildRequest();
        String proxyHost = ConfigProperties.getStringProperty(ConfigProperties.PROXY_HOST);

        if (StringUtils.isNotBlank(proxyHost)) {
            int proxyPort = ConfigProperties.getIntProperty(ConfigProperties.PROXY_PORT);
            HttpHost proxy = new HttpHost(proxyHost, proxyPort);
            request.viaProxy(proxy);
        }
        httpResponseMessage = request.execute().returnResponse();
        HttpHelper.ensureSuccess(httpResponseMessage, mapper);
    }

    private TResult deserialize(String jsonString, Class<TResult> cls) throws Exception {
        return mapper.readValue(jsonString, cls);
    }

    private String stringContent() throws Exception {
        HttpEntity httpEntity = httpResponseMessage.getEntity();
        InputStream stream = (InputStream) httpEntity.getContent();
        return org.apache.commons.io.IOUtils.toString(stream, "UTF-8");
    }

    private Request buildRequest() throws Exception {
        String url = baseAddress + resourceUrl.getUrl();
        if (verb.equals("GET")) {
            request = Request.Get(url);
        } else if (verb.equals("PUT")) {
            request = Request.Put(url);
        } else if (verb.equals("POST")) {
            request = Request.Post(url);
        } else if (verb.equals("DELETE")) {
            request = Request.Delete(url);
        } else {
            throw new Exception("Not implemented");
        }

        if (verb.equals("POST") || verb.equals("PUT")) {
            if (StringUtils.isNotBlank(httpContent)) {
                request.bodyString(httpContent, ContentType.APPLICATION_JSON);
            } else if (this.streamContent != null) {
                request.bodyStream(this.streamContent);
            }
        }

        Iterator<Entry<String, String>> i = headers.entrySet().iterator();
        while (i.hasNext()) {
            Entry<String, String> header = i.next();
            request.addHeader(header.getKey(), header.getValue());
        }

        AppAuthenticator.addAuthHeader(request);
        request.addHeader(Headers.X_VOL_VERSION, Version.API_VERSION);

        if (proxyHttpHost != null) {
            request.viaProxy(proxyHttpHost);
        }
        
        return request;
    }
}
