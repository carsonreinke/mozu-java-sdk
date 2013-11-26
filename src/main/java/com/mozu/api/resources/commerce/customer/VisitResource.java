/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.customer;

import com.mozu.api.ApiContext;
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
public class VisitResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;
	public VisitResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * 
	 * <p><pre><code>
	 *	Visit visit = new Visit();
	 *	VisitCollection visitCollection = visit.GetVisits();
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @return com.mozu.api.contracts.customer.VisitCollection
	 * @see com.mozu.api.contracts.customer.VisitCollection
	 */
	public com.mozu.api.contracts.customer.VisitCollection getVisits() throws Exception
	{
		return getVisits( null,  null,  null,  null, null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Visit visit = new Visit();
	 *	VisitCollection visitCollection = visit.GetVisits( filter,  pageSize,  sortBy,  startIndex, authTicket);
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param sortBy 
	 * @param startIndex 
	 * @param authTicket User Auth Ticket
	 * @return com.mozu.api.contracts.customer.VisitCollection
	 * @see com.mozu.api.contracts.customer.VisitCollection
	 */
	public com.mozu.api.contracts.customer.VisitCollection getVisits(String filter, Integer pageSize, String sortBy, Integer startIndex, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.VisitCollection> client = com.mozu.api.clients.commerce.customer.VisitClient.getVisitsClient( filter,  pageSize,  sortBy,  startIndex, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Visit visit = new Visit();
	 *	Visit visit = visit.GetVisit( visitId, authTicket);
	 * </code></pre></p>
	 * @param visitId 
	 * @param authTicket User Auth Ticket
	 * @return com.mozu.api.contracts.customer.Visit
	 * @see com.mozu.api.contracts.customer.Visit
	 */
	public com.mozu.api.contracts.customer.Visit getVisit(String visitId, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.Visit> client = com.mozu.api.clients.commerce.customer.VisitClient.getVisitClient( visitId, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Visit visit = new Visit();
	 *	Visit visit = visit.AddVisit( visit, authTicket);
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @param visit 
	 * @return com.mozu.api.contracts.customer.Visit
	 * @see com.mozu.api.contracts.customer.Visit
	 * @see com.mozu.api.contracts.customer.Visit
	 */
	public com.mozu.api.contracts.customer.Visit addVisit(com.mozu.api.contracts.customer.Visit visit, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.Visit> client = com.mozu.api.clients.commerce.customer.VisitClient.addVisitClient( visit, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Visit visit = new Visit();
	 *	Visit visit = visit.UpdateVisit( visit,  visitId, authTicket);
	 * </code></pre></p>
	 * @param visitId 
	 * @param authTicket User Auth Ticket
	 * @param visit 
	 * @return com.mozu.api.contracts.customer.Visit
	 * @see com.mozu.api.contracts.customer.Visit
	 * @see com.mozu.api.contracts.customer.Visit
	 */
	public com.mozu.api.contracts.customer.Visit updateVisit(com.mozu.api.contracts.customer.Visit visit, String visitId, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.Visit> client = com.mozu.api.clients.commerce.customer.VisitClient.updateVisitClient( visit,  visitId, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



