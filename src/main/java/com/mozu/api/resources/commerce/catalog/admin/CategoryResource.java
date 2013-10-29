/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.resources.commerce.catalog.admin;

import com.mozu.api.ApiContext;
import com.mozu.api.resources.BaseResource;
import java.util.ArrayList;
import com.mozu.api.MozuClient;

/// <summary>
/// Use the Categories resource to organize products and control where they appear on the storefront. Create and maintain a hierarchy of categories and subcategories where the site will store properties.
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
	* @return com.mozu.api.contracts.productadmin.CategoryPagedCollection
	* @see com.mozu.api.contracts.productadmin.CategoryPagedCollection
	*/
	public com.mozu.api.contracts.productadmin.CategoryPagedCollection getCategories() throws Exception
	{
		return getCategories( null,  null,  null,  null);
	}

/**
	* Retrieves a list of categories according to any specified filter criteria and sort options.
	* <p><pre><code>
	*    Category category = new Category();
	*   CategoryPagedCollection categoryPagedCollection = category.GetCategories( filter,  pageSize,  sortBy,  startIndex);
	* </code></pre></p>
	* @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. You can filter product category search results by any of its properties, including its position in the category hierarchy. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	* @param pageSize Specifies the number of results to display on each page when creating paged results from a query. The maximum value is 200.
	* @param sortBy 
	* @param startIndex 
	* @return com.mozu.api.contracts.productadmin.CategoryPagedCollection
	* @see com.mozu.api.contracts.productadmin.CategoryPagedCollection
	*/
	public com.mozu.api.contracts.productadmin.CategoryPagedCollection getCategories(String filter, Integer pageSize, String sortBy, Integer startIndex) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.CategoryPagedCollection> client = com.mozu.api.clients.commerce.catalog.admin.CategoryClient.getCategoriesClient( filter,  pageSize,  sortBy,  startIndex);
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
	* @param categoryId Unique identifier of the category to retrieve.
	* @return com.mozu.api.contracts.productadmin.Category
	* @see com.mozu.api.contracts.productadmin.Category
	*/
	public com.mozu.api.contracts.productadmin.Category getCategory(Integer categoryId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.Category> client = com.mozu.api.clients.commerce.catalog.admin.CategoryClient.getCategoryClient( categoryId);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

/**
	* Retrieves the subcategories of a category. This is a list of subcategories at the same level (siblings). Use a list of siblings, for example, to display the categories in a horizontal list.
	* <p><pre><code>
	*    Category category = new Category();
	*   CategoryCollection categoryCollection = category.GetChildCategories( categoryId);
	* </code></pre></p>
	* @param categoryId Unique identifier of the category whose subcategories are retrieved.
	* @return com.mozu.api.contracts.productadmin.CategoryCollection
	* @see com.mozu.api.contracts.productadmin.CategoryCollection
	*/
	public com.mozu.api.contracts.productadmin.CategoryCollection getChildCategories(Integer categoryId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.CategoryCollection> client = com.mozu.api.clients.commerce.catalog.admin.CategoryClient.getChildCategoriesClient( categoryId);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

	/**
	* Adds a new category to the site's category hierarchy. Specify a ParentCategoryID to determine where to locate the category in the hierarchy. If a ParentCategoryID is not specified, the new category becomes a top-level category.
	* <p><pre><code>
	*    Category category = new Category();
	*   Category category = category.AddCategory( category);
	* </code></pre></p>
	* @param category Properties of the new category. Required properties: ParentCategoryID and Content.Name.
	* @return com.mozu.api.contracts.productadmin.Category
	* @see com.mozu.api.contracts.productadmin.Category
	* @see com.mozu.api.contracts.productadmin.Category
	*/
	public com.mozu.api.contracts.productadmin.Category addCategory(com.mozu.api.contracts.productadmin.Category category) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.Category> client = com.mozu.api.clients.commerce.catalog.admin.CategoryClient.addCategoryClient( category);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

	/**
	* Modifies a category such as moving it to another location in the category tree, or changing whether it is visible on the storefront. This PUT replaces the existing resource, so be sure to include all the information to maintain for the category.
	* <p><pre><code>
	*    Category category = new Category();
	*   Category category = category.UpdateCategory( categoryId,  category);
	* </code></pre></p>
	* @param categoryId Unique identifier of the category to modify.
	* @param category Properties of the category to modify.
	* @return com.mozu.api.contracts.productadmin.Category
	* @see com.mozu.api.contracts.productadmin.Category
	* @see com.mozu.api.contracts.productadmin.Category
	*/
	public com.mozu.api.contracts.productadmin.Category updateCategory(Integer categoryId, com.mozu.api.contracts.productadmin.Category category) throws Exception
	{
		return updateCategory( false,  categoryId,  category);
	}

/**
	* Modifies a category such as moving it to another location in the category tree, or changing whether it is visible on the storefront. This PUT replaces the existing resource, so be sure to include all the information to maintain for the category.
	* <p><pre><code>
	*    Category category = new Category();
	*   Category category = category.UpdateCategory( cascadeVisibility,  categoryId,  category);
	* </code></pre></p>
	* @param cascadeVisibility If true, when changing the display option for the category, change it for all subcategories also. Default: False.
	* @param categoryId Unique identifier of the category to modify.
	* @param category Properties of the category to modify.
	* @return com.mozu.api.contracts.productadmin.Category
	* @see com.mozu.api.contracts.productadmin.Category
	* @see com.mozu.api.contracts.productadmin.Category
	*/
	public com.mozu.api.contracts.productadmin.Category updateCategory(Boolean cascadeVisibility, Integer categoryId, com.mozu.api.contracts.productadmin.Category category) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.Category> client = com.mozu.api.clients.commerce.catalog.admin.CategoryClient.updateCategoryClient( cascadeVisibility,  categoryId,  category);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

	/**
	* Deletes the category specified by its category ID.
	* <p><pre><code>
	*    Category category = new Category();
	*   category.DeleteCategoryById( categoryId);
	* </code></pre></p>
	* @param categoryId Unique identifier of the category to delete.
	* @return 
	*/
	public void deleteCategoryById(Integer categoryId) throws Exception
	{
		deleteCategoryById( false,  categoryId);
	}

/**
	* Deletes the category specified by its category ID.
	* <p><pre><code>
	*    Category category = new Category();
	*   category.DeleteCategoryById( cascadeDelete,  categoryId);
	* </code></pre></p>
	* @param cascadeDelete If true, any subcategories of a category are deleted when this category is deleted. Default: False.
	* @param categoryId Unique identifier of the category to delete.
	* @return 
	*/
	public void deleteCategoryById(Boolean cascadeDelete, Integer categoryId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.CategoryClient.deleteCategoryByIdClient( cascadeDelete,  categoryId);
		setContext(_apiContext, client,true);
		client.executeRequest();

	}


}



