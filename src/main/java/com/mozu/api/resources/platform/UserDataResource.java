/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.platform;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;

/** <summary>
 * Use the user data subresource to store user-level data required for a third-party application in the Mozu database.
 * </summary>
 */
public class UserDataResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;
	public UserDataResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * Retrieves the value of a record in the Mozu database.
	 * <p><pre><code>
	 *	UserData userdata = new UserData();
	 *	string string = userdata.GetDBValue( dbEntryQuery, authTicket);
	 * </code></pre></p>
	 * @param dbEntryQuery The database entry query string used to retrieve the record information.
	 * @param authTicket User Auth Ticket
	 * @return string
	 * @see string
	 */
	public String getDBValue(String dbEntryQuery, AuthTicket authTicket) throws Exception
	{
		MozuClient<String> client = com.mozu.api.clients.platform.UserDataClient.getDBValueClient( dbEntryQuery, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new record in the Mozu database based on the information supplied in the request.
	 * <p><pre><code>
	 *	UserData userdata = new UserData();
	 *	userdata.CreateDBValue( value,  dbEntryQuery, authTicket);
	 * </code></pre></p>
	 * @param dbEntryQuery The database entry string to create.
	 * @param authTicket User Auth Ticket
	 * @param value The value string to create.
	 * @return 
	 * @see string
	 */
	public void createDBValue(String value, String dbEntryQuery, AuthTicket authTicket) throws Exception
	{
		MozuClient client = com.mozu.api.clients.platform.UserDataClient.createDBValueClient( value,  dbEntryQuery, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();

	}

	/**
	 * Updates a record in the Mozu database based on the information supplied in the request.
	 * <p><pre><code>
	 *	UserData userdata = new UserData();
	 *	userdata.UpdateDBValue( value,  dbEntryQuery, authTicket);
	 * </code></pre></p>
	 * @param dbEntryQuery The database entry query string used to update the record information.
	 * @param authTicket User Auth Ticket
	 * @param value The database value to update.
	 * @return 
	 * @see string
	 */
	public void updateDBValue(String value, String dbEntryQuery, AuthTicket authTicket) throws Exception
	{
		MozuClient client = com.mozu.api.clients.platform.UserDataClient.updateDBValueClient( value,  dbEntryQuery, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();

	}

	/**
	 * Removes a previously defined record in the Mozu database.
	 * <p><pre><code>
	 *	UserData userdata = new UserData();
	 *	userdata.DeleteDBValue( dbEntryQuery, authTicket);
	 * </code></pre></p>
	 * @param dbEntryQuery The database entry string to delete.
	 * @param authTicket User Auth Ticket
	 * @return 
	 */
	public void deleteDBValue(String dbEntryQuery, AuthTicket authTicket) throws Exception
	{
		MozuClient client = com.mozu.api.clients.platform.UserDataClient.deleteDBValueClient( dbEntryQuery, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();

	}

}



