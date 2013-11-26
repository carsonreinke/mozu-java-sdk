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
import org.joda.time.DateTimeZone;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mozu.api.ApiException;
import com.mozu.api.contracts.adminuser.DeveloperAccount;
import com.mozu.api.contracts.adminuser.DeveloperAdminUserAuthTicket;
import com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket;
import com.mozu.api.contracts.core.UserAuthInfo;
import com.mozu.api.contracts.core.UserAuthTicket;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.urls.platform.adminuser.TenantAdminUserAuthTicketUrl;
import com.mozu.api.urls.platform.developer.DeveloperAdminUserAuthTicketUrl;
import com.mozu.api.urls.platform.user.UserAuthTicketUrl;
import com.mozu.api.utils.HttpHelper;

public class UserAuthenticator {
    private static ObjectMapper mapper = new ObjectMapper();
    private static HttpHost proxyHttpHost = HttpHelper.getProxyHost();

    public static AuthenticationProfile setActiveScope(AuthTicket authTicket, Scope scope) {
        return refreshUserAuthTicket(authTicket, scope.getId());
    }

    public static AuthenticationProfile ensureAuthTicket(AuthTicket authTicket) {
        DateTime accessTokenDateTime = new DateTime(authTicket.getAccessTokenExpiration()); 
        if (accessTokenDateTime.isBefore(DateTime.now(DateTimeZone.UTC).plus(180000)))
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

        AuthenticationProfile userInfo = setUserAuth(response, authTicket.getScope());

        return userInfo;
    }
    public static AuthenticationProfile authenticate(UserAuthInfo userAuthInfo, UserScope scope) {
        return authenticate(userAuthInfo, scope, null);
    }

    public static AuthenticationProfile authenticate(UserAuthInfo userAuthInfo, UserScope scope, Integer id) {
        String resourceUrl = AppAuthenticator.getInstance().getBaseUrl()
                + getResourceUrl(scope, id); // AuthTicketUrl.AuthenticateAppUrl();

        Request client = Request.Post(resourceUrl);

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

        return setUserAuth(response, scope);
    }

    private static AuthenticationProfile setUserAuth(HttpResponse response, UserScope userScope) {
        AuthenticationProfile userProfile = null;

        switch (userScope) {
        case Tenant:
            userProfile = getTenantUserProfile(response, userScope);
            break;
        case Developer:
            userProfile = getDeveloperUserProfile(response, userScope);
            break;
        case Shopper:
            userProfile = getShopperUserProfile(response, userScope);
            break;
        default:
            break;
        }

        return userProfile;
    }

    private static AuthenticationProfile getTenantUserProfile(HttpResponse response, UserScope userScope) {
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

    private static AuthenticationProfile getDeveloperUserProfile(HttpResponse response, UserScope userScope) {
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

    private static AuthenticationProfile getShopperUserProfile(HttpResponse response, UserScope userScope) {
        UserAuthTicket shopperUserAuthTicketUserAuthTicket = null;
        try {
            shopperUserAuthTicketUserAuthTicket = mapper.readValue(response.getEntity()
                    .getContent(), UserAuthTicket.class);
        } catch (JsonParseException jpe) {
            throw new ApiException("JSON error while deserializing shopper user auth ticket : "
                    + jpe.getMessage());
        } catch (IOException ioe) {
            throw new ApiException("IO Exception occurred while authenticating shopper: "
                    + ioe.getMessage());
        }

        AuthTicket authTicket = new AuthTicket(
                shopperUserAuthTicketUserAuthTicket.getAccessToken(), shopperUserAuthTicketUserAuthTicket.getAccessTokenExpiration(),
                shopperUserAuthTicketUserAuthTicket.getRefreshToken(), 
                        shopperUserAuthTicketUserAuthTicket.getRefreshTokenExpiration(),
                userScope);

        return new AuthenticationProfile(authTicket, null, null, shopperUserAuthTicketUserAuthTicket.getUser());
    }

    private static String getResourceRefreshUrl(AuthTicket authTicket, Integer id) {
        switch (authTicket.getScope()) {
        case Tenant:
            return TenantAdminUserAuthTicketUrl.refreshAuthTicketUrl(id).getUrl();
        case Shopper:
            return UserAuthTicketUrl.refreshUserAuthTicketUrl(authTicket.getRefreshToken())
                    .getUrl();
        case Developer:
            return DeveloperAdminUserAuthTicketUrl.refreshDeveloperAuthTicketUrl(id).getUrl();
        default:
            throw new NotImplementedException("Invalid User Scope.");
        }
    }

    private static String getResourceUrl(UserScope scope, Integer id) {
        switch (scope) {
        case Tenant:
            return TenantAdminUserAuthTicketUrl.createUserAuthTicketUrl(id).getUrl();
        case Shopper:
            return UserAuthTicketUrl.createUserAuthTicketUrl().getUrl();
        case Developer:
            return DeveloperAdminUserAuthTicketUrl.createDeveloperUserAuthTicketUrl(id).getUrl();
        default:
            throw new NotImplementedException();
        }
    }

}
