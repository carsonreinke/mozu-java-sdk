/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.catalog.admin.attributedefinition.attributes;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class AttributeVocabularyValueUrl
{

	/**
	 * Get Resource Url for GetAttributeVocabularyValues
	 * @param attributeFQN 
	 * @return   String Resource Url
	 */
	public static MozuUrl getAttributeVocabularyValuesUrl(String attributeFQN)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues");
		formatter.formatUrl("attributeFQN", attributeFQN);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetAttributeVocabularyValue
	 * @param attributeFQN 
	 * @param value 
	 * @return   String Resource Url
	 */
	public static MozuUrl getAttributeVocabularyValueUrl(String attributeFQN, String value)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value}");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("value", value);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddAttributeVocabularyValue
	 * @param attributeFQN 
	 * @return   String Resource Url
	 */
	public static MozuUrl addAttributeVocabularyValueUrl(String attributeFQN)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues");
		formatter.formatUrl("attributeFQN", attributeFQN);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateAttributeVocabularyValues
	 * @param attributeFQN 
	 * @return   String Resource Url
	 */
	public static MozuUrl updateAttributeVocabularyValuesUrl(String attributeFQN)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues");
		formatter.formatUrl("attributeFQN", attributeFQN);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateAttributeVocabularyValue
	 * @param attributeFQN 
	 * @param value 
	 * @return   String Resource Url
	 */
	public static MozuUrl updateAttributeVocabularyValueUrl(String attributeFQN, String value)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value}");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("value", value);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteAttributeVocabularyValue
	 * @param attributeFQN 
	 * @param value 
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteAttributeVocabularyValueUrl(String attributeFQN, String value)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value}");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("value", value);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

