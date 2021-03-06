/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.customer;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;

/** <summary>
 * Use the Address Validation resource to validate addresses associated with a customer account contact.
 * </summary>
 */
public class AddressValidationRequestResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;
	public AddressValidationRequestResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * Validates the customer address supplied in the request.
	 * <p><pre><code>
	 *	AddressValidationRequest addressvalidationrequest = new AddressValidationRequest();
	 *	AddressValidationResponse addressValidationResponse = addressvalidationrequest.ValidateAddress( addressValidationRequest, authTicket);
	 * </code></pre></p>
	 * @param authTicket User Auth Ticket
	 * @param addressValidationRequest Properties of the address to validate.
	 * @return com.mozu.api.contracts.customer.AddressValidationResponse
	 * @see com.mozu.api.contracts.customer.AddressValidationResponse
	 * @see com.mozu.api.contracts.customer.AddressValidationRequest
	 */
	public com.mozu.api.contracts.customer.AddressValidationResponse validateAddress(com.mozu.api.contracts.customer.AddressValidationRequest addressValidationRequest, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.AddressValidationResponse> client = com.mozu.api.clients.commerce.customer.AddressValidationRequestClient.validateAddressClient( addressValidationRequest, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



