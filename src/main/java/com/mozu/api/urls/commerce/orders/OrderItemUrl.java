/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.orders;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class OrderItemUrl
{

	/**
	 * Get Resource Url for GetOrderItem
	 * @param draft 
	 * @param orderId 
	 * @param orderItemId 
	 * @return   String Resource Url
	 */
	public static MozuUrl getOrderItemUrl(Boolean draft, String orderId, String orderItemId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/items/{orderItemId}?draft={draft}");
		formatter.formatUrl("draft", draft);
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("orderItemId", orderItemId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetOrderItems
	 * @param draft 
	 * @param orderId 
	 * @return   String Resource Url
	 */
	public static MozuUrl getOrderItemsUrl(Boolean draft, String orderId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/items?draft={draft}");
		formatter.formatUrl("draft", draft);
		formatter.formatUrl("orderId", orderId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreateOrderItem
	 * @param orderId 
	 * @param updateMode 
	 * @param version 
	 * @return   String Resource Url
	 */
	public static MozuUrl createOrderItemUrl(String orderId, String updateMode, String version)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/items?updatemode={updateMode}&version={version}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("updateMode", updateMode);
		formatter.formatUrl("version", version);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateOrderItemDiscount
	 * @param discountId 
	 * @param orderId 
	 * @param orderItemId 
	 * @param updateMode 
	 * @param version 
	 * @return   String Resource Url
	 */
	public static MozuUrl updateOrderItemDiscountUrl(Integer discountId, String orderId, String orderItemId, String updateMode, String version)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/items/{orderItemId}/discounts/{discountId}?updatemode={updateMode}&version={version}");
		formatter.formatUrl("discountId", discountId);
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("orderItemId", orderItemId);
		formatter.formatUrl("updateMode", updateMode);
		formatter.formatUrl("version", version);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateItemProductPrice
	 * @param orderId 
	 * @param orderItemId 
	 * @param price 
	 * @param updateMode 
	 * @param version 
	 * @return   String Resource Url
	 */
	public static MozuUrl updateItemProductPriceUrl(String orderId, String orderItemId, Double price, String updateMode, String version)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/items/{orderItemId}/price/{price}?updatemode={updateMode}&version={version}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("orderItemId", orderItemId);
		formatter.formatUrl("price", price);
		formatter.formatUrl("updateMode", updateMode);
		formatter.formatUrl("version", version);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateItemQuantity
	 * @param orderId 
	 * @param orderItemId 
	 * @param quantity 
	 * @param updateMode 
	 * @param version 
	 * @return   String Resource Url
	 */
	public static MozuUrl updateItemQuantityUrl(String orderId, String orderItemId, Integer quantity, String updateMode, String version)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/items/{orderItemId}/quantity/{quantity}?updatemode={updateMode}&version={version}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("orderItemId", orderItemId);
		formatter.formatUrl("quantity", quantity);
		formatter.formatUrl("updateMode", updateMode);
		formatter.formatUrl("version", version);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteOrderItem
	 * @param orderId 
	 * @param orderItemId 
	 * @param updateMode 
	 * @param version 
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteOrderItemUrl(String orderId, String orderItemId, String updateMode, String version)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/items/{orderItemId}?updatemode={updateMode}&version={version}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("orderItemId", orderItemId);
		formatter.formatUrl("updateMode", updateMode);
		formatter.formatUrl("version", version);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

