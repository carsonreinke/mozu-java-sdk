
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.urls.commerce.orders;

import com.mozu.api.utils.UrlFormatter;


public class PaymentUrl
{

	/**
        * Get Resource Url for GetPayments
        * @param orderId Unique identifier of the order.
        * @return    String Resource Url
    */
	public static String getPaymentsUrl(String orderId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/payments/");
		formatter.formatUrl("orderId", orderId);
		return formatter.getResourceUrl();
	}

	/**
        * Get Resource Url for GetPayment
        * @param orderId Unique identifier of the order associated with the payment transaction.
        * @param paymentId Unique identifier of the payment transaction submitted for the order.
        * @return    String Resource Url
    */
	public static String getPaymentUrl(String orderId, String paymentId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/payments/{paymentId}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("paymentId", paymentId);
		return formatter.getResourceUrl();
	}

	/**
        * Get Resource Url for GetAvailablePaymentActions
        * @param orderId Unique identifier of the order associated with the payment.
        * @param paymentId Unique identifer of the payment for which to retrieve available actions.
        * @return    String Resource Url
    */
	public static String getAvailablePaymentActionsUrl(String orderId, String paymentId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/payments/{paymentId}/actions");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("paymentId", paymentId);
		return formatter.getResourceUrl();
	}

		/**
        * Get Resource Url for PerformPaymentAction
        * @param orderId Unique identifier of the order associated with the payment.
        * @param paymentId Unique identifer of the payment for which to perform the action.
        * @return    String Resource Url
    */
	public static String performPaymentActionUrl(String orderId, String paymentId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/payments/{paymentId}/actions");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("paymentId", paymentId);
		return formatter.getResourceUrl();
	}

	/**
        * Get Resource Url for CreatePaymentAction
        * @param orderId Unique identifier of the order for which to apply the payment.
        * @return    String Resource Url
    */
	public static String createPaymentActionUrl(String orderId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/payments/actions");
		formatter.formatUrl("orderId", orderId);
		return formatter.getResourceUrl();
	}

			
}
