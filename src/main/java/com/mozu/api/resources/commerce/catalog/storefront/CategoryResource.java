/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.resources.commerce.catalog.storefront;

import com.mozu.api.ApiContext;
import com.mozu.api.resources.BaseResource;
import java.util.ArrayList;
import com.mozu.api.MozuClient;

/// <summary>
/// Get the product category hierarchy as it appears to shoppers who are browsing the storefront. The hierarchy can be returned as a flat list or as a category tree.
/// </summary>
public class CategoryResource extends BaseResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;
	
	public CategoryResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	* Retrieves a list of categories according to any specified filter criteria and sort options.
	* <p><pre><code>
	*    Category category = new Category();
	*   CategoryPagedCollection categoryPagedCollection = category.GetCategories();
	* </code></pre></p>
	* @return com.mozu.api.contracts.productruntime.CategoryPagedCollection
	* @see com.mozu.api.contracts.productruntime.CategoryPagedCollection
	*/
	public com.mozu.api.contracts.productruntime.CategoryPagedCollection getCategories() throws Exception
	{
		return getCategories( null,  null,  null,  null);
	}

/**
	* Retrieves a list of categories according to any specified filter criteria and sort options.
	* <p><pre><code>
	*    Category category = new Category();
	*   CategoryPagedCollection categoryPagedCollection = category.GetCategories( filter,  pageSize,  sortBy,  startIndex);
	* </code></pre></p>
	* @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. You can filter product category search results by any of its properties, including its position in the category hierarchy. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). <b>For example - "filter=IsDisplayed+eq+true"</b>
	* @param pageSize Specifies the number of results to display on each page when creating paged results from a query. The maximum value is 200.
	* @param sortBy 
	* @param startIndex 
	* @return com.mozu.api.contracts.productruntime.CategoryPagedCollection
	* @see com.mozu.api.contracts.productruntime.CategoryPagedCollection
	*/
	public com.mozu.api.contracts.productruntime.CategoryPagedCollection getCategories(String filter, Integer pageSize, String sortBy, Integer startIndex) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productruntime.CategoryPagedCollection> client = com.mozu.api.clients.commerce.catalog.storefront.CategoryClient.getCategoriesClient( filter,  pageSize,  sortBy,  startIndex);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

/**
	* Retrieves the details of a single category.
	* <p><pre><code>
	*    Category category = new Category();
	*   Category category = category.GetCategory( categoryId);
	* </code></pre></p>
	* @param categoryId Unique identifier for the storefront container used to organize products.
	* @return com.mozu.api.contracts.productruntime.Category
	* @see com.mozu.api.contracts.productruntime.Category
	*/
	public com.mozu.api.contracts.productruntime.Category getCategory(Integer categoryId) throws Exception
	{
		return getCategory( false,  categoryId);
	}

/**
	* Retrieves the details of a single category.
	* <p><pre><code>
	*    Category category = new Category();
	*   Category category = category.GetCategory( allowInactive,  categoryId);
	* </code></pre></p>
	* @param allowInactive If true, allow inactive categories to be retrieved in the category list response. If false, the categories retrieved will not include ones marked inactive.
	* @param categoryId Unique identifier for the storefront container used to organize products.
	* @return com.mozu.api.contracts.productruntime.Category
	* @see com.mozu.api.contracts.productruntime.Category
	*/
	public com.mozu.api.contracts.productruntime.Category getCategory(Boolean allowInactive, Integer categoryId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productruntime.Category> client = com.mozu.api.clients.commerce.catalog.storefront.CategoryClient.getCategoryClient( allowInactive,  categoryId);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

/**
	* Retrieves the list of product categories that appear on the storefront organized in a hierarchical format. Hidden categories do not appear in the list.
	* <p><pre><code>
	*    Category category = new Category();
	*   CategoryCollection categoryCollection = category.GetCategoryTree();
	* </code></pre></p>
	* @return com.mozu.api.contracts.productruntime.CategoryCollection
	* @see com.mozu.api.contracts.productruntime.CategoryCollection
	*/
	public com.mozu.api.contracts.productruntime.CategoryCollection getCategoryTree() throws Exception
	{
		MozuClient<com.mozu.api.contracts.productruntime.CategoryCollection> client = com.mozu.api.clients.commerce.catalog.storefront.CategoryClient.getCategoryTreeClient();
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

			
}



