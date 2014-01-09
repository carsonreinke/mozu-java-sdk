package com.mozu.api.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.NotImplementedException;
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
import com.mozu.api.contracts.adminuser.DeveloperAccount;
import com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket;
import com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket;
import com.mozu.api.contracts.core.UserAuthInfo;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.urls.platform.adminuser.TenantAdminUserAuthTicketUrl;
import com.mozu.api.urls.platform.developer.DeveloperAdminUserAuthTicketUrl;
import com.mozu.api.utils.HttpHelper;
import com.mozu.api.utils.JsonUtils;

public class UserAuthenticator {
    private static ObjectMapper mapper = JsonUtils.initObjectMapper();

    private static HttpHost proxyHttpHost = HttpHelper.getProxyHost();

    public static AuthenticationProfile setActiveScope(AuthTicket authTicket, Scope scope) {
        return refreshUserAuthTicket(authTicket, scope.getId());
    }

    public static AuthenticationProfile ensureAuthTicket(AuthTicket authTicket) {
        DateTime accessTokenDateTime = new DateTime(authTicket.getAccessTokenExpiration()).minus(180000);
        if (accessTokenDateTime.isBeforeNow())
            return refreshUserAuthTicket(authTicket);

        return null;
    }

    public static AuthenticationProfile refreshUserAuthTicket(AuthTicket authTicket) {
        return refreshUserAuthTicket(authTicket, null);
    }

    public static AuthenticationProfile refreshUserAuthTicket(AuthTicket authTicket, Integer id)
            throws ApiException {

        String resourceUrl = AppAuthenticator.getInstance().getBaseUrl()
                + getResourceRefreshUrl(authTicket, id); // AuthTicketUrl.AuthenticateAppUrl();

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

        AuthenticationProfile userInfo = setUserAuth(response, authTicket.getScope(), null);

        return userInfo;
    }
    public static AuthenticationProfile authenticate(UserAuthInfo userAuthInfo, AuthenticationScope scope) {
        return authenticate(userAuthInfo, scope, null);
    }

    public static AuthenticationProfile authenticate(UserAuthInfo userAuthInfo, AuthenticationScope scope, Integer id) {
        return authenticate(userAuthInfo, scope, id, null);
    }
    
    public static AuthenticationProfile authenticate(UserAuthInfo userAuthInfo, AuthenticationScope scope, Integer id, Integer siteId) {
       String resourceUrl = AppAuthenticator.getInstance().getBaseUrl()
                + getResourceUrl(scope, id); // AuthTicketUrl.AuthenticateAppUrl();

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

        return setUserAuth(response, scope, siteId);
    }
    
    public static void logout(AuthTicket authTicket)
    {
        String url = AppAuthenticator.getInstance().getBaseUrl()
                + getLogoutUrl(authTicket);
        Request client = Request.Delete(url);

        if (proxyHttpHost != null) {
            client.viaProxy(proxyHttpHost);
        }

        AppAuthenticator.addAuthHeader(client);

        try {
            client.execute().returnResponse();
        } catch (IOException ioe) {
            throw new ApiException("IO Exception occurred while authenticating user: "
                    + ioe.getMessage());
        }
    }

    private static AuthenticationProfile setUserAuth(HttpResponse response, AuthenticationScope userScope, Integer siteId) {
        AuthenticationProfile userProfile = null;

        switch (userScope) {
        case Tenant:
            userProfile = getTenantUserProfile(response, userScope);
            break;
        case Developer:
            userProfile = getDeveloperUserProfile(response, userScope);
            break;
        default:
            break;
        }
        
        userProfile.getAuthTicket().setSiteId(siteId);
        
        return userProfile;
    }

    private static AuthenticationProfile getTenantUserProfile(HttpResponse response, AuthenticationScope userScope) {
        TenantAdminUserAuthTicket tenantAdminUserAuthTicket = null;
        try {
            tenantAdminUserAuthTicket = mapper.readValue(response.getEntity().getContent(),
                    TenantAdminUserAuthTicket.class);
        } catch (JsonParseException jpe) {
            throw new ApiException(
                    "JSON error while deserializing tenant admin user auth ticket : "
                            + jpe.getMessage());
        } catch (IOException ioe) {
            throw new ApiException("IO Exception occurred while authenticating tenant admin: "
                    + ioe.getMessage());
        }

        Scope activeScope = null;
        if (tenantAdminUserAuthTicket.getTenant() != null) {
            activeScope = new Scope(tenantAdminUserAuthTicket.getTenant().getId(),
                    tenantAdminUserAuthTicket.getTenant().getName());
        }
        AuthTicket authTicket = new AuthTicket(tenantAdminUserAuthTicket.getAccessToken(),tenantAdminUserAuthTicket.getAccessTokenExpiration(),
                tenantAdminUserAuthTicket.getRefreshToken(), tenantAdminUserAuthTicket
                        .getRefreshTokenExpiration(), userScope);
        List<Scope> availableScopes = new ArrayList<Scope>();
        if (tenantAdminUserAuthTicket.getAvailableTenants() != null) {
            for (Tenant tenant : tenantAdminUserAuthTicket.getAvailableTenants()) {
                availableScopes.add(new Scope(tenant.getId(), tenant.getName()));
            }
        }
        return new AuthenticationProfile(authTicket, availableScopes, activeScope, tenantAdminUserAuthTicket.getUser());
    }

    private static AuthenticationProfile getDeveloperUserProfile(HttpResponse response, AuthenticationScope userScope) {
        DeveloperAdminUserAuthTicket developerAdminUserAuthTicket = null;
        try {
            developerAdminUserAuthTicket = mapper.readValue(response.getEntity().getContent(),
                    DeveloperAdminUserAuthTicket.class);
        } catch (JsonParseException jpe) {
            throw new ApiException("JSON error while deserializing Developer Auth ticket : "
                    + jpe.getMessage());
        } catch (IOException ioe) {
            throw new ApiException("IO Exception occurred while authenticating developer: "
                    + ioe.getMessage());
        }

        Scope activeScope = null;
        if (developerAdminUserAuthTicket.getAccount() != null) {
            activeScope = new Scope(developerAdminUserAuthTicket.getAccount().getId(),
                    developerAdminUserAuthTicket.getAccount().getName());
        }
        AuthTicket authTicket = new AuthTicket(developerAdminUserAuthTicket.getAccessToken(),
                developerAdminUserAuthTicket.getAccessTokenExpiration(),
                developerAdminUserAuthTicket.getRefreshToken(), developerAdminUserAuthTicket.getRefreshTokenExpiration(),
                userScope);
        List<Scope> availableScopes = new ArrayList<Scope>();
        if (developerAdminUserAuthTicket.getAvailableAccounts() != null) {
            for (DeveloperAccount devAcct : developerAdminUserAuthTicket.getAvailableAccounts()) {
                availableScopes.add(new Scope(devAcct.getId(), devAcct.getName()));
            }
        }
        return new AuthenticationProfile(authTicket, availableScopes, activeScope, developerAdminUserAuthTicket.getUser());
    }

    private static String getResourceRefreshUrl(AuthTicket authTicket, Integer id) {
        switch (authTicket.getScope()) {
        case Tenant:
            return TenantAdminUserAuthTicketUrl.refreshAuthTicketUrl(id).getUrl();
        case Developer:
            return DeveloperAdminUserAuthTicketUrl.refreshDeveloperAuthTicketUrl(id).getUrl();
        default:
            throw new NotImplementedException("Invalid User Scope.");
        }
    }

    private static String getResourceUrl(AuthenticationScope scope, Integer id) {
        switch (scope) {
        case Tenant:
            return TenantAdminUserAuthTicketUrl.createUserAuthTicketUrl(id).getUrl();
        case Developer:
            return DeveloperAdminUserAuthTicketUrl.createDeveloperUserAuthTicketUrl(id).getUrl();
        default:
            throw new NotImplementedException();
        }
    }

    private static String getLogoutUrl(AuthTicket ticket)
    {
        switch (ticket.getScope())
        {
            case Tenant:
                return TenantAdminUserAuthTicketUrl.deleteUserAuthTicketUrl(ticket.getRefreshToken()).getUrl();
            case Developer:
                return DeveloperAdminUserAuthTicketUrl.deleteUserAuthTicketUrl(ticket.getAccessToken()).getUrl();
            default:
                throw new NotImplementedException();
        }
    }
}
