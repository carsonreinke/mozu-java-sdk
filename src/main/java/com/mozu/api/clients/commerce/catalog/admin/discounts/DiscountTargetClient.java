/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin.discounts;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;

/** <summary>
 * Retrieves and modifies the products, categories, and shipping methods eligible for discounts in the form of a fixed dollar amount, percentage off a product price, or free shipping.
 * </summary>
 */
public class DiscountTargetClient {
	
	/**
	 * Retrieves the discount target, that is which products, categories, or shipping methods are eligible for the discount.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.DiscountTarget> mozuClient=GetDiscountTargetClient(dataViewMode,  discountId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DiscountTarget discountTarget = client.Result();
	 * </code></pre></p>
	 * @param discountId Unique identifier of the discount. System-supplied and read only.
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.DiscountTarget>
	 * @see com.mozu.api.contracts.productadmin.DiscountTarget
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.DiscountTarget> getDiscountTargetClient(com.mozu.api.DataViewMode dataViewMode, Integer discountId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.discounts.DiscountTargetUrl.getDiscountTargetUrl(discountId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.DiscountTarget.class;
		MozuClient<com.mozu.api.contracts.productadmin.DiscountTarget> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * Modifies properties of the discount target, for example, the dollar amount, or precentage off the price.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.DiscountTarget> mozuClient=UpdateDiscountTargetClient(dataViewMode,  discountTarget,  discountId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DiscountTarget discountTarget = client.Result();
	 * </code></pre></p>
	 * @param discountId Unique identifier of the discount. System-supplied and read-only.
	 * @param authTicket User Auth Ticket
	 * @param discountTarget Properties of the discount target to modify. Required properties: Target.Type. Any unspecified properties are set to null and boolean variables to false.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.DiscountTarget>
	 * @see com.mozu.api.contracts.productadmin.DiscountTarget
	 * @see com.mozu.api.contracts.productadmin.DiscountTarget
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.DiscountTarget> updateDiscountTargetClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.DiscountTarget discountTarget, Integer discountId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.discounts.DiscountTargetUrl.updateDiscountTargetUrl(discountId);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.DiscountTarget.class;
		MozuClient<com.mozu.api.contracts.productadmin.DiscountTarget> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(discountTarget);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

}



