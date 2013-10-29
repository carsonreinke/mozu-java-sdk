/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.clients.commerce.settings.general;

import java.util.ArrayList;
import com.mozu.api.MozuClient;

/// <summary>
/// Use the taxable territories subresource to manage the regional territories for this site that are subejct to sales tax.
/// </summary>
public class TaxableTerritoryClient {
	
	
	/**
	* Retrieves a list of the taxable territories configured for the site.
	* <p><pre><code>
	*   MozuClient<ArrayList<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>> mozuClient=GetTaxableTerritoriesClient();
	* client.setBaseAddress(url);
	* client.executeRequest();
	* TaxableTerritory taxableTerritory = client.Result();
	* </code></pre></p>
	* @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>>
	* @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	*/
	public static MozuClient<ArrayList<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>> getTaxableTerritoriesClient() throws Exception
	{
		String url = com.mozu.api.urls.commerce.settings.general.TaxableTerritoryUrl.getTaxableTerritoriesUrl();
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>(){}.getClass();
		MozuClient<ArrayList<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	* Creates a new territory for which to calculate sales tax.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.sitesettings.general.TaxableTerritory> mozuClient=AddTaxableTerritoryClient( taxableTerritory);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* TaxableTerritory taxableTerritory = client.Result();
	* </code></pre></p>
	* @param taxableTerritory Properties of the taxable territory to create.
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.general.TaxableTerritory>
	* @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	* @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	*/
	public static MozuClient<com.mozu.api.contracts.sitesettings.general.TaxableTerritory> addTaxableTerritoryClient(com.mozu.api.contracts.sitesettings.general.TaxableTerritory taxableTerritory) throws Exception
	{
		String url = com.mozu.api.urls.commerce.settings.general.TaxableTerritoryUrl.addTaxableTerritoryUrl();
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.sitesettings.general.TaxableTerritory.class;
		MozuClient<com.mozu.api.contracts.sitesettings.general.TaxableTerritory> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(taxableTerritory);
		return mozuClient;

	}

	/**
	* Updates one or more taxable territories configured for a site.
	* <p><pre><code>
	*   MozuClient<ArrayList<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>> mozuClient=UpdateTaxableTerritoriesClient( taxableterritories);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* TaxableTerritory taxableTerritory = client.Result();
	* </code></pre></p>
	* @param taxableterritories Properties of the taxable territories to update.
	* @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>>
	* @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	* @see com.mozu.api.contracts.sitesettings.general.TaxableTerritory
	*/
	public static MozuClient<ArrayList<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>> updateTaxableTerritoriesClient(ArrayList<com.mozu.api.contracts.sitesettings.general.TaxableTerritory> taxableterritories) throws Exception
	{
		String url = com.mozu.api.urls.commerce.settings.general.TaxableTerritoryUrl.updateTaxableTerritoriesUrl();
		String verb = "PUT";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>(){}.getClass();
		MozuClient<ArrayList<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(taxableterritories);
		return mozuClient;

	}

	
}


