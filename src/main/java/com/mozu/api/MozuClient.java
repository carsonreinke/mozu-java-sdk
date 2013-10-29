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
import com.mozu.api.security.Authentication;
import com.mozu.api.utils.ConfigProperties;
import com.mozu.api.utils.Helper;

public class MozuClient<TResult> {

	private String baseAddress = null;
	private String jsonBody = null;
	private String verb = null;
	private String resourceUrl = null;
	private HttpResponse response = null;
	private Request request = null;
	private HashMap<String, String> headers = new HashMap<String, String>();
	private ApiError apiError = new ApiError();
	private final Class<TResult> responseType;

	public MozuClient() {
		this.responseType = null;
	}

	public MozuClient (Class<TResult> responseType) throws Exception {
		this.responseType = responseType;
	}

	public void setBaseAddress(String baseAddress) {
		this.baseAddress = baseAddress;
	}

    public void setContext(ApiContext appContext) {
        
        setBaseAddress(appContext.getBaseUrl());
        setContext(appContext.getTenantId(), appContext.getSiteGroupId(), appContext.getSiteId());
    }

    public void setContext(int tenantId) {
		setHeader(Headers.X_VOL_TENANT, String.valueOf(tenantId));
	}

	public void setContext(int tenantId, int siteGroupId) {
		setHeader(Headers.X_VOL_TENANT, String.valueOf(tenantId));
		setHeader(Headers.X_VOL_SITEGROUP, String.valueOf(siteGroupId));
	}

	public void setContext(int tenantId, int siteGroupId, int siteId) {
		setHeader(Headers.X_VOL_TENANT, String.valueOf(tenantId));
		if (siteGroupId != 0) {
		    setHeader(Headers.X_VOL_SITEGROUP, String.valueOf(siteGroupId));
		} 
		if (siteId != 0) {
		    setHeader(Headers.X_VOL_SITE, String.valueOf(siteId));
		}
	}

	public void setHeader(String header, String value) {
		this.headers.put(header, value);
	}

	public void setVerb(String verb) {
		this.verb = verb;
	}

	public void setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
	}

	public <TBody> void setBody(TBody body) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		jsonBody = mapper.writeValueAsString(body);
	}

	public void setBody(String body) {
		jsonBody = body;
	}

	public String getStringResult() throws Exception {
		return stringContent();
	}

	public TResult getResult() throws Exception {
		return deserialize(getStringResult(), responseType);
	}

	public HttpResponse getResponse() {
		return response;
	}

	public Request getRequest() throws Exception {
		return buildRequest();
	}

	public void executeRequest() throws Exception {
		buildRequest();
		String proxyHost = ConfigProperties.getStringProperty(ConfigProperties.PROXY_HOST);
				
		if (StringUtils.isNotBlank(proxyHost)) {
			int proxyPort = ConfigProperties.getIntProperty(ConfigProperties.PROXY_PORT);
			HttpHost proxy = new HttpHost(proxyHost, proxyPort);
			request.viaProxy(proxy);
		}
		response = request.execute().returnResponse();
		ensureSuccess();
	}

	private TResult deserialize(String jsonString, Class<TResult> cls)
			throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(jsonString, cls);
	}

	private void ensureSuccess() throws Exception {
		int statusCode = ((HttpResponse) response).getStatusLine()
				.getStatusCode();

		if (statusCode < 200 || statusCode > 300) {
			String content = stringContent();
			ObjectMapper mapper = new ObjectMapper();
			apiError = mapper.readValue(content, apiError.getClass());
			throw new Exception("Mozu Error: "
					+ apiError.getExceptionDetail().getMessage());
		}
	}

	private String stringContent() throws Exception {
		HttpEntity httpEntity = response.getEntity();
		InputStream stream = (InputStream) httpEntity.getContent();
		return Helper.getStringFromInputStream(stream);
	}

	private Request buildRequest() throws Exception {
		String url = baseAddress + resourceUrl;
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

		if ((verb.equals("POST") || verb.equals("PUT")) && StringUtils.isNotBlank(jsonBody)) {
			request.bodyString(jsonBody, ContentType.APPLICATION_JSON);
		}

		Iterator<Entry<String, String>> i = headers.entrySet().iterator();
		while (i.hasNext()) {
			Entry<String, String> header = i.next();
			request.addHeader(header.getKey(), header.getValue());
		}
		
		Authentication.addAuthHeader(request);
		request.addHeader(Headers.X_VOL_VERSION, Version.API_VERSION);

		return request;
	}
}
