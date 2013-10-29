/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.resources.commerce.customer;

import com.mozu.api.ApiContext;
import com.mozu.api.resources.BaseResource;
import java.util.ArrayList;
import com.mozu.api.MozuClient;

/// <summary>
/// Merchants create, view, update and delete groups. Groups are useful to manage sets of customers, for example, to offer discounts to particular groups or assign VIP status to a set of customers. A customer account can have several groups or none at all.
/// </summary>
public class CustomerGroupResource extends BaseResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;
	
	public CustomerGroupResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	* Retrieves a list of all customer groups defined for the site according to any specified filter criteria and sort options.
	* <p><pre><code>
	*    CustomerGroup customergroup = new CustomerGroup();
	*   CustomerGroupCollection customerGroupCollection = customergroup.GetGroups();
	* </code></pre></p>
	* @return com.mozu.api.contracts.customer.CustomerGroupCollection
	* @see com.mozu.api.contracts.customer.CustomerGroupCollection
	*/
	public com.mozu.api.contracts.customer.CustomerGroupCollection getGroups() throws Exception
	{
		return getGroups( null,  null,  null,  null);
	}

/**
	* Retrieves a list of all customer groups defined for the site according to any specified filter criteria and sort options.
	* <p><pre><code>
	*    CustomerGroup customergroup = new CustomerGroup();
	*   CustomerGroupCollection customerGroupCollection = customergroup.GetGroups( filter,  pageSize,  sortBy,  startIndex);
	* </code></pre></p>
	* @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	* @param pageSize Specifies the number of results to display on each page when creating paged results from a query. The maximum value is 200.
	* @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	* @param startIndex Indicates the zero-based offset in the complete result set where the returned entities begin, when creating paged results from a query. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	* @return com.mozu.api.contracts.customer.CustomerGroupCollection
	* @see com.mozu.api.contracts.customer.CustomerGroupCollection
	*/
	public com.mozu.api.contracts.customer.CustomerGroupCollection getGroups(String filter, Integer pageSize, String sortBy, Integer startIndex) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerGroupCollection> client = com.mozu.api.clients.commerce.customer.CustomerGroupClient.getGroupsClient( filter,  pageSize,  sortBy,  startIndex);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

/**
	* Retrieves the name of a customer group specified the customer group ID.
	* <p><pre><code>
	*    CustomerGroup customergroup = new CustomerGroup();
	*   CustomerGroup customerGroup = customergroup.GetGroup( groupId);
	* </code></pre></p>
	* @param groupId Identifier of the customer group to retrieve.
	* @return com.mozu.api.contracts.customer.CustomerGroup
	* @see com.mozu.api.contracts.customer.CustomerGroup
	*/
	public com.mozu.api.contracts.customer.CustomerGroup getGroup(Integer groupId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerGroup> client = com.mozu.api.clients.commerce.customer.CustomerGroupClient.getGroupClient( groupId);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

	/**
	* Creates a new customer group. New customer groups do not have any associated customer accounts.
	* <p><pre><code>
	*    CustomerGroup customergroup = new CustomerGroup();
	*   CustomerGroup customerGroup = customergroup.AddGroup( customerGroup);
	* </code></pre></p>
	* @param customerGroup Properties of the customer group to create.
	* @return com.mozu.api.contracts.customer.CustomerGroup
	* @see com.mozu.api.contracts.customer.CustomerGroup
	* @see com.mozu.api.contracts.customer.CustomerGroup
	*/
	public com.mozu.api.contracts.customer.CustomerGroup addGroup(com.mozu.api.contracts.customer.CustomerGroup customerGroup) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerGroup> client = com.mozu.api.clients.commerce.customer.CustomerGroupClient.addGroupClient( customerGroup);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

	/**
	* Changes the name of an existing customer group.
	* <p><pre><code>
	*    CustomerGroup customergroup = new CustomerGroup();
	*   CustomerGroup customerGroup = customergroup.UpdateGroup( groupId,  customerGroup);
	* </code></pre></p>
	* @param groupId Identifier of the customer group to update.
	* @param customerGroup New name of the customer group.
	* @return com.mozu.api.contracts.customer.CustomerGroup
	* @see com.mozu.api.contracts.customer.CustomerGroup
	* @see com.mozu.api.contracts.customer.CustomerGroup
	*/
	public com.mozu.api.contracts.customer.CustomerGroup updateGroup(Integer groupId, com.mozu.api.contracts.customer.CustomerGroup customerGroup) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerGroup> client = com.mozu.api.clients.commerce.customer.CustomerGroupClient.updateGroupClient( groupId,  customerGroup);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

	/**
	* Deletes a customer group specified by its unique identifier. Deleting a group removes any customer account associations, but does not delete the customer account itself.
	* <p><pre><code>
	*    CustomerGroup customergroup = new CustomerGroup();
	*   customergroup.DeleteGroup( groupId);
	* </code></pre></p>
	* @param groupId Identifier of the customer group to delete.
	* @return 
	*/
	public void deleteGroup(Integer groupId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.customer.CustomerGroupClient.deleteGroupClient( groupId);
		setContext(_apiContext, client,true);
		client.executeRequest();

	}


}


