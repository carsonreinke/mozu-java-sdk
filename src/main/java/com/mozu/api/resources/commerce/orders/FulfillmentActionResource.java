/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.orders;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;

/** <summary>
 * Use the Fulfillment resource to manage shipments or pickups of collections of packages for an order.
 * </summary>
 */
public class FulfillmentActionResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;
	public FulfillmentActionResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * Retrieve a list of the fulfillment information for the specified order.
	 * <p><pre><code>
	 *	FulfillmentAction fulfillmentaction = new FulfillmentAction();
	 *	FulfillmentInfo fulfillmentInfo = fulfillmentaction.GetFulfillmentInfo( orderId);
	 * </code></pre></p>
	 * @param orderId Retrieves a list of the fulfillment information for the specified order.
	 * @param authTicket User Auth Ticket
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo
	 */
	public com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo getFulfillmentInfo(String orderId) throws Exception
	{
		return getFulfillmentInfo( orderId,  null, null);
	}

	/**
	 * Retrieve a list of the fulfillment information for the specified order.
	 * <p><pre><code>
	 *	FulfillmentAction fulfillmentaction = new FulfillmentAction();
	 *	FulfillmentInfo fulfillmentInfo = fulfillmentaction.GetFulfillmentInfo( orderId,  draft, authTicket);
	 * </code></pre></p>
	 * @param draft If true, retrieve the draft version of the order's fulfillment information, which might include uncommitted changes.
	 * @param orderId Retrieves a list of the fulfillment information for the specified order.
	 * @param authTicket User Auth Ticket
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo
	 */
	public com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo getFulfillmentInfo(String orderId, Boolean draft, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo> client = com.mozu.api.clients.commerce.orders.FulfillmentActionClient.getFulfillmentInfoClient( orderId,  draft, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Sets the fulfillment action to "Ship" or "PickUp". To ship an order or prepare it for in-store pickup, the order must have a customer name, the "Open" or "OpenAndProcessing" status. To ship the order, it must also have the full shipping address and shipping method. Shipping all packages or picking up all pickups for an order will complete a paid order.
	 * <p><pre><code>
	 *	FulfillmentAction fulfillmentaction = new FulfillmentAction();
	 *	Order order = fulfillmentaction.PerformFulfillmentAction( action,  orderId, authTicket);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order for which to perform the fulfillment action.
	 * @param authTicket User Auth Ticket
	 * @param action The action to perform for the order fulfillment.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order performFulfillmentAction(com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction action, String orderId, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.FulfillmentActionClient.performFulfillmentActionClient( action,  orderId, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates one or more propertes of fulfillment information for the specified order.
	 * <p><pre><code>
	 *	FulfillmentAction fulfillmentaction = new FulfillmentAction();
	 *	FulfillmentInfo fulfillmentInfo = fulfillmentaction.SetFulFillmentInfo( fulfillmentInfo,  orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the fulfillment information to update.
	 * @param authTicket User Auth Ticket
	 * @param fulfillmentInfo Array of shipping fulfillment information associated with an order.
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo
	 */
	public com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo setFulFillmentInfo(com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo fulfillmentInfo, String orderId) throws Exception
	{
		return setFulFillmentInfo( fulfillmentInfo,  orderId,  null,  null, null);
	}

	/**
	 * Updates one or more propertes of fulfillment information for the specified order.
	 * <p><pre><code>
	 *	FulfillmentAction fulfillmentaction = new FulfillmentAction();
	 *	FulfillmentInfo fulfillmentInfo = fulfillmentaction.SetFulFillmentInfo( fulfillmentInfo,  orderId,  updateMode,  version, authTicket);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the fulfillment information to update.
	 * @param updateMode Specifies whether to set the fulfillment information by updating the original order, updating the order in draft mode, or updating the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @param authTicket User Auth Ticket
	 * @param fulfillmentInfo Array of shipping fulfillment information associated with an order.
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo
	 */
	public com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo setFulFillmentInfo(com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo fulfillmentInfo, String orderId, String updateMode, String version, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo> client = com.mozu.api.clients.commerce.orders.FulfillmentActionClient.setFulFillmentInfoClient( fulfillmentInfo,  orderId,  updateMode,  version, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



