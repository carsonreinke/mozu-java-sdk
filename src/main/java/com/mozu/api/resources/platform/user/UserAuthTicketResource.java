/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.resources.platform.user;

import com.mozu.api.ApiContext;
import com.mozu.api.resources.BaseResource;
import java.util.ArrayList;
import com.mozu.api.MozuClient;

/// <summary>
/// Manage the user authentication tickets used to perform operations in the Mozu API.
/// </summary>
public class UserAuthTicketResource extends BaseResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;
	
	public UserAuthTicketResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
		/**
	* Generates an authentication ticket for a user.
	* <p><pre><code>
	*    UserAuthTicket userauthticket = new UserAuthTicket();
	*   UserAuthTicket userAuthTicket = userauthticket.CreateUserAuthTicket( userAuthInfo);
	* </code></pre></p>
	* @param userAuthInfo The user authentication information, which consists of email address and password.
	* @return com.mozu.api.contracts.core.UserAuthTicket
	* @see com.mozu.api.contracts.core.UserAuthTicket
	* @see com.mozu.api.contracts.core.UserAuthInfo
	*/
	public com.mozu.api.contracts.core.UserAuthTicket createUserAuthTicket(com.mozu.api.contracts.core.UserAuthInfo userAuthInfo) throws Exception
	{
		MozuClient<com.mozu.api.contracts.core.UserAuthTicket> client = com.mozu.api.clients.platform.user.UserAuthTicketClient.createUserAuthTicketClient( userAuthInfo);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

/**
	* Generates an authentication ticket for a user that can be used for an individual site.
	* <p><pre><code>
	*    UserAuthTicket userauthticket = new UserAuthTicket();
	*   UserAuthTicket userAuthTicket = userauthticket.CreateAuthTicketForSite( userAuthInfo);
	* </code></pre></p>
	* @param userAuthInfo The user authentication information, which consists of email address and password.
	* @return com.mozu.api.contracts.core.UserAuthTicket
	* @see com.mozu.api.contracts.core.UserAuthTicket
	* @see com.mozu.api.contracts.core.UserTokenInfo
	*/
	public com.mozu.api.contracts.core.UserAuthTicket createAuthTicketForSite(com.mozu.api.contracts.core.UserTokenInfo userAuthInfo) throws Exception
	{
		MozuClient<com.mozu.api.contracts.core.UserAuthTicket> client = com.mozu.api.clients.platform.user.UserAuthTicketClient.createAuthTicketForSiteClient( userAuthInfo);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

	/**
	* Refresh the user authentication ticket by supplying the refresh token.
	* <p><pre><code>
	*    UserAuthTicket userauthticket = new UserAuthTicket();
	*   UserAuthTicket userAuthTicket = userauthticket.RefreshUserAuthTicket( refreshToken);
	* </code></pre></p>
	* @param refreshToken The refresh token generated in the user authentication ticket.
	* @return com.mozu.api.contracts.core.UserAuthTicket
	* @see com.mozu.api.contracts.core.UserAuthTicket
	*/
	public com.mozu.api.contracts.core.UserAuthTicket refreshUserAuthTicket(String refreshToken) throws Exception
	{
		MozuClient<com.mozu.api.contracts.core.UserAuthTicket> client = com.mozu.api.clients.platform.user.UserAuthTicketClient.refreshUserAuthTicketClient( refreshToken);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

	
}



