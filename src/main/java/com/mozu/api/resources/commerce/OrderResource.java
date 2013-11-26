/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce;

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
public class OrderResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;
	public OrderResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	OrderCollection orderCollection = order.GetOrders();
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderCollection
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderCollection
	 */
	public com.mozu.api.contracts.commerceruntime.orders.OrderCollection getOrders() throws Exception
	{
		return getOrders( null,  null,  null,  null,  null,  null, null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	OrderCollection orderCollection = order.GetOrders( filter,  pageSize,  q,  qLimit,  sortBy,  startIndex, authTicket);
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param q 
	 * @param qLimit 
	 * @param sortBy 
	 * @param startIndex 
	 * @param authTicket User Auth Ticket
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderCollection
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderCollection
	 */
	public com.mozu.api.contracts.commerceruntime.orders.OrderCollection getOrders(String filter, Integer pageSize, String q, Integer qLimit, String sortBy, Integer startIndex, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderCollection> client = com.mozu.api.clients.commerce.OrderClient.getOrdersClient( filter,  pageSize,  q,  qLimit,  sortBy,  startIndex, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	string string = order.GetAvailableActions( orderId, authTicket);
	 * </code></pre></p>
	 * @param orderId 
	 * @param authTicket User Auth Ticket
	 * @return List<string>
	 * @see string
	 */
	public List<String> getAvailableActions(String orderId, AuthTicket authTicket) throws Exception
	{
		MozuClient<List<String>> client = com.mozu.api.clients.commerce.OrderClient.getAvailableActionsClient( orderId, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	TaxableOrder taxableOrder = order.GetTaxableOrders( orderId, authTicket);
	 * </code></pre></p>
	 * @param orderId 
	 * @param authTicket User Auth Ticket
	 * @return List<com.mozu.api.contracts.pricingruntime.TaxableOrder>
	 * @see com.mozu.api.contracts.pricingruntime.TaxableOrder
	 */
	public List<com.mozu.api.contracts.pricingruntime.TaxableOrder> getTaxableOrders(String orderId, AuthTicket authTicket) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.pricingruntime.TaxableOrder>> client = com.mozu.api.clients.commerce.OrderClient.getTaxableOrdersClient( orderId, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.GetOrder( orderId);
	 * </code></pre></p>
	 * @param orderId 
	 * @param authTicket User Auth Ticket
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order getOrder(String orderId) throws Exception
	{
		return getOrder( orderId,  false, null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.GetOrder( orderId,  draft, authTicket);
	 * </code></pre></p>
	 * @param draft 
	 * @param orderId 
	 * @param authTicket User Auth Ticket
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order getOrder(String orderId, Boolean draft, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.OrderClient.getOrderClient( orderId,  draft, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.CreateOrder( order, authTicket);
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @param order 
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order createOrder(com.mozu.api.contracts.commerceruntime.orders.Order order, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.OrderClient.createOrderClient( order, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.CreateOrderFromCart( cartId, authTicket);
	 * </code></pre></p>
	 * @param cartId 
	 * @param authTicket User Auth Ticket
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order createOrderFromCart(String cartId, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.OrderClient.createOrderFromCartClient( cartId, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.PerformOrderAction( action,  orderId, authTicket);
	 * </code></pre></p>
	 * @param orderId 
	 * @param authTicket User Auth Ticket
	 * @param action 
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderAction
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order performOrderAction(com.mozu.api.contracts.commerceruntime.orders.OrderAction action, String orderId, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.OrderClient.performOrderActionClient( action,  orderId, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.UpdateOrderDiscount( discount,  discountId,  orderId);
	 * </code></pre></p>
	 * @param discountId 
	 * @param orderId 
	 * @param authTicket User Auth Ticket
	 * @param discount 
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order updateOrderDiscount(com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount discount, Integer discountId, String orderId) throws Exception
	{
		return updateOrderDiscount( discount,  discountId,  orderId,  null,  null, null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.UpdateOrderDiscount( discount,  discountId,  orderId,  updateMode,  version, authTicket);
	 * </code></pre></p>
	 * @param discountId 
	 * @param orderId 
	 * @param updateMode 
	 * @param version 
	 * @param authTicket User Auth Ticket
	 * @param discount 
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order updateOrderDiscount(com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount discount, Integer discountId, String orderId, String updateMode, String version, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.OrderClient.updateOrderDiscountClient( discount,  discountId,  orderId,  updateMode,  version, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	order.DeleteOrderDraft( orderId);
	 * </code></pre></p>
	 * @param orderId 
	 * @param authTicket User Auth Ticket
	 * @return 
	 */
	public void deleteOrderDraft(String orderId) throws Exception
	{
		deleteOrderDraft( orderId,  null, null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	order.DeleteOrderDraft( orderId,  version, authTicket);
	 * </code></pre></p>
	 * @param orderId 
	 * @param version 
	 * @param authTicket User Auth Ticket
	 * @return 
	 */
	public void deleteOrderDraft(String orderId, String version, AuthTicket authTicket) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.OrderClient.deleteOrderDraftClient( orderId,  version, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.ChangeOrderUserId( orderId, authTicket);
	 * </code></pre></p>
	 * @param orderId 
	 * @param authTicket User Auth Ticket
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order changeOrderUserId(String orderId, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.OrderClient.changeOrderUserIdClient( orderId, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.UpdateOrder( order,  orderId);
	 * </code></pre></p>
	 * @param orderId 
	 * @param authTicket User Auth Ticket
	 * @param order 
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order updateOrder(com.mozu.api.contracts.commerceruntime.orders.Order order, String orderId) throws Exception
	{
		return updateOrder( order,  orderId,  null,  null, null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.UpdateOrder( order,  orderId,  updateMode,  version, authTicket);
	 * </code></pre></p>
	 * @param orderId 
	 * @param updateMode 
	 * @param version 
	 * @param authTicket User Auth Ticket
	 * @param order 
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order updateOrder(com.mozu.api.contracts.commerceruntime.orders.Order order, String orderId, String updateMode, String version, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.OrderClient.updateOrderClient( order,  orderId,  updateMode,  version, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



