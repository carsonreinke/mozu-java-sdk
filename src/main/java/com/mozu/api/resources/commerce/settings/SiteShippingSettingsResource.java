/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.settings;

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
public class SiteShippingSettingsResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;
	public SiteShippingSettingsResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * 
	 * <p><pre><code>
	 *	SiteShippingSettings siteshippingsettings = new SiteShippingSettings();
	 *	SiteShippingSettings siteShippingSettings = siteshippingsettings.GetSiteShippingSettings(authTicket);
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @return com.mozu.api.contracts.sitesettings.shipping.SiteShippingSettings
	 * @see com.mozu.api.contracts.sitesettings.shipping.SiteShippingSettings
	 */
	public com.mozu.api.contracts.sitesettings.shipping.SiteShippingSettings getSiteShippingSettings(AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.shipping.SiteShippingSettings> client = com.mozu.api.clients.commerce.settings.SiteShippingSettingsClient.getSiteShippingSettingsClient(authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



