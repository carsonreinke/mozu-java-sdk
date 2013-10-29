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
/// A grouping of related orders attributes.
/// </summary>
public class AttributeSetClient {
	
	
	/**
	* Retrieves the attribute set by providing the name and namespace.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.core.extensible.AttributeSet> mozuClient=GetAttributeSetByNameClient( fqn);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* AttributeSet attributeSet = client.Result();
	* </code></pre></p>
	* @param fqn The fully qualified name of the attribute, which is a user defined attribute identifier.
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.extensible.AttributeSet>
	* @see com.mozu.api.contracts.core.extensible.AttributeSet
	*/
	public static MozuClient<com.mozu.api.contracts.core.extensible.AttributeSet> getAttributeSetByNameClient(String fqn) throws Exception
	{
		String url = com.mozu.api.urls.commerce.orders.attributedefinition.AttributeSetUrl.getAttributeSetByNameUrl(fqn);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.core.extensible.AttributeSet.class;
		MozuClient<com.mozu.api.contracts.core.extensible.AttributeSet> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

/**
	* Retrieves a list of attribute sets according to any filter criteria or sort options.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.core.extensible.AttributeSetCollection> mozuClient=GetAttributeSetsClient();
	* client.setBaseAddress(url);
	* client.executeRequest();
	* AttributeSetCollection attributeSetCollection = client.Result();
	* </code></pre></p>
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.extensible.AttributeSetCollection>
	* @see com.mozu.api.contracts.core.extensible.AttributeSetCollection
	*/
	public static MozuClient<com.mozu.api.contracts.core.extensible.AttributeSetCollection> getAttributeSetsClient() throws Exception
	{
		return getAttributeSetsClient( null,  null,  null,  null);
	}

/**
	* Retrieves a list of attribute sets according to any filter criteria or sort options.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.core.extensible.AttributeSetCollection> mozuClient=GetAttributeSetsClient( filter,  pageSize,  sortBy,  startIndex);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* AttributeSetCollection attributeSetCollection = client.Result();
	* </code></pre></p>
	* @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	* @param pageSize Specifies the number of results to display on each page when creating paged results from a query. The maximum value is 200.
	* @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	* @param startIndex Indicates the zero-based offset in the complete result set where the returned entities begin, when creating paged results from a query. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.extensible.AttributeSetCollection>
	* @see com.mozu.api.contracts.core.extensible.AttributeSetCollection
	*/
	public static MozuClient<com.mozu.api.contracts.core.extensible.AttributeSetCollection> getAttributeSetsClient(String filter, Integer pageSize, String sortBy, Integer startIndex) throws Exception
	{
		String url = com.mozu.api.urls.commerce.orders.attributedefinition.AttributeSetUrl.getAttributeSetsUrl(filter, pageSize, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.core.extensible.AttributeSetCollection.class;
		MozuClient<com.mozu.api.contracts.core.extensible.AttributeSetCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

/**
	* Retrieves a specific attribute set by providing the attribute set ID.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.core.extensible.AttributeSet> mozuClient=GetAttributeSetClient( attributeSetId);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* AttributeSet attributeSet = client.Result();
	* </code></pre></p>
	* @param attributeSetId Identifier of the attribute set being retrieved.
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.extensible.AttributeSet>
	* @see com.mozu.api.contracts.core.extensible.AttributeSet
	*/
	public static MozuClient<com.mozu.api.contracts.core.extensible.AttributeSet> getAttributeSetClient(Integer attributeSetId) throws Exception
	{
		String url = com.mozu.api.urls.commerce.orders.attributedefinition.AttributeSetUrl.getAttributeSetUrl(attributeSetId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.core.extensible.AttributeSet.class;
		MozuClient<com.mozu.api.contracts.core.extensible.AttributeSet> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	* Create new attribute set to provide order extensibility.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.core.extensible.AttributeSet> mozuClient=CreateAttributeSetClient( attributeSet);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* AttributeSet attributeSet = client.Result();
	* </code></pre></p>
	* @param attributeSet The properties of the orders attribute set being created.
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.extensible.AttributeSet>
	* @see com.mozu.api.contracts.core.extensible.AttributeSet
	* @see com.mozu.api.contracts.core.extensible.AttributeSet
	*/
	public static MozuClient<com.mozu.api.contracts.core.extensible.AttributeSet> createAttributeSetClient(com.mozu.api.contracts.core.extensible.AttributeSet attributeSet) throws Exception
	{
		String url = com.mozu.api.urls.commerce.orders.attributedefinition.AttributeSetUrl.createAttributeSetUrl();
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.core.extensible.AttributeSet.class;
		MozuClient<com.mozu.api.contracts.core.extensible.AttributeSet> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(attributeSet);
		return mozuClient;

	}

	/**
	* Update an existing attribute set by providing the attribute set ID.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.core.extensible.AttributeSet> mozuClient=UpdateAttributeSetClient( attributeSetId,  attributeSet);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* AttributeSet attributeSet = client.Result();
	* </code></pre></p>
	* @param attributeSetId Identifier of the attribute set being updated.
	* @param attributeSet The properties of the attribute set being updated.
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.extensible.AttributeSet>
	* @see com.mozu.api.contracts.core.extensible.AttributeSet
	* @see com.mozu.api.contracts.core.extensible.AttributeSet
	*/
	public static MozuClient<com.mozu.api.contracts.core.extensible.AttributeSet> updateAttributeSetClient(Integer attributeSetId, com.mozu.api.contracts.core.extensible.AttributeSet attributeSet) throws Exception
	{
		String url = com.mozu.api.urls.commerce.orders.attributedefinition.AttributeSetUrl.updateAttributeSetUrl(attributeSetId);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.core.extensible.AttributeSet.class;
		MozuClient<com.mozu.api.contracts.core.extensible.AttributeSet> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(attributeSet);
		return mozuClient;

	}

/**
	* Associate an attribute with an attribute set.
	* <p><pre><code>
	*   MozuClient mozuClient=UpsertAttributeSetAssignmentClient( assignment);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* </code></pre></p>
	* @param assignment Properties of the attribute set assignment.
	* @return Mozu.Api.MozuClient 
	* @see com.mozu.api.contracts.core.extensible.AttributeSetAssignment
	*/
	public static MozuClient upsertAttributeSetAssignmentClient(com.mozu.api.contracts.core.extensible.AttributeSetAssignment assignment) throws Exception
	{
		String url = com.mozu.api.urls.commerce.orders.attributedefinition.AttributeSetUrl.upsertAttributeSetAssignmentUrl();
		String verb = "PUT";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(assignment);
		return mozuClient;

	}

	/**
	* Delete a specific attribute set by providing the attribute set ID.
	* <p><pre><code>
	*   MozuClient mozuClient=DeleteAttributeSetClient( attributeSetId);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* </code></pre></p>
	* @param attributeSetId Identifier of the attribute set being deleted.
	* @return Mozu.Api.MozuClient 
	*/
	public static MozuClient deleteAttributeSetClient(Integer attributeSetId) throws Exception
	{
		String url = com.mozu.api.urls.commerce.orders.attributedefinition.AttributeSetUrl.deleteAttributeSetUrl(attributeSetId);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

/**
	* Removes the attribute from its assigned attribute set.
	* <p><pre><code>
	*   MozuClient mozuClient=RemoveAttributeSetAssignmentClient( attributeSetId,  locationId);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* </code></pre></p>
	* @param attributeSetId Identifier of the attribute set.
	* @param locationId Identifier of the location. Locations describe where in the application the attribute set definition will be rendered (such as a page).
	* @return Mozu.Api.MozuClient 
	*/
	public static MozuClient removeAttributeSetAssignmentClient(Integer attributeSetId, Integer locationId) throws Exception
	{
		String url = com.mozu.api.urls.commerce.orders.attributedefinition.AttributeSetUrl.removeAttributeSetAssignmentUrl(attributeSetId, locationId);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

/**
	* Delete a specific attribute set by providing the fully qualified name.
	* <p><pre><code>
	*   MozuClient mozuClient=DeleteAttributeSetByNameClient( fqn);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* </code></pre></p>
	* @param fqn The fully qualified name of the attribute, which is a user defined attribute identifier.
	* @return Mozu.Api.MozuClient 
	*/
	public static MozuClient deleteAttributeSetByNameClient(String fqn) throws Exception
	{
		String url = com.mozu.api.urls.commerce.orders.attributedefinition.AttributeSetUrl.deleteAttributeSetByNameUrl(fqn);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}


}



