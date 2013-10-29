
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.urls.commerce.orders;

import com.mozu.api.utils.UrlFormatter;


public class ShipmentUrl
{

	/**
        * Get Resource Url for GetAvailableShipmentActions
        * @param orderId Unique identifier of the order for which to get a list of available actions.
        * @param packageId Unique identifier for the physical package associated with the order for which to get a list of available actions.
        * @return    String Resource Url
    */
	public static String getAvailableShipmentActionsUrl(String orderId, String packageId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/shipments/{packageId}/actions");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("packageId", packageId);
		return formatter.getResourceUrl();
	}

	/**
        * Get Resource Url for GetShipment
        * @param orderId Unique identifier of the order associated with the shipment to retrieve.
        * @param shipmentId Unique identifier of the shipment to retrieve.
        * @return    String Resource Url
    */
	public static String getShipmentUrl(String orderId, String shipmentId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/shipments/{shipmentId}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("shipmentId", shipmentId);
		return formatter.getResourceUrl();
	}

	/**
        * Get Resource Url for GetAvailableShipmentMethods
        * @param orderId Unique identifier of the order for the available shipment methods being retrieved.
        * @return    String Resource Url
    */
	public static String getAvailableShipmentMethodsUrl(String orderId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/shipments/methods");
		formatter.formatUrl("orderId", orderId);
		return formatter.getResourceUrl();
	}

		/**
        * Get Resource Url for CreatePackageShipments
        * @param orderId Unique identifier of the order for this shipment.
        * @return    String Resource Url
    */
	public static String createPackageShipmentsUrl(String orderId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/shipments");
		formatter.formatUrl("orderId", orderId);
		return formatter.getResourceUrl();
	}

	/**
        * Get Resource Url for PerformShipmentAction
        * @param orderId Unique identifier of the order associated with the shipment for which to perform the action.
        * @return    String Resource Url
    */
	public static String performShipmentActionUrl(String orderId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/shipments/actions/");
		formatter.formatUrl("orderId", orderId);
		return formatter.getResourceUrl();
	}

			/**
        * Get Resource Url for DeleteShipment
        * @param orderId Unique identifier of the order to cancel shipment.
        * @param shipmentId Unique identifier of the shipment to cancel.
        * @return    String Resource Url
    */
	public static String deleteShipmentUrl(String orderId, String shipmentId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/shipments/{shipmentId}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("shipmentId", shipmentId);
		return formatter.getResourceUrl();
	}

	
}

