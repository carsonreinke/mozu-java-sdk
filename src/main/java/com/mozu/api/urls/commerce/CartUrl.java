/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class CartUrl
{

	/**
	 * Get Resource Url for GetCart
	 * @param cartId Identifier of the cart to retrieve.
	 * @return   String Resource Url
	 */
	public static MozuUrl getCartUrl(String cartId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/carts/{cartId}");
		formatter.formatUrl("cartId", cartId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetOrCreateCart
	 * @return   String Resource Url
	 */
	public static MozuUrl getOrCreateCartUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/carts/current");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetCartSummary
	 * @return   String Resource Url
	 */
	public static MozuUrl getCartSummaryUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/carts/summary");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetUserCart
	 * @param userId Unique identifier of the user whose cart you want to retrieve.
	 * @return   String Resource Url
	 */
	public static MozuUrl getUserCartUrl(String userId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/carts/user/{userId}");
		formatter.formatUrl("userId", userId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetUserCartSummary
	 * @param userId Unique identifier of the user whose cart details you want to retrieve.
	 * @return   String Resource Url
	 */
	public static MozuUrl getUserCartSummaryUrl(String userId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/carts/user/{userId}/summary");
		formatter.formatUrl("userId", userId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateCart
	 * @return   String Resource Url
	 */
	public static MozuUrl updateCartUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/carts/current");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteCart
	 * @param cartId Identifier of the cart to delete.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteCartUrl(String cartId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/carts/{cartId}");
		formatter.formatUrl("cartId", cartId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteCurrentCart
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteCurrentCartUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/carts/current");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

