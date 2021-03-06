/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.settings.general;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class TaxableTerritoryUrl
{

	/**
	 * Get Resource Url for GetTaxableTerritories
	 * @return   String Resource Url
	 */
	public static MozuUrl getTaxableTerritoriesUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/settings/general/taxableterritories");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddTaxableTerritory
	 * @return   String Resource Url
	 */
	public static MozuUrl addTaxableTerritoryUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/settings/general/taxableterritories");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateTaxableTerritories
	 * @return   String Resource Url
	 */
	public static MozuUrl updateTaxableTerritoriesUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/settings/general/taxableterritories");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

