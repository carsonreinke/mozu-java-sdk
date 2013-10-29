/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.resources.commerce.orders;

import com.mozu.api.ApiContext;
import com.mozu.api.resources.BaseResource;
import java.util.ArrayList;
import com.mozu.api.MozuClient;

/// <summary>
/// Use the Billing Info subresource to manage the billing information stored for an order.
/// </summary>
public class BillingInfoResource extends BaseResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;
	
	public BillingInfoResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	* Retrieves the billing information associated with an order.
	* <p><pre><code>
	*    BillingInfo billinginfo = new BillingInfo();
	*   BillingInfo billingInfo = billinginfo.GetBillingInfo( orderId);
	* </code></pre></p>
	* @param orderId Unique identifier of the order.
	* @return com.mozu.api.contracts.commerceruntime.payments.BillingInfo
	* @see com.mozu.api.contracts.commerceruntime.payments.BillingInfo
	*/
	public com.mozu.api.contracts.commerceruntime.payments.BillingInfo getBillingInfo(String orderId) throws Exception
	{
		return getBillingInfo( false,  orderId);
	}

/**
	* Retrieves the billing information associated with an order.
	* <p><pre><code>
	*    BillingInfo billinginfo = new BillingInfo();
	*   BillingInfo billingInfo = billinginfo.GetBillingInfo( draft,  orderId);
	* </code></pre></p>
	* @param draft If true, retrieve the draft version of the order billing information, which might include uncommitted changes.
	* @param orderId Unique identifier of the order.
	* @return com.mozu.api.contracts.commerceruntime.payments.BillingInfo
	* @see com.mozu.api.contracts.commerceruntime.payments.BillingInfo
	*/
	public com.mozu.api.contracts.commerceruntime.payments.BillingInfo getBillingInfo(Boolean draft, String orderId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.payments.BillingInfo> client = com.mozu.api.clients.commerce.orders.BillingInfoClient.getBillingInfoClient( draft,  orderId);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

		/**
	* Updates the billing information supplied for an order.
	* <p><pre><code>
	*    BillingInfo billinginfo = new BillingInfo();
	*   BillingInfo billingInfo = billinginfo.SetBillingInfo( orderId,  billingInfo);
	* </code></pre></p>
	* @param orderId Unique identifier of the order.
	* @param billingInfo The properties of the order billing information to update.
	* @return com.mozu.api.contracts.commerceruntime.payments.BillingInfo
	* @see com.mozu.api.contracts.commerceruntime.payments.BillingInfo
	* @see com.mozu.api.contracts.commerceruntime.payments.BillingInfo
	*/
	public com.mozu.api.contracts.commerceruntime.payments.BillingInfo setBillingInfo(String orderId, com.mozu.api.contracts.commerceruntime.payments.BillingInfo billingInfo) throws Exception
	{
		return setBillingInfo( orderId,  null,  null,  billingInfo);
	}

/**
	* Updates the billing information supplied for an order.
	* <p><pre><code>
	*    BillingInfo billinginfo = new BillingInfo();
	*   BillingInfo billingInfo = billinginfo.SetBillingInfo( orderId,  updateMode,  version,  billingInfo);
	* </code></pre></p>
	* @param orderId Unique identifier of the order.
	* @param updateMode Specifies whether to set the billing information by updating the original order, updating the order in draft mode, or updating the order in draft mode and then committing the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal", "ApplyToDraft", or "ApplyAndCommit".
	* @param version If applicable, the version of the order or draft for which to set the billing information.
	* @param billingInfo The properties of the order billing information to update.
	* @return com.mozu.api.contracts.commerceruntime.payments.BillingInfo
	* @see com.mozu.api.contracts.commerceruntime.payments.BillingInfo
	* @see com.mozu.api.contracts.commerceruntime.payments.BillingInfo
	*/
	public com.mozu.api.contracts.commerceruntime.payments.BillingInfo setBillingInfo(String orderId, String updateMode, String version, com.mozu.api.contracts.commerceruntime.payments.BillingInfo billingInfo) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.payments.BillingInfo> client = com.mozu.api.clients.commerce.orders.BillingInfoClient.setBillingInfoClient( orderId,  updateMode,  version,  billingInfo);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

	
}


