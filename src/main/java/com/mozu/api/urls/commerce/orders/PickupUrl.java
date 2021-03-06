/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.orders;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class PickupUrl
{

	/**
	 * Get Resource Url for GetPickup
	 * @param orderId Unique identifier of the order associated with the pickup.
	 * @param pickupId Unique identifier of the pickup to retrieve.
	 * @return   String Resource Url
	 */
	public static MozuUrl getPickupUrl(String orderId, String pickupId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/pickups/{pickupId}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("pickupId", pickupId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetAvailablePickupFulfillmentActions
	 * @param orderId Unique identifier of the order associated with the pickup.
	 * @param pickupId Unique identifier of the pickup for which to retrieve available actions.
	 * @return   String Resource Url
	 */
	public static MozuUrl getAvailablePickupFulfillmentActionsUrl(String orderId, String pickupId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/pickups/{pickupId}/actions");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("pickupId", pickupId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreatePickup
	 * @param orderId Unique identifier of the order.
	 * @return   String Resource Url
	 */
	public static MozuUrl createPickupUrl(String orderId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/pickups");
		formatter.formatUrl("orderId", orderId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdatePickup
	 * @param orderId Unique identifier of the order associated with the in-store pickup.
	 * @param pickupId Unique identifier of the pickup to update.
	 * @return   String Resource Url
	 */
	public static MozuUrl updatePickupUrl(String orderId, String pickupId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/pickups/{pickupId}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("pickupId", pickupId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeletePickup
	 * @param orderId Unique identifier of the order associated with the pickup.
	 * @param pickupId Unique identifier of the pickup to remove.
	 * @return   String Resource Url
	 */
	public static MozuUrl deletePickupUrl(String orderId, String pickupId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/pickups/{pickupId}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("pickupId", pickupId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

