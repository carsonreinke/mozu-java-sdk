/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.resources.commerce;

import com.mozu.api.ApiContext;
import com.mozu.api.resources.BaseResource;
import java.util.ArrayList;
import com.mozu.api.MozuClient;

/// <summary>
/// Use the returns subresource to manage returned items for a completed order. Returns can include any number of items associated with the original order.
/// </summary>
public class ReturnResource extends BaseResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;
	
	public ReturnResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	* Retrieves a list of all returns according to any filter and sort criteria.
	* <p><pre><code>
	*    Return return = new Return();
	*   ReturnCollection returnCollection = return.GetReturns();
	* </code></pre></p>
	* @return com.mozu.api.contracts.commerceruntime.returns.ReturnCollection
	* @see com.mozu.api.contracts.commerceruntime.returns.ReturnCollection
	*/
	public com.mozu.api.contracts.commerceruntime.returns.ReturnCollection getReturns() throws Exception
	{
		return getReturns( null,  null,  null,  null);
	}

/**
	* Retrieves a list of all returns according to any filter and sort criteria.
	* <p><pre><code>
	*    Return return = new Return();
	*   ReturnCollection returnCollection = return.GetReturns( filter,  pageSize,  sortBy,  startIndex);
	* </code></pre></p>
	* @param filter 
	* @param pageSize 
	* @param sortBy 
	* @param startIndex 
	* @return com.mozu.api.contracts.commerceruntime.returns.ReturnCollection
	* @see com.mozu.api.contracts.commerceruntime.returns.ReturnCollection
	*/
	public com.mozu.api.contracts.commerceruntime.returns.ReturnCollection getReturns(String filter, Integer pageSize, String sortBy, Integer startIndex) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnCollection> client = com.mozu.api.clients.commerce.ReturnClient.getReturnsClient( filter,  pageSize,  sortBy,  startIndex);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

/**
	* Retrieves a list of properties for the specified return.
	* <p><pre><code>
	*    Return return = new Return();
	*   Return return = return.GetReturn( returnId);
	* </code></pre></p>
	* @param returnId Returns the properties of the return specified in the request as well as system-supplied information.
	* @return com.mozu.api.contracts.commerceruntime.returns.Return
	* @see com.mozu.api.contracts.commerceruntime.returns.Return
	*/
	public com.mozu.api.contracts.commerceruntime.returns.Return getReturn(String returnId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> client = com.mozu.api.clients.commerce.ReturnClient.getReturnClient( returnId);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

/**
	* Retrieves a list of the actions available to perform for the specified return based on its current state.
	* <p><pre><code>
	*    Return return = new Return();
	*   string string = return.GetAvailableReturnActions( returnId);
	* </code></pre></p>
	* @param returnId Retrieves a list of the actions available to perform for the specified return based on its current state.
	* @return List<string>
	* @see string
	*/
	public ArrayList<String> getAvailableReturnActions(String returnId) throws Exception
	{
		MozuClient<ArrayList<String>> client = com.mozu.api.clients.commerce.ReturnClient.getAvailableReturnActionsClient( returnId);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

/**
	* Retrieves a list of all payments submitted as part of a refund associated with a customer return.
	* <p><pre><code>
	*    Return return = new Return();
	*   PaymentCollection paymentCollection = return.GetPayments( returnId);
	* </code></pre></p>
	* @param returnId Returns the details of the refund payment associated with the return specified in the request.
	* @return com.mozu.api.contracts.commerceruntime.payments.PaymentCollection
	* @see com.mozu.api.contracts.commerceruntime.payments.PaymentCollection
	*/
	public com.mozu.api.contracts.commerceruntime.payments.PaymentCollection getPayments(String returnId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.payments.PaymentCollection> client = com.mozu.api.clients.commerce.ReturnClient.getPaymentsClient( returnId);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

/**
	* Retrieves the details of a payment submitted as part of a refund associated with a customer return.
	* <p><pre><code>
	*    Return return = new Return();
	*   Payment payment = return.GetPayment( paymentId,  returnId);
	* </code></pre></p>
	* @param paymentId Unique identifier of the return payment to retrieve.
	* @param returnId Unique identifier of the return associated with the payment.
	* @return com.mozu.api.contracts.commerceruntime.payments.Payment
	* @see com.mozu.api.contracts.commerceruntime.payments.Payment
	*/
	public com.mozu.api.contracts.commerceruntime.payments.Payment getPayment(String paymentId, String returnId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.payments.Payment> client = com.mozu.api.clients.commerce.ReturnClient.getPaymentClient( paymentId,  returnId);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

/**
	* Retrieves a list of the payment actions available to perform for the specified return when a return results in a refund to the customer.
	* <p><pre><code>
	*    Return return = new Return();
	*   string string = return.GetAvailablePaymentActionsForReturn( paymentId,  returnId);
	* </code></pre></p>
	* @param paymentId Unique identifier of the payment for which to perform the action.
	* @param returnId Unique identifier of the return associated with the payment.
	* @return List<string>
	* @see string
	*/
	public ArrayList<String> getAvailablePaymentActionsForReturn(String paymentId, String returnId) throws Exception
	{
		MozuClient<ArrayList<String>> client = com.mozu.api.clients.commerce.ReturnClient.getAvailablePaymentActionsForReturnClient( paymentId,  returnId);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

	/**
	* Creates a return for items previously shipped in a completed order.
	* <p><pre><code>
	*    Return return = new Return();
	*   Return return = return.CreateReturn( ret);
	* </code></pre></p>
	* @param ret Wrapper for the properties of the return to create.
	* @return com.mozu.api.contracts.commerceruntime.returns.Return
	* @see com.mozu.api.contracts.commerceruntime.returns.Return
	* @see com.mozu.api.contracts.commerceruntime.returns.Return
	*/
	public com.mozu.api.contracts.commerceruntime.returns.Return createReturn(com.mozu.api.contracts.commerceruntime.returns.Return ret) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> client = com.mozu.api.clients.commerce.ReturnClient.createReturnClient( ret);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

/**
	* Updates a refund payment associated with a customer return by performing the specified action.
	* <p><pre><code>
	*    Return return = new Return();
	*   Return return = return.PerformPaymentActionForReturn( paymentId,  returnId,  action);
	* </code></pre></p>
	* @param paymentId Unique identifier of the return payment to update.
	* @param returnId Unique identifier of the return associated with the refund payment.
	* @param action The payment action to perform for the refund payment.
	* @return com.mozu.api.contracts.commerceruntime.returns.Return
	* @see com.mozu.api.contracts.commerceruntime.returns.Return
	* @see com.mozu.api.contracts.commerceruntime.payments.PaymentAction
	*/
	public com.mozu.api.contracts.commerceruntime.returns.Return performPaymentActionForReturn(String paymentId, String returnId, com.mozu.api.contracts.commerceruntime.payments.PaymentAction action) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> client = com.mozu.api.clients.commerce.ReturnClient.performPaymentActionForReturnClient( paymentId,  returnId,  action);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

/**
	* Creates a new payment for a return that results in a refund to the customer.
	* <p><pre><code>
	*    Return return = new Return();
	*   Return return = return.CreatePaymentActionForReturn( returnId,  action);
	* </code></pre></p>
	* @param returnId Unique identifier of the return associated with the payment action.
	* @param action The payment action to perform for the customer return.
	* @return com.mozu.api.contracts.commerceruntime.returns.Return
	* @see com.mozu.api.contracts.commerceruntime.returns.Return
	* @see com.mozu.api.contracts.commerceruntime.payments.PaymentAction
	*/
	public com.mozu.api.contracts.commerceruntime.returns.Return createPaymentActionForReturn(String returnId, com.mozu.api.contracts.commerceruntime.payments.PaymentAction action) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> client = com.mozu.api.clients.commerce.ReturnClient.createPaymentActionForReturnClient( returnId,  action);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

/**
	* Updates the return by performing the specified action.
	* <p><pre><code>
	*    Return return = new Return();
	*   ReturnCollection returnCollection = return.PerformReturnActions( action);
	* </code></pre></p>
	* @param action The name of the return action to perform, such as "Refund" or "Replace".
	* @return com.mozu.api.contracts.commerceruntime.returns.ReturnCollection
	* @see com.mozu.api.contracts.commerceruntime.returns.ReturnCollection
	* @see com.mozu.api.contracts.commerceruntime.returns.ReturnAction
	*/
	public com.mozu.api.contracts.commerceruntime.returns.ReturnCollection performReturnActions(com.mozu.api.contracts.commerceruntime.returns.ReturnAction action) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnCollection> client = com.mozu.api.clients.commerce.ReturnClient.performReturnActionsClient( action);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

	/**
	* Updates one or more properties of a return for items previously shipped in a completed order.
	* <p><pre><code>
	*    Return return = new Return();
	*   Return return = return.UpdateReturn( returnId,  ret);
	* </code></pre></p>
	* @param returnId Unique identifier of the return.
	* @param ret Wrapper for the array of properties to update for the return.
	* @return com.mozu.api.contracts.commerceruntime.returns.Return
	* @see com.mozu.api.contracts.commerceruntime.returns.Return
	* @see com.mozu.api.contracts.commerceruntime.returns.Return
	*/
	public com.mozu.api.contracts.commerceruntime.returns.Return updateReturn(String returnId, com.mozu.api.contracts.commerceruntime.returns.Return ret) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> client = com.mozu.api.clients.commerce.ReturnClient.updateReturnClient( returnId,  ret);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

	/**
	* Deletes a return previously configured for the specified order.
	* <p><pre><code>
	*    Return return = new Return();
	*   return.DeleteReturn( returnId);
	* </code></pre></p>
	* @param returnId Unique identifier of the return to delete from the order.
	* @return 
	*/
	public void deleteReturn(String returnId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.ReturnClient.deleteReturnClient( returnId);
		setContext(_apiContext, client,true);
		client.executeRequest();

	}


}


