/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;

/** <summary>
 * Use the Orders resource to manage all components of order processing, payment, and fulfillment.
 * </summary>
 */
public class OrderClient {
	
	/**
	 * Retrieves a list of orders according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderCollection> mozuClient=GetOrdersClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * OrderCollection orderCollection = client.Result();
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.OrderCollection>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderCollection> getOrdersClient() throws Exception
	{
		return getOrdersClient( null,  null,  null,  null,  null,  null, null);
	}

	/**
	 * Retrieves a list of orders according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderCollection> mozuClient=GetOrdersClient( startIndex,  pageSize,  sortBy,  filter,  q,  qLimit, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * OrderCollection orderCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. You can filter an order's search results by any of its properties, including status, contact information, or total. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=Status+eq+Submitted"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param q A list of order search terms to use in the query when searching across order number and the name or email of the billing contact. Separate multiple search terms with a space character.
	 * @param qLimit The maximum number of search results to return in the response. You can limit any range between 1-100.
	 * @param sortBy 
	 * @param startIndex 
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.OrderCollection>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderCollection> getOrdersClient(Integer startIndex, Integer pageSize, String sortBy, String filter, String q, Integer qLimit, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.OrderUrl.getOrdersUrl(filter, pageSize, q, qLimit, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.OrderCollection.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * Retrieves available order actions which depends on the status of the order. Actions are "CreateOrder," "SubmitOrder," "SetOrderAsProcessing," "CloseOrder," or "CancelOrder."
	 * <p><pre><code>
	 * MozuClient<List<String>> mozuClient=GetAvailableActionsClient( orderId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * string string = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the available order actions to get.
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <List<string>>
	 * @see string
	 */
	public static MozuClient<List<String>> getAvailableActionsClient(String orderId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.OrderUrl.getAvailableActionsUrl(orderId);
		String verb = "GET";
		Class<?> clz = new ArrayList<String>(){}.getClass();
		MozuClient<List<String>> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.pricingruntime.TaxableOrder>> mozuClient=GetTaxableOrdersClient( orderId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * TaxableOrder taxableOrder = client.Result();
	 * </code></pre></p>
	 * @param orderId 
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.pricingruntime.TaxableOrder>>
	 * @see com.mozu.api.contracts.pricingruntime.TaxableOrder
	 */
	public static MozuClient<List<com.mozu.api.contracts.pricingruntime.TaxableOrder>> getTaxableOrdersClient(String orderId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.OrderUrl.getTaxableOrdersUrl(orderId);
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.pricingruntime.TaxableOrder>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.pricingruntime.TaxableOrder>> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * Retrieves the details of an order specified by the order ID.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=GetOrderClient( orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order details to get.
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> getOrderClient(String orderId) throws Exception
	{
		return getOrderClient( orderId,  false, null);
	}

	/**
	 * Retrieves the details of an order specified by the order ID.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=GetOrderClient( orderId,  draft, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param draft If true, retrieve the draft version of the order, which might include uncommitted changes to the order or its components.
	 * @param orderId Unique identifier of the order details to get.
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> getOrderClient(String orderId, Boolean draft, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.OrderUrl.getOrderUrl(draft, orderId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * Creates a new order for no-cart quick-ordering scenarios.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=CreateOrderClient( order, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @param order All properties of the order to place.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> createOrderClient(com.mozu.api.contracts.commerceruntime.orders.Order order, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.OrderUrl.createOrderUrl();
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(order);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * Creates a new order from an existing cart when the customer chooses to proceed to checkout.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=CreateOrderFromCartClient( cartId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param cartId Unique identifier of the cart. This is the original cart ID expressed as a GUID.
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> createOrderFromCartClient(String cartId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.OrderUrl.createOrderFromCartUrl(cartId);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * Perform the specified action for an order. Available actions depend on the current status of the order. When in doubt, first get a list of available order actions.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=PerformOrderActionClient( action,  orderId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param authTicket User Auth Ticket
	 * @param action Action to perform, which can be "CreateOrder," "SubmitOrder," "SetOrderAsProcessing," "CloseOrder," or "CancelOrder."
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderAction
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> performOrderActionClient(com.mozu.api.contracts.commerceruntime.orders.OrderAction action, String orderId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.OrderUrl.performOrderActionUrl(orderId);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(action);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * Update the properties of a discount applied to an order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=UpdateOrderDiscountClient( discount,  orderId,  discountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param discountId Unique identifier of the discount. System-supplied and read only.
	 * @param orderId Unique identifier of the order discount. System-supplied and read only.
	 * @param authTicket User Auth Ticket
	 * @param discount Properties of the order discount to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> updateOrderDiscountClient(com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount discount, String orderId, Integer discountId) throws Exception
	{
		return updateOrderDiscountClient( discount,  orderId,  discountId,  null,  null, null);
	}

	/**
	 * Update the properties of a discount applied to an order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=UpdateOrderDiscountClient( discount,  orderId,  discountId,  updateMode,  version, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param discountId Unique identifier of the discount. System-supplied and read only.
	 * @param orderId Unique identifier of the order discount. System-supplied and read only.
	 * @param updateMode Specifies whether to modify the discount by updating the original order, updating the order in draft mode, or updating the order in draft mode and then committing the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @param authTicket User Auth Ticket
	 * @param discount Properties of the order discount to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> updateOrderDiscountClient(com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount discount, String orderId, Integer discountId, String updateMode, String version, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.OrderUrl.updateOrderDiscountUrl(discountId, orderId, updateMode, version);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(discount);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * Deletes the current draft version of the order, which also deletes any uncommitted changes made to the order in draft mode.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteOrderDraftClient( orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the draft to delete.
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteOrderDraftClient(String orderId) throws Exception
	{
		return deleteOrderDraftClient( orderId,  null, null);
	}

	/**
	 * Deletes the current draft version of the order, which also deletes any uncommitted changes made to the order in draft mode.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteOrderDraftClient( orderId,  version, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the draft to delete.
	 * @param version If applicable, the version of the order draft to delete.
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteOrderDraftClient(String orderId, String version, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.OrderUrl.deleteOrderDraftUrl(orderId, version);
		String verb = "PUT";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * Updates the user ID of the shopper who placed the order to the current user.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=ChangeOrderUserIdClient( orderId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> changeOrderUserIdClient(String orderId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.OrderUrl.changeOrderUserIdUrl(orderId);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * Updates the specified order when additional order information, such as shipping or billing information, is modified during the checkout process.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=UpdateOrderClient( order,  orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order to update.
	 * @param authTicket User Auth Ticket
	 * @param order The properties of the order to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> updateOrderClient(com.mozu.api.contracts.commerceruntime.orders.Order order, String orderId) throws Exception
	{
		return updateOrderClient( order,  orderId,  null,  null, null);
	}

	/**
	 * Updates the specified order when additional order information, such as shipping or billing information, is modified during the checkout process.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=UpdateOrderClient( order,  orderId,  updateMode,  version, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order to update.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @param authTicket User Auth Ticket
	 * @param order The properties of the order to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> updateOrderClient(com.mozu.api.contracts.commerceruntime.orders.Order order, String orderId, String updateMode, String version, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.OrderUrl.updateOrderUrl(orderId, updateMode, version);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(order);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

}



