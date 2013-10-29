
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.urls.commerce.catalog.admin.attributedefinition;

import com.mozu.api.utils.UrlFormatter;


public class AttributeUrl
{

	/**
        * Get Resource Url for GetAttributes
        * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
        * @param pageSize Specifies the number of results to display on each page when creating paged results from a query. The maximum value is 200.
        * @param sortBy 
        * @param startIndex 
        * @return    String Resource Url
    */
	public static String getAttributesUrl(String filter, Integer pageSize, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/attributedefinition/attributes/?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&&filter={filter}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return formatter.getResourceUrl();
	}

	/**
        * Get Resource Url for GetAttribute
        * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
        * @return    String Resource Url
    */
	public static String getAttributeUrl(String attributeFQN)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}");
		formatter.formatUrl("attributeFQN", attributeFQN);
		return formatter.getResourceUrl();
	}

		/**
        * Get Resource Url for AddAttribute
        * @return    String Resource Url
    */
	public static String addAttributeUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/attributedefinition/attributes/");
		return formatter.getResourceUrl();
	}

		/**
        * Get Resource Url for UpdateAttribute
        * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
        * @return    String Resource Url
    */
	public static String updateAttributeUrl(String attributeFQN)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}");
		formatter.formatUrl("attributeFQN", attributeFQN);
		return formatter.getResourceUrl();
	}

		/**
        * Get Resource Url for DeleteAttribute
        * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
        * @return    String Resource Url
    */
	public static String deleteAttributeUrl(String attributeFQN)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}");
		formatter.formatUrl("attributeFQN", attributeFQN);
		return formatter.getResourceUrl();
	}

	
}
