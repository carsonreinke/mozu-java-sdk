/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.clients.commerce.catalog.admin.attributedefinition.producttypes;

import java.util.ArrayList;
import com.mozu.api.MozuClient;

/// <summary>
/// Use the variations resource to preview possible product variations for a specific product type based on the option attributes defined for the product type, such as size or color.
/// </summary>
public class ProductTypeVariationClient {
	
	
		/**
	* Generates the variations possible for a product associated with the product type based on the option values supplied in the request.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.productadmin.ProductVariationPagedCollection> mozuClient=GenerateProductVariationsClient( productTypeId,  productOptionsIn);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* ProductVariationPagedCollection productVariationPagedCollection = client.Result();
	* </code></pre></p>
	* @param productTypeId Unique identifier of the product type.
	* @param productOptionsIn The product option attributes configured for this product type.
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductVariationPagedCollection>
	* @see com.mozu.api.contracts.productadmin.ProductVariationPagedCollection
	* @see com.mozu.api.contracts.productadmin.ProductOption
	*/
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductVariationPagedCollection> generateProductVariationsClient(Integer productTypeId, ArrayList<com.mozu.api.contracts.productadmin.ProductOption> productOptionsIn) throws Exception
	{
		return generateProductVariationsClient( null,  null,  null,  productTypeId,  null,  null,  productOptionsIn);
	}

/**
	* Generates the variations possible for a product associated with the product type based on the option values supplied in the request.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.productadmin.ProductVariationPagedCollection> mozuClient=GenerateProductVariationsClient( filter,  pageSize,  productCode,  productTypeId,  sortBy,  startIndex,  productOptionsIn);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* ProductVariationPagedCollection productVariationPagedCollection = client.Result();
	* </code></pre></p>
	* @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	* @param pageSize Specifies the number of results to display on each page when creating paged results from a query. The maximum value is 200.
	* @param productCode 
	* @param productTypeId Unique identifier of the product type.
	* @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	* @param startIndex Indicates the zero-based offset in the complete result set where the returned entities begin, when creating paged results from a query. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	* @param productOptionsIn The product option attributes configured for this product type.
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductVariationPagedCollection>
	* @see com.mozu.api.contracts.productadmin.ProductVariationPagedCollection
	* @see com.mozu.api.contracts.productadmin.ProductOption
	*/
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductVariationPagedCollection> generateProductVariationsClient(String filter, Integer pageSize, String productCode, Integer productTypeId, String sortBy, Integer startIndex, ArrayList<com.mozu.api.contracts.productadmin.ProductOption> productOptionsIn) throws Exception
	{
		String url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeVariationUrl.generateProductVariationsUrl(filter, pageSize, productCode, productTypeId, sortBy, startIndex);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductVariationPagedCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductVariationPagedCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(productOptionsIn);
		return mozuClient;

	}

		
}


