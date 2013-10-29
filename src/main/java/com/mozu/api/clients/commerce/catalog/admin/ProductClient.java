/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.clients.commerce.catalog.admin;

import java.util.ArrayList;
import com.mozu.api.MozuClient;

/// <summary>
/// Use this resource to create products, view the attributes associated with existing products, and determine which sites feature a specific product.
/// </summary>
public class ProductClient {
	
	
	/**
	* Retrieves a list of products according to any specified facets, filter criteria, and sort options.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.productadmin.ProductCollection> mozuClient=GetProductsClient();
	* client.setBaseAddress(url);
	* client.executeRequest();
	* ProductCollection productCollection = client.Result();
	* </code></pre></p>
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductCollection>
	* @see com.mozu.api.contracts.productadmin.ProductCollection
	*/
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductCollection> getProductsClient() throws Exception
	{
		return getProductsClient( null,  false,  null,  null,  null,  null,  null);
	}

/**
	* Retrieves a list of products according to any specified facets, filter criteria, and sort options.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.productadmin.ProductCollection> mozuClient=GetProductsClient( filter,  noCount,  pageSize,  q,  qLimit,  sortBy,  startIndex);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* ProductCollection productCollection = client.Result();
	* </code></pre></p>
	* @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	* @param noCount If true, the operation does not return the TotalCount number of results.
	* @param pageSize Specifies the number of results to display on each page when creating paged results from a query. The maximum value is 200.
	* @param q A list of product search terms to use in the query when searching across product code and product name. Separate multiple search terms with a space character.
	* @param qLimit The maximum number of search results to return in the response. You can limit any range between 1-100.
	* @param sortBy 
	* @param startIndex 
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductCollection>
	* @see com.mozu.api.contracts.productadmin.ProductCollection
	*/
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductCollection> getProductsClient(String filter, Boolean noCount, Integer pageSize, String q, Integer qLimit, String sortBy, Integer startIndex) throws Exception
	{
		String url = com.mozu.api.urls.commerce.catalog.admin.ProductUrl.getProductsUrl(filter, noCount, pageSize, q, qLimit, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

/**
	* Retrieves an existing product.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.productadmin.Product> mozuClient=GetProductClient( productCode);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* Product product = client.Result();
	* </code></pre></p>
	* @param productCode Merchant-created code associated with the product such as a SKU. Max length: 30. Accepts a to z, A to Z, Ãƒâ€¹-ÃƒËœ, 0 to 9, #, semicolon, commas, apostrophes, and Spaces, but no punctuation or other characters.
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Product>
	* @see com.mozu.api.contracts.productadmin.Product
	*/
	public static MozuClient<com.mozu.api.contracts.productadmin.Product> getProductClient(String productCode) throws Exception
	{
		String url = com.mozu.api.urls.commerce.catalog.admin.ProductUrl.getProductUrl(productCode);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.Product.class;
		MozuClient<com.mozu.api.contracts.productadmin.Product> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

/**
	* Retrieves a product that is associated with more than one specific site.
	* <p><pre><code>
	*   MozuClient<ArrayList<com.mozu.api.contracts.productadmin.ProductInSiteInfo>> mozuClient=GetProductInSitesClient( productCode);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* ProductInSiteInfo productInSiteInfo = client.Result();
	* </code></pre></p>
	* @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	* @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.ProductInSiteInfo>>
	* @see com.mozu.api.contracts.productadmin.ProductInSiteInfo
	*/
	public static MozuClient<ArrayList<com.mozu.api.contracts.productadmin.ProductInSiteInfo>> getProductInSitesClient(String productCode) throws Exception
	{
		String url = com.mozu.api.urls.commerce.catalog.admin.ProductUrl.getProductInSitesUrl(productCode);
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.ProductInSiteInfo>(){}.getClass();
		MozuClient<ArrayList<com.mozu.api.contracts.productadmin.ProductInSiteInfo>> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

/**
	* Retrieves a product that is associated with a specific site ID.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.productadmin.ProductInSiteInfo> mozuClient=GetProductInSiteClient( productCode,  siteId);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* ProductInSiteInfo productInSiteInfo = client.Result();
	* </code></pre></p>
	* @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	* @param siteId 
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductInSiteInfo>
	* @see com.mozu.api.contracts.productadmin.ProductInSiteInfo
	*/
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductInSiteInfo> getProductInSiteClient(String productCode, Integer siteId) throws Exception
	{
		String url = com.mozu.api.urls.commerce.catalog.admin.ProductUrl.getProductInSiteUrl(productCode, siteId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductInSiteInfo.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductInSiteInfo> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	* Creates a new product. Supply a product name, product code, price and other product characteristics such as its attributes, categories where the product belongs, whether the product has configurable options, stand-alone options, and so on.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.productadmin.Product> mozuClient=AddProductClient( product);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* Product product = client.Result();
	* </code></pre></p>
	* @param product Properties of the new product. Required properties: ProductCode, Content.ProductName, and Price.ListPrice.
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Product>
	* @see com.mozu.api.contracts.productadmin.Product
	* @see com.mozu.api.contracts.productadmin.Product
	*/
	public static MozuClient<com.mozu.api.contracts.productadmin.Product> addProductClient(com.mozu.api.contracts.productadmin.Product product) throws Exception
	{
		String url = com.mozu.api.urls.commerce.catalog.admin.ProductUrl.addProductUrl();
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.Product.class;
		MozuClient<com.mozu.api.contracts.productadmin.Product> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(product);
		return mozuClient;

	}

/**
	* Creates a new product and assigns it to a specific site.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.productadmin.ProductInSiteInfo> mozuClient=AddProductInSiteClient( productCode,  productInSiteInfoIn);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* ProductInSiteInfo productInSiteInfo = client.Result();
	* </code></pre></p>
	* @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	* @param productInSiteInfoIn Creates a new product to associate with a site by updating the properties of that product by product ID.
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductInSiteInfo>
	* @see com.mozu.api.contracts.productadmin.ProductInSiteInfo
	* @see com.mozu.api.contracts.productadmin.ProductInSiteInfo
	*/
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductInSiteInfo> addProductInSiteClient(String productCode, com.mozu.api.contracts.productadmin.ProductInSiteInfo productInSiteInfoIn) throws Exception
	{
		String url = com.mozu.api.urls.commerce.catalog.admin.ProductUrl.addProductInSiteUrl(productCode);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductInSiteInfo.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductInSiteInfo> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(productInSiteInfoIn);
		return mozuClient;

	}

/**
	* Updates the inventory for an existing product. The inventory or stock adjustment value is either an absolute number (number of items in stock) or Delta (the number to subtract from or add to the current number of items in stock).
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.productadmin.Product> mozuClient=UpdateProductStockClient( productCode,  stockAdjustment);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* Product product = client.Result();
	* </code></pre></p>
	* @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	* @param stockAdjustment Inventory adjustment for the product. Must supply Type (either Absolute or Delta) and Value (number of items to adjust). If Delta, specify a negative number to subtract inventory.
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Product>
	* @see com.mozu.api.contracts.productadmin.Product
	* @see com.mozu.api.contracts.productadmin.StockOnHandAdjustment
	*/
	public static MozuClient<com.mozu.api.contracts.productadmin.Product> updateProductStockClient(String productCode, com.mozu.api.contracts.productadmin.StockOnHandAdjustment stockAdjustment) throws Exception
	{
		String url = com.mozu.api.urls.commerce.catalog.admin.ProductUrl.updateProductStockUrl(productCode);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.Product.class;
		MozuClient<com.mozu.api.contracts.productadmin.Product> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(stockAdjustment);
		return mozuClient;

	}

	/**
	* Modifies an existing product.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.productadmin.Product> mozuClient=UpdateProductClient( productCode,  product);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* Product product = client.Result();
	* </code></pre></p>
	* @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	* @param product Properties of the product to update. Required properties: ProductCode, Content.ProductName, and Price.ListPrice.
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Product>
	* @see com.mozu.api.contracts.productadmin.Product
	* @see com.mozu.api.contracts.productadmin.Product
	*/
	public static MozuClient<com.mozu.api.contracts.productadmin.Product> updateProductClient(String productCode, com.mozu.api.contracts.productadmin.Product product) throws Exception
	{
		String url = com.mozu.api.urls.commerce.catalog.admin.ProductUrl.updateProductUrl(productCode);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.Product.class;
		MozuClient<com.mozu.api.contracts.productadmin.Product> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(product);
		return mozuClient;

	}

/**
	* Modifies an existing product that is associated with more than one specific site. For example, to link an existing product that is already associated to a site to another site, use this operation to create that association.
	* <p><pre><code>
	*   MozuClient<ArrayList<com.mozu.api.contracts.productadmin.ProductInSiteInfo>> mozuClient=UpdateProductInSitesClient( productCode,  productInSitesIn);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* ProductInSiteInfo productInSiteInfo = client.Result();
	* </code></pre></p>
	* @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	* @param productInSitesIn Modifies an existing product associated with more than one site by updating the properties of that product by product ID.
	* @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.ProductInSiteInfo>>
	* @see com.mozu.api.contracts.productadmin.ProductInSiteInfo
	* @see com.mozu.api.contracts.productadmin.ProductInSiteInfo
	*/
	public static MozuClient<ArrayList<com.mozu.api.contracts.productadmin.ProductInSiteInfo>> updateProductInSitesClient(String productCode, ArrayList<com.mozu.api.contracts.productadmin.ProductInSiteInfo> productInSitesIn) throws Exception
	{
		String url = com.mozu.api.urls.commerce.catalog.admin.ProductUrl.updateProductInSitesUrl(productCode);
		String verb = "PUT";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.ProductInSiteInfo>(){}.getClass();
		MozuClient<ArrayList<com.mozu.api.contracts.productadmin.ProductInSiteInfo>> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(productInSitesIn);
		return mozuClient;

	}

/**
	* Modifies an existing product associated with a specific site ID.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.productadmin.ProductInSiteInfo> mozuClient=UpdateProductInSiteClient( productCode,  siteId,  productInSiteInfoIn);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* ProductInSiteInfo productInSiteInfo = client.Result();
	* </code></pre></p>
	* @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	* @param siteId 
	* @param productInSiteInfoIn Modifies an existing product associated with a site by updating the properties of that product by product ID.
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductInSiteInfo>
	* @see com.mozu.api.contracts.productadmin.ProductInSiteInfo
	* @see com.mozu.api.contracts.productadmin.ProductInSiteInfo
	*/
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductInSiteInfo> updateProductInSiteClient(String productCode, Integer siteId, com.mozu.api.contracts.productadmin.ProductInSiteInfo productInSiteInfoIn) throws Exception
	{
		String url = com.mozu.api.urls.commerce.catalog.admin.ProductUrl.updateProductInSiteUrl(productCode, siteId);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductInSiteInfo.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductInSiteInfo> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(productInSiteInfoIn);
		return mozuClient;

	}

	/**
	* Deletes the product specified by its product code.
	* <p><pre><code>
	*   MozuClient mozuClient=DeleteProductClient( productCode);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* </code></pre></p>
	* @param productCode Merchant-created code associated with the product such as a SKU.
	* @return Mozu.Api.MozuClient 
	*/
	public static MozuClient deleteProductClient(String productCode) throws Exception
	{
		String url = com.mozu.api.urls.commerce.catalog.admin.ProductUrl.deleteProductUrl(productCode);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

/**
	* Deletes the product specified by its product code and based on the site it has been associated with.
	* <p><pre><code>
	*   MozuClient mozuClient=DeleteProductInSiteClient( productCode,  siteId);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* </code></pre></p>
	* @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	* @param siteId 
	* @return Mozu.Api.MozuClient 
	*/
	public static MozuClient deleteProductInSiteClient(String productCode, Integer siteId) throws Exception
	{
		String url = com.mozu.api.urls.commerce.catalog.admin.ProductUrl.deleteProductInSiteUrl(productCode, siteId);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}


}



