/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.settings.general;

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
public class TaxableTerritoryClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>> mozuClient=GetTaxableTerritoriesClient(authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * TaxableTerritory taxableTerritory = client.Result();
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>>
	 * @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 */
	public static MozuClient<List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>> getTaxableTerritoriesClient(AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.general.TaxableTerritoryUrl.getTaxableTerritoriesUrl();
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.general.TaxableTerritory> mozuClient=AddTaxableTerritoryClient( taxableTerritory, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * TaxableTerritory taxableTerritory = client.Result();
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @param taxableTerritory 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.general.TaxableTerritory>
	 * @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 * @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.general.TaxableTerritory> addTaxableTerritoryClient(com.mozu.api.contracts.sitesettings.general.TaxableTerritory taxableTerritory, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.general.TaxableTerritoryUrl.addTaxableTerritoryUrl();
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.sitesettings.general.TaxableTerritory.class;
		MozuClient<com.mozu.api.contracts.sitesettings.general.TaxableTerritory> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(taxableTerritory);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>> mozuClient=UpdateTaxableTerritoriesClient( taxableterritories, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * TaxableTerritory taxableTerritory = client.Result();
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @param taxableterritories 
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>>
	 * @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 * @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	 */
	public static MozuClient<List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>> updateTaxableTerritoriesClient(List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory> taxableterritories, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.general.TaxableTerritoryUrl.updateTaxableTerritoriesUrl();
		String verb = "PUT";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(taxableterritories);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

}



