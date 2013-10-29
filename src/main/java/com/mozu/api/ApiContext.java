package com.mozu.api;

import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpRequest;

import com.mozu.api.contracts.tenant.Domain;
import com.mozu.api.contracts.tenant.Site;
import com.mozu.api.contracts.tenant.SiteGroup;
import com.mozu.api.contracts.tenant.Tenant;

public class ApiContext  {

	private String baseUrl;
	private int tenantId = 0;
	private int siteGroupId = 0;
	private int siteId = 0;
	private String tenantUrl = null;
	private String siteUrl = null;
	private String correlationId = null;
	private String hmacSha256 = null;
    
	public ApiContext (String baseUrl) {
		this.baseUrl = baseUrl;
	}
	
    public static String getUrl(Domain domain)
    {
        return "http://" + domain.getDomainName();
    }
    
    public void setContext(Tenant tenant) {
    	tenantId = tenant.getId();
    	tenantUrl = getUrl(tenant.getDomain());

    	if (siteId >= 0 && siteGroupId <=0) {
    		for(SiteGroup siteGroup : tenant.getSiteGroups()) {
    			for(Site site : siteGroup.getSites()) {
    				if (site.getId() == siteId) {
    					siteGroupId = site.getSiteGroupId();
    					for(Domain domain:site.getDomains()) {
    						if (domain.getIsSystemAssigned()) {
    							siteUrl = getUrl(domain);
    							break;
    						}
    					}
    					break;
    				}
    			}
    			if (siteGroupId > 0)
    				break;
    		}
    	}
    }
    
    public void setContext(Site site)
    {
        this.siteId = site.getId();
        this.siteGroupId = site.getSiteGroupId();
        this.tenantId = site.getTenantId();

		for(Domain domain:site.getDomains()) {
			if (domain.getIsSystemAssigned()) {
				siteUrl = getUrl(domain);
				break;
			}
		}
    }

    
    public void setContextFromHeaders(HttpRequest request)
    {
    	tenantUrl = getHeaderValue(Headers.X_VOL_TENANT_DOMAIN, request);
    	siteUrl = getHeaderValue(Headers.X_VOL_SITE_DOMAIN, request);
    	correlationId = getHeaderValue(Headers.X_VOL_CORRELATION, request);
        hmacSha256 = getHeaderValue(Headers.X_VOL_HMAC_SHA256, request);
        
        tenantId = getHeaderValueInt(Headers.X_VOL_TENANT, request);
        siteId = getHeaderValueInt(Headers.X_VOL_SITE, request);
        siteGroupId = getHeaderValueInt(Headers.X_VOL_SITEGROUP, request);
        
        if (StringUtils.isNotBlank(tenantUrl))
            tenantUrl = "Http://"+tenantUrl;

        if (StringUtils.isNotBlank(siteUrl))
            siteUrl = "http://"+siteUrl;
    }
    
    public String getBaseUrl() {
		return baseUrl;
	}

	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	public int getTenantId() {
		return tenantId;
	}

	public void setTenantId(int tenantId) {
		this.tenantId = tenantId;
	}

	public int getSiteGroupId() {
		return siteGroupId;
	}

	public void setSiteGroupId(int siteGroupId) {
		this.siteGroupId = siteGroupId;
	}

	public int getSiteId() {
		return siteId;
	}

	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}

	public String getTenantUrl() {
		return tenantUrl;
	}

	public void setTenantUrl(String tenantUrl) {
		this.tenantUrl = tenantUrl;
	}

	public String getSiteUrl() {
		return siteUrl;
	}

	public void setSiteUrl(String siteUrl) {
		this.siteUrl = siteUrl;
	}

	public String getCorrelationId() {
		return correlationId;
	}

	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}

	public String getHmacSha256() {
		return hmacSha256;
	}

	public void setHmacSha256(String hmacSha256) {
		this.hmacSha256 = hmacSha256;
	}

	private String getHeaderValue(String header, HttpRequest request) {
    	if (request.containsHeader(header))
    		return (request.getFirstHeader(header)).getValue();
    	else
    		return null;
    }
    
    private static Integer getHeaderValueInt(String header, HttpRequest request) {
    	if (request.containsHeader(header))
    		return Integer.parseInt((request.getFirstHeader(header)).getValue());
    	else
    		return null;
    }
}
