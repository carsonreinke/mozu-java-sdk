/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/

package com.mozu.api.resources;

import org.apache.commons.lang.StringUtils;

import com.mozu.api.ApiContext;
import com.mozu.api.ApiException;
import com.mozu.api.MozuClient;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.resources.platform.TenantResource;

public class BaseResource {

	protected void setContext(ApiContext context, MozuClient<?> client, boolean useTenantUrl) throws Exception {
		validateContext(useTenantUrl, context);
		client.setBaseAddress(context.getTenantUrl());
		client.setContext(context.getTenantId(), context.getSiteGroupId(), context.getSiteId());
	}

	 private void validateContext(boolean useTenantUrl, ApiContext context) throws Exception
     {
         if (useTenantUrl)
         {
             if (context.getTenantId() <= 0)
                 throw new ApiException("TenantId is missing");

             if (context.getTenantUrl() == null ||  context.getTenantUrl().trim().equals(""))
             {
                 TenantResource tenantResource = new TenantResource(context);
                 Tenant tenant = tenantResource.getTenant(context.getTenantId());

                 if (tenant == null)
                     throw new ApiException("Tenant "+context.getTenantId()+" Not found");
                 context.setContext(tenant);
             }
         }
         else
         {
             if (StringUtils.isBlank(context.getBaseUrl()))
                 throw new ApiException("Base Url is missing");
         }
     }
}