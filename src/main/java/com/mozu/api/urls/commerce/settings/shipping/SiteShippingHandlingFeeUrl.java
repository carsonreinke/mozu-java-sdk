/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.settings.shipping;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class SiteShippingHandlingFeeUrl
{

	/**
	 * Get Resource Url for GetOrderHandlingFee
	 * @return   String Resource Url
	 */
	public static MozuUrl getOrderHandlingFeeUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/settings/shipping/orderhandlingfee");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreateOrderHandlingFee
	 * @return   String Resource Url
	 */
	public static MozuUrl createOrderHandlingFeeUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/settings/shipping/orderhandlingfee");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateOrderHandlingFee
	 * @return   String Resource Url
	 */
	public static MozuUrl updateOrderHandlingFeeUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/settings/shipping/orderhandlingfee");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

