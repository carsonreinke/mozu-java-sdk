/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.location.admin;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class LocationUrl
{

	/**
	 * Get Resource Url for GetLocations
	 * @param filter 
	 * @param pageSize 
	 * @param sortBy 
	 * @param startIndex 
	 * @return   String Resource Url
	 */
	public static MozuUrl getLocationsUrl(String filter, Integer pageSize, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/location/admin/locations/?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetLocation
	 * @param locationCode 
	 * @return   String Resource Url
	 */
	public static MozuUrl getLocationUrl(String locationCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/location/admin/locations/{locationCode}");
		formatter.formatUrl("locationCode", locationCode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddLocation
	 * @return   String Resource Url
	 */
	public static MozuUrl addLocationUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/location/admin/locations/");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateLocation
	 * @param locationCode 
	 * @return   String Resource Url
	 */
	public static MozuUrl updateLocationUrl(String locationCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/location/admin/locations/{locationCode}");
		formatter.formatUrl("locationCode", locationCode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteLocation
	 * @param locationCode 
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteLocationUrl(String locationCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/location/admin/locations/{locationCode}");
		formatter.formatUrl("locationCode", locationCode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

