/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.resources.commerce.catalog.admin.attributedefinition;

import com.mozu.api.ApiContext;
import com.mozu.api.resources.BaseResource;
import java.util.ArrayList;
import com.mozu.api.MozuClient;

/// <summary>
/// Use the Attribute Definition resource to manage the properties, options, and extras that uniquely describe products of a specific type. Attributes can be associated with a product type, assigned values by a merchant or shopper, and added as faceted search filters for a product category.Options are product attributes that describe unique configurations made by the shopper, such as size or color, and generate a new product variation (or unique SKU).Properties are product attributes that describe aspects of the product that do not represent an option configurable by the shopper, such as screen resolution or brand.Extras are product attributes that describe add-on configurations made by the shopper that do not represent a product variation, such as a monogram.
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
	* Retrieves a paged list of attributes according to any specified filter criteria and sort options.
	* <p><pre><code>
	*    Attribute attribute = new Attribute();
	*   AttributeCollection attributeCollection = attribute.GetAttributes();
	* </code></pre></p>
	* @return com.mozu.api.contracts.productadmin.AttributeCollection
	* @see com.mozu.api.contracts.productadmin.AttributeCollection
	*/
	public com.mozu.api.contracts.productadmin.AttributeCollection getAttributes() throws Exception
	{
		return getAttributes( null,  null,  null,  null);
	}

/**
	* Retrieves a paged list of attributes according to any specified filter criteria and sort options.
	* <p><pre><code>
	*    Attribute attribute = new Attribute();
	*   AttributeCollection attributeCollection = attribute.GetAttributes( filter,  pageSize,  sortBy,  startIndex);
	* </code></pre></p>
	* @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	* @param pageSize Specifies the number of results to display on each page when creating paged results from a query. The maximum value is 200.
	* @param sortBy 
	* @param startIndex 
	* @return com.mozu.api.contracts.productadmin.AttributeCollection
	* @see com.mozu.api.contracts.productadmin.AttributeCollection
	*/
	public com.mozu.api.contracts.productadmin.AttributeCollection getAttributes(String filter, Integer pageSize, String sortBy, Integer startIndex) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.AttributeCollection> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.AttributeClient.getAttributesClient( filter,  pageSize,  sortBy,  startIndex);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

/**
	* Retrieves the details of the specified product attribute.
	* <p><pre><code>
	*    Attribute attribute = new Attribute();
	*   Attribute attribute = attribute.GetAttribute( attributeFQN);
	* </code></pre></p>
	* @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	* @return com.mozu.api.contracts.productadmin.Attribute
	* @see com.mozu.api.contracts.productadmin.Attribute
	*/
	public com.mozu.api.contracts.productadmin.Attribute getAttribute(String attributeFQN) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.Attribute> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.AttributeClient.getAttributeClient( attributeFQN);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

	/**
	* Creates a new attribute to describe one aspect of a product such as color or size, based on its defined product type. The attribute name, attribute type, input type, and data type are required.
	* <p><pre><code>
	*    Attribute attribute = new Attribute();
	*   Attribute attribute = attribute.AddAttribute( attribute);
	* </code></pre></p>
	* @param attribute Properties of the new product attribute to create.
	* @return com.mozu.api.contracts.productadmin.Attribute
	* @see com.mozu.api.contracts.productadmin.Attribute
	* @see com.mozu.api.contracts.productadmin.Attribute
	*/
	public com.mozu.api.contracts.productadmin.Attribute addAttribute(com.mozu.api.contracts.productadmin.Attribute attribute) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.Attribute> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.AttributeClient.addAttributeClient( attribute);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

	/**
	* Updates an existing attribute with attribute properties to set.
	* <p><pre><code>
	*    Attribute attribute = new Attribute();
	*   Attribute attribute = attribute.UpdateAttribute( attributeFQN,  attribute);
	* </code></pre></p>
	* @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	* @param attribute Any properties of the attribute that to update.
	* @return com.mozu.api.contracts.productadmin.Attribute
	* @see com.mozu.api.contracts.productadmin.Attribute
	* @see com.mozu.api.contracts.productadmin.Attribute
	*/
	public com.mozu.api.contracts.productadmin.Attribute updateAttribute(String attributeFQN, com.mozu.api.contracts.productadmin.Attribute attribute) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.Attribute> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.AttributeClient.updateAttributeClient( attributeFQN,  attribute);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

	/**
	* Deletes a defined product attribute. You cannot delete an attribute assigned a value for a product.
	* <p><pre><code>
	*    Attribute attribute = new Attribute();
	*   attribute.DeleteAttribute( attributeFQN);
	* </code></pre></p>
	* @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	* @return 
	*/
	public void deleteAttribute(String attributeFQN) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.AttributeClient.deleteAttributeClient( attributeFQN);
		setContext(_apiContext, client,true);
		client.executeRequest();

	}


}


