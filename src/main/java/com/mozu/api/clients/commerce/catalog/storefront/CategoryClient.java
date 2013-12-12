/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.storefront;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;

/** <summary>
 * Get the product category hierarchy as it appears to shoppers who are browsing the storefront. The hierarchy can be returned as a flat list or as a category tree.
 * </summary>
 */
public class CategoryClient {
	
	/**
	 * Retrieves a list of categories according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.CategoryPagedCollection> mozuClient=GetCategoriesClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CategoryPagedCollection categoryPagedCollection = client.Result();
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.CategoryPagedCollection>
	 * @see com.mozu.api.contracts.productruntime.CategoryPagedCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.CategoryPagedCollection> getCategoriesClient() throws Exception
	{
		return getCategoriesClient( null,  null,  null,  null, null);
	}

	/**
	 * Retrieves a list of categories according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.CategoryPagedCollection> mozuClient=GetCategoriesClient( filter,  startIndex,  pageSize,  sortBy, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CategoryPagedCollection categoryPagedCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. You can filter product category search results by any of its properties, including its position in the category hierarchy. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param sortBy 
	 * @param startIndex 
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.CategoryPagedCollection>
	 * @see com.mozu.api.contracts.productruntime.CategoryPagedCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.CategoryPagedCollection> getCategoriesClient(String filter, Integer startIndex, Integer pageSize, String sortBy, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.CategoryUrl.getCategoriesUrl(filter, pageSize, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productruntime.CategoryPagedCollection.class;
		MozuClient<com.mozu.api.contracts.productruntime.CategoryPagedCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * Retrieves the details of a single category.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.Category> mozuClient=GetCategoryClient( categoryId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Category category = client.Result();
	 * </code></pre></p>
	 * @param categoryId Unique identifier for the storefront container used to organize products.
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.Category>
	 * @see com.mozu.api.contracts.productruntime.Category
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.Category> getCategoryClient(Integer categoryId) throws Exception
	{
		return getCategoryClient( categoryId,  false, null);
	}

	/**
	 * Retrieves the details of a single category.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.Category> mozuClient=GetCategoryClient( categoryId,  allowInactive, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Category category = client.Result();
	 * </code></pre></p>
	 * @param allowInactive If true, allow inactive categories to be retrieved in the category list response. If false, the categories retrieved will not include ones marked inactive.
	 * @param categoryId Unique identifier for the storefront container used to organize products.
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.Category>
	 * @see com.mozu.api.contracts.productruntime.Category
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.Category> getCategoryClient(Integer categoryId, Boolean allowInactive, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.CategoryUrl.getCategoryUrl(allowInactive, categoryId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productruntime.Category.class;
		MozuClient<com.mozu.api.contracts.productruntime.Category> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * Retrieves the list of product categories that appear on the storefront organized in a hierarchical format. Hidden categories do not appear in the list.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.CategoryCollection> mozuClient=GetCategoryTreeClient(authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CategoryCollection categoryCollection = client.Result();
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.CategoryCollection>
	 * @see com.mozu.api.contracts.productruntime.CategoryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.CategoryCollection> getCategoryTreeClient(AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.CategoryUrl.getCategoryTreeUrl();
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productruntime.CategoryCollection.class;
		MozuClient<com.mozu.api.contracts.productruntime.CategoryCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

}



