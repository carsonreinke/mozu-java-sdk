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
/// Use the Options subresource to define how an option attribute is used for a specific product type. Product attribute definitions are unique for each associated product type.
/// </summary>
public class ProductTypeOptionClient {
	
	
	/**
	* Retrieves a list of option product attributes defined for the specified product type.
	* <p><pre><code>
	*   MozuClient<ArrayList<com.mozu.api.contracts.productadmin.AttributeInProductType>> mozuClient=GetOptionsClient( productTypeId);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* AttributeInProductType attributeInProductType = client.Result();
	* </code></pre></p>
	* @param productTypeId Identifier of the product type to retrieve.
	* @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.AttributeInProductType>>
	* @see com.mozu.api.contracts.productadmin.AttributeInProductType
	*/
	public static MozuClient<ArrayList<com.mozu.api.contracts.productadmin.AttributeInProductType>> getOptionsClient(Integer productTypeId) throws Exception
	{
		String url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeOptionUrl.getOptionsUrl(productTypeId);
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.AttributeInProductType>(){}.getClass();
		MozuClient<ArrayList<com.mozu.api.contracts.productadmin.AttributeInProductType>> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

/**
	* Retrieves the details of an option attribute defined for the specified product type.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient=GetOptionClient( attributeFQN,  productTypeId);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* AttributeInProductType attributeInProductType = client.Result();
	* </code></pre></p>
	* @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	* @param productTypeId The identifier of the product type.
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeInProductType>
	* @see com.mozu.api.contracts.productadmin.AttributeInProductType
	*/
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> getOptionClient(String attributeFQN, Integer productTypeId) throws Exception
	{
		String url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeOptionUrl.getOptionUrl(attributeFQN, productTypeId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.AttributeInProductType.class;
		MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	* Assigns an option attribute to the product type based on the information supplied in the request.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient=AddOptionClient( productTypeId,  attributeInProductType);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* AttributeInProductType attributeInProductType = client.Result();
	* </code></pre></p>
	* @param productTypeId Identifier of the product type.
	* @param attributeInProductType Properties of the option attribute to define for the specified product type.
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeInProductType>
	* @see com.mozu.api.contracts.productadmin.AttributeInProductType
	* @see com.mozu.api.contracts.productadmin.AttributeInProductType
	*/
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> addOptionClient(Integer productTypeId, com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType) throws Exception
	{
		String url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeOptionUrl.addOptionUrl(productTypeId);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.AttributeInProductType.class;
		MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(attributeInProductType);
		return mozuClient;

	}

	/**
	* Updates an option attribute definition for the specified product type.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient=UpdateOptionClient( attributeFQN,  productTypeId,  attributeInProductType);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* AttributeInProductType attributeInProductType = client.Result();
	* </code></pre></p>
	* @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	* @param productTypeId Identifier of the product type.
	* @param attributeInProductType Properties of the option product attribute to define for the specified product type.
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeInProductType>
	* @see com.mozu.api.contracts.productadmin.AttributeInProductType
	* @see com.mozu.api.contracts.productadmin.AttributeInProductType
	*/
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> updateOptionClient(String attributeFQN, Integer productTypeId, com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType) throws Exception
	{
		String url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeOptionUrl.updateOptionUrl(attributeFQN, productTypeId);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.AttributeInProductType.class;
		MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(attributeInProductType);
		return mozuClient;

	}

	/**
	* Removes an option attribute definition for the specified product type.
	* <p><pre><code>
	*   MozuClient mozuClient=DeleteOptionClient( attributeFQN,  productTypeId);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* </code></pre></p>
	* @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	* @param productTypeId Identifier of the product type.
	* @return Mozu.Api.MozuClient 
	*/
	public static MozuClient deleteOptionClient(String attributeFQN, Integer productTypeId) throws Exception
	{
		String url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeOptionUrl.deleteOptionUrl(attributeFQN, productTypeId);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}


}


