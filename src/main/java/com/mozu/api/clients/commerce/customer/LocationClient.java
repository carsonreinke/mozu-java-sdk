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
/// List of locations where customer pages exist. Examples: Customer Welcome Page, Customer Information Page.
/// </summary>
public class LocationClient {
	
	
	/**
	* Retrieves the location of a customer by providing a location ID.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.core.extensible.Location> mozuClient=GetLocationClient( locationId);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* Location location = client.Result();
	* </code></pre></p>
	* @param locationId Identifier of the location being retrieved.
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.extensible.Location>
	* @see com.mozu.api.contracts.core.extensible.Location
	*/
	public static MozuClient<com.mozu.api.contracts.core.extensible.Location> getLocationClient(Integer locationId) throws Exception
	{
		String url = com.mozu.api.urls.commerce.customer.LocationUrl.getLocationUrl(locationId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.core.extensible.Location.class;
		MozuClient<com.mozu.api.contracts.core.extensible.Location> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

/**
	* Retrieves the location by providing a name to query by.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.core.extensible.Location> mozuClient=GetLocationByNameClient( name);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* Location location = client.Result();
	* </code></pre></p>
	* @param name The name of the location.
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.extensible.Location>
	* @see com.mozu.api.contracts.core.extensible.Location
	*/
	public static MozuClient<com.mozu.api.contracts.core.extensible.Location> getLocationByNameClient(String name) throws Exception
	{
		String url = com.mozu.api.urls.commerce.customer.LocationUrl.getLocationByNameUrl(name);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.core.extensible.Location.class;
		MozuClient<com.mozu.api.contracts.core.extensible.Location> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

/**
	* Retrieves a list of locations for this particular customer.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.core.extensible.LocationCollection> mozuClient=GetLocationsClient();
	* client.setBaseAddress(url);
	* client.executeRequest();
	* LocationCollection locationCollection = client.Result();
	* </code></pre></p>
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.extensible.LocationCollection>
	* @see com.mozu.api.contracts.core.extensible.LocationCollection
	*/
	public static MozuClient<com.mozu.api.contracts.core.extensible.LocationCollection> getLocationsClient() throws Exception
	{
		return getLocationsClient( null,  null,  null,  null);
	}

/**
	* Retrieves a list of locations for this particular customer.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.core.extensible.LocationCollection> mozuClient=GetLocationsClient( filter,  pageSize,  sortBy,  startIndex);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* LocationCollection locationCollection = client.Result();
	* </code></pre></p>
	* @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	* @param pageSize Specifies the number of results to display on each page when creating paged results from a query. The maximum value is 200.
	* @param sortBy 
	* @param startIndex 
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.extensible.LocationCollection>
	* @see com.mozu.api.contracts.core.extensible.LocationCollection
	*/
	public static MozuClient<com.mozu.api.contracts.core.extensible.LocationCollection> getLocationsClient(String filter, Integer pageSize, String sortBy, Integer startIndex) throws Exception
	{
		String url = com.mozu.api.urls.commerce.customer.LocationUrl.getLocationsUrl(filter, pageSize, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.core.extensible.LocationCollection.class;
		MozuClient<com.mozu.api.contracts.core.extensible.LocationCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

			
}



