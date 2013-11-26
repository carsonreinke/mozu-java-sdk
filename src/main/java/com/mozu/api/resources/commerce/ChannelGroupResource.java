/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce;

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
public class ChannelGroupResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;
	public ChannelGroupResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * 
	 * <p><pre><code>
	 *	ChannelGroup channelgroup = new ChannelGroup();
	 *	ChannelGroupCollection channelGroupCollection = channelgroup.GetChannelGroups();
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @return com.mozu.api.contracts.commerceruntime.channels.ChannelGroupCollection
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroupCollection
	 */
	public com.mozu.api.contracts.commerceruntime.channels.ChannelGroupCollection getChannelGroups() throws Exception
	{
		return getChannelGroups( null,  null,  null,  null, null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ChannelGroup channelgroup = new ChannelGroup();
	 *	ChannelGroupCollection channelGroupCollection = channelgroup.GetChannelGroups( filter,  pageSize,  sortBy,  startIndex, authTicket);
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param sortBy 
	 * @param startIndex 
	 * @param authTicket User Auth Ticket
	 * @return com.mozu.api.contracts.commerceruntime.channels.ChannelGroupCollection
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroupCollection
	 */
	public com.mozu.api.contracts.commerceruntime.channels.ChannelGroupCollection getChannelGroups(String filter, Integer pageSize, String sortBy, Integer startIndex, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroupCollection> client = com.mozu.api.clients.commerce.ChannelGroupClient.getChannelGroupsClient( filter,  pageSize,  sortBy,  startIndex, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ChannelGroup channelgroup = new ChannelGroup();
	 *	ChannelGroup channelGroup = channelgroup.GetChannelGroup( code, authTicket);
	 * </code></pre></p>
	 * @param code 
	 * @param authTicket User Auth Ticket
	 * @return com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 */
	public com.mozu.api.contracts.commerceruntime.channels.ChannelGroup getChannelGroup(String code, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup> client = com.mozu.api.clients.commerce.ChannelGroupClient.getChannelGroupClient( code, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ChannelGroup channelgroup = new ChannelGroup();
	 *	ChannelGroup channelGroup = channelgroup.CreateChannelGroup( channelGroup, authTicket);
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @param channelGroup 
	 * @return com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 */
	public com.mozu.api.contracts.commerceruntime.channels.ChannelGroup createChannelGroup(com.mozu.api.contracts.commerceruntime.channels.ChannelGroup channelGroup, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup> client = com.mozu.api.clients.commerce.ChannelGroupClient.createChannelGroupClient( channelGroup, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ChannelGroup channelgroup = new ChannelGroup();
	 *	ChannelGroup channelGroup = channelgroup.UpdateChannelGroup( channelGroup,  code, authTicket);
	 * </code></pre></p>
	 * @param code 
	 * @param authTicket User Auth Ticket
	 * @param channelGroup 
	 * @return com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 */
	public com.mozu.api.contracts.commerceruntime.channels.ChannelGroup updateChannelGroup(com.mozu.api.contracts.commerceruntime.channels.ChannelGroup channelGroup, String code, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup> client = com.mozu.api.clients.commerce.ChannelGroupClient.updateChannelGroupClient( channelGroup,  code, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ChannelGroup channelgroup = new ChannelGroup();
	 *	channelgroup.DeleteChannelGroup( code, authTicket);
	 * </code></pre></p>
	 * @param code 
	 * @param authTicket User Auth Ticket
	 * @return 
	 */
	public void deleteChannelGroup(String code, AuthTicket authTicket) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.ChannelGroupClient.deleteChannelGroupClient( code, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();

	}

}



