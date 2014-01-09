/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.admin;

import com.mozu.api.ApiContext;
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
public class LocationResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;
	public LocationResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * 
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	LocationCollection locationCollection = location.GetLocations();
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @return com.mozu.api.contracts.location.LocationCollection
	 * @see com.mozu.api.contracts.location.LocationCollection
	 */
	public com.mozu.api.contracts.location.LocationCollection getLocations() throws Exception
	{
		return getLocations( null,  null,  null,  null, null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	LocationCollection locationCollection = location.GetLocations( startIndex,  pageSize,  sortBy,  filter, authTicket);
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param sortBy 
	 * @param startIndex 
	 * @param authTicket User Auth Ticket
	 * @return com.mozu.api.contracts.location.LocationCollection
	 * @see com.mozu.api.contracts.location.LocationCollection
	 */
	public com.mozu.api.contracts.location.LocationCollection getLocations(Integer startIndex, Integer pageSize, String sortBy, String filter, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.LocationCollection> client = com.mozu.api.clients.commerce.admin.LocationClient.getLocationsClient( startIndex,  pageSize,  sortBy,  filter, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	Location location = location.GetLocation( locationCode, authTicket);
	 * </code></pre></p>
	 * @param locationCode 
	 * @param authTicket User Auth Ticket
	 * @return com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public com.mozu.api.contracts.location.Location getLocation(String locationCode, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.Location> client = com.mozu.api.clients.commerce.admin.LocationClient.getLocationClient( locationCode, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	Location location = location.AddLocation( location, authTicket);
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @param location 
	 * @return com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public com.mozu.api.contracts.location.Location addLocation(com.mozu.api.contracts.location.Location location, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.Location> client = com.mozu.api.clients.commerce.admin.LocationClient.addLocationClient( location, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	Location location = location.UpdateLocation( location,  locationCode, authTicket);
	 * </code></pre></p>
	 * @param locationCode 
	 * @param authTicket User Auth Ticket
	 * @param location 
	 * @return com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public com.mozu.api.contracts.location.Location updateLocation(com.mozu.api.contracts.location.Location location, String locationCode, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.Location> client = com.mozu.api.clients.commerce.admin.LocationClient.updateLocationClient( location,  locationCode, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Location location = new Location();
	 *	location.DeleteLocation( locationCode, authTicket);
	 * </code></pre></p>
	 * @param locationCode 
	 * @param authTicket User Auth Ticket
	 * @return 
	 */
	public void deleteLocation(String locationCode, AuthTicket authTicket) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.admin.LocationClient.deleteLocationClient( locationCode, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();

	}

}



