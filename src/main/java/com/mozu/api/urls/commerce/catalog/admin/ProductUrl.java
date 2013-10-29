
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.urls.commerce.catalog.admin;

import com.mozu.api.utils.UrlFormatter;


public class ProductUrl
{

	/**
        * Get Resource Url for GetProducts
        * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
        * @param noCount If true, the operation does not return the TotalCount number of results.
        * @param pageSize Specifies the number of results to display on each page when creating paged results from a query. The maximum value is 200.
        * @param q A list of product search terms to use in the query when searching across product code and product name. Separate multiple search terms with a space character.
        * @param qLimit The maximum number of search results to return in the response. You can limit any range between 1-100.
        * @param sortBy 
        * @param startIndex 
        * @return    String Resource Url
    */
	public static String getProductsUrl(String filter, Boolean noCount, Integer pageSize, String q, Integer qLimit, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&&filter={filter}&q={q}&qLimit={qLimit}&noCount={noCount}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("noCount", noCount);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("q", q);
		formatter.formatUrl("qLimit", qLimit);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return formatter.getResourceUrl();
	}

	/**
        * Get Resource Url for GetProduct
        * @param productCode Merchant-created code associated with the product such as a SKU. Max length: 30. Accepts a to z, A to Z, Ãƒâ€¹-ÃƒËœ, 0 to 9, #, semicolon, commas, apostrophes, and Spaces, but no punctuation or other characters.
        * @return    String Resource Url
    */
	public static String getProductUrl(String productCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}");
		formatter.formatUrl("productCode", productCode);
		return formatter.getResourceUrl();
	}

	/**
        * Get Resource Url for GetProductInSites
        * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
        * @return    String Resource Url
    */
	public static String getProductInSitesUrl(String productCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/ProductInSites");
		formatter.formatUrl("productCode", productCode);
		return formatter.getResourceUrl();
	}

	/**
        * Get Resource Url for GetProductInSite
        * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
        * @param siteId 
        * @return    String Resource Url
    */
	public static String getProductInSiteUrl(String productCode, Integer siteId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/ProductInSites/{siteId}");
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("siteId", siteId);
		return formatter.getResourceUrl();
	}

		/**
        * Get Resource Url for AddProduct
        * @return    String Resource Url
    */
	public static String addProductUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/");
		return formatter.getResourceUrl();
	}

	/**
        * Get Resource Url for AddProductInSite
        * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
        * @return    String Resource Url
    */
	public static String addProductInSiteUrl(String productCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/ProductInSites");
		formatter.formatUrl("productCode", productCode);
		return formatter.getResourceUrl();
	}

	/**
        * Get Resource Url for UpdateProductStock
        * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
        * @return    String Resource Url
    */
	public static String updateProductStockUrl(String productCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/StockOnHandAdjustment");
		formatter.formatUrl("productCode", productCode);
		return formatter.getResourceUrl();
	}

		/**
        * Get Resource Url for UpdateProduct
        * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
        * @return    String Resource Url
    */
	public static String updateProductUrl(String productCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}");
		formatter.formatUrl("productCode", productCode);
		return formatter.getResourceUrl();
	}

	/**
        * Get Resource Url for UpdateProductInSites
        * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
        * @return    String Resource Url
    */
	public static String updateProductInSitesUrl(String productCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/ProductInSites");
		formatter.formatUrl("productCode", productCode);
		return formatter.getResourceUrl();
	}

	/**
        * Get Resource Url for UpdateProductInSite
        * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
        * @param siteId 
        * @return    String Resource Url
    */
	public static String updateProductInSiteUrl(String productCode, Integer siteId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/ProductInSites/{siteId}");
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("siteId", siteId);
		return formatter.getResourceUrl();
	}

		/**
        * Get Resource Url for DeleteProduct
        * @param productCode Merchant-created code associated with the product such as a SKU.
        * @return    String Resource Url
    */
	public static String deleteProductUrl(String productCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}");
		formatter.formatUrl("productCode", productCode);
		return formatter.getResourceUrl();
	}

	/**
        * Get Resource Url for DeleteProductInSite
        * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
        * @param siteId 
        * @return    String Resource Url
    */
	public static String deleteProductInSiteUrl(String productCode, Integer siteId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/ProductInSites/{siteId}");
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("siteId", siteId);
		return formatter.getResourceUrl();
	}

	
}
