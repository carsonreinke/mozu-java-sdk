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
 * 
 * </summary>
 */
public class CardResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;
	public CardResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * 
	 * <p><pre><code>
	 *	Card card = new Card();
	 *	CardCollection cardCollection = card.GetAccountCards( accountId, authTicket);
	 * </code></pre></p>
	 * @param accountId 
	 * @param authTicket User Auth Ticket
	 * @return com.mozu.api.contracts.customer.CardCollection
	 * @see com.mozu.api.contracts.customer.CardCollection
	 */
	public com.mozu.api.contracts.customer.CardCollection getAccountCards(Integer accountId, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CardCollection> client = com.mozu.api.clients.commerce.customer.accounts.CardClient.getAccountCardsClient( accountId, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Card card = new Card();
	 *	Card card = card.AddAccountCard( card,  accountId, authTicket);
	 * </code></pre></p>
	 * @param accountId 
	 * @param authTicket User Auth Ticket
	 * @param card 
	 * @return com.mozu.api.contracts.customer.Card
	 * @see com.mozu.api.contracts.customer.Card
	 * @see com.mozu.api.contracts.customer.Card
	 */
	public com.mozu.api.contracts.customer.Card addAccountCard(com.mozu.api.contracts.customer.Card card, Integer accountId, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.Card> client = com.mozu.api.clients.commerce.customer.accounts.CardClient.addAccountCardClient( card,  accountId, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Card card = new Card();
	 *	Card card = card.UpdateAccountCard( card,  accountId, authTicket);
	 * </code></pre></p>
	 * @param accountId 
	 * @param authTicket User Auth Ticket
	 * @param card 
	 * @return com.mozu.api.contracts.customer.Card
	 * @see com.mozu.api.contracts.customer.Card
	 * @see com.mozu.api.contracts.customer.Card
	 */
	public com.mozu.api.contracts.customer.Card updateAccountCard(com.mozu.api.contracts.customer.Card card, Integer accountId, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.Card> client = com.mozu.api.clients.commerce.customer.accounts.CardClient.updateAccountCardClient( card,  accountId, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Card card = new Card();
	 *	card.DeleteAccountCard( accountId,  cardId, authTicket);
	 * </code></pre></p>
	 * @param accountId 
	 * @param cardId 
	 * @param authTicket User Auth Ticket
	 * @return 
	 */
	public void deleteAccountCard(Integer accountId, String cardId, AuthTicket authTicket) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.customer.accounts.CardClient.deleteAccountCardClient( accountId,  cardId, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();

	}

}



