/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.appdev;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

/**
 *	Properties of the authentication ticket used to authenticate applications.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthTicket implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The token that stores an encrypted list of the application's configured behaviors and authenticates the application.
	 */
	protected String accessToken;

	public String getAccessToken() {
		return this.accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	/**
	 * Date and time the access token expires. After the access token expires, refresh the authentication ticket using the refresh koken.
	 */
	protected DateTime accessTokenExpiration;

	public DateTime getAccessTokenExpiration() {
		return this.accessTokenExpiration;
	}

	public void setAccessTokenExpiration(DateTime accessTokenExpiration) {
		this.accessTokenExpiration = accessTokenExpiration;
	}

	/**
	 * The token that refreshes the application's authentication ticket.
	 */
	protected String refreshToken;

	public String getRefreshToken() {
		return this.refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	/**
	 * Date and time the refresh token expires. After the refresh token expires, generate a new authentication ticket.
	 */
	protected DateTime refreshTokenExpiration;

	public DateTime getRefreshTokenExpiration() {
		return this.refreshTokenExpiration;
	}

	public void setRefreshTokenExpiration(DateTime refreshTokenExpiration) {
		this.refreshTokenExpiration = refreshTokenExpiration;
	}

}
