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
public class LocationTypeResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;
	public LocationTypeResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * 
	 * <p><pre><code>
	 *	LocationType locationtype = new LocationType();
	 *	LocationType locationType = locationtype.GetLocationTypes(authTicket);
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @return List<com.mozu.api.contracts.location.LocationType>
	 * @see com.mozu.api.contracts.location.LocationType
	 */
	public List<com.mozu.api.contracts.location.LocationType> getLocationTypes(AuthTicket authTicket) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.location.LocationType>> client = com.mozu.api.clients.commerce.admin.LocationTypeClient.getLocationTypesClient(authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	LocationType locationtype = new LocationType();
	 *	LocationType locationType = locationtype.GetLocationType( locationTypeCode, authTicket);
	 * </code></pre></p>
	 * @param locationTypeCode 
	 * @param authTicket User Auth Ticket
	 * @return com.mozu.api.contracts.location.LocationType
	 * @see com.mozu.api.contracts.location.LocationType
	 */
	public com.mozu.api.contracts.location.LocationType getLocationType(String locationTypeCode, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.LocationType> client = com.mozu.api.clients.commerce.admin.LocationTypeClient.getLocationTypeClient( locationTypeCode, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	LocationType locationtype = new LocationType();
	 *	LocationType locationType = locationtype.AddLocationType( locationType, authTicket);
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @param locationType 
	 * @return com.mozu.api.contracts.location.LocationType
	 * @see com.mozu.api.contracts.location.LocationType
	 * @see com.mozu.api.contracts.location.LocationType
	 */
	public com.mozu.api.contracts.location.LocationType addLocationType(com.mozu.api.contracts.location.LocationType locationType, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.LocationType> client = com.mozu.api.clients.commerce.admin.LocationTypeClient.addLocationTypeClient( locationType, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	LocationType locationtype = new LocationType();
	 *	LocationType locationType = locationtype.UpdateLocationType( locationType,  locationTypeCode, authTicket);
	 * </code></pre></p>
	 * @param locationTypeCode 
	 * @param authTicket User Auth Ticket
	 * @param locationType 
	 * @return com.mozu.api.contracts.location.LocationType
	 * @see com.mozu.api.contracts.location.LocationType
	 * @see com.mozu.api.contracts.location.LocationType
	 */
	public com.mozu.api.contracts.location.LocationType updateLocationType(com.mozu.api.contracts.location.LocationType locationType, String locationTypeCode, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.LocationType> client = com.mozu.api.clients.commerce.admin.LocationTypeClient.updateLocationTypeClient( locationType,  locationTypeCode, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	LocationType locationtype = new LocationType();
	 *	locationtype.DeleteLocationType( locationTypeCode, authTicket);
	 * </code></pre></p>
	 * @param locationTypeCode 
	 * @param authTicket User Auth Ticket
	 * @return 
	 */
	public void deleteLocationType(String locationTypeCode, AuthTicket authTicket) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.admin.LocationTypeClient.deleteLocationTypeClient( locationTypeCode, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();

	}

}



