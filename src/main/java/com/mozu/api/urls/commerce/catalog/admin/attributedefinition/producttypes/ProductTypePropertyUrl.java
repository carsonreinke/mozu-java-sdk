
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.urls.commerce.catalog.admin.attributedefinition.producttypes;

import com.mozu.api.utils.UrlFormatter;


public class ProductTypePropertyUrl
{

	/**
        * Get Resource Url for GetProperties
        * @param productTypeId Identifier of the product type.
        * @return    String Resource Url
    */
	public static String getPropertiesUrl(Integer productTypeId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Properties");
		formatter.formatUrl("productTypeId", productTypeId);
		return formatter.getResourceUrl();
	}

	/**
        * Get Resource Url for GetProperty
        * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
        * @param productTypeId Identifier of the product type.
        * @return    String Resource Url
    */
	public static String getPropertyUrl(String attributeFQN, Integer productTypeId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Properties/{attributeFQN}");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("productTypeId", productTypeId);
		return formatter.getResourceUrl();
	}

		/**
        * Get Resource Url for AddProperty
        * @param productTypeId Identifier of the product type.
        * @return    String Resource Url
    */
	public static String addPropertyUrl(Integer productTypeId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Properties");
		formatter.formatUrl("productTypeId", productTypeId);
		return formatter.getResourceUrl();
	}

		/**
        * Get Resource Url for UpdateProperty
        * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
        * @param productTypeId Identifier of the product type.
        * @return    String Resource Url
    */
	public static String updatePropertyUrl(String attributeFQN, Integer productTypeId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Properties/{attributeFQN}");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("productTypeId", productTypeId);
		return formatter.getResourceUrl();
	}

		/**
        * Get Resource Url for DeleteProperty
        * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
        * @param productTypeId Identifier of the product type.
        * @return    String Resource Url
    */
	public static String deletePropertyUrl(String attributeFQN, Integer productTypeId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Properties/{attributeFQN}");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("productTypeId", productTypeId);
		return formatter.getResourceUrl();
	}

	
}
