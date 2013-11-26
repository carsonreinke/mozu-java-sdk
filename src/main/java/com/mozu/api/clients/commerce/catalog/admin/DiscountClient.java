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
 * 
 * </summary>
 */
public class DiscountClient {
	
	/**
	 * 
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
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.DiscountCollection> mozuClient=GetDiscountsClient(dataViewMode,  filter,  pageSize,  sortBy,  startIndex, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DiscountCollection discountCollection = client.Result();
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param sortBy 
	 * @param startIndex 
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.DiscountCollection>
	 * @see com.mozu.api.contracts.productadmin.DiscountCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.DiscountCollection> getDiscountsClient(com.mozu.api.DataViewMode dataViewMode, String filter, Integer pageSize, String sortBy, Integer startIndex, AuthTicket authTicket) throws Exception
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
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Discount> mozuClient=GetDiscountClient(dataViewMode,  discountId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Discount discount = client.Result();
	 * </code></pre></p>
	 * @param discountId 
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
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.DiscountLocalizedContent> mozuClient=GetDiscountContentClient(dataViewMode,  discountId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DiscountLocalizedContent discountLocalizedContent = client.Result();
	 * </code></pre></p>
	 * @param discountId 
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
	 * 
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
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Discount> mozuClient=CreateDiscountClient(dataViewMode,  discount, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Discount discount = client.Result();
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @param discount 
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
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.discounts.Redemption> mozuClient=RedeemDiscountClient(dataViewMode,  redemption, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Redemption redemption = client.Result();
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @param redemption 
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
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Discount> mozuClient=UpdateDiscountClient(dataViewMode,  discount,  discountId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Discount discount = client.Result();
	 * </code></pre></p>
	 * @param discountId 
	 * @param authTicket User Auth Ticket
	 * @param discount 
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
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.DiscountLocalizedContent> mozuClient=UpdateDiscountContentClient(dataViewMode,  content,  discountId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DiscountLocalizedContent discountLocalizedContent = client.Result();
	 * </code></pre></p>
	 * @param discountId 
	 * @param authTicket User Auth Ticket
	 * @param content 
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
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteDiscountClient(dataViewMode,  discountId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param discountId 
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
	 * 
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
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=UnRedeemDiscountClient(dataViewMode,  discountId,  orderNumber, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param discountId 
	 * @param orderNumber 
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



