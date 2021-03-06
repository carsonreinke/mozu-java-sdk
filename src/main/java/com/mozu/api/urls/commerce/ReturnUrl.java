/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class ReturnUrl
{

	/**
	 * Get Resource Url for GetReturns
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return   String Resource Url
	 */
	public static MozuUrl getReturnsUrl(String filter, Integer pageSize, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetReturn
	 * @param returnId Returns the properties of the return specified in the request as well as system-supplied information.
	 * @return   String Resource Url
	 */
	public static MozuUrl getReturnUrl(String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}");
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetAvailableReturnActions
	 * @param returnId Retrieves a list of the actions available to perform for the specified return based on its current state.
	 * @return   String Resource Url
	 */
	public static MozuUrl getAvailableReturnActionsUrl(String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}/actions");
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetPayments
	 * @param returnId Returns the details of the refund payment associated with the return specified in the request.
	 * @return   String Resource Url
	 */
	public static MozuUrl getPaymentsUrl(String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}/payments");
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetPayment
	 * @param paymentId Unique identifier of the return payment to retrieve.
	 * @param returnId Unique identifier of the return associated with the payment.
	 * @return   String Resource Url
	 */
	public static MozuUrl getPaymentUrl(String paymentId, String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}/payments/{paymentId}");
		formatter.formatUrl("paymentId", paymentId);
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetAvailablePaymentActionsForReturn
	 * @param paymentId Unique identifier of the payment for which to perform the action.
	 * @param returnId Unique identifier of the return associated with the payment.
	 * @return   String Resource Url
	 */
	public static MozuUrl getAvailablePaymentActionsForReturnUrl(String paymentId, String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}/payments/{paymentId}/actions");
		formatter.formatUrl("paymentId", paymentId);
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreateReturn
	 * @return   String Resource Url
	 */
	public static MozuUrl createReturnUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for PerformPaymentActionForReturn
	 * @param paymentId Unique identifier of the return payment to update.
	 * @param returnId Unique identifier of the return associated with the refund payment.
	 * @return   String Resource Url
	 */
	public static MozuUrl performPaymentActionForReturnUrl(String paymentId, String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}/payments/{paymentId}/actions");
		formatter.formatUrl("paymentId", paymentId);
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreatePaymentActionForReturn
	 * @param returnId Unique identifier of the return associated with the payment action.
	 * @return   String Resource Url
	 */
	public static MozuUrl createPaymentActionForReturnUrl(String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}/payments/actions");
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for PerformReturnActions
	 * @return   String Resource Url
	 */
	public static MozuUrl performReturnActionsUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/actions");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateReturn
	 * @param returnId Unique identifier of the return.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateReturnUrl(String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}");
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteReturn
	 * @param returnId Unique identifier of the return to delete.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteReturnUrl(String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}");
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

