package com.mozu.api.security;

import java.io.IOException;

import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;
import org.joda.time.DateTime;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mozu.api.ApiException;
import com.mozu.api.Headers;
import com.mozu.api.contracts.customer.CustomerAuthTicket;
import com.mozu.api.contracts.customer.CustomerUserAuthInfo;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.resources.platform.TenantResource;
import com.mozu.api.urls.commerce.customer.CustomerAuthTicketUrl;
import com.mozu.api.utils.HttpHelper;
import com.mozu.api.utils.JsonUtils;

public class CustomerAuthenticator {
    private static ObjectMapper mapper = JsonUtils.initObjectMapper();
    
    private static HttpHost proxyHttpHost = HttpHelper.getProxyHost();

    public static CustomerAuthenticationProfile ensureAuthTicket(AuthTicket authTicket) {
        DateTime accessTokenDateTime = new DateTime(authTicket.getAccessTokenExpiration()).minus(180000);
        if (accessTokenDateTime.isBeforeNow())
            return refreshUserAuthTicket(authTicket);

        return null;
    }

    public static CustomerAuthenticationProfile refreshUserAuthTicket(AuthTicket authTicket) {
        return refreshUserAuthTicket(authTicket, null);
    }

    public static CustomerAuthenticationProfile refreshUserAuthTicket(AuthTicket authTicket, Integer tenantId)
            throws ApiException {

        String resourceUrl = getTenantDomain(tenantId)
                + CustomerAuthTicketUrl.refreshUserAuthTicketUrl(authTicket.getRefreshToken()).getUrl();

        Request client = Request.Put(resourceUrl);

        try {
            client.bodyString(mapper.writeValueAsString(authTicket), ContentType.APPLICATION_JSON);
        } catch (JsonProcessingException jpe) {
            throw new ApiException("JSON error proccessing user authentication: "
                    + jpe.getMessage());
        }
        if (proxyHttpHost != null) {
            client.viaProxy(proxyHttpHost);
        }

        AppAuthenticator.addAuthHeader(client);
        HttpResponse response = null;
        try {
            response = client.execute().returnResponse();
        } catch (IOException ioe) {
            throw new ApiException("IO Exception occurred while authenticating user: "
                    + ioe.getMessage());
        }

        HttpHelper.ensureSuccess(response, mapper);

        CustomerAuthenticationProfile userInfo = setUserAuth(response, null);

        return userInfo;
    }
    
    public static CustomerAuthenticationProfile authenticate(CustomerUserAuthInfo userAuthInfo,  Integer tenantId, Integer siteId) {

       String resourceUrl = getTenantDomain(tenantId)
                + CustomerAuthTicketUrl.createUserAuthTicketUrl().getUrl(); // AuthTicketUrl.AuthenticateAppUrl();

        Request client = Request.Post(resourceUrl);
        
        if (siteId != null) {
            client.addHeader(Headers.X_VOL_SITE, siteId.toString());
        }
        
        try {
            client.bodyString(mapper.writeValueAsString(userAuthInfo), ContentType.APPLICATION_JSON);
        } catch (JsonProcessingException jpe) {
            throw new ApiException("JSON error proccessing user authentication: "
                    + jpe.getMessage());
        }
        if (proxyHttpHost != null) {
            client.viaProxy(proxyHttpHost);
        }

        AppAuthenticator.addAuthHeader(client);

        HttpResponse response = null;
        try {
            response = client.execute().returnResponse();
        } catch (IOException ioe) {
            throw new ApiException("IO Exception occurred while authenticating user: "
                    + ioe.getMessage());
        }

        HttpHelper.ensureSuccess(response, mapper);

        return setUserAuth(response, siteId);
    }
    
    private static CustomerAuthenticationProfile setUserAuth(HttpResponse response, Integer siteId) {
        CustomerAuthTicket customerAuthTicket = null;
        try {
            customerAuthTicket = mapper.readValue(response.getEntity()
                    .getContent(), CustomerAuthTicket.class);
        } catch (JsonParseException jpe) {
            throw new ApiException("JSON error while deserializing customer user auth ticket : "
                    + jpe.getMessage());
        } catch (IOException ioe) {
            throw new ApiException("IO Exception occurred while authenticating customer: "
                    + ioe.getMessage());
        }

        AuthTicket authTicket = new AuthTicket(
                customerAuthTicket.getAccessToken(), customerAuthTicket.getAccessTokenExpiration(),
                customerAuthTicket.getRefreshToken(), 
                        customerAuthTicket.getRefreshTokenExpiration(),
                AuthenticationScope.Customer);
        CustomerAuthenticationProfile authenticationProfile = new CustomerAuthenticationProfile();
        authenticationProfile.setAuthTicket(authTicket);
        authenticationProfile.setCustomerAccount(customerAuthTicket.getCustomerAccount());
        
        authenticationProfile.getAuthTicket().setSiteId(siteId);
        
        return authenticationProfile;
    }

    private static String getTenantDomain (Integer tenantId) {
        TenantResource tenantResource = new TenantResource();
        Tenant tenant = null;
        try {
            tenant = tenantResource.getTenant(tenantId, null);
        } catch (Exception exception ) {
            throw new ApiException("Exception occurred getting tenant: " + exception.getMessage());
        }

        if (tenant == null)
            throw new ApiException("Tenant " + tenantId + " Not found");

        return HttpHelper.getUrl(tenant.getDomain());
    }

}
