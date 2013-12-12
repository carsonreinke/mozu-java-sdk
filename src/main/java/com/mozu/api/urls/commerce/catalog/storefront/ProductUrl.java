/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.catalog.storefront;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class ProductUrl
{

	/**
	 * Get Resource Url for GetProducts
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param sortBy 
	 * @param startIndex 
	 * @return   String Resource Url
	 */
	public static MozuUrl getProductsUrl(String filter, Integer pageSize, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/storefront/products/?filter={filter}&startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetProductInventory
	 * @param locationCodes Array of location codes for which to retrieve product inventory information.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return   String Resource Url
	 */
	public static MozuUrl getProductInventoryUrl(String locationCodes, String productCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/storefront/products/{productCode}/locationinventory?locationCodes={locationCodes}");
		formatter.formatUrl("locationCodes", locationCodes);
		formatter.formatUrl("productCode", productCode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetProduct
	 * @param allowInactive If true, returns an inactive product as part of the query.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param skipInventoryCheck 
	 * @param variationProductCode Merchant-created code associated with a specific product variation. Variation product codes maintain an association with the base product code.
	 * @return   String Resource Url
	 */
	public static MozuUrl getProductUrl(Boolean allowInactive, String productCode, Boolean skipInventoryCheck, String variationProductCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/storefront/products/{productCode}?variationProductCode={variationProductCode}&allowInactive={allowInactive}&skipInventoryCheck={skipInventoryCheck}");
		formatter.formatUrl("allowInactive", allowInactive);
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("skipInventoryCheck", skipInventoryCheck);
		formatter.formatUrl("variationProductCode", variationProductCode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for ConfiguredProduct
	 * @param includeOptionDetails If true, the response returns details about the product. If false, returns a product summary such as the product name, price, and sale price.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param skipInventoryCheck 
	 * @return   String Resource Url
	 */
	public static MozuUrl configuredProductUrl(Boolean includeOptionDetails, String productCode, Boolean skipInventoryCheck)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/storefront/products/{productCode}/configure?includeOptionDetails={includeOptionDetails}&skipInventoryCheck={skipInventoryCheck}");
		formatter.formatUrl("includeOptionDetails", includeOptionDetails);
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("skipInventoryCheck", skipInventoryCheck);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for ValidateProduct
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param skipInventoryCheck 
	 * @return   String Resource Url
	 */
	public static MozuUrl validateProductUrl(String productCode, Boolean skipInventoryCheck)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/storefront/products/{productCode}/validate?skipInventoryCheck={skipInventoryCheck}");
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("skipInventoryCheck", skipInventoryCheck);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

