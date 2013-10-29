
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.urls.commerce.customer;

import com.mozu.api.utils.UrlFormatter;


public class CustomerAccountUrl
{

	/**
        * Get Resource Url for GetAccounts
        * @param fields The fields to include in the response.
        * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
        * @param pageSize 
        * @param q A list of customer account search terms to use in the query when searching across customer name and email. Separate multiple search terms with a space character.
        * @param qLimit The maximum number of search results to return in the response. You can limit any range between 1-100.
        * @param sortBy 
        * @param startIndex 
        * @return    String Resource Url
    */
	public static String getAccountsUrl(String fields, String filter, Integer pageSize, String q, Integer qLimit, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}&fields={fields}&q={q}&qLimit={qLimit}");
		formatter.formatUrl("fields", fields);
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("q", q);
		formatter.formatUrl("qLimit", qLimit);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return formatter.getResourceUrl();
	}

	/**
        * Get Resource Url for GetAccount
        * @param accountId Unique identifier of the customer account to retrieve.
        * @return    String Resource Url
    */
	public static String getAccountUrl(Integer accountId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/{accountId}");
		formatter.formatUrl("accountId", accountId);
		return formatter.getResourceUrl();
	}

		/**
        * Get Resource Url for AddAccount
        * @return    String Resource Url
    */
	public static String addAccountUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/");
		return formatter.getResourceUrl();
	}

		/**
        * Get Resource Url for UpdateAccount
        * @param accountId Unique identifier of the customer account.
        * @return    String Resource Url
    */
	public static String updateAccountUrl(Integer accountId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/{accountId}");
		formatter.formatUrl("accountId", accountId);
		return formatter.getResourceUrl();
	}

		/**
        * Get Resource Url for DeleteAccount
        * @param accountId Unique identifier of the customer account to delete.
        * @return    String Resource Url
    */
	public static String deleteAccountUrl(Integer accountId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/{accountId}");
		formatter.formatUrl("accountId", accountId);
		return formatter.getResourceUrl();
	}

	
}
