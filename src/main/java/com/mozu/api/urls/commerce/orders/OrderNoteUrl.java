/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.orders;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class OrderNoteUrl
{

	/**
	 * Get Resource Url for GetOrderNotes
	 * @param orderId 
	 * @return   String Resource Url
	 */
	public static MozuUrl getOrderNotesUrl(String orderId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/notes");
		formatter.formatUrl("orderId", orderId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetOrderNote
	 * @param noteId 
	 * @param orderId 
	 * @return   String Resource Url
	 */
	public static MozuUrl getOrderNoteUrl(String noteId, String orderId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/notes/{noteId}");
		formatter.formatUrl("noteId", noteId);
		formatter.formatUrl("orderId", orderId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreateOrderNote
	 * @param orderId 
	 * @return   String Resource Url
	 */
	public static MozuUrl createOrderNoteUrl(String orderId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/notes");
		formatter.formatUrl("orderId", orderId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateOrderNote
	 * @param noteId 
	 * @param orderId 
	 * @return   String Resource Url
	 */
	public static MozuUrl updateOrderNoteUrl(String noteId, String orderId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/notes/{noteId}");
		formatter.formatUrl("noteId", noteId);
		formatter.formatUrl("orderId", orderId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteOrderNote
	 * @param noteId 
	 * @param orderId 
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteOrderNoteUrl(String noteId, String orderId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/notes/{noteId}");
		formatter.formatUrl("noteId", noteId);
		formatter.formatUrl("orderId", orderId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

