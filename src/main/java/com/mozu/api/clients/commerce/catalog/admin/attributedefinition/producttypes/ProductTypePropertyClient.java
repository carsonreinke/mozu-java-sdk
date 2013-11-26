/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin.attributedefinition.producttypes;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;

/** <summary>
 * 
 * </summary>
 */
public class ProductTypePropertyClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.AttributeInProductType>> mozuClient=GetPropertiesClient(dataViewMode,  productTypeId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeInProductType attributeInProductType = client.Result();
	 * </code></pre></p>
	 * @param productTypeId 
	 * @param dataViewMode DataViewMode
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.AttributeInProductType>>
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.AttributeInProductType>> getPropertiesClient(com.mozu.api.DataViewMode dataViewMode, Integer productTypeId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.producttypes.ProductTypePropertyUrl.getPropertiesUrl(productTypeId);
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.AttributeInProductType>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.productadmin.AttributeInProductType>> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient=GetPropertyClient(dataViewMode,  attributeFQN,  productTypeId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeInProductType attributeInProductType = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param productTypeId 
	 * @param dataViewMode DataViewMode
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeInProductType>
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> getPropertyClient(com.mozu.api.DataViewMode dataViewMode, String attributeFQN, Integer productTypeId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.producttypes.ProductTypePropertyUrl.getPropertyUrl(attributeFQN, productTypeId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.AttributeInProductType.class;
		MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient=AddPropertyClient(dataViewMode,  attributeInProductType,  productTypeId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeInProductType attributeInProductType = client.Result();
	 * </code></pre></p>
	 * @param productTypeId 
	 * @param dataViewMode DataViewMode
	 * @param authTicket User Auth Ticket
	 * @param attributeInProductType 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeInProductType>
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> addPropertyClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType, Integer productTypeId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.producttypes.ProductTypePropertyUrl.addPropertyUrl(productTypeId);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.AttributeInProductType.class;
		MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(attributeInProductType);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient=UpdatePropertyClient(dataViewMode,  attributeInProductType,  attributeFQN,  productTypeId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeInProductType attributeInProductType = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param productTypeId 
	 * @param dataViewMode DataViewMode
	 * @param authTicket User Auth Ticket
	 * @param attributeInProductType 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeInProductType>
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> updatePropertyClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType, String attributeFQN, Integer productTypeId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.producttypes.ProductTypePropertyUrl.updatePropertyUrl(attributeFQN, productTypeId);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.AttributeInProductType.class;
		MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(attributeInProductType);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeletePropertyClient(dataViewMode,  attributeFQN,  productTypeId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param productTypeId 
	 * @param dataViewMode DataViewMode
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deletePropertyClient(com.mozu.api.DataViewMode dataViewMode, String attributeFQN, Integer productTypeId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.producttypes.ProductTypePropertyUrl.deletePropertyUrl(attributeFQN, productTypeId);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

}



