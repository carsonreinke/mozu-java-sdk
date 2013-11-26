/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.core;

import java.util.List;
import java.io.Serializable;
import java.util.Date;
import com.mozu.api.contracts.core.UserScope;
import com.mozu.api.contracts.core.UserProfile;

public class UserAuthTicket implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected String accessToken;

	public String getAccessToken() {
		return this.accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	protected Date accessTokenExpiration;

	public Date getAccessTokenExpiration() {
		return this.accessTokenExpiration;
	}

	public void setAccessTokenExpiration(Date accessTokenExpiration) {
		this.accessTokenExpiration = accessTokenExpiration;
	}

	protected List<Integer> grantedBehaviors;
	public List<Integer> getGrantedBehaviors() {
		return this.grantedBehaviors;
	}
	public void setGrantedBehaviors(List<Integer> grantedBehaviors) {
		this.grantedBehaviors = grantedBehaviors;
	}

	protected String refreshToken;

	public String getRefreshToken() {
		return this.refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	protected Date refreshTokenExpiration;

	public Date getRefreshTokenExpiration() {
		return this.refreshTokenExpiration;
	}

	public void setRefreshTokenExpiration(Date refreshTokenExpiration) {
		this.refreshTokenExpiration = refreshTokenExpiration;
	}

	protected UserScope scope;

	public UserScope getScope() {
		return this.scope;
	}

	public void setScope(UserScope scope) {
		this.scope = scope;
	}

	protected UserProfile user;

	public UserProfile getUser() {
		return this.user;
	}

	public void setUser(UserProfile user) {
		this.user = user;
	}

}
