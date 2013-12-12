package com.mozu.api;

import com.mozu.api.contracts.tenant.Tenant;

public interface ApiContext {
    /**
     * Get the current tenantID 
     * @return
     */
    Integer getTenantId ();
    
    /**
     * get the current Site ID
     * @return current site ID
     */
    Integer getSiteId();
    
    /**
     * Get the tenant URL
     * @return tenant URL
     */
    String getTenantUrl ();
    
    /**
     * get the URL for the Site
     * @return Site URL
     */
    String getSiteUrl ();
    
    /**
     * 
     * @return
     */
    String getCorrelationId ();
    
    /**
     * 
     * @return the current HMAC SHA 256 
     */
    String getHMACSha256 ();
    
    /**
     * The application authorization ticket
     * @return application authorization ticket
     */
    String getAppAuthTicket ();
    
    /**
     * 
     * @return
     */
    Integer getMasterCatalogId();
    
    /**
     * 
     * @return
     */
    Integer getCatalogId();
    
   
    /**
     * Get the current tenant
     * @return null if there is not a current tenant, otherwise return a tenant.
     */
    Tenant getTenant ();

}
