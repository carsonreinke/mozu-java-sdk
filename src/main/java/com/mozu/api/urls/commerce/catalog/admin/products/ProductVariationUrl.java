
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.urls.commerce.catalog.admin.products;

import com.mozu.api.utils.UrlFormatter;


public class ProductVariationUrl
{

	/**
        * Get Resource Url for GetProductVariation
        * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
        * @param variationKey System-generated key that represents the attribute values that uniquely identify a specific product variation.
        * @return    String Resource Url
    */
	public static String getProductVariationUrl(String productCode, String variationKey)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/variations/{variationKey}");
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("variationKey", variationKey);
		return formatter.getResourceUrl();
	}

	/**
        * Get Resource Url for GetProductVariations
        * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
        * @param pageSize Specifies the number of results to display on each page when creating paged results from a query. The maximum value is 200.
        * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
        * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
        * @param startIndex Indicates the zero-based offset in the complete result set where the returned entities begin, when creating paged results from a query. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
        * @return    String Resource Url
    */
	public static String getProductVariationsUrl(String filter, Integer pageSize, String productCode, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/variations?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return formatter.getResourceUrl();
	}

			/**
        * Get Resource Url for UpdateProductVariations
        * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
        * @return    String Resource Url
    */
	public static String updateProductVariationsUrl(String productCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/variations");
		formatter.formatUrl("productCode", productCode);
		return formatter.getResourceUrl();
	}

	/**
        * Get Resource Url for UpdateProductVariation
        * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
        * @param variationKey System-generated key that represents the attribute values that uniquely identify a specific product variation.
        * @return    String Resource Url
    */
	public static String updateProductVariationUrl(String productCode, String variationKey)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/variations/{variationKey}");
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("variationKey", variationKey);
		return formatter.getResourceUrl();
	}

		/**
        * Get Resource Url for DeleteProductVariation
        * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
        * @param variationKey System-generated key that represents the attribute values that uniquely identify a specific product variation.
        * @return    String Resource Url
    */
	public static String deleteProductVariationUrl(String productCode, String variationKey)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/variations/{variationKey}");
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("variationKey", variationKey);
		return formatter.getResourceUrl();
	}

	
}

