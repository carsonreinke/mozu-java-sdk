/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;

/** <summary>
 * Define and manage discounts to apply to products, product categories, or orders. The discounts can be a specified amount off the price, percentage off the price, or for free shipping. Create a coupon code that shoppers can use to redeem the discount.
 * </summary>
 */
public class DiscountClient {
	
	/**
	 * Retrieves a list of discounts according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.DiscountCollection> mozuClient=GetDiscountsClient(dataViewMode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DiscountCollection discountCollection = client.Result();
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.DiscountCollection>
	 * @see com.mozu.api.contracts.productadmin.DiscountCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.DiscountCollection> getDiscountsClient(com.mozu.api.DataViewMode dataViewMode) throws Exception
	{
		return getDiscountsClient(dataViewMode,  null,  null,  null,  null, null);
	}

	/**
	 * Retrieves a list of discounts according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.DiscountCollection> mozuClient=GetDiscountsClient(dataViewMode,  startIndex,  pageSize,  sortBy,  filter, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DiscountCollection discountCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param sortBy 
	 * @param startIndex 
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.DiscountCollection>
	 * @see com.mozu.api.contracts.productadmin.DiscountCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.DiscountCollection> getDiscountsClient(com.mozu.api.DataViewMode dataViewMode, Integer startIndex, Integer pageSize, String sortBy, String filter, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.DiscountUrl.getDiscountsUrl(filter, pageSize, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.DiscountCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.DiscountCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * Retrieves the details of a single discount.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Discount> mozuClient=GetDiscountClient(dataViewMode,  discountId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Discount discount = client.Result();
	 * </code></pre></p>
	 * @param discountId Unique identifier of the discount. System-supplied and read-only.
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Discount>
	 * @see com.mozu.api.contracts.productadmin.Discount
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Discount> getDiscountClient(com.mozu.api.DataViewMode dataViewMode, Integer discountId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.DiscountUrl.getDiscountUrl(discountId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.Discount.class;
		MozuClient<com.mozu.api.contracts.productadmin.Discount> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * Retrieves the localized content specified for the specified discount.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.DiscountLocalizedContent> mozuClient=GetDiscountContentClient(dataViewMode,  discountId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DiscountLocalizedContent discountLocalizedContent = client.Result();
	 * </code></pre></p>
	 * @param discountId Unique identifier of the discount. System-supplied and read-only.
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.DiscountLocalizedContent>
	 * @see com.mozu.api.contracts.productadmin.DiscountLocalizedContent
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.DiscountLocalizedContent> getDiscountContentClient(com.mozu.api.DataViewMode dataViewMode, Integer discountId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.DiscountUrl.getDiscountContentUrl(discountId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.DiscountLocalizedContent.class;
		MozuClient<com.mozu.api.contracts.productadmin.DiscountLocalizedContent> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * Generates a random code for a coupon.
	 * <p><pre><code>
	 * MozuClient<String> mozuClient=GenerateRandomCouponClient(dataViewMode, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * string string = client.Result();
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <string>
	 * @see string
	 */
	public static MozuClient<String> generateRandomCouponClient(com.mozu.api.DataViewMode dataViewMode, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.DiscountUrl.generateRandomCouponUrl();
		String verb = "GET";
		Class<?> clz = String.class;
		MozuClient<String> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * Creates a discount.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Discount> mozuClient=CreateDiscountClient(dataViewMode,  discount, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Discount discount = client.Result();
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @param discount Properties of the discount to create. Required properties: Content.Name, AmountType, StartDate, and Target.Type.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Discount>
	 * @see com.mozu.api.contracts.productadmin.Discount
	 * @see com.mozu.api.contracts.productadmin.Discount
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Discount> createDiscountClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.Discount discount, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.DiscountUrl.createDiscountUrl();
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.Discount.class;
		MozuClient<com.mozu.api.contracts.productadmin.Discount> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(discount);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * Redeems a discount configured in the product admin.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.discounts.Redemption> mozuClient=RedeemDiscountClient(dataViewMode,  redemption, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Redemption redemption = client.Result();
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @param redemption Properties of the product discount redemption.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.discounts.Redemption>
	 * @see com.mozu.api.contracts.productadmin.discounts.Redemption
	 * @see com.mozu.api.contracts.productadmin.discounts.Redemption
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.discounts.Redemption> redeemDiscountClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.discounts.Redemption redemption, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.DiscountUrl.redeemDiscountUrl();
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.discounts.Redemption.class;
		MozuClient<com.mozu.api.contracts.productadmin.discounts.Redemption> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(redemption);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * Modifies a discount.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Discount> mozuClient=UpdateDiscountClient(dataViewMode,  discount,  discountId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Discount discount = client.Result();
	 * </code></pre></p>
	 * @param discountId Unique identifier of the discount. System-supplied and read-only.
	 * @param authTicket User Auth Ticket
	 * @param discount Properties of the discount to update. Required properties: Content.Name, AmountType, StartDate, and Target.Type. Any unspecified properties are set to null and boolean variables are set to false.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Discount>
	 * @see com.mozu.api.contracts.productadmin.Discount
	 * @see com.mozu.api.contracts.productadmin.Discount
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Discount> updateDiscountClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.Discount discount, Integer discountId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.DiscountUrl.updateDiscountUrl(discountId);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.Discount.class;
		MozuClient<com.mozu.api.contracts.productadmin.Discount> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(discount);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * Modifies the localized content for the specified discount. Rename the discount without modifying any other discount properties.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.DiscountLocalizedContent> mozuClient=UpdateDiscountContentClient(dataViewMode,  content,  discountId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DiscountLocalizedContent discountLocalizedContent = client.Result();
	 * </code></pre></p>
	 * @param discountId Unique identifier of the discount. System-supplied and read-only.
	 * @param authTicket User Auth Ticket
	 * @param content New Name and/or LocaleCode. Properties of the content to update. Required property: Name.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.DiscountLocalizedContent>
	 * @see com.mozu.api.contracts.productadmin.DiscountLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.DiscountLocalizedContent
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.DiscountLocalizedContent> updateDiscountContentClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.DiscountLocalizedContent content, Integer discountId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.DiscountUrl.updateDiscountContentUrl(discountId);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.DiscountLocalizedContent.class;
		MozuClient<com.mozu.api.contracts.productadmin.DiscountLocalizedContent> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(content);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * Deletes a discount specified by its discount ID.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteDiscountClient(dataViewMode,  discountId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param discountId Unique identifier of the discount. System-supplied and read-only.
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteDiscountClient(com.mozu.api.DataViewMode dataViewMode, Integer discountId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.DiscountUrl.deleteDiscountUrl(discountId);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * Deletes a previous discount redemption from an order.
	 * <p><pre><code>
	 * MozuClient mozuClient=UnRedeemDiscountClient(dataViewMode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient unRedeemDiscountClient(com.mozu.api.DataViewMode dataViewMode) throws Exception
	{
		return unRedeemDiscountClient(dataViewMode,  null,  null, null);
	}

	/**
	 * Deletes a previous discount redemption from an order.
	 * <p><pre><code>
	 * MozuClient mozuClient=UnRedeemDiscountClient(dataViewMode,  discountId,  orderNumber, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param discountId Unique identifier of the previously redeemed discount. System-supplied and read only.
	 * @param orderNumber The number of the order associated with the redeemed product discount.
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient unRedeemDiscountClient(com.mozu.api.DataViewMode dataViewMode, Integer discountId, Integer orderNumber, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.DiscountUrl.unRedeemDiscountUrl(discountId, orderNumber);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

}



