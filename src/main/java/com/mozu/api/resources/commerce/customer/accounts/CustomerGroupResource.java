/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.resources.commerce.customer.accounts;

import com.mozu.api.ApiContext;
import com.mozu.api.resources.BaseResource;
import java.util.ArrayList;
import com.mozu.api.MozuClient;

/// <summary>
/// Use the groups subresource to manage customer accounts in groups. The groups are useful to manage sets of customers. A customer account can belong to several groups or none at all.
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
	* Retrieve a list of customer groups associated with the customer account.
	* <p><pre><code>
	*    CustomerGroup customergroup = new CustomerGroup();
	*   CustomerGroupCollection customerGroupCollection = customergroup.GetAccountGroups( accountId);
	* </code></pre></p>
	* @param accountId Unique identifier of the customer account.
	* @return com.mozu.api.contracts.customer.CustomerGroupCollection
	* @see com.mozu.api.contracts.customer.CustomerGroupCollection
	*/
	public com.mozu.api.contracts.customer.CustomerGroupCollection getAccountGroups(Integer accountId) throws Exception
	{
		return getAccountGroups( accountId,  null,  null,  null,  null);
	}

/**
	* Retrieve a list of customer groups associated with the customer account.
	* <p><pre><code>
	*    CustomerGroup customergroup = new CustomerGroup();
	*   CustomerGroupCollection customerGroupCollection = customergroup.GetAccountGroups( accountId,  filter,  pageSize,  sortBy,  startIndex);
	* </code></pre></p>
	* @param accountId Unique identifier of the customer account.
	* @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	* @param pageSize Specifies the number of results to display on each page when creating paged results from a query. The maximum value is 200.
	* @param sortBy 
	* @param startIndex 
	* @return com.mozu.api.contracts.customer.CustomerGroupCollection
	* @see com.mozu.api.contracts.customer.CustomerGroupCollection
	*/
	public com.mozu.api.contracts.customer.CustomerGroupCollection getAccountGroups(Integer accountId, String filter, Integer pageSize, String sortBy, Integer startIndex) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerGroupCollection> client = com.mozu.api.clients.commerce.customer.accounts.CustomerGroupClient.getAccountGroupsClient( accountId,  filter,  pageSize,  sortBy,  startIndex);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

/**
	* Retrieves details of a customer account in a group.
	* <p><pre><code>
	*    CustomerGroup customergroup = new CustomerGroup();
	*   CustomerGroup customerGroup = customergroup.GetAccountGroup( accountId,  groupId);
	* </code></pre></p>
	* @param accountId Unique identifier of the customer account.
	* @param groupId Unique identifier of the customer group.
	* @return com.mozu.api.contracts.customer.CustomerGroup
	* @see com.mozu.api.contracts.customer.CustomerGroup
	*/
	public com.mozu.api.contracts.customer.CustomerGroup getAccountGroup(Integer accountId, Integer groupId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerGroup> client = com.mozu.api.clients.commerce.customer.accounts.CustomerGroupClient.getAccountGroupClient( accountId,  groupId);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

	/**
	* Adds a customer account to a group.
	* <p><pre><code>
	*    CustomerGroup customergroup = new CustomerGroup();
	*   CustomerGroup customerGroup = customergroup.AddAccountGroup( accountId,  groupId);
	* </code></pre></p>
	* @param accountId Unique identifier of the customer account to add to a group.
	* @param groupId Unique identifier of the customer group to add the customer to.
	* @return com.mozu.api.contracts.customer.CustomerGroup
	* @see com.mozu.api.contracts.customer.CustomerGroup
	*/
	public com.mozu.api.contracts.customer.CustomerGroup addAccountGroup(Integer accountId, Integer groupId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerGroup> client = com.mozu.api.clients.commerce.customer.accounts.CustomerGroupClient.addAccountGroupClient( accountId,  groupId);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

		/**
	* Removes a customer account from a group.
	* <p><pre><code>
	*    CustomerGroup customergroup = new CustomerGroup();
	*   customergroup.DeleteAccountGroup( accountId,  groupId);
	* </code></pre></p>
	* @param accountId Unique identifier of the customer account to remove from the group.
	* @param groupId Unique identifier of the customer group.
	* @return 
	*/
	public void deleteAccountGroup(Integer accountId, Integer groupId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.customer.accounts.CustomerGroupClient.deleteAccountGroupClient( accountId,  groupId);
		setContext(_apiContext, client,true);
		client.executeRequest();

	}


}



