/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;

/** <summary>
 * Use the Wish Lists resource to manage the shopper wish lists of products associated with a customer account. Although customer accounts are managed at the tenant level, the system stores shopper wish lists at the site level. This enables the same customer to have wish lists for each of a merchant's sites. Use the Wish List Items resource to manage items in a wish list.
 * </summary>
 */
public class WishlistClient {
	
	/**
	 * Retrieves a list of shopper wish lists according to any filter and sort criteria.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistCollection> mozuClient=GetWishlistsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * WishlistCollection wishlistCollection = client.Result();
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.wishlists.WishlistCollection>
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistCollection> getWishlistsClient() throws Exception
	{
		return getWishlistsClient( null,  null,  null,  null,  null,  null, null);
	}

	/**
	 * Retrieves a list of shopper wish lists according to any filter and sort criteria.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistCollection> mozuClient=GetWishlistsClient( startIndex,  pageSize,  sortBy,  filter,  q,  qLimit, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * WishlistCollection wishlistCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param q A list of search terms to use in the query when searching across wish list name. Separate multiple search terms with a space character.
	 * @param qLimit The maximum number of search results to return in the response. You can limit any range between 1-100.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.wishlists.WishlistCollection>
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistCollection> getWishlistsClient(Integer startIndex, Integer pageSize, String sortBy, String filter, String q, Integer qLimit, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.WishlistUrl.getWishlistsUrl(filter, pageSize, q, qLimit, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.wishlists.WishlistCollection.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * Retrieves the details of the shopper wish list specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.Wishlist> mozuClient=GetWishlistClient( wishlistId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Wishlist wishlist = client.Result();
	 * </code></pre></p>
	 * @param wishlistId Unique identifier of the shopper wish list to retrieve.
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.wishlists.Wishlist>
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.Wishlist> getWishlistClient(String wishlistId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.WishlistUrl.getWishlistUrl(wishlistId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.wishlists.Wishlist.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.Wishlist> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.Wishlist> mozuClient=GetWishlistByNameClient( customerAccountId,  wishlistName, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Wishlist wishlist = client.Result();
	 * </code></pre></p>
	 * @param customerAccountId 
	 * @param wishlistName 
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.wishlists.Wishlist>
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.Wishlist> getWishlistByNameClient(Integer customerAccountId, String wishlistName, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.WishlistUrl.getWishlistByNameUrl(customerAccountId, wishlistName);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.wishlists.Wishlist.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.Wishlist> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * Creates a new shopper wish list for the associated customer account. Although customer accounts are maintained at the tenant level, the system stores wish lists at the site level. Newly created wish lists do not have any items.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.Wishlist> mozuClient=CreateWishlistClient( wishlist, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Wishlist wishlist = client.Result();
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @param wishlist Properties of the wish list to create.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.wishlists.Wishlist>
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.Wishlist> createWishlistClient(com.mozu.api.contracts.commerceruntime.wishlists.Wishlist wishlist, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.WishlistUrl.createWishlistUrl();
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.wishlists.Wishlist.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.Wishlist> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(wishlist);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * Updates one or more properties of a shopper wish list defined for a customer account.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.Wishlist> mozuClient=UpdateWishlistClient( wishlist,  wishlistId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Wishlist wishlist = client.Result();
	 * </code></pre></p>
	 * @param wishlistId Unique identifier of the shopper wish list to update.
	 * @param authTicket User Auth Ticket
	 * @param wishlist Properties of the shopper wish list to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.wishlists.Wishlist>
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.Wishlist> updateWishlistClient(com.mozu.api.contracts.commerceruntime.wishlists.Wishlist wishlist, String wishlistId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.WishlistUrl.updateWishlistUrl(wishlistId);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.wishlists.Wishlist.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.Wishlist> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(wishlist);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * Deletes the shopper wish list specified in the request and all items associated with it.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteWishlistClient( wishlistId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param wishlistId Unique identifier of the wish list to delete.
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteWishlistClient(String wishlistId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.WishlistUrl.deleteWishlistUrl(wishlistId);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

}



