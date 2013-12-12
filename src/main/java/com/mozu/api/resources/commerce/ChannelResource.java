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
 * Use the Channels resource to manage the channels a company uses to create logical commercial business divisions based on region or types of sales, such as "US Online," "Amazon," or "EMEA Retail." All orders include a channel association that enables the company to perform financial reporting for each defined channel. Because channels are managed at the tenant level, you must associate all the tenant's sites with a channel. Sites that do not have a defined channel association cannot successfully submit orders.
 * </summary>
 */
public class ChannelResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;
	public ChannelResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * Retrieves a list of channels defined for a tenant according to any filter or sort criteria specified in the request.
	 * <p><pre><code>
	 *	Channel channel = new Channel();
	 *	ChannelCollection channelCollection = channel.GetChannels();
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @return com.mozu.api.contracts.commerceruntime.channels.ChannelCollection
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelCollection
	 */
	public com.mozu.api.contracts.commerceruntime.channels.ChannelCollection getChannels() throws Exception
	{
		return getChannels( null,  null,  null,  null, null);
	}

	/**
	 * Retrieves a list of channels defined for a tenant according to any filter or sort criteria specified in the request.
	 * <p><pre><code>
	 *	Channel channel = new Channel();
	 *	ChannelCollection channelCollection = channel.GetChannels( startIndex,  pageSize,  sortBy,  filter, authTicket);
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @param authTicket User Auth Ticket
	 * @return com.mozu.api.contracts.commerceruntime.channels.ChannelCollection
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelCollection
	 */
	public com.mozu.api.contracts.commerceruntime.channels.ChannelCollection getChannels(Integer startIndex, Integer pageSize, String sortBy, String filter, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelCollection> client = com.mozu.api.clients.commerce.ChannelClient.getChannelsClient( startIndex,  pageSize,  sortBy,  filter, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of the channel specified in the request.
	 * <p><pre><code>
	 *	Channel channel = new Channel();
	 *	Channel channel = channel.GetChannel( code, authTicket);
	 * </code></pre></p>
	 * @param code User-defined code that identifies the channel to retrieve.
	 * @param authTicket User Auth Ticket
	 * @return com.mozu.api.contracts.commerceruntime.channels.Channel
	 * @see com.mozu.api.contracts.commerceruntime.channels.Channel
	 */
	public com.mozu.api.contracts.commerceruntime.channels.Channel getChannel(String code, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.channels.Channel> client = com.mozu.api.clients.commerce.ChannelClient.getChannelClient( code, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new channel that defines a new logical business division to use for financial reporting.
	 * <p><pre><code>
	 *	Channel channel = new Channel();
	 *	Channel channel = channel.CreateChannel( channel, authTicket);
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @param channel Properties of the channel to create.
	 * @return com.mozu.api.contracts.commerceruntime.channels.Channel
	 * @see com.mozu.api.contracts.commerceruntime.channels.Channel
	 * @see com.mozu.api.contracts.commerceruntime.channels.Channel
	 */
	public com.mozu.api.contracts.commerceruntime.channels.Channel createChannel(com.mozu.api.contracts.commerceruntime.channels.Channel channel, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.channels.Channel> client = com.mozu.api.clients.commerce.ChannelClient.createChannelClient( channel, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates one or more details of a defined channel, including the associated sites.
	 * <p><pre><code>
	 *	Channel channel = new Channel();
	 *	Channel channel = channel.UpdateChannel( channel,  code, authTicket);
	 * </code></pre></p>
	 * @param code User-defined code that identifies the channel to update.
	 * @param authTicket User Auth Ticket
	 * @param channel Properties of a the channel to update.
	 * @return com.mozu.api.contracts.commerceruntime.channels.Channel
	 * @see com.mozu.api.contracts.commerceruntime.channels.Channel
	 * @see com.mozu.api.contracts.commerceruntime.channels.Channel
	 */
	public com.mozu.api.contracts.commerceruntime.channels.Channel updateChannel(com.mozu.api.contracts.commerceruntime.channels.Channel channel, String code, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.channels.Channel> client = com.mozu.api.clients.commerce.ChannelClient.updateChannelClient( channel,  code, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Deletes a defined channel for the tenant and removes the defined site associations. After deleting this channel, assign its associated sites to another channel.
	 * <p><pre><code>
	 *	Channel channel = new Channel();
	 *	channel.DeleteChannel( code, authTicket);
	 * </code></pre></p>
	 * @param code User-defined code that identifies the channel to delete.
	 * @param authTicket User Auth Ticket
	 * @return 
	 */
	public void deleteChannel(String code, AuthTicket authTicket) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.ChannelClient.deleteChannelClient( code, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();

	}

}



