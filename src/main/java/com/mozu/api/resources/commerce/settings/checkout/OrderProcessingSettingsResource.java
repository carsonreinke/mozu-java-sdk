/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.resources.commerce.settings.checkout;

import com.mozu.api.ApiContext;
import com.mozu.api.resources.BaseResource;
import java.util.ArrayList;
import com.mozu.api.MozuClient;

/// <summary>
/// Use the order processing settings resource to define how orders and payments are processed for the site.
/// </summary>
public class OrderProcessingSettingsResource extends BaseResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;
	
	public OrderProcessingSettingsResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	* Retrieves a list of the order processing settings defined for the site.
	* <p><pre><code>
	*    OrderProcessingSettings orderprocessingsettings = new OrderProcessingSettings();
	*   OrderProcessingSettings orderProcessingSettings = orderprocessingsettings.GetOrderProcessingSettings();
	* </code></pre></p>
	* @return com.mozu.api.contracts.sitesettings.order.OrderProcessingSettings
	* @see com.mozu.api.contracts.sitesettings.order.OrderProcessingSettings
	*/
	public com.mozu.api.contracts.sitesettings.order.OrderProcessingSettings getOrderProcessingSettings() throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.order.OrderProcessingSettings> client = com.mozu.api.clients.commerce.settings.checkout.OrderProcessingSettingsClient.getOrderProcessingSettingsClient();
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

		/**
	* Updates the order processing settings defined for the site.
	* <p><pre><code>
	*    OrderProcessingSettings orderprocessingsettings = new OrderProcessingSettings();
	*   OrderProcessingSettings orderProcessingSettings = orderprocessingsettings.UpdateOrderProcessingSettings( orderProcessingSettings);
	* </code></pre></p>
	* @param orderProcessingSettings List of the order processing settings to define for the site.
	* @return com.mozu.api.contracts.sitesettings.order.OrderProcessingSettings
	* @see com.mozu.api.contracts.sitesettings.order.OrderProcessingSettings
	* @see com.mozu.api.contracts.sitesettings.order.OrderProcessingSettings
	*/
	public com.mozu.api.contracts.sitesettings.order.OrderProcessingSettings updateOrderProcessingSettings(com.mozu.api.contracts.sitesettings.order.OrderProcessingSettings orderProcessingSettings) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.order.OrderProcessingSettings> client = com.mozu.api.clients.commerce.settings.checkout.OrderProcessingSettingsClient.updateOrderProcessingSettingsClient( orderProcessingSettings);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

	
}



