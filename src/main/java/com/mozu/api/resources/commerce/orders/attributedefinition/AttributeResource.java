/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.resources.commerce.orders.attributedefinition;

import com.mozu.api.ApiContext;
import com.mozu.api.resources.BaseResource;
import java.util.ArrayList;
import com.mozu.api.MozuClient;

/// <summary>
/// Attributes for orders creates extensibility for the way we describe orders.
/// </summary>
public class AttributeResource extends BaseResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;
	
	public AttributeResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	* Retrieves an existing order attribute by providing the name and namespace.
	* <p><pre><code>
	*    Attribute attribute = new Attribute();
	*   Attribute attribute = attribute.GetAttributeByName( fqn);
	* </code></pre></p>
	* @param fqn The fully qualified name of the attribute, which is a user defined attribute identifier.
	* @return com.mozu.api.contracts.core.extensible.Attribute
	* @see com.mozu.api.contracts.core.extensible.Attribute
	*/
	public com.mozu.api.contracts.core.extensible.Attribute getAttributeByName(String fqn) throws Exception
	{
		MozuClient<com.mozu.api.contracts.core.extensible.Attribute> client = com.mozu.api.clients.commerce.orders.attributedefinition.AttributeClient.getAttributeByNameClient( fqn);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

/**
	* Retrieves a list of order attributes according to any filter criteria or sort options.
	* <p><pre><code>
	*    Attribute attribute = new Attribute();
	*   AttributeCollection attributeCollection = attribute.GetAttributes();
	* </code></pre></p>
	* @return com.mozu.api.contracts.core.extensible.AttributeCollection
	* @see com.mozu.api.contracts.core.extensible.AttributeCollection
	*/
	public com.mozu.api.contracts.core.extensible.AttributeCollection getAttributes() throws Exception
	{
		return getAttributes( null,  null,  null,  null);
	}

/**
	* Retrieves a list of order attributes according to any filter criteria or sort options.
	* <p><pre><code>
	*    Attribute attribute = new Attribute();
	*   AttributeCollection attributeCollection = attribute.GetAttributes( filter,  pageSize,  sortBy,  startIndex);
	* </code></pre></p>
	* @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	* @param pageSize Specifies the number of results to display on each page when creating paged results from a query. The maximum value is 200.
	* @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	* @param startIndex Indicates the zero-based offset in the complete result set where the returned entities begin, when creating paged results from a query. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	* @return com.mozu.api.contracts.core.extensible.AttributeCollection
	* @see com.mozu.api.contracts.core.extensible.AttributeCollection
	*/
	public com.mozu.api.contracts.core.extensible.AttributeCollection getAttributes(String filter, Integer pageSize, String sortBy, Integer startIndex) throws Exception
	{
		MozuClient<com.mozu.api.contracts.core.extensible.AttributeCollection> client = com.mozu.api.clients.commerce.orders.attributedefinition.AttributeClient.getAttributesClient( filter,  pageSize,  sortBy,  startIndex);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

/**
	* Retrieves a single existing order attribute.
	* <p><pre><code>
	*    Attribute attribute = new Attribute();
	*   Attribute attribute = attribute.GetAttribute( attributeId);
	* </code></pre></p>
	* @param attributeId Identifier of the single order attribute to retrieve.
	* @return com.mozu.api.contracts.core.extensible.Attribute
	* @see com.mozu.api.contracts.core.extensible.Attribute
	*/
	public com.mozu.api.contracts.core.extensible.Attribute getAttribute(Integer attributeId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.core.extensible.Attribute> client = com.mozu.api.clients.commerce.orders.attributedefinition.AttributeClient.getAttributeClient( attributeId);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

	/**
	* Create a new attribute to associate with an order.
	* <p><pre><code>
	*    Attribute attribute = new Attribute();
	*   Attribute attribute = attribute.CreateAttribute( attribute);
	* </code></pre></p>
	* @param attribute The properties of the order attribute to create.
	* @return com.mozu.api.contracts.core.extensible.Attribute
	* @see com.mozu.api.contracts.core.extensible.Attribute
	* @see com.mozu.api.contracts.core.extensible.Attribute
	*/
	public com.mozu.api.contracts.core.extensible.Attribute createAttribute(com.mozu.api.contracts.core.extensible.Attribute attribute) throws Exception
	{
		MozuClient<com.mozu.api.contracts.core.extensible.Attribute> client = com.mozu.api.clients.commerce.orders.attributedefinition.AttributeClient.createAttributeClient( attribute);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

	/**
	* Update an existing order attribute.
	* <p><pre><code>
	*    Attribute attribute = new Attribute();
	*   Attribute attribute = attribute.UpdateAttribute( attributeId,  attribute);
	* </code></pre></p>
	* @param attributeId Unique identifier of the attribute.
	* @param attribute The properties of the order attribute being updated.
	* @return com.mozu.api.contracts.core.extensible.Attribute
	* @see com.mozu.api.contracts.core.extensible.Attribute
	* @see com.mozu.api.contracts.core.extensible.Attribute
	*/
	public com.mozu.api.contracts.core.extensible.Attribute updateAttribute(Integer attributeId, com.mozu.api.contracts.core.extensible.Attribute attribute) throws Exception
	{
		MozuClient<com.mozu.api.contracts.core.extensible.Attribute> client = com.mozu.api.clients.commerce.orders.attributedefinition.AttributeClient.updateAttributeClient( attributeId,  attribute);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

	/**
	* Delete an existing order attribute.
	* <p><pre><code>
	*    Attribute attribute = new Attribute();
	*   attribute.DeleteAttribute( attributeId);
	* </code></pre></p>
	* @param attributeId Unique identifier of the attribute.
	* @return 
	*/
	public void deleteAttribute(Integer attributeId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.orders.attributedefinition.AttributeClient.deleteAttributeClient( attributeId);
		setContext(_apiContext, client,true);
		client.executeRequest();

	}

/**
	* Deletes an order attribute by specifying the fully qualified name of the attribute.
	* <p><pre><code>
	*    Attribute attribute = new Attribute();
	*   attribute.DeleteAttributeByName( fqn);
	* </code></pre></p>
	* @param fqn The fully qualified name of the attribute, which is a user defined attribute identifier.
	* @return 
	*/
	public void deleteAttributeByName(String fqn) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.orders.attributedefinition.AttributeClient.deleteAttributeByNameClient( fqn);
		setContext(_apiContext, client,true);
		client.executeRequest();

	}


}



