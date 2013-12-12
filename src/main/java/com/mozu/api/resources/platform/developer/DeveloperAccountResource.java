/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.platform.developer;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;

/** <summary>
 * Use the Developer Accounts resource to retrieve details about the developer account a company uses to test applications and themes.
 * </summary>
 */
public class DeveloperAccountResource {
	
	/**
	 * Retrieves the details of the developer account specified in the request.
	 * <p><pre><code>
	 *	DeveloperAccount developeraccount = new DeveloperAccount();
	 *	DeveloperAccount developerAccount = developeraccount.GetDeveloperAccount();
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @return com.mozu.api.contracts.appdev.DeveloperAccount
	 * @see com.mozu.api.contracts.appdev.DeveloperAccount
	 */
	public com.mozu.api.contracts.appdev.DeveloperAccount getDeveloperAccount() throws Exception
	{
		return getDeveloperAccount( null, null);
	}

	/**
	 * Retrieves the details of the developer account specified in the request.
	 * <p><pre><code>
	 *	DeveloperAccount developeraccount = new DeveloperAccount();
	 *	DeveloperAccount developerAccount = developeraccount.GetDeveloperAccount( accountId, authTicket);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the developer account to retrieve.
	 * @param authTicket User Auth Ticket
	 * @return com.mozu.api.contracts.appdev.DeveloperAccount
	 * @see com.mozu.api.contracts.appdev.DeveloperAccount
	 */
	public com.mozu.api.contracts.appdev.DeveloperAccount getDeveloperAccount(Integer accountId, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.appdev.DeveloperAccount> client = com.mozu.api.clients.platform.developer.DeveloperAccountClient.getDeveloperAccountClient( accountId, authTicket);
		client.executeRequest();
		return client.getResult();

	}

}



