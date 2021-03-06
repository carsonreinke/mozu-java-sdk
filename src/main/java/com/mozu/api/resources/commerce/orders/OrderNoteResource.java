/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.orders;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;

/** <summary>
 * Use the Order Notes subresource to manage merchant-level notes associated with an active order.
 * </summary>
 */
public class OrderNoteResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;
	public OrderNoteResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * Retrieves a list of all notes for an order.
	 * <p><pre><code>
	 *	OrderNote ordernote = new OrderNote();
	 *	OrderNote orderNote = ordernote.GetOrderNotes( orderId, authTicket);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param authTicket User Auth Ticket
	 * @return List<com.mozu.api.contracts.commerceruntime.orders.OrderNote>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 */
	public List<com.mozu.api.contracts.commerceruntime.orders.OrderNote> getOrderNotes(String orderId, AuthTicket authTicket) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.commerceruntime.orders.OrderNote>> client = com.mozu.api.clients.commerce.orders.OrderNoteClient.getOrderNotesClient( orderId, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of a specific order note.
	 * <p><pre><code>
	 *	OrderNote ordernote = new OrderNote();
	 *	OrderNote orderNote = ordernote.GetOrderNote( orderId,  noteId, authTicket);
	 * </code></pre></p>
	 * @param noteId Unique identifier of the order note to retrieve.
	 * @param orderId Unique identifier of the order associated with the note.
	 * @param authTicket User Auth Ticket
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 */
	public com.mozu.api.contracts.commerceruntime.orders.OrderNote getOrderNote(String orderId, String noteId, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderNote> client = com.mozu.api.clients.commerce.orders.OrderNoteClient.getOrderNoteClient( orderId,  noteId, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new merchant note for the specified order.
	 * <p><pre><code>
	 *	OrderNote ordernote = new OrderNote();
	 *	OrderNote orderNote = ordernote.CreateOrderNote( orderNote,  orderId, authTicket);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order for which to add a note.
	 * @param authTicket User Auth Ticket
	 * @param orderNote The alphanumeric text contained in the note. The maximum length is 256 characters.
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 */
	public com.mozu.api.contracts.commerceruntime.orders.OrderNote createOrderNote(com.mozu.api.contracts.commerceruntime.orders.OrderNote orderNote, String orderId, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderNote> client = com.mozu.api.clients.commerce.orders.OrderNoteClient.createOrderNoteClient( orderNote,  orderId, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates a specific note for an order.
	 * <p><pre><code>
	 *	OrderNote ordernote = new OrderNote();
	 *	OrderNote orderNote = ordernote.UpdateOrderNote( orderNote,  orderId,  noteId, authTicket);
	 * </code></pre></p>
	 * @param noteId Unique identifier of the order note.
	 * @param orderId Unique identifier of the order.
	 * @param authTicket User Auth Ticket
	 * @param orderNote The content of the order note. The maximum length is 256 characters.
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 */
	public com.mozu.api.contracts.commerceruntime.orders.OrderNote updateOrderNote(com.mozu.api.contracts.commerceruntime.orders.OrderNote orderNote, String orderId, String noteId, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderNote> client = com.mozu.api.clients.commerce.orders.OrderNoteClient.updateOrderNoteClient( orderNote,  orderId,  noteId, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Deletes the specified order note.
	 * <p><pre><code>
	 *	OrderNote ordernote = new OrderNote();
	 *	ordernote.DeleteOrderNote( orderId,  noteId, authTicket);
	 * </code></pre></p>
	 * @param noteId Unique identifier of the order note to delete.
	 * @param orderId Unique identifier of the order associated with the note.
	 * @param authTicket User Auth Ticket
	 * @return 
	 */
	public void deleteOrderNote(String orderId, String noteId, AuthTicket authTicket) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.orders.OrderNoteClient.deleteOrderNoteClient( orderId,  noteId, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();

	}

}



