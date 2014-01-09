/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.adminuser;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.contracts.core.UserProfile;

/**
 *	Properties of the authentication ticket to be used in user claims with the Mozu API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TenantAdminUserAuthTicket implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Alphanumeric string used to authenticate the user in API request headers.
	 */
	protected String accessToken;

	public String getAccessToken() {
		return this.accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	/**
	 * The date and time the user access token expires.
	 */
	protected DateTime accessTokenExpiration;

	public DateTime getAccessTokenExpiration() {
		return this.accessTokenExpiration;
	}

	public void setAccessTokenExpiration(DateTime accessTokenExpiration) {
		this.accessTokenExpiration = accessTokenExpiration;
	}

	/**
	 * Date and time when the entity was created, represented in UTC Date/Time.
	 */
	protected DateTime createdOn;

	public DateTime getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(DateTime createdOn) {
		this.createdOn = createdOn;
	}

	/**
	 * Collection of behaviors encrypted in the user authentication ticket. Behaviors are granted to users as part of the role assigned for the given tenant or developer account.
	 */
	protected List<Integer> grantedBehaviors;
	public List<Integer> getGrantedBehaviors() {
		return this.grantedBehaviors;
	}
	public void setGrantedBehaviors(List<Integer> grantedBehaviors) {
		this.grantedBehaviors = grantedBehaviors;
	}

	/**
	 * Alphanumeric string used to generate a new user authentication ticket after the access token expires.
	 */
	protected String refreshToken;

	public String getRefreshToken() {
		return this.refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	/**
	 * The date and time the user refresh token expires.
	 */
	protected DateTime refreshTokenExpiration;

	public DateTime getRefreshTokenExpiration() {
		return this.refreshTokenExpiration;
	}

	public void setRefreshTokenExpiration(DateTime refreshTokenExpiration) {
		this.refreshTokenExpiration = refreshTokenExpiration;
	}

	/**
	 * Collection of tenants for which the user authentication ticket grants access.
	 */
	protected List<Tenant> availableTenants;
	public List<Tenant> getAvailableTenants() {
		return this.availableTenants;
	}
	public void setAvailableTenants(List<Tenant> availableTenants) {
		this.availableTenants = availableTenants;
	}

	/**
	 * Tenant information associated with the user authentication ticket.
	 */
	protected Tenant tenant;

	public Tenant getTenant() {
		return this.tenant;
	}

	public void setTenant(Tenant tenant) {
		this.tenant = tenant;
	}

	/**
	 * User information associated with the authentication ticket.
	 */
	protected UserProfile user;

	public UserProfile getUser() {
		return this.user;
	}

	public void setUser(UserProfile user) {
		this.user = user;
	}

}
