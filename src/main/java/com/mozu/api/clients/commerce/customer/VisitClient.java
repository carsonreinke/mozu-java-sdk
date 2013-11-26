/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.customer;

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
public class VisitClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.VisitCollection> mozuClient=GetVisitsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * VisitCollection visitCollection = client.Result();
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.VisitCollection>
	 * @see com.mozu.api.contracts.customer.VisitCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.VisitCollection> getVisitsClient() throws Exception
	{
		return getVisitsClient( null,  null,  null,  null, null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.VisitCollection> mozuClient=GetVisitsClient( filter,  pageSize,  sortBy,  startIndex, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * VisitCollection visitCollection = client.Result();
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param sortBy 
	 * @param startIndex 
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.VisitCollection>
	 * @see com.mozu.api.contracts.customer.VisitCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.VisitCollection> getVisitsClient(String filter, Integer pageSize, String sortBy, Integer startIndex, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.VisitUrl.getVisitsUrl(filter, pageSize, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.VisitCollection.class;
		MozuClient<com.mozu.api.contracts.customer.VisitCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.Visit> mozuClient=GetVisitClient( visitId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Visit visit = client.Result();
	 * </code></pre></p>
	 * @param visitId 
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.Visit>
	 * @see com.mozu.api.contracts.customer.Visit
	 */
	public static MozuClient<com.mozu.api.contracts.customer.Visit> getVisitClient(String visitId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.VisitUrl.getVisitUrl(visitId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.Visit.class;
		MozuClient<com.mozu.api.contracts.customer.Visit> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.Visit> mozuClient=AddVisitClient( visit, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Visit visit = client.Result();
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @param visit 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.Visit>
	 * @see com.mozu.api.contracts.customer.Visit
	 * @see com.mozu.api.contracts.customer.Visit
	 */
	public static MozuClient<com.mozu.api.contracts.customer.Visit> addVisitClient(com.mozu.api.contracts.customer.Visit visit, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.VisitUrl.addVisitUrl();
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.customer.Visit.class;
		MozuClient<com.mozu.api.contracts.customer.Visit> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(visit);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.Visit> mozuClient=UpdateVisitClient( visit,  visitId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Visit visit = client.Result();
	 * </code></pre></p>
	 * @param visitId 
	 * @param authTicket User Auth Ticket
	 * @param visit 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.Visit>
	 * @see com.mozu.api.contracts.customer.Visit
	 * @see com.mozu.api.contracts.customer.Visit
	 */
	public static MozuClient<com.mozu.api.contracts.customer.Visit> updateVisitClient(com.mozu.api.contracts.customer.Visit visit, String visitId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.VisitUrl.updateVisitUrl(visitId);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.customer.Visit.class;
		MozuClient<com.mozu.api.contracts.customer.Visit> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(visit);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

}



