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
/// Use the Extras subresource to define how a product attribute classified as an "extra" is used for a specific product type. Product attribute defintions are unique for each associated product type.
/// </summary>
public class ProductTypeExtraClient {
	
	
	/**
	* Retrieves a list of extra attributes defined for the specified product type.
	* <p><pre><code>
	*   MozuClient<ArrayList<com.mozu.api.contracts.productadmin.AttributeInProductType>> mozuClient=GetExtrasClient( productTypeId);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* AttributeInProductType attributeInProductType = client.Result();
	* </code></pre></p>
	* @param productTypeId Identifier of the product type.
	* @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.AttributeInProductType>>
	* @see com.mozu.api.contracts.productadmin.AttributeInProductType
	*/
	public static MozuClient<ArrayList<com.mozu.api.contracts.productadmin.AttributeInProductType>> getExtrasClient(Integer productTypeId) throws Exception
	{
		String url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeExtraUrl.getExtrasUrl(productTypeId);
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.AttributeInProductType>(){}.getClass();
		MozuClient<ArrayList<com.mozu.api.contracts.productadmin.AttributeInProductType>> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

/**
	* Retrieves the details of an extra attribute definition for the specified product type.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient=GetExtraClient( attributeFQN,  productTypeId);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* AttributeInProductType attributeInProductType = client.Result();
	* </code></pre></p>
	* @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	* @param productTypeId Identifier of the product type whose extra is being retrieved.
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeInProductType>
	* @see com.mozu.api.contracts.productadmin.AttributeInProductType
	*/
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> getExtraClient(String attributeFQN, Integer productTypeId) throws Exception
	{
		String url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeExtraUrl.getExtraUrl(attributeFQN, productTypeId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.AttributeInProductType.class;
		MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	* Assigns a defined extra attribute to the product type based on the information supplied in the request.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient=AddExtraClient( productTypeId,  attributeInProductType);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* AttributeInProductType attributeInProductType = client.Result();
	* </code></pre></p>
	* @param productTypeId Identifier of the product type.
	* @param attributeInProductType The properties of the extra attribute definition for this product type assignment.
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeInProductType>
	* @see com.mozu.api.contracts.productadmin.AttributeInProductType
	* @see com.mozu.api.contracts.productadmin.AttributeInProductType
	*/
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> addExtraClient(Integer productTypeId, com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType) throws Exception
	{
		String url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeExtraUrl.addExtraUrl(productTypeId);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.AttributeInProductType.class;
		MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(attributeInProductType);
		return mozuClient;

	}

	/**
	* Update the definition of an extra attribute for the specified product type.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient=UpdateExtraClient( attributeFQN,  productTypeId,  attributeInProductType);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* AttributeInProductType attributeInProductType = client.Result();
	* </code></pre></p>
	* @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	* @param productTypeId Identifier of the product type.
	* @param attributeInProductType The properties of the extra attribute definition to update for the product type.
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeInProductType>
	* @see com.mozu.api.contracts.productadmin.AttributeInProductType
	* @see com.mozu.api.contracts.productadmin.AttributeInProductType
	*/
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> updateExtraClient(String attributeFQN, Integer productTypeId, com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType) throws Exception
	{
		String url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeExtraUrl.updateExtraUrl(attributeFQN, productTypeId);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.AttributeInProductType.class;
		MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(attributeInProductType);
		return mozuClient;

	}

	/**
	* Removes an extra attribute definition from the specified product type.
	* <p><pre><code>
	*   MozuClient mozuClient=DeleteExtraClient( attributeFQN,  productTypeId);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* </code></pre></p>
	* @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	* @param productTypeId Identifier of the product type.
	* @return Mozu.Api.MozuClient 
	*/
	public static MozuClient deleteExtraClient(String attributeFQN, Integer productTypeId) throws Exception
	{
		String url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeExtraUrl.deleteExtraUrl(attributeFQN, productTypeId);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}


}



