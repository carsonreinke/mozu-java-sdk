/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.settings.checkout;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;

/** <summary>
 * Settings for the checkout login. Choose whether or not shoppers must first login before a purchase can be processed. Choose the option for guests to purchase without logging in, prompt guests to login, or require them to login before a purchase can be completed.
 * </summary>
 */
public class CustomerCheckoutSettingsResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;
	public CustomerCheckoutSettingsResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * Retrieves all checkout settings defined for the site: Payment settings, such as the payment gateway ID and credentials, supported credit cards, and more; Customer Checkout settings, such as whether login is required, and any custom attributes; and Order Processing settings, such as when payment is authorized and captured, and any custom attributes.
	 * <p><pre><code>
	 *	CustomerCheckoutSettings customercheckoutsettings = new CustomerCheckoutSettings();
	 *	CustomerCheckoutSettings customerCheckoutSettings = customercheckoutsettings.GetCustomerCheckoutSettings(authTicket);
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @return com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings
	 * @see com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings
	 */
	public com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings getCustomerCheckoutSettings(AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings> client = com.mozu.api.clients.commerce.settings.checkout.CustomerCheckoutSettingsClient.getCustomerCheckoutSettingsClient(authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Modifies existing site checkout settings. Modify Payment, Customer Checkout, and Order Processing settings in one PUT.
	 * <p><pre><code>
	 *	CustomerCheckoutSettings customercheckoutsettings = new CustomerCheckoutSettings();
	 *	CustomerCheckoutSettings customerCheckoutSettings = customercheckoutsettings.UpdateCustomerCheckoutSettings( customerCheckoutSettings, authTicket);
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @param customerCheckoutSettings All the properties to update in the checkout settings.
	 * @return com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings
	 * @see com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings
	 * @see com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings
	 */
	public com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings updateCustomerCheckoutSettings(com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings customerCheckoutSettings, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings> client = com.mozu.api.clients.commerce.settings.checkout.CustomerCheckoutSettingsClient.updateCustomerCheckoutSettingsClient( customerCheckoutSettings, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



