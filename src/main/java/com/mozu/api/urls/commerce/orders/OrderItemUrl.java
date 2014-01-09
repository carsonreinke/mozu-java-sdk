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
	 * @param draft If true, retrieve the draft version of this order item, which might include uncommitted changes to the order item, the order, or other order components.
	 * @param orderId Unique identifier of the order item to retrieve.
	 * @param orderItemId Unique identifier of the order item details to retrieve.
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
	 * @param draft If true, retrieve the draft version of the order's items, which might include uncommitted changes to one or more order items, the order itself, or other order components.
	 * @param orderId Unique identifier of the order items to retrieve.
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
	 * @param orderId Unique identifier of the order for which to add the item.
	 * @param skipInventoryCheck 
	 * @param updateMode Specifies whether to add the item by updating the original order, updating the order in draft mode, or updating the order in draft mode and then committing the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @return   String Resource Url
	 */
	public static MozuUrl createOrderItemUrl(String orderId, Boolean skipInventoryCheck, String updateMode, String version)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/items?updatemode={updateMode}&version={version}&skipInventoryCheck={skipInventoryCheck}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("skipInventoryCheck", skipInventoryCheck);
		formatter.formatUrl("updateMode", updateMode);
		formatter.formatUrl("version", version);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateOrderItemDiscount
	 * @param discountId Unique identifier of the discount. System-supplied and read only.
	 * @param orderId Unique identifier of the order associated with the item discount.
	 * @param orderItemId Unique identifier of the item in the order.
	 * @param updateMode Specifies whether to change the item discount by updating the original order, updating the order in draft mode, or updating the order in draft mode and then committing the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
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
	 * Get Resource Url for UpdateItemFulfillment
	 * @param orderId 
	 * @param orderItemId 
	 * @param updateMode 
	 * @param version 
	 * @return   String Resource Url
	 */
	public static MozuUrl updateItemFulfillmentUrl(String orderId, String orderItemId, String updateMode, String version)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/items/{orderItemId}/fulfillment?updatemode={updateMode}&version={version}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("orderItemId", orderItemId);
		formatter.formatUrl("updateMode", updateMode);
		formatter.formatUrl("version", version);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateItemProductPrice
	 * @param orderId Unique identifier of the order containing the item to price override.
	 * @param orderItemId Unique identifier of the item in the order to price override.
	 * @param price The override price to specify for this item in the specified order.
	 * @param updateMode Specifies whether to change the product price by updating the original order, updating the order in draft mode, or updating the order in draft mode and then committing the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
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
	 * @param orderId Unique identifier of the order containing the item to update quantity.
	 * @param orderItemId Unique identifier of the item in the order to update quantity.
	 * @param quantity The quantity of the item in the order to update.
	 * @param updateMode Specifies whether to change the item quantity by updating the original order, updating the order in draft mode, or updating the order in draft mode and then committing the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
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
	 * @param orderId Unique identifier of the order with the item to remove.
	 * @param orderItemId Unique identifier of the item to remove from the order.
	 * @param updateMode Specifies whether to remove the item by updating the original order, updating the order in draft mode, or updating the order in draft mode and then committing the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
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

