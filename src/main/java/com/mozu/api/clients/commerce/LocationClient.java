/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;

/** <summary>
 * 
 * </summary>
 */
public class LocationClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.Location> mozuClient=GetLocationClient( code, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Location location = client.Result();
	 * </code></pre></p>
	 * @param code 
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.Location>
	 * @see com.mozu.api.contracts.location.Location
	 */
	public static MozuClient<com.mozu.api.contracts.location.Location> getLocationClient(String code, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.LocationUrl.getLocationUrl(code);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.location.Location.class;
		MozuClient<com.mozu.api.contracts.location.Location> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.Location> mozuClient=GetLocationInUsageTypeClient( locationUsageType,  code, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Location location = client.Result();
	 * </code></pre></p>
	 * @param code 
	 * @param locationUsageType 
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.Location>
	 * @see com.mozu.api.contracts.location.Location
	 */
	public static MozuClient<com.mozu.api.contracts.location.Location> getLocationInUsageTypeClient(String locationUsageType, String code, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.LocationUrl.getLocationInUsageTypeUrl(code, locationUsageType);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.location.Location.class;
		MozuClient<com.mozu.api.contracts.location.Location> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationCollection> mozuClient=GetLocationsInUsageTypeClient( locationUsageType);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationCollection locationCollection = client.Result();
	 * </code></pre></p>
	 * @param locationUsageType 
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationCollection>
	 * @see com.mozu.api.contracts.location.LocationCollection
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationCollection> getLocationsInUsageTypeClient(String locationUsageType) throws Exception
	{
		return getLocationsInUsageTypeClient( locationUsageType,  null,  null,  null,  null, null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationCollection> mozuClient=GetLocationsInUsageTypeClient( locationUsageType,  startIndex,  pageSize,  sortBy,  filter, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationCollection locationCollection = client.Result();
	 * </code></pre></p>
	 * @param filter 
	 * @param locationUsageType 
	 * @param pageSize 
	 * @param sortBy 
	 * @param startIndex 
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationCollection>
	 * @see com.mozu.api.contracts.location.LocationCollection
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationCollection> getLocationsInUsageTypeClient(String locationUsageType, Integer startIndex, Integer pageSize, String sortBy, String filter, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.LocationUrl.getLocationsInUsageTypeUrl(filter, locationUsageType, pageSize, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.location.LocationCollection.class;
		MozuClient<com.mozu.api.contracts.location.LocationCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.Location> mozuClient=GetDirectShipLocationClient(authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Location location = client.Result();
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.Location>
	 * @see com.mozu.api.contracts.location.Location
	 */
	public static MozuClient<com.mozu.api.contracts.location.Location> getDirectShipLocationClient(AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.LocationUrl.getDirectShipLocationUrl();
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.location.Location.class;
		MozuClient<com.mozu.api.contracts.location.Location> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.Location> mozuClient=GetInStorePickupLocationClient( code, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Location location = client.Result();
	 * </code></pre></p>
	 * @param code 
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.Location>
	 * @see com.mozu.api.contracts.location.Location
	 */
	public static MozuClient<com.mozu.api.contracts.location.Location> getInStorePickupLocationClient(String code, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.LocationUrl.getInStorePickupLocationUrl(code);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.location.Location.class;
		MozuClient<com.mozu.api.contracts.location.Location> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationCollection> mozuClient=GetInStorePickupLocationsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationCollection locationCollection = client.Result();
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationCollection>
	 * @see com.mozu.api.contracts.location.LocationCollection
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationCollection> getInStorePickupLocationsClient() throws Exception
	{
		return getInStorePickupLocationsClient( null,  null,  null,  null, null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationCollection> mozuClient=GetInStorePickupLocationsClient( startIndex,  pageSize,  sortBy,  filter, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationCollection locationCollection = client.Result();
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param sortBy 
	 * @param startIndex 
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationCollection>
	 * @see com.mozu.api.contracts.location.LocationCollection
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationCollection> getInStorePickupLocationsClient(Integer startIndex, Integer pageSize, String sortBy, String filter, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.LocationUrl.getInStorePickupLocationsUrl(filter, pageSize, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.location.LocationCollection.class;
		MozuClient<com.mozu.api.contracts.location.LocationCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

}



