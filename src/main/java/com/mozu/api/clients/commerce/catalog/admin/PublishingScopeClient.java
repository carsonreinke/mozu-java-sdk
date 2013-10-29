/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.clients.commerce.catalog.admin;

import java.util.ArrayList;
import com.mozu.api.MozuClient;

/// <summary>
/// 
/// </summary>
public class PublishingScopeClient {
	
	
		/**
	* 
	* <p><pre><code>
	*   MozuClient mozuClient=DiscardDraftsClient( publishScope);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* </code></pre></p>
	* @param publishScope 
	* @return Mozu.Api.MozuClient 
	* @see com.mozu.api.contracts.productadmin.PublishingScope
	*/
	public static MozuClient discardDraftsClient(com.mozu.api.contracts.productadmin.PublishingScope publishScope) throws Exception
	{
		String url = com.mozu.api.urls.commerce.catalog.admin.PublishingScopeUrl.discardDraftsUrl();
		String verb = "POST";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(publishScope);
		return mozuClient;

	}

/**
	* 
	* <p><pre><code>
	*   MozuClient mozuClient=PublishDraftsClient( publishScope);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* </code></pre></p>
	* @param publishScope 
	* @return Mozu.Api.MozuClient 
	* @see com.mozu.api.contracts.productadmin.PublishingScope
	*/
	public static MozuClient publishDraftsClient(com.mozu.api.contracts.productadmin.PublishingScope publishScope) throws Exception
	{
		String url = com.mozu.api.urls.commerce.catalog.admin.PublishingScopeUrl.publishDraftsUrl();
		String verb = "POST";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(publishScope);
		return mozuClient;

	}

		
}



