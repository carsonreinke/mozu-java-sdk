
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.urls.commerce.customer.accounts;

import com.mozu.api.utils.UrlFormatter;


public class CustomerContactUrl
{

	/**
        * Get Resource Url for GetAccountContact
        * @param accountId Unique identifier of the customer account whose contact information is being retrieved.
        * @param contactId Unique identifier of the customer account contact to retrieve.
        * @return    String Resource Url
    */
	public static String getAccountContactUrl(Integer accountId, Integer contactId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/{accountId}/contacts/{contactId}");
		formatter.formatUrl("accountId", accountId);
		formatter.formatUrl("contactId", contactId);
		return formatter.getResourceUrl();
	}

	/**
        * Get Resource Url for GetAccountContacts
        * @param accountId Unique identifier of the customer account associated with the contact information to retrieve.
        * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
        * @param pageSize Specifies the number of results to display on each page when creating paged results from a query. The maximum value is 200.
        * @param sortBy 
        * @param startIndex 
        * @return    String Resource Url
    */
	public static String getAccountContactsUrl(Integer accountId, String filter, Integer pageSize, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/{accountId}/contacts?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}");
		formatter.formatUrl("accountId", accountId);
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return formatter.getResourceUrl();
	}

		/**
        * Get Resource Url for AddAccountContact
        * @param accountId Unique identifier of the customer account containing the new contact.
        * @return    String Resource Url
    */
	public static String addAccountContactUrl(Integer accountId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/{accountId}/contacts");
		formatter.formatUrl("accountId", accountId);
		return formatter.getResourceUrl();
	}

		/**
        * Get Resource Url for UpdateAccountContact
        * @param accountId Unique identifier of the customer account whose contact information is being updated.
        * @param contactId Unique identifer of the customer account contact being updated.
        * @return    String Resource Url
    */
	public static String updateAccountContactUrl(Integer accountId, Integer contactId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/{accountId}/contacts/{contactId}");
		formatter.formatUrl("accountId", accountId);
		formatter.formatUrl("contactId", contactId);
		return formatter.getResourceUrl();
	}

		/**
        * Get Resource Url for DeleteAccountContact
        * @param accountId Unique identifier of the customer account.
        * @param contactId Unique identifier of the customer account contact to delete.
        * @return    String Resource Url
    */
	public static String deleteAccountContactUrl(Integer accountId, Integer contactId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/{accountId}/contacts/{contactId}");
		formatter.formatUrl("accountId", accountId);
		formatter.formatUrl("contactId", contactId);
		return formatter.getResourceUrl();
	}

	
}
