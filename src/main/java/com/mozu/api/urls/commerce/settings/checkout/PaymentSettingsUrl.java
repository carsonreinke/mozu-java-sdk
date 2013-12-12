/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.settings.checkout;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class PaymentSettingsUrl
{

	/**
	 * Get Resource Url for GetThirdPartyPaymentWorkflows
	 * @return   String Resource Url
	 */
	public static MozuUrl getThirdPartyPaymentWorkflowsUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/settings/checkout/paymentsettings/thirdpartyworkflows");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

