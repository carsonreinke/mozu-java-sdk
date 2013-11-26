/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.location;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class LocationUrl
{

	/**
	 * Get Resource Url for GetLocation
	 * @param code 
	 * @return   String Resource Url
	 */
	public static MozuUrl getLocationUrl(String code)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/location/runtime/locations/{code}");
		formatter.formatUrl("code", code);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetLocationInUsageType
	 * @param code 
	 * @param locationUsageType 
	 * @return   String Resource Url
	 */
	public static MozuUrl getLocationInUsageTypeUrl(String code, String locationUsageType)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/location/runtime/locationUsageTypes/{locationUsageType}/locations/{code}");
		formatter.formatUrl("code", code);
		formatter.formatUrl("locationUsageType", locationUsageType);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetLocationsInUsageType
	 * @param filter 
	 * @param locationUsageType 
	 * @param pageSize 
	 * @param sortBy 
	 * @param startIndex 
	 * @return   String Resource Url
	 */
	public static MozuUrl getLocationsInUsageTypeUrl(String filter, String locationUsageType, Integer pageSize, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/location/runtime/locationUsageTypes/{locationUsageType}/locations?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("locationUsageType", locationUsageType);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetDirectShipLocation
	 * @return   String Resource Url
	 */
	public static MozuUrl getDirectShipLocationUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/location/runtime/locationUsageTypes/DS/location");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetInStorePickupLocation
	 * @param code 
	 * @return   String Resource Url
	 */
	public static MozuUrl getInStorePickupLocationUrl(String code)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/location/runtime/locationUsageTypes/SP/locations/{code}");
		formatter.formatUrl("code", code);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetInStorePickupLocations
	 * @param filter 
	 * @param pageSize 
	 * @param sortBy 
	 * @param startIndex 
	 * @return   String Resource Url
	 */
	public static MozuUrl getInStorePickupLocationsUrl(String filter, Integer pageSize, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/location/runtime/locationUsageTypes/SP/locations?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

