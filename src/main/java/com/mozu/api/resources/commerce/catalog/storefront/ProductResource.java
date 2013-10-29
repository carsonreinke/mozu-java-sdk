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
/// Manage shoppers' product selection process during a visit to the storefront. Update product options as shoppers pick and choose their product choices. A shopper can't add a product to a cart until all of its required options have been selected.
/// </summary>
public class ProductResource extends BaseResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;
	
	public ProductResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	* Retrieves a list of products that appear on the storefront according to any specified filter criteria and sort options. A set of filter expressions representing the search parameters for a query.
	* <p><pre><code>
	*    Product product = new Product();
	*   ProductCollection productCollection = product.GetProducts();
	* </code></pre></p>
	* @return com.mozu.api.contracts.productruntime.ProductCollection
	* @see com.mozu.api.contracts.productruntime.ProductCollection
	*/
	public com.mozu.api.contracts.productruntime.ProductCollection getProducts() throws Exception
	{
		return getProducts( null,  null,  null,  null);
	}

/**
	* Retrieves a list of products that appear on the storefront according to any specified filter criteria and sort options. A set of filter expressions representing the search parameters for a query.
	* <p><pre><code>
	*    Product product = new Product();
	*   ProductCollection productCollection = product.GetProducts( filter,  pageSize,  sortBy,  startIndex);
	* </code></pre></p>
	* @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	* @param pageSize Specifies the number of results to display on each page when creating paged results from a query. The maximum value is 200.
	* @param sortBy 
	* @param startIndex 
	* @return com.mozu.api.contracts.productruntime.ProductCollection
	* @see com.mozu.api.contracts.productruntime.ProductCollection
	*/
	public com.mozu.api.contracts.productruntime.ProductCollection getProducts(String filter, Integer pageSize, String sortBy, Integer startIndex) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productruntime.ProductCollection> client = com.mozu.api.clients.commerce.catalog.storefront.ProductClient.getProductsClient( filter,  pageSize,  sortBy,  startIndex);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

/**
	* Retrieves information about a single product given its product code.
	* <p><pre><code>
	*    Product product = new Product();
	*   Product product = product.GetProduct( productCode);
	* </code></pre></p>
	* @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	* @return com.mozu.api.contracts.productruntime.Product
	* @see com.mozu.api.contracts.productruntime.Product
	*/
	public com.mozu.api.contracts.productruntime.Product getProduct(String productCode) throws Exception
	{
		return getProduct( false,  productCode,  null);
	}

/**
	* Retrieves information about a single product given its product code.
	* <p><pre><code>
	*    Product product = new Product();
	*   Product product = product.GetProduct( allowInactive,  productCode,  variationProductCode);
	* </code></pre></p>
	* @param allowInactive If true, returns an inactive product as part of the query.
	* @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	* @param variationProductCode Merchant-created code associated with a specific product variation. Variation product codes maintain an association with the base product code.
	* @return com.mozu.api.contracts.productruntime.Product
	* @see com.mozu.api.contracts.productruntime.Product
	*/
	public com.mozu.api.contracts.productruntime.Product getProduct(Boolean allowInactive, String productCode, String variationProductCode) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productruntime.Product> client = com.mozu.api.clients.commerce.catalog.storefront.ProductClient.getProductClient( allowInactive,  productCode,  variationProductCode);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

	/**
	* Creates a new product selection. A create occurs each time a shopper selects a product option as they configure a product. Once all the required product options are configured, the product can be added to a cart.
	* <p><pre><code>
	*    Product product = new Product();
	*   ConfiguredProduct configuredProduct = product.ConfiguredProduct( productCode,  productOptionSelections);
	* </code></pre></p>
	* @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	* @param productOptionSelections For a product with shopper-configurable options, the properties of the product options selected by the shopper.
	* @return com.mozu.api.contracts.productruntime.ConfiguredProduct
	* @see com.mozu.api.contracts.productruntime.ConfiguredProduct
	* @see com.mozu.api.contracts.productruntime.ProductOptionSelections
	*/
	public com.mozu.api.contracts.productruntime.ConfiguredProduct configuredProduct(String productCode, com.mozu.api.contracts.productruntime.ProductOptionSelections productOptionSelections) throws Exception
	{
		return configuredProduct( false,  productCode,  productOptionSelections);
	}

/**
	* Creates a new product selection. A create occurs each time a shopper selects a product option as they configure a product. Once all the required product options are configured, the product can be added to a cart.
	* <p><pre><code>
	*    Product product = new Product();
	*   ConfiguredProduct configuredProduct = product.ConfiguredProduct( includeOptionDetails,  productCode,  productOptionSelections);
	* </code></pre></p>
	* @param includeOptionDetails If true, the response returns details about the product. If false, returns a product summary such as the product name, price, and sale price.
	* @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	* @param productOptionSelections For a product with shopper-configurable options, the properties of the product options selected by the shopper.
	* @return com.mozu.api.contracts.productruntime.ConfiguredProduct
	* @see com.mozu.api.contracts.productruntime.ConfiguredProduct
	* @see com.mozu.api.contracts.productruntime.ProductOptionSelections
	*/
	public com.mozu.api.contracts.productruntime.ConfiguredProduct configuredProduct(Boolean includeOptionDetails, String productCode, com.mozu.api.contracts.productruntime.ProductOptionSelections productOptionSelections) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productruntime.ConfiguredProduct> client = com.mozu.api.clients.commerce.catalog.storefront.ProductClient.configuredProductClient( includeOptionDetails,  productCode,  productOptionSelections);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

/**
	* Validate the final state of shopper-selected options.
	* <p><pre><code>
	*    Product product = new Product();
	*   ProductValidationSummary productValidationSummary = product.ValidateProduct( productCode,  productOptionSelections);
	* </code></pre></p>
	* @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	* @param productOptionSelections For a product with shopper-configurable options, the properties of the product options selected by the shopper.
	* @return com.mozu.api.contracts.productruntime.ProductValidationSummary
	* @see com.mozu.api.contracts.productruntime.ProductValidationSummary
	* @see com.mozu.api.contracts.productruntime.ProductOptionSelections
	*/
	public com.mozu.api.contracts.productruntime.ProductValidationSummary validateProduct(String productCode, com.mozu.api.contracts.productruntime.ProductOptionSelections productOptionSelections) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productruntime.ProductValidationSummary> client = com.mozu.api.clients.commerce.catalog.storefront.ProductClient.validateProductClient( productCode,  productOptionSelections);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

		
}


