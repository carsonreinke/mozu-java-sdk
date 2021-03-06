package com.mozu.api;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpRequest;

import com.mozu.api.contracts.tenant.Site;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.utils.HttpHelper;

public class MozuApiContext implements ApiContext {

    private Integer tenantId = 0;
    private Integer siteId = 0;
    private String tenantUrl = null;
    private String siteUrl = null;
    private String correlationId = null;
    private String hmacSha256 = null;
    private String appAuthTicket = null;
    private Integer masterCatalogId = null;
    private Integer catalogId = null; 
    private Tenant tenant = null;

    public MozuApiContext() {
    }

    public MozuApiContext(Integer tenantId, Integer siteId, Integer masterCatalogId, Integer catalogId)
            throws ApiException {
        this.tenantId = tenantId;
        this.siteId = siteId;
        this.masterCatalogId = masterCatalogId;
        this.catalogId = catalogId;
    }

    public MozuApiContext(Integer tenantId, Integer siteId)
            throws ApiException {
        this(tenantId, siteId, null, null);
    }

    public MozuApiContext(Integer tenantId)
            throws ApiException {
        this(tenantId, null, null, null);
    }

    public MozuApiContext(Tenant tenant)
            throws ApiException {
        this(tenant, null, null, null);
    }

    public MozuApiContext(Tenant tenant, Site site, Integer masterCatalogId, Integer catalogId)
            throws ApiException {
        this(tenant == null ? null : tenant.getId(), site == null ? null : site.getId(), masterCatalogId, catalogId);        this.tenantUrl = HttpHelper.getUrl(tenant.getDomain());

        if (site != null && site.getId() >= 0) {
            this.siteUrl = HttpHelper.getUrl(site.getDomain());
        }
    }

    public MozuApiContext(Site site, Integer masterCatalogId, Integer catalogId) throws ApiException {
        this.tenantId = site.getTenantId();

        if (site != null && site.getId() >= 0) {
            this.siteId = site.getId();
            this.siteUrl = HttpHelper.getUrl(site.getDomain());
        }
        this.masterCatalogId = masterCatalogId;
        this.catalogId = catalogId;
    }

    public MozuApiContext(Map<String, String> headers)
            throws ApiException {
        this.tenantUrl = headers.get(Headers.X_VOL_TENANT_DOMAIN);
        this.siteUrl = headers.get(Headers.X_VOL_SITE_DOMAIN);
        this.tenantId = Integer.getInteger(headers.get(Headers.X_VOL_TENANT));
        this.siteId = Integer.getInteger(headers.get(Headers.X_VOL_SITE));
        this.correlationId = headers.get(Headers.X_VOL_CORRELATION);
        this.hmacSha256 = headers.get(Headers.X_VOL_HMAC_SHA256);

        String masterCatalogStr = headers.get(Headers.X_VOL_MASTER_CATALOG);
        if (masterCatalogStr != null)
        {
            this.masterCatalogId = Integer.getInteger(masterCatalogStr);
        }

        String catalogStr = headers.get(Headers.X_VOL_CATALOG);
        if (catalogStr != null) {
            this.catalogId = Integer.getInteger(catalogStr);
        }

        this.tenantUrl = HttpHelper.getUrl(tenantUrl);

        this.siteUrl = HttpHelper.getUrl(siteUrl);

    }

    public MozuApiContext (HttpRequest request) throws ApiException {
        tenantUrl = getHeaderValue(Headers.X_VOL_TENANT_DOMAIN, request);
        siteUrl = getHeaderValue(Headers.X_VOL_SITE_DOMAIN, request);
        tenantId = getHeaderValueInt(Headers.X_VOL_TENANT, request);
        siteId = getHeaderValueInt(Headers.X_VOL_SITE, request);
        correlationId = getHeaderValue(Headers.X_VOL_CORRELATION, request);
        hmacSha256 = getHeaderValue(Headers.X_VOL_HMAC_SHA256, request);
        masterCatalogId = getHeaderValueInt(Headers.X_VOL_MASTER_CATALOG, request);
        catalogId = getHeaderValueInt(Headers.X_VOL_CATALOG, request);

        this.tenantUrl = HttpHelper.getUrl(tenantUrl);

        siteUrl = HttpHelper.getUrl(siteUrl);
    }

    public MozuApiContext (HttpServletRequest request) throws ApiException {
        tenantUrl = request.getHeader(Headers.X_VOL_TENANT_DOMAIN);
        siteUrl = request.getHeader(Headers.X_VOL_SITE_DOMAIN);
        tenantId = request.getIntHeader(Headers.X_VOL_TENANT);
        siteId = request.getIntHeader(Headers.X_VOL_SITE);
        correlationId = request.getHeader(Headers.X_VOL_CORRELATION);
        hmacSha256 = request.getHeader(Headers.X_VOL_HMAC_SHA256);
        masterCatalogId = request.getIntHeader(Headers.X_VOL_MASTER_CATALOG);
        catalogId = request.getIntHeader(Headers.X_VOL_CATALOG);

         tenantUrl = HttpHelper.getUrl(tenantUrl);

         siteUrl = HttpHelper.getUrl(siteUrl);
    }
    public Integer getTenantId() {
        return tenantId;
    }

    public Integer getSiteId() {
        return siteId;
    }

    public String getTenantUrl() {
        return tenantUrl;
    }

    public String getSiteUrl() {
        return siteUrl;
    }

    public String getCorrelationId() {
        return correlationId;
    }

    public String getHMACSha256() {
        return hmacSha256;
    }

    public String getAppAuthTicket() {
        return this.appAuthTicket;
    }

    public Integer getMasterCatalogId() {
        return masterCatalogId;
    }

    public Integer getCatalogId() {
        return catalogId;
    }

    public Tenant getTenant() {
        return tenant;
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
