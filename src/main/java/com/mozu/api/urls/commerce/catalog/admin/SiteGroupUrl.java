
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.urls.commerce.catalog.admin;

import com.mozu.api.utils.UrlFormatter;


public class SiteGroupUrl
{

	/**
        * Get Resource Url for GetSiteGroups
        * @param pageSize 
        * @param startIndex 
        * @return    String Resource Url
    */
	public static String getSiteGroupsUrl(Integer pageSize, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/sitegroups/?startIndex={startIndex}&pageSize={pageSize}");
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("startIndex", startIndex);
		return formatter.getResourceUrl();
	}

	/**
        * Get Resource Url for GetSiteGroup
        * @param siteGroupId 
        * @return    String Resource Url
    */
	public static String getSiteGroupUrl(Integer siteGroupId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/sitegroups/{siteGroupId}");
		formatter.formatUrl("siteGroupId", siteGroupId);
		return formatter.getResourceUrl();
	}

			/**
        * Get Resource Url for UpdateSiteGroup
        * @param siteGroupId 
        * @return    String Resource Url
    */
	public static String updateSiteGroupUrl(Integer siteGroupId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/sitegroups/{siteGroupId}");
		formatter.formatUrl("siteGroupId", siteGroupId);
		return formatter.getResourceUrl();
	}

		
}

