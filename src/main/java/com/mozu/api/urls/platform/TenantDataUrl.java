/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.platform;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class TenantDataUrl
{

	/**
	 * Get Resource Url for GetDBValue
	 * @param dbEntryQuery 
	 * @return   String Resource Url
	 */
	public static MozuUrl getDBValueUrl(String dbEntryQuery)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/tenantdata/{*dbEntryQuery}");
		formatter.formatUrl("dbEntryQuery", dbEntryQuery);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreateDBValue
	 * @param dbEntryQuery 
	 * @return   String Resource Url
	 */
	public static MozuUrl createDBValueUrl(String dbEntryQuery)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/tenantdata/{*dbEntryQuery}");
		formatter.formatUrl("dbEntryQuery", dbEntryQuery);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateDBValue
	 * @param dbEntryQuery 
	 * @return   String Resource Url
	 */
	public static MozuUrl updateDBValueUrl(String dbEntryQuery)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/tenantdata/{*dbEntryQuery}");
		formatter.formatUrl("dbEntryQuery", dbEntryQuery);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteDBValue
	 * @param dbEntryQuery 
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteDBValueUrl(String dbEntryQuery)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/tenantdata/{*dbEntryQuery}");
		formatter.formatUrl("dbEntryQuery", dbEntryQuery);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

