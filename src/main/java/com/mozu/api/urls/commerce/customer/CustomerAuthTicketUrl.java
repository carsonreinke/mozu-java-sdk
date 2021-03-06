/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.customer;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class CustomerAuthTicketUrl
{

	/**
	 * Get Resource Url for CreateUserAuthTicket
	 * @return   String Resource Url
	 */
	public static MozuUrl createUserAuthTicketUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/authtickets/");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for RefreshUserAuthTicket
	 * @param refreshToken 
	 * @return   String Resource Url
	 */
	public static MozuUrl refreshUserAuthTicketUrl(String refreshToken)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/authtickets/refresh?refreshToken={refreshToken}");
		formatter.formatUrl("refreshToken", refreshToken);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

