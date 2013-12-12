/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.platform.applications;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;

/** <summary>
 * Use this resource to manage authentication tickets for your applications.
 * </summary>
 */
public class AuthTicketResource {
	
	/**
	 * Generate an authentication ticket for an application.
	 * <p><pre><code>
	 *	AuthTicket authticket = new AuthTicket();
	 *	AuthTicket authTicket = authticket.AuthenticateApp( appAuthInfo);
	 * </code></pre></p>
	 * @param appAuthInfo Authentication information required to generate an authentication ticket includes the application id and the shared secret.
	 * @return com.mozu.api.contracts.appdev.AuthTicket
	 * @see com.mozu.api.contracts.appdev.AuthTicket
	 * @see com.mozu.api.contracts.appdev.AppAuthInfo
	 */
	public com.mozu.api.contracts.appdev.AuthTicket authenticateApp(com.mozu.api.contracts.appdev.AppAuthInfo appAuthInfo) throws Exception
	{
		MozuClient<com.mozu.api.contracts.appdev.AuthTicket> client = com.mozu.api.clients.platform.applications.AuthTicketClient.authenticateAppClient( appAuthInfo);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Refreshes the application's authentication ticket and generates a new access token by providing the refresh token string.
	 * <p><pre><code>
	 *	AuthTicket authticket = new AuthTicket();
	 *	AuthTicket authTicket = authticket.RefreshAppAuthTicket( authTicketRequest);
	 * </code></pre></p>
	 * @param authTicketRequest The refresh token string required to update the application authentication ticket.
	 * @return com.mozu.api.contracts.appdev.AuthTicket
	 * @see com.mozu.api.contracts.appdev.AuthTicket
	 * @see com.mozu.api.contracts.appdev.AuthTicketRequest
	 */
	public com.mozu.api.contracts.appdev.AuthTicket refreshAppAuthTicket(com.mozu.api.contracts.appdev.AuthTicketRequest authTicketRequest) throws Exception
	{
		MozuClient<com.mozu.api.contracts.appdev.AuthTicket> client = com.mozu.api.clients.platform.applications.AuthTicketClient.refreshAppAuthTicketClient( authTicketRequest);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Deletes an authentication for an application based on the specified refresh token.
	 * <p><pre><code>
	 *	AuthTicket authticket = new AuthTicket();
	 *	authticket.DeleteAppAuthTicket( refreshToken);
	 * </code></pre></p>
	 * @param refreshToken The refresh token string from the application's authentication ticket.
	 * @return 
	 */
	public void deleteAppAuthTicket(String refreshToken) throws Exception
	{
		MozuClient client = com.mozu.api.clients.platform.applications.AuthTicketClient.deleteAppAuthTicketClient( refreshToken);
		client.executeRequest();

	}

}



