/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.resources.commerce.carts;

import com.mozu.api.ApiContext;
import com.mozu.api.resources.BaseResource;
import java.util.ArrayList;
import com.mozu.api.MozuClient;

/// <summary>
/// System messages for live carts to notify the shopper about a product price or inventory change. System-supplied and read-only. For example: Product price is reduced due to a buy one, get one 50% off (BOGO) sale. A message may appear if the product is out of stock during the cart shopping process.
/// </summary>
public class ChangeMessageResource extends BaseResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;
	
	public ChangeMessageResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	* Retrieves messages to and from the current shopper. These are messages supplied by the system to notify the shopper of price increases or decreases or product unavailability.
	* <p><pre><code>
	*    ChangeMessage changemessage = new ChangeMessage();
	*   CartChangeMessageCollection cartChangeMessageCollection = changemessage.GetMessages();
	* </code></pre></p>
	* @return com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection
	* @see com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection
	*/
	public com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection getMessages() throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartChangeMessageCollection> client = com.mozu.api.clients.commerce.carts.ChangeMessageClient.getMessagesClient();
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

			/**
	* Deletes all messages associated with the cart of the current shopper.
	* <p><pre><code>
	*    ChangeMessage changemessage = new ChangeMessage();
	*   changemessage.RemoveAllMessages();
	* </code></pre></p>
	* @return 
	*/
	public void removeAllMessages() throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.carts.ChangeMessageClient.removeAllMessagesClient();
		setContext(_apiContext, client,true);
		client.executeRequest();

	}

/**
	* Removes a single message associated with the cart of the current shopper.
	* <p><pre><code>
	*    ChangeMessage changemessage = new ChangeMessage();
	*   changemessage.RemoveMessage( messageId);
	* </code></pre></p>
	* @param messageId Identifier of the message to remove from the cart.
	* @return 
	*/
	public void removeMessage(String messageId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.carts.ChangeMessageClient.removeMessageClient( messageId);
		setContext(_apiContext, client,true);
		client.executeRequest();

	}


}



