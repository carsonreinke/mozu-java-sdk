/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.platform.adminuser;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;

/** <summary>
 * 
 * </summary>
 */
public class TenantAdminUserAuthTicketClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket> mozuClient=CreateUserAuthTicketClient( userAuthInfo);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * TenantAdminUserAuthTicket tenantAdminUserAuthTicket = client.Result();
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @param userAuthInfo 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket>
	 * @see com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 * @see com.mozu.api.contracts.core.UserAuthInfo
	 */
	public static MozuClient<com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket> createUserAuthTicketClient(com.mozu.api.contracts.core.UserAuthInfo userAuthInfo) throws Exception
	{
		return createUserAuthTicketClient( userAuthInfo,  null, null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket> mozuClient=CreateUserAuthTicketClient( userAuthInfo,  tenantId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * TenantAdminUserAuthTicket tenantAdminUserAuthTicket = client.Result();
	 * </code></pre></p>
	 * @param tenantId 
	 * @param authTicket User Auth Ticket
	 * @param userAuthInfo 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket>
	 * @see com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 * @see com.mozu.api.contracts.core.UserAuthInfo
	 */
	public static MozuClient<com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket> createUserAuthTicketClient(com.mozu.api.contracts.core.UserAuthInfo userAuthInfo, Integer tenantId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.adminuser.TenantAdminUserAuthTicketUrl.createUserAuthTicketUrl(tenantId);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket.class;
		MozuClient<com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(userAuthInfo);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket> mozuClient=RefreshAuthTicketClient( existingAuthTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * TenantAdminUserAuthTicket tenantAdminUserAuthTicket = client.Result();
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @param existingAuthTicket 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket>
	 * @see com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 * @see com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 */
	public static MozuClient<com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket> refreshAuthTicketClient(com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket existingAuthTicket) throws Exception
	{
		return refreshAuthTicketClient( existingAuthTicket,  null, null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket> mozuClient=RefreshAuthTicketClient( existingAuthTicket,  tenantId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * TenantAdminUserAuthTicket tenantAdminUserAuthTicket = client.Result();
	 * </code></pre></p>
	 * @param tenantId 
	 * @param authTicket User Auth Ticket
	 * @param existingAuthTicket 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket>
	 * @see com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 * @see com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 */
	public static MozuClient<com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket> refreshAuthTicketClient(com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket existingAuthTicket, Integer tenantId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.adminuser.TenantAdminUserAuthTicketUrl.refreshAuthTicketUrl(tenantId);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket.class;
		MozuClient<com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(existingAuthTicket);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteUserAuthTicketClient( refreshToken, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param refreshToken 
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteUserAuthTicketClient(String refreshToken, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.adminuser.TenantAdminUserAuthTicketUrl.deleteUserAuthTicketUrl(refreshToken);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

}



