/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.clients.commerce.customer;

import java.util.ArrayList;
import com.mozu.api.MozuClient;

/// <summary>
/// Create, view, update, and delete a contact in a customer account. A customer account may have multiple contacts for billing or shipping addresses. Each contact may also list any groups to which the contact belongs and whether the contact accepts marketing material such as newsletters or email offers.
/// </summary>
public class CustomerAccountClient {
	
	
	/**
	* Retrieves a list of customer accounts.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.customer.CustomerAccountCollection> mozuClient=GetAccountsClient();
	* client.setBaseAddress(url);
	* client.executeRequest();
	* CustomerAccountCollection customerAccountCollection = client.Result();
	* </code></pre></p>
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAccountCollection>
	* @see com.mozu.api.contracts.customer.CustomerAccountCollection
	*/
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAccountCollection> getAccountsClient() throws Exception
	{
		return getAccountsClient( null,  null,  null,  null,  null,  null,  null);
	}

/**
	* Retrieves a list of customer accounts.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.customer.CustomerAccountCollection> mozuClient=GetAccountsClient( fields,  filter,  pageSize,  q,  qLimit,  sortBy,  startIndex);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* CustomerAccountCollection customerAccountCollection = client.Result();
	* </code></pre></p>
	* @param fields The fields to include in the response.
	* @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	* @param pageSize 
	* @param q A list of customer account search terms to use in the query when searching across customer name and email. Separate multiple search terms with a space character.
	* @param qLimit The maximum number of search results to return in the response. You can limit any range between 1-100.
	* @param sortBy 
	* @param startIndex 
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAccountCollection>
	* @see com.mozu.api.contracts.customer.CustomerAccountCollection
	*/
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAccountCollection> getAccountsClient(String fields, String filter, Integer pageSize, String q, Integer qLimit, String sortBy, Integer startIndex) throws Exception
	{
		String url = com.mozu.api.urls.commerce.customer.CustomerAccountUrl.getAccountsUrl(fields, filter, pageSize, q, qLimit, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerAccountCollection.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerAccountCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

/**
	* Retrieve details of a customer account.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.customer.CustomerAccount> mozuClient=GetAccountClient( accountId);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* CustomerAccount customerAccount = client.Result();
	* </code></pre></p>
	* @param accountId Unique identifier of the customer account to retrieve.
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAccount>
	* @see com.mozu.api.contracts.customer.CustomerAccount
	*/
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAccount> getAccountClient(Integer accountId) throws Exception
	{
		String url = com.mozu.api.urls.commerce.customer.CustomerAccountUrl.getAccountUrl(accountId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerAccount.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerAccount> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	* Creates a new customer account.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.customer.CustomerAccount> mozuClient=AddAccountClient( customerAccount);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* CustomerAccount customerAccount = client.Result();
	* </code></pre></p>
	* @param customerAccount Properties of the new customer account to create.
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAccount>
	* @see com.mozu.api.contracts.customer.CustomerAccount
	* @see com.mozu.api.contracts.customer.CustomerAccount
	*/
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAccount> addAccountClient(com.mozu.api.contracts.customer.CustomerAccount customerAccount) throws Exception
	{
		String url = com.mozu.api.urls.commerce.customer.CustomerAccountUrl.addAccountUrl();
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerAccount.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerAccount> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(customerAccount);
		return mozuClient;

	}

	/**
	* Updates a customer account.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.customer.CustomerAccount> mozuClient=UpdateAccountClient( accountId,  customerAccount);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* CustomerAccount customerAccount = client.Result();
	* </code></pre></p>
	* @param accountId Unique identifier of the customer account.
	* @param customerAccount Properties of the customer account to update.
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAccount>
	* @see com.mozu.api.contracts.customer.CustomerAccount
	* @see com.mozu.api.contracts.customer.CustomerAccount
	*/
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAccount> updateAccountClient(Integer accountId, com.mozu.api.contracts.customer.CustomerAccount customerAccount) throws Exception
	{
		String url = com.mozu.api.urls.commerce.customer.CustomerAccountUrl.updateAccountUrl(accountId);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerAccount.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerAccount> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(customerAccount);
		return mozuClient;

	}

	/**
	* Deletes a customer account. A customer account cannot be deleted if any orders exist, past or present.
	* <p><pre><code>
	*   MozuClient mozuClient=DeleteAccountClient( accountId);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* </code></pre></p>
	* @param accountId Unique identifier of the customer account to delete.
	* @return Mozu.Api.MozuClient 
	*/
	public static MozuClient deleteAccountClient(Integer accountId) throws Exception
	{
		String url = com.mozu.api.urls.commerce.customer.CustomerAccountUrl.deleteAccountUrl(accountId);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}


}



