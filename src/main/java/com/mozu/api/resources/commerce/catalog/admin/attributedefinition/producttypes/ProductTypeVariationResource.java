/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.resources.commerce.catalog.admin.attributedefinition.producttypes;

import com.mozu.api.ApiContext;
import com.mozu.api.resources.BaseResource;
import java.util.ArrayList;
import com.mozu.api.MozuClient;

/// <summary>
/// Use the variations resource to preview possible product variations for a specific product type based on the option attributes defined for the product type, such as size or color.
/// </summary>
public class ProductTypeVariationResource extends BaseResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;
	
	public ProductTypeVariationResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
		/**
	* Generates the variations possible for a product associated with the product type based on the option values supplied in the request.
	* <p><pre><code>
	*    ProductTypeVariation producttypevariation = new ProductTypeVariation();
	*   ProductVariationPagedCollection productVariationPagedCollection = producttypevariation.GenerateProductVariations( productTypeId,  productOptionsIn);
	* </code></pre></p>
	* @param productTypeId Unique identifier of the product type.
	* @param productOptionsIn The product option attributes configured for this product type.
	* @return com.mozu.api.contracts.productadmin.ProductVariationPagedCollection
	* @see com.mozu.api.contracts.productadmin.ProductVariationPagedCollection
	* @see com.mozu.api.contracts.productadmin.ProductOption
	*/
	public com.mozu.api.contracts.productadmin.ProductVariationPagedCollection generateProductVariations(Integer productTypeId, ArrayList<com.mozu.api.contracts.productadmin.ProductOption> productOptionsIn) throws Exception
	{
		return generateProductVariations( null,  null,  null,  productTypeId,  null,  null,  productOptionsIn);
	}

/**
	* Generates the variations possible for a product associated with the product type based on the option values supplied in the request.
	* <p><pre><code>
	*    ProductTypeVariation producttypevariation = new ProductTypeVariation();
	*   ProductVariationPagedCollection productVariationPagedCollection = producttypevariation.GenerateProductVariations( filter,  pageSize,  productCode,  productTypeId,  sortBy,  startIndex,  productOptionsIn);
	* </code></pre></p>
	* @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	* @param pageSize Specifies the number of results to display on each page when creating paged results from a query. The maximum value is 200.
	* @param productCode 
	* @param productTypeId Unique identifier of the product type.
	* @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	* @param startIndex Indicates the zero-based offset in the complete result set where the returned entities begin, when creating paged results from a query. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	* @param productOptionsIn The product option attributes configured for this product type.
	* @return com.mozu.api.contracts.productadmin.ProductVariationPagedCollection
	* @see com.mozu.api.contracts.productadmin.ProductVariationPagedCollection
	* @see com.mozu.api.contracts.productadmin.ProductOption
	*/
	public com.mozu.api.contracts.productadmin.ProductVariationPagedCollection generateProductVariations(String filter, Integer pageSize, String productCode, Integer productTypeId, String sortBy, Integer startIndex, ArrayList<com.mozu.api.contracts.productadmin.ProductOption> productOptionsIn) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductVariationPagedCollection> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeVariationClient.generateProductVariationsClient( filter,  pageSize,  productCode,  productTypeId,  sortBy,  startIndex,  productOptionsIn);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

		
}



