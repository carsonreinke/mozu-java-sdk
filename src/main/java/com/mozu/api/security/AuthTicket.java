package com.mozu.api.security;

import java.util.Date;

public class AuthTicket extends com.mozu.api.contracts.appdev.AuthTicket {
    private static final long serialVersionUID = 1L;
    
    private UserScope userScope;
    
    public AuthTicket () {
        super();
    }

    public AuthTicket(String accessToken, Date accessTokenExpiration, String refreshToken, Date refreshTokeExpiration, UserScope userScope) {
        this.accessToken = accessToken;
        this.accessTokenExpiration = accessTokenExpiration;
        this.refreshToken = refreshToken;
        this.refreshTokenExpiration = refreshTokeExpiration;
        this.userScope = userScope;
    }
    
    public UserScope getScope() {
        return userScope;
    }
    public void setScope(UserScope scope) {
        this.userScope = scope;
    }
}
