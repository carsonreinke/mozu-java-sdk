/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.customer.accounts;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;

/** <summary>
 * Merchants can add and view internal notes for a customer account. For example, a merchant can track a customer's interests or complaints. Only merchants can add and view notes. Customers cannot see these notes from their My Account page.
 * </summary>
 */
public class CustomerNoteResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;
	public CustomerNoteResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * Retrieves the contents of a particular note attached to a specified customer account.
	 * <p><pre><code>
	 *	CustomerNote customernote = new CustomerNote();
	 *	CustomerNote customerNote = customernote.GetAccountNote( accountId,  noteId, authTicket);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account that contains the note being retrieved.
	 * @param noteId Unique identifier of a particular note to retrieve.
	 * @param authTicket User Auth Ticket
	 * @return com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 */
	public com.mozu.api.contracts.customer.CustomerNote getAccountNote(Integer accountId, Integer noteId, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerNote> client = com.mozu.api.clients.commerce.customer.accounts.CustomerNoteClient.getAccountNoteClient( accountId,  noteId, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a list of notes added to a customer account according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	CustomerNote customernote = new CustomerNote();
	 *	CustomerNoteCollection customerNoteCollection = customernote.GetAccountNotes( accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param authTicket User Auth Ticket
	 * @return com.mozu.api.contracts.customer.CustomerNoteCollection
	 * @see com.mozu.api.contracts.customer.CustomerNoteCollection
	 */
	public com.mozu.api.contracts.customer.CustomerNoteCollection getAccountNotes(Integer accountId) throws Exception
	{
		return getAccountNotes( accountId,  null,  null,  null,  null, null);
	}

	/**
	 * Retrieves a list of notes added to a customer account according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	CustomerNote customernote = new CustomerNote();
	 *	CustomerNoteCollection customerNoteCollection = customernote.GetAccountNotes( accountId,  startIndex,  pageSize,  sortBy,  filter, authTicket);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @param authTicket User Auth Ticket
	 * @return com.mozu.api.contracts.customer.CustomerNoteCollection
	 * @see com.mozu.api.contracts.customer.CustomerNoteCollection
	 */
	public com.mozu.api.contracts.customer.CustomerNoteCollection getAccountNotes(Integer accountId, Integer startIndex, Integer pageSize, String sortBy, String filter, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerNoteCollection> client = com.mozu.api.clients.commerce.customer.accounts.CustomerNoteClient.getAccountNotesClient( accountId,  startIndex,  pageSize,  sortBy,  filter, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Adds a new note to the specified customer account.
	 * <p><pre><code>
	 *	CustomerNote customernote = new CustomerNote();
	 *	CustomerNote customerNote = customernote.AddAccountNote( note,  accountId, authTicket);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account for which to create the note.
	 * @param authTicket User Auth Ticket
	 * @param note Properties of the customer account note to create.
	 * @return com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 */
	public com.mozu.api.contracts.customer.CustomerNote addAccountNote(com.mozu.api.contracts.customer.CustomerNote note, Integer accountId, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerNote> client = com.mozu.api.clients.commerce.customer.accounts.CustomerNoteClient.addAccountNoteClient( note,  accountId, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Modifies an existing note for a customer account.
	 * <p><pre><code>
	 *	CustomerNote customernote = new CustomerNote();
	 *	CustomerNote customerNote = customernote.UpdateAccountNote( note,  accountId,  noteId, authTicket);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account note to modify.
	 * @param noteId Unique identifier of the note to update.
	 * @param authTicket User Auth Ticket
	 * @param note The new content to replace the existing note.
	 * @return com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 */
	public com.mozu.api.contracts.customer.CustomerNote updateAccountNote(com.mozu.api.contracts.customer.CustomerNote note, Integer accountId, Integer noteId, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerNote> client = com.mozu.api.clients.commerce.customer.accounts.CustomerNoteClient.updateAccountNoteClient( note,  accountId,  noteId, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Removes a note from the specified customer account.
	 * <p><pre><code>
	 *	CustomerNote customernote = new CustomerNote();
	 *	customernote.DeleteAccountNote( accountId,  noteId, authTicket);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account that contains the note being deleted.
	 * @param noteId Unique identifier of the customer account note being deleted.
	 * @param authTicket User Auth Ticket
	 * @return 
	 */
	public void deleteAccountNote(Integer accountId, Integer noteId, AuthTicket authTicket) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.customer.accounts.CustomerNoteClient.deleteAccountNoteClient( accountId,  noteId, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();

	}

}



