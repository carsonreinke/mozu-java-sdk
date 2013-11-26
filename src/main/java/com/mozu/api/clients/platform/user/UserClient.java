/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.platform.user;

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
public class UserClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.core.User> mozuClient=GetUserByEmailClient( emailAddress, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * User user = client.Result();
	 * </code></pre></p>
	 * @param emailAddress 
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.User>
	 * @see com.mozu.api.contracts.core.User
	 */
	public static MozuClient<com.mozu.api.contracts.core.User> getUserByEmailClient(String emailAddress, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.user.UserUrl.getUserByEmailUrl(emailAddress);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.core.User.class;
		MozuClient<com.mozu.api.contracts.core.User> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.core.User> mozuClient=GetUserClient( userId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * User user = client.Result();
	 * </code></pre></p>
	 * @param userId 
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.User>
	 * @see com.mozu.api.contracts.core.User
	 */
	public static MozuClient<com.mozu.api.contracts.core.User> getUserClient(String userId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.user.UserUrl.getUserUrl(userId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.core.User.class;
		MozuClient<com.mozu.api.contracts.core.User> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.core.User> mozuClient=CreateUserClient( shopper, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * User user = client.Result();
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @param shopper 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.User>
	 * @see com.mozu.api.contracts.core.User
	 * @see com.mozu.api.contracts.core.User
	 */
	public static MozuClient<com.mozu.api.contracts.core.User> createUserClient(com.mozu.api.contracts.core.User shopper, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.user.UserUrl.createUserUrl();
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.core.User.class;
		MozuClient<com.mozu.api.contracts.core.User> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(shopper);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.core.UserCollection> mozuClient=CreateUsersClient( users, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * UserCollection userCollection = client.Result();
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @param users 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.UserCollection>
	 * @see com.mozu.api.contracts.core.UserCollection
	 * @see com.mozu.api.contracts.core.UserCollection
	 */
	public static MozuClient<com.mozu.api.contracts.core.UserCollection> createUsersClient(com.mozu.api.contracts.core.UserCollection users, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.user.UserUrl.createUsersUrl();
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.core.UserCollection.class;
		MozuClient<com.mozu.api.contracts.core.UserCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(users);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.user.UserLoginResult> mozuClient=LoginClient( userAuthInfo, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * UserLoginResult userLoginResult = client.Result();
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @param userAuthInfo 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.user.UserLoginResult>
	 * @see com.mozu.api.contracts.user.UserLoginResult
	 * @see com.mozu.api.contracts.core.UserAuthInfo
	 */
	public static MozuClient<com.mozu.api.contracts.user.UserLoginResult> loginClient(com.mozu.api.contracts.core.UserAuthInfo userAuthInfo, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.user.UserUrl.loginUrl();
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.user.UserLoginResult.class;
		MozuClient<com.mozu.api.contracts.user.UserLoginResult> mozuClient = new MozuClient(clz);
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
	 * MozuClient mozuClient=ResetPasswordClient( resetPasswordInfo, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @param resetPasswordInfo 
	 * @return Mozu.Api.MozuClient 
	 * @see com.mozu.api.contracts.user.ResetPasswordInfo
	 */
	public static MozuClient resetPasswordClient(com.mozu.api.contracts.user.ResetPasswordInfo resetPasswordInfo, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.user.UserUrl.resetPasswordUrl();
		String verb = "POST";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(resetPasswordInfo);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

}



