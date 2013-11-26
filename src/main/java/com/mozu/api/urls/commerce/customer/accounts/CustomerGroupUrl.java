/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.customer.accounts;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class CustomerGroupUrl
{

	/**
	 * Get Resource Url for GetAccountGroups
	 * @param accountId 
	 * @param filter 
	 * @param pageSize 
	 * @param sortBy 
	 * @param startIndex 
	 * @return   String Resource Url
	 */
	public static MozuUrl getAccountGroupsUrl(Integer accountId, String filter, Integer pageSize, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/{accountId}/groups/?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}");
		formatter.formatUrl("accountId", accountId);
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetAccountGroup
	 * @param accountId 
	 * @param groupId 
	 * @return   String Resource Url
	 */
	public static MozuUrl getAccountGroupUrl(Integer accountId, Integer groupId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/{accountId}/groups/{groupId}");
		formatter.formatUrl("accountId", accountId);
		formatter.formatUrl("groupId", groupId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddAccountGroup
	 * @param accountId 
	 * @param groupId 
	 * @return   String Resource Url
	 */
	public static MozuUrl addAccountGroupUrl(Integer accountId, Integer groupId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/{accountId}/groups/{groupId}");
		formatter.formatUrl("accountId", accountId);
		formatter.formatUrl("groupId", groupId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteAccountGroup
	 * @param accountId 
	 * @param groupId 
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteAccountGroupUrl(Integer accountId, Integer groupId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/{accountId}/groups/{groupId}");
		formatter.formatUrl("accountId", accountId);
		formatter.formatUrl("groupId", groupId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

