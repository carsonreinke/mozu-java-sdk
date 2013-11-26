/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.customer.accounts;

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
public class CustomerNoteClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerNote> mozuClient=GetAccountNoteClient( accountId,  noteId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerNote customerNote = client.Result();
	 * </code></pre></p>
	 * @param accountId 
	 * @param noteId 
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerNote>
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerNote> getAccountNoteClient(Integer accountId, Integer noteId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerNoteUrl.getAccountNoteUrl(accountId, noteId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerNote.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerNote> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerNoteCollection> mozuClient=GetAccountNotesClient( accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerNoteCollection customerNoteCollection = client.Result();
	 * </code></pre></p>
	 * @param accountId 
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerNoteCollection>
	 * @see com.mozu.api.contracts.customer.CustomerNoteCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerNoteCollection> getAccountNotesClient(Integer accountId) throws Exception
	{
		return getAccountNotesClient( accountId,  null,  null,  null,  null, null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerNoteCollection> mozuClient=GetAccountNotesClient( accountId,  filter,  pageSize,  sortBy,  startIndex, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerNoteCollection customerNoteCollection = client.Result();
	 * </code></pre></p>
	 * @param accountId 
	 * @param filter 
	 * @param pageSize 
	 * @param sortBy 
	 * @param startIndex 
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerNoteCollection>
	 * @see com.mozu.api.contracts.customer.CustomerNoteCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerNoteCollection> getAccountNotesClient(Integer accountId, String filter, Integer pageSize, String sortBy, Integer startIndex, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerNoteUrl.getAccountNotesUrl(accountId, filter, pageSize, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerNoteCollection.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerNoteCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerNote> mozuClient=AddAccountNoteClient( note,  accountId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerNote customerNote = client.Result();
	 * </code></pre></p>
	 * @param accountId 
	 * @param authTicket User Auth Ticket
	 * @param note 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerNote>
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerNote> addAccountNoteClient(com.mozu.api.contracts.customer.CustomerNote note, Integer accountId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerNoteUrl.addAccountNoteUrl(accountId);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerNote.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerNote> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(note);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerNote> mozuClient=UpdateAccountNoteClient( note,  accountId,  noteId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerNote customerNote = client.Result();
	 * </code></pre></p>
	 * @param accountId 
	 * @param noteId 
	 * @param authTicket User Auth Ticket
	 * @param note 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerNote>
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerNote> updateAccountNoteClient(com.mozu.api.contracts.customer.CustomerNote note, Integer accountId, Integer noteId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerNoteUrl.updateAccountNoteUrl(accountId, noteId);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerNote.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerNote> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(note);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteAccountNoteClient( accountId,  noteId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param accountId 
	 * @param noteId 
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteAccountNoteClient(Integer accountId, Integer noteId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerNoteUrl.deleteAccountNoteUrl(accountId, noteId);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

}



