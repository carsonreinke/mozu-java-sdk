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
/// Use this resource to create products, view the attributes associated with existing products, and determine which sites feature a specific product.
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
	* Retrieves a list of products according to any specified facets, filter criteria, and sort options.
	* <p><pre><code>
	*    Product product = new Product();
	*   ProductCollection productCollection = product.GetProducts();
	* </code></pre></p>
	* @return com.mozu.api.contracts.productadmin.ProductCollection
	* @see com.mozu.api.contracts.productadmin.ProductCollection
	*/
	public com.mozu.api.contracts.productadmin.ProductCollection getProducts() throws Exception
	{
		return getProducts( null,  false,  null,  null,  null,  null,  null);
	}

/**
	* Retrieves a list of products according to any specified facets, filter criteria, and sort options.
	* <p><pre><code>
	*    Product product = new Product();
	*   ProductCollection productCollection = product.GetProducts( filter,  noCount,  pageSize,  q,  qLimit,  sortBy,  startIndex);
	* </code></pre></p>
	* @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	* @param noCount If true, the operation does not return the TotalCount number of results.
	* @param pageSize Specifies the number of results to display on each page when creating paged results from a query. The maximum value is 200.
	* @param q A list of product search terms to use in the query when searching across product code and product name. Separate multiple search terms with a space character.
	* @param qLimit The maximum number of search results to return in the response. You can limit any range between 1-100.
	* @param sortBy 
	* @param startIndex 
	* @return com.mozu.api.contracts.productadmin.ProductCollection
	* @see com.mozu.api.contracts.productadmin.ProductCollection
	*/
	public com.mozu.api.contracts.productadmin.ProductCollection getProducts(String filter, Boolean noCount, Integer pageSize, String q, Integer qLimit, String sortBy, Integer startIndex) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductCollection> client = com.mozu.api.clients.commerce.catalog.admin.ProductClient.getProductsClient( filter,  noCount,  pageSize,  q,  qLimit,  sortBy,  startIndex);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

/**
	* Retrieves an existing product.
	* <p><pre><code>
	*    Product product = new Product();
	*   Product product = product.GetProduct( productCode);
	* </code></pre></p>
	* @param productCode Merchant-created code associated with the product such as a SKU. Max length: 30. Accepts a to z, A to Z, Ãƒâ€¹-ÃƒËœ, 0 to 9, #, semicolon, commas, apostrophes, and Spaces, but no punctuation or other characters.
	* @return com.mozu.api.contracts.productadmin.Product
	* @see com.mozu.api.contracts.productadmin.Product
	*/
	public com.mozu.api.contracts.productadmin.Product getProduct(String productCode) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.Product> client = com.mozu.api.clients.commerce.catalog.admin.ProductClient.getProductClient( productCode);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

/**
	* Retrieves a product that is associated with more than one specific site.
	* <p><pre><code>
	*    Product product = new Product();
	*   ProductInSiteInfo productInSiteInfo = product.GetProductInSites( productCode);
	* </code></pre></p>
	* @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	* @return List<com.mozu.api.contracts.productadmin.ProductInSiteInfo>
	* @see com.mozu.api.contracts.productadmin.ProductInSiteInfo
	*/
	public ArrayList<com.mozu.api.contracts.productadmin.ProductInSiteInfo> getProductInSites(String productCode) throws Exception
	{
		MozuClient<ArrayList<com.mozu.api.contracts.productadmin.ProductInSiteInfo>> client = com.mozu.api.clients.commerce.catalog.admin.ProductClient.getProductInSitesClient( productCode);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

/**
	* Retrieves a product that is associated with a specific site ID.
	* <p><pre><code>
	*    Product product = new Product();
	*   ProductInSiteInfo productInSiteInfo = product.GetProductInSite( productCode,  siteId);
	* </code></pre></p>
	* @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	* @param siteId 
	* @return com.mozu.api.contracts.productadmin.ProductInSiteInfo
	* @see com.mozu.api.contracts.productadmin.ProductInSiteInfo
	*/
	public com.mozu.api.contracts.productadmin.ProductInSiteInfo getProductInSite(String productCode, Integer siteId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductInSiteInfo> client = com.mozu.api.clients.commerce.catalog.admin.ProductClient.getProductInSiteClient( productCode,  siteId);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

	/**
	* Creates a new product. Supply a product name, product code, price and other product characteristics such as its attributes, categories where the product belongs, whether the product has configurable options, stand-alone options, and so on.
	* <p><pre><code>
	*    Product product = new Product();
	*   Product product = product.AddProduct( product);
	* </code></pre></p>
	* @param product Properties of the new product. Required properties: ProductCode, Content.ProductName, and Price.ListPrice.
	* @return com.mozu.api.contracts.productadmin.Product
	* @see com.mozu.api.contracts.productadmin.Product
	* @see com.mozu.api.contracts.productadmin.Product
	*/
	public com.mozu.api.contracts.productadmin.Product addProduct(com.mozu.api.contracts.productadmin.Product product) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.Product> client = com.mozu.api.clients.commerce.catalog.admin.ProductClient.addProductClient( product);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

/**
	* Creates a new product and assigns it to a specific site.
	* <p><pre><code>
	*    Product product = new Product();
	*   ProductInSiteInfo productInSiteInfo = product.AddProductInSite( productCode,  productInSiteInfoIn);
	* </code></pre></p>
	* @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	* @param productInSiteInfoIn Creates a new product to associate with a site by updating the properties of that product by product ID.
	* @return com.mozu.api.contracts.productadmin.ProductInSiteInfo
	* @see com.mozu.api.contracts.productadmin.ProductInSiteInfo
	* @see com.mozu.api.contracts.productadmin.ProductInSiteInfo
	*/
	public com.mozu.api.contracts.productadmin.ProductInSiteInfo addProductInSite(String productCode, com.mozu.api.contracts.productadmin.ProductInSiteInfo productInSiteInfoIn) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductInSiteInfo> client = com.mozu.api.clients.commerce.catalog.admin.ProductClient.addProductInSiteClient( productCode,  productInSiteInfoIn);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

/**
	* Updates the inventory for an existing product. The inventory or stock adjustment value is either an absolute number (number of items in stock) or Delta (the number to subtract from or add to the current number of items in stock).
	* <p><pre><code>
	*    Product product = new Product();
	*   Product product = product.UpdateProductStock( productCode,  stockAdjustment);
	* </code></pre></p>
	* @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	* @param stockAdjustment Inventory adjustment for the product. Must supply Type (either Absolute or Delta) and Value (number of items to adjust). If Delta, specify a negative number to subtract inventory.
	* @return com.mozu.api.contracts.productadmin.Product
	* @see com.mozu.api.contracts.productadmin.Product
	* @see com.mozu.api.contracts.productadmin.StockOnHandAdjustment
	*/
	public com.mozu.api.contracts.productadmin.Product updateProductStock(String productCode, com.mozu.api.contracts.productadmin.StockOnHandAdjustment stockAdjustment) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.Product> client = com.mozu.api.clients.commerce.catalog.admin.ProductClient.updateProductStockClient( productCode,  stockAdjustment);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

	/**
	* Modifies an existing product.
	* <p><pre><code>
	*    Product product = new Product();
	*   Product product = product.UpdateProduct( productCode,  product);
	* </code></pre></p>
	* @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	* @param product Properties of the product to update. Required properties: ProductCode, Content.ProductName, and Price.ListPrice.
	* @return com.mozu.api.contracts.productadmin.Product
	* @see com.mozu.api.contracts.productadmin.Product
	* @see com.mozu.api.contracts.productadmin.Product
	*/
	public com.mozu.api.contracts.productadmin.Product updateProduct(String productCode, com.mozu.api.contracts.productadmin.Product product) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.Product> client = com.mozu.api.clients.commerce.catalog.admin.ProductClient.updateProductClient( productCode,  product);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

/**
	* Modifies an existing product that is associated with more than one specific site. For example, to link an existing product that is already associated to a site to another site, use this operation to create that association.
	* <p><pre><code>
	*    Product product = new Product();
	*   ProductInSiteInfo productInSiteInfo = product.UpdateProductInSites( productCode,  productInSitesIn);
	* </code></pre></p>
	* @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	* @param productInSitesIn Modifies an existing product associated with more than one site by updating the properties of that product by product ID.
	* @return List<com.mozu.api.contracts.productadmin.ProductInSiteInfo>
	* @see com.mozu.api.contracts.productadmin.ProductInSiteInfo
	* @see com.mozu.api.contracts.productadmin.ProductInSiteInfo
	*/
	public ArrayList<com.mozu.api.contracts.productadmin.ProductInSiteInfo> updateProductInSites(String productCode, ArrayList<com.mozu.api.contracts.productadmin.ProductInSiteInfo> productInSitesIn) throws Exception
	{
		MozuClient<ArrayList<com.mozu.api.contracts.productadmin.ProductInSiteInfo>> client = com.mozu.api.clients.commerce.catalog.admin.ProductClient.updateProductInSitesClient( productCode,  productInSitesIn);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

/**
	* Modifies an existing product associated with a specific site ID.
	* <p><pre><code>
	*    Product product = new Product();
	*   ProductInSiteInfo productInSiteInfo = product.UpdateProductInSite( productCode,  siteId,  productInSiteInfoIn);
	* </code></pre></p>
	* @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	* @param siteId 
	* @param productInSiteInfoIn Modifies an existing product associated with a site by updating the properties of that product by product ID.
	* @return com.mozu.api.contracts.productadmin.ProductInSiteInfo
	* @see com.mozu.api.contracts.productadmin.ProductInSiteInfo
	* @see com.mozu.api.contracts.productadmin.ProductInSiteInfo
	*/
	public com.mozu.api.contracts.productadmin.ProductInSiteInfo updateProductInSite(String productCode, Integer siteId, com.mozu.api.contracts.productadmin.ProductInSiteInfo productInSiteInfoIn) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductInSiteInfo> client = com.mozu.api.clients.commerce.catalog.admin.ProductClient.updateProductInSiteClient( productCode,  siteId,  productInSiteInfoIn);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

	/**
	* Deletes the product specified by its product code.
	* <p><pre><code>
	*    Product product = new Product();
	*   product.DeleteProduct( productCode);
	* </code></pre></p>
	* @param productCode Merchant-created code associated with the product such as a SKU.
	* @return 
	*/
	public void deleteProduct(String productCode) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.ProductClient.deleteProductClient( productCode);
		setContext(_apiContext, client,true);
		client.executeRequest();

	}

/**
	* Deletes the product specified by its product code and based on the site it has been associated with.
	* <p><pre><code>
	*    Product product = new Product();
	*   product.DeleteProductInSite( productCode,  siteId);
	* </code></pre></p>
	* @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	* @param siteId 
	* @return 
	*/
	public void deleteProductInSite(String productCode, Integer siteId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.ProductClient.deleteProductInSiteClient( productCode,  siteId);
		setContext(_apiContext, client,true);
		client.executeRequest();

	}


}


