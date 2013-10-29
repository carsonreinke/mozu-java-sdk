
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.urls.commerce.customer.accounts;

import com.mozu.api.utils.UrlFormatter;


public class TransactionUrl
{

	/**
        * Get Resource Url for GetTransactions
        * @param accountId 
        * @return    String Resource Url
    */
	public static String getTransactionsUrl(Integer accountId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/{accountId}/transactions");
		formatter.formatUrl("accountId", accountId);
		return formatter.getResourceUrl();
	}

		/**
        * Get Resource Url for AddTransaction
        * @param accountId 
        * @return    String Resource Url
    */
	public static String addTransactionUrl(Integer accountId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/{accountId}/transactions");
		formatter.formatUrl("accountId", accountId);
		return formatter.getResourceUrl();
	}

			/**
        * Get Resource Url for RemoveTransaction
        * @param accountId 
        * @param transactionId 
        * @return    String Resource Url
    */
	public static String removeTransactionUrl(Integer accountId, String transactionId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/{accountId}/transactions/{transactionId}");
		formatter.formatUrl("accountId", accountId);
		formatter.formatUrl("transactionId", transactionId);
		return formatter.getResourceUrl();
	}

	
}
