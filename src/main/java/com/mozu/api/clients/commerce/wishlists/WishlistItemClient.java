/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.wishlists;

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
public class WishlistItemClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem> mozuClient=GetWishlistItemClient( wishlistId,  wishlistItemId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * WishlistItem wishlistItem = client.Result();
	 * </code></pre></p>
	 * @param wishlistId 
	 * @param wishlistItemId 
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem>
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem> getWishlistItemClient(String wishlistId, String wishlistItemId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.wishlists.WishlistItemUrl.getWishlistItemUrl(wishlistId, wishlistItemId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection> mozuClient=GetWishlistItemsClient( wishlistId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * WishlistItemCollection wishlistItemCollection = client.Result();
	 * </code></pre></p>
	 * @param wishlistId 
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection>
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection> getWishlistItemsClient(String wishlistId) throws Exception
	{
		return getWishlistItemsClient( wishlistId,  null,  null,  null,  null, null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection> mozuClient=GetWishlistItemsClient( wishlistId,  filter,  pageSize,  sortBy,  startIndex, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * WishlistItemCollection wishlistItemCollection = client.Result();
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param sortBy 
	 * @param startIndex 
	 * @param wishlistId 
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection>
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection> getWishlistItemsClient(String wishlistId, String filter, Integer pageSize, String sortBy, Integer startIndex, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.wishlists.WishlistItemUrl.getWishlistItemsUrl(filter, pageSize, sortBy, startIndex, wishlistId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItemCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem> mozuClient=AddItemToWishlistClient( wishlistItem,  wishlistId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * WishlistItem wishlistItem = client.Result();
	 * </code></pre></p>
	 * @param wishlistId 
	 * @param authTicket User Auth Ticket
	 * @param wishlistItem 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem>
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem> addItemToWishlistClient(com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem wishlistItem, String wishlistId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.wishlists.WishlistItemUrl.addItemToWishlistUrl(wishlistId);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(wishlistItem);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem> mozuClient=UpdateWishlistItemClient( wishlistItem,  wishlistId,  wishlistItemId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * WishlistItem wishlistItem = client.Result();
	 * </code></pre></p>
	 * @param wishlistId 
	 * @param wishlistItemId 
	 * @param authTicket User Auth Ticket
	 * @param wishlistItem 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem>
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem> updateWishlistItemClient(com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem wishlistItem, String wishlistId, String wishlistItemId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.wishlists.WishlistItemUrl.updateWishlistItemUrl(wishlistId, wishlistItemId);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(wishlistItem);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem> mozuClient=UpdateWishlistItemQuantityClient( quantity,  wishlistId,  wishlistItemId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * WishlistItem wishlistItem = client.Result();
	 * </code></pre></p>
	 * @param quantity 
	 * @param wishlistId 
	 * @param wishlistItemId 
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem>
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem> updateWishlistItemQuantityClient(Integer quantity, String wishlistId, String wishlistItemId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.wishlists.WishlistItemUrl.updateWishlistItemQuantityUrl(quantity, wishlistId, wishlistItemId);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistItem> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.Wishlist> mozuClient=RemoveAllWishlistItemsClient( wishlistId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Wishlist wishlist = client.Result();
	 * </code></pre></p>
	 * @param wishlistId 
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.wishlists.Wishlist>
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.Wishlist> removeAllWishlistItemsClient(String wishlistId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.wishlists.WishlistItemUrl.removeAllWishlistItemsUrl(wishlistId);
		String verb = "DELETE";
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
	 * MozuClient mozuClient=DeleteWishlistItemClient( wishlistId,  wishlistItemId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param wishlistId 
	 * @param wishlistItemId 
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteWishlistItemClient(String wishlistId, String wishlistItemId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.wishlists.WishlistItemUrl.deleteWishlistItemUrl(wishlistId, wishlistItemId);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

}



