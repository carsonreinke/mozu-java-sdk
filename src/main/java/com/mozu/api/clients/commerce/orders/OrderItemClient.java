/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.orders;

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
public class OrderItemClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItem> mozuClient=GetOrderItemClient( orderId,  orderItemId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * OrderItem orderItem = client.Result();
	 * </code></pre></p>
	 * @param orderId 
	 * @param orderItemId 
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.OrderItem>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItem> getOrderItemClient(String orderId, String orderItemId) throws Exception
	{
		return getOrderItemClient( orderId,  orderItemId,  false, null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItem> mozuClient=GetOrderItemClient( orderId,  orderItemId,  draft, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * OrderItem orderItem = client.Result();
	 * </code></pre></p>
	 * @param draft 
	 * @param orderId 
	 * @param orderItemId 
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.OrderItem>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItem> getOrderItemClient(String orderId, String orderItemId, Boolean draft, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.OrderItemUrl.getOrderItemUrl(draft, orderId, orderItemId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.OrderItem.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItem> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection> mozuClient=GetOrderItemsClient( orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * OrderItemCollection orderItemCollection = client.Result();
	 * </code></pre></p>
	 * @param orderId 
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection> getOrderItemsClient(String orderId) throws Exception
	{
		return getOrderItemsClient( orderId,  false, null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection> mozuClient=GetOrderItemsClient( orderId,  draft, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * OrderItemCollection orderItemCollection = client.Result();
	 * </code></pre></p>
	 * @param draft 
	 * @param orderId 
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection> getOrderItemsClient(String orderId, Boolean draft, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.OrderItemUrl.getOrderItemsUrl(draft, orderId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=CreateOrderItemClient( orderItem,  orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId 
	 * @param authTicket User Auth Ticket
	 * @param orderItem 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> createOrderItemClient(com.mozu.api.contracts.commerceruntime.orders.OrderItem orderItem, String orderId) throws Exception
	{
		return createOrderItemClient( orderItem,  orderId,  null,  null, null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=CreateOrderItemClient( orderItem,  orderId,  updateMode,  version, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId 
	 * @param updateMode 
	 * @param version 
	 * @param authTicket User Auth Ticket
	 * @param orderItem 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> createOrderItemClient(com.mozu.api.contracts.commerceruntime.orders.OrderItem orderItem, String orderId, String updateMode, String version, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.OrderItemUrl.createOrderItemUrl(orderId, updateMode, version);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(orderItem);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=UpdateOrderItemDiscountClient( discount,  discountId,  orderId,  orderItemId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param discountId 
	 * @param orderId 
	 * @param orderItemId 
	 * @param authTicket User Auth Ticket
	 * @param discount 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> updateOrderItemDiscountClient(com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount discount, Integer discountId, String orderId, String orderItemId) throws Exception
	{
		return updateOrderItemDiscountClient( discount,  discountId,  orderId,  orderItemId,  null,  null, null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=UpdateOrderItemDiscountClient( discount,  discountId,  orderId,  orderItemId,  updateMode,  version, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param discountId 
	 * @param orderId 
	 * @param orderItemId 
	 * @param updateMode 
	 * @param version 
	 * @param authTicket User Auth Ticket
	 * @param discount 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> updateOrderItemDiscountClient(com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount discount, Integer discountId, String orderId, String orderItemId, String updateMode, String version, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.OrderItemUrl.updateOrderItemDiscountUrl(discountId, orderId, orderItemId, updateMode, version);
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
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=UpdateItemProductPriceClient( orderId,  orderItemId,  price);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId 
	 * @param orderItemId 
	 * @param price 
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> updateItemProductPriceClient(String orderId, String orderItemId, Double price) throws Exception
	{
		return updateItemProductPriceClient( orderId,  orderItemId,  price,  null,  null, null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=UpdateItemProductPriceClient( orderId,  orderItemId,  price,  updateMode,  version, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId 
	 * @param orderItemId 
	 * @param price 
	 * @param updateMode 
	 * @param version 
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> updateItemProductPriceClient(String orderId, String orderItemId, Double price, String updateMode, String version, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.OrderItemUrl.updateItemProductPriceUrl(orderId, orderItemId, price, updateMode, version);
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
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=UpdateItemQuantityClient( orderId,  orderItemId,  quantity);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId 
	 * @param orderItemId 
	 * @param quantity 
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> updateItemQuantityClient(String orderId, String orderItemId, Integer quantity) throws Exception
	{
		return updateItemQuantityClient( orderId,  orderItemId,  quantity,  null,  null, null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=UpdateItemQuantityClient( orderId,  orderItemId,  quantity,  updateMode,  version, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId 
	 * @param orderItemId 
	 * @param quantity 
	 * @param updateMode 
	 * @param version 
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> updateItemQuantityClient(String orderId, String orderItemId, Integer quantity, String updateMode, String version, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.OrderItemUrl.updateItemQuantityUrl(orderId, orderItemId, quantity, updateMode, version);
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
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=DeleteOrderItemClient( orderId,  orderItemId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId 
	 * @param orderItemId 
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> deleteOrderItemClient(String orderId, String orderItemId) throws Exception
	{
		return deleteOrderItemClient( orderId,  orderItemId,  null,  null, null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=DeleteOrderItemClient( orderId,  orderItemId,  updateMode,  version, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId 
	 * @param orderItemId 
	 * @param updateMode 
	 * @param version 
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> deleteOrderItemClient(String orderId, String orderItemId, String updateMode, String version, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.OrderItemUrl.deleteOrderItemUrl(orderId, orderItemId, updateMode, version);
		String verb = "DELETE";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

}



