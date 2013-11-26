/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.settings;

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
public class ApplicationClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.application.Application> mozuClient=ThirdPartyGetApplicationClient(authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Application application = client.Result();
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.application.Application>
	 * @see com.mozu.api.contracts.sitesettings.application.Application
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.application.Application> thirdPartyGetApplicationClient(AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.ApplicationUrl.thirdPartyGetApplicationUrl();
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.sitesettings.application.Application.class;
		MozuClient<com.mozu.api.contracts.sitesettings.application.Application> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.application.Application> mozuClient=ThirdPartyUpdateApplicationClient( application, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Application application = client.Result();
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @param application 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.application.Application>
	 * @see com.mozu.api.contracts.sitesettings.application.Application
	 * @see com.mozu.api.contracts.sitesettings.application.Application
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.application.Application> thirdPartyUpdateApplicationClient(com.mozu.api.contracts.sitesettings.application.Application application, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.ApplicationUrl.thirdPartyUpdateApplicationUrl();
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.sitesettings.application.Application.class;
		MozuClient<com.mozu.api.contracts.sitesettings.application.Application> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(application);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

}



