/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.clients.commerce.orders.attributedefinition;

import java.util.ArrayList;
import com.mozu.api.MozuClient;

/// <summary>
/// Attributes for orders creates extensibility for the way we describe orders.
/// </summary>
public class AttributeClient {
	
	
	/**
	* Retrieves an existing order attribute by providing the name and namespace.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.core.extensible.Attribute> mozuClient=GetAttributeByNameClient( fqn);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* Attribute attribute = client.Result();
	* </code></pre></p>
	* @param fqn The fully qualified name of the attribute, which is a user defined attribute identifier.
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.extensible.Attribute>
	* @see com.mozu.api.contracts.core.extensible.Attribute
	*/
	public static MozuClient<com.mozu.api.contracts.core.extensible.Attribute> getAttributeByNameClient(String fqn) throws Exception
	{
		String url = com.mozu.api.urls.commerce.orders.attributedefinition.AttributeUrl.getAttributeByNameUrl(fqn);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.core.extensible.Attribute.class;
		MozuClient<com.mozu.api.contracts.core.extensible.Attribute> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

/**
	* Retrieves a list of order attributes according to any filter criteria or sort options.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.core.extensible.AttributeCollection> mozuClient=GetAttributesClient();
	* client.setBaseAddress(url);
	* client.executeRequest();
	* AttributeCollection attributeCollection = client.Result();
	* </code></pre></p>
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.extensible.AttributeCollection>
	* @see com.mozu.api.contracts.core.extensible.AttributeCollection
	*/
	public static MozuClient<com.mozu.api.contracts.core.extensible.AttributeCollection> getAttributesClient() throws Exception
	{
		return getAttributesClient( null,  null,  null,  null);
	}

/**
	* Retrieves a list of order attributes according to any filter criteria or sort options.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.core.extensible.AttributeCollection> mozuClient=GetAttributesClient( filter,  pageSize,  sortBy,  startIndex);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* AttributeCollection attributeCollection = client.Result();
	* </code></pre></p>
	* @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	* @param pageSize Specifies the number of results to display on each page when creating paged results from a query. The maximum value is 200.
	* @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	* @param startIndex Indicates the zero-based offset in the complete result set where the returned entities begin, when creating paged results from a query. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.extensible.AttributeCollection>
	* @see com.mozu.api.contracts.core.extensible.AttributeCollection
	*/
	public static MozuClient<com.mozu.api.contracts.core.extensible.AttributeCollection> getAttributesClient(String filter, Integer pageSize, String sortBy, Integer startIndex) throws Exception
	{
		String url = com.mozu.api.urls.commerce.orders.attributedefinition.AttributeUrl.getAttributesUrl(filter, pageSize, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.core.extensible.AttributeCollection.class;
		MozuClient<com.mozu.api.contracts.core.extensible.AttributeCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

/**
	* Retrieves a single existing order attribute.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.core.extensible.Attribute> mozuClient=GetAttributeClient( attributeId);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* Attribute attribute = client.Result();
	* </code></pre></p>
	* @param attributeId Identifier of the single order attribute to retrieve.
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.extensible.Attribute>
	* @see com.mozu.api.contracts.core.extensible.Attribute
	*/
	public static MozuClient<com.mozu.api.contracts.core.extensible.Attribute> getAttributeClient(Integer attributeId) throws Exception
	{
		String url = com.mozu.api.urls.commerce.orders.attributedefinition.AttributeUrl.getAttributeUrl(attributeId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.core.extensible.Attribute.class;
		MozuClient<com.mozu.api.contracts.core.extensible.Attribute> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	* Create a new attribute to associate with an order.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.core.extensible.Attribute> mozuClient=CreateAttributeClient( attribute);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* Attribute attribute = client.Result();
	* </code></pre></p>
	* @param attribute The properties of the order attribute to create.
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.extensible.Attribute>
	* @see com.mozu.api.contracts.core.extensible.Attribute
	* @see com.mozu.api.contracts.core.extensible.Attribute
	*/
	public static MozuClient<com.mozu.api.contracts.core.extensible.Attribute> createAttributeClient(com.mozu.api.contracts.core.extensible.Attribute attribute) throws Exception
	{
		String url = com.mozu.api.urls.commerce.orders.attributedefinition.AttributeUrl.createAttributeUrl();
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.core.extensible.Attribute.class;
		MozuClient<com.mozu.api.contracts.core.extensible.Attribute> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(attribute);
		return mozuClient;

	}

	/**
	* Update an existing order attribute.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.core.extensible.Attribute> mozuClient=UpdateAttributeClient( attributeId,  attribute);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* Attribute attribute = client.Result();
	* </code></pre></p>
	* @param attributeId Unique identifier of the attribute.
	* @param attribute The properties of the order attribute being updated.
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.extensible.Attribute>
	* @see com.mozu.api.contracts.core.extensible.Attribute
	* @see com.mozu.api.contracts.core.extensible.Attribute
	*/
	public static MozuClient<com.mozu.api.contracts.core.extensible.Attribute> updateAttributeClient(Integer attributeId, com.mozu.api.contracts.core.extensible.Attribute attribute) throws Exception
	{
		String url = com.mozu.api.urls.commerce.orders.attributedefinition.AttributeUrl.updateAttributeUrl(attributeId);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.core.extensible.Attribute.class;
		MozuClient<com.mozu.api.contracts.core.extensible.Attribute> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(attribute);
		return mozuClient;

	}

	/**
	* Delete an existing order attribute.
	* <p><pre><code>
	*   MozuClient mozuClient=DeleteAttributeClient( attributeId);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* </code></pre></p>
	* @param attributeId Unique identifier of the attribute.
	* @return Mozu.Api.MozuClient 
	*/
	public static MozuClient deleteAttributeClient(Integer attributeId) throws Exception
	{
		String url = com.mozu.api.urls.commerce.orders.attributedefinition.AttributeUrl.deleteAttributeUrl(attributeId);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

/**
	* Deletes an order attribute by specifying the fully qualified name of the attribute.
	* <p><pre><code>
	*   MozuClient mozuClient=DeleteAttributeByNameClient( fqn);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* </code></pre></p>
	* @param fqn The fully qualified name of the attribute, which is a user defined attribute identifier.
	* @return Mozu.Api.MozuClient 
	*/
	public static MozuClient deleteAttributeByNameClient(String fqn) throws Exception
	{
		String url = com.mozu.api.urls.commerce.orders.attributedefinition.AttributeUrl.deleteAttributeByNameUrl(fqn);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}


}



