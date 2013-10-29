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
/// Use this subresource to apply coupons to or remove coupons from an order based on a supplied coupon code.
/// </summary>
public class AppliedDiscountResource extends BaseResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;
	
	public AppliedDiscountResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
			/**
	* Apply a coupon to the order.
	* <p><pre><code>
	*    AppliedDiscount applieddiscount = new AppliedDiscount();
	*   Order order = applieddiscount.ApplyCoupon( couponCode,  orderId);
	* </code></pre></p>
	* @param couponCode 
	* @param orderId Unique identifier of the order to associate the coupon. System-supplied and read-only.
	* @return com.mozu.api.contracts.commerceruntime.orders.Order
	* @see com.mozu.api.contracts.commerceruntime.orders.Order
	*/
	public com.mozu.api.contracts.commerceruntime.orders.Order applyCoupon(String couponCode, String orderId) throws Exception
	{
		return applyCoupon( couponCode,  orderId,  null,  null);
	}

/**
	* Apply a coupon to the order.
	* <p><pre><code>
	*    AppliedDiscount applieddiscount = new AppliedDiscount();
	*   Order order = applieddiscount.ApplyCoupon( couponCode,  orderId,  updateMode,  version);
	* </code></pre></p>
	* @param couponCode 
	* @param orderId Unique identifier of the order to associate the coupon. System-supplied and read-only.
	* @param updateMode Specifies whether to apply the coupon by updating the original order, updating the order in draft mode, or updating the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal", "ApplyToDraft", or "ApplyAndCommit".
	* @param version If applicable, the version of the order or order draft to which to apply the coupon.
	* @return com.mozu.api.contracts.commerceruntime.orders.Order
	* @see com.mozu.api.contracts.commerceruntime.orders.Order
	*/
	public com.mozu.api.contracts.commerceruntime.orders.Order applyCoupon(String couponCode, String orderId, String updateMode, String version) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.AppliedDiscountClient.applyCouponClient( couponCode,  orderId,  updateMode,  version);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

	/**
	* Removes a coupon previously applied to the order.
	* <p><pre><code>
	*    AppliedDiscount applieddiscount = new AppliedDiscount();
	*   Order order = applieddiscount.RemoveCoupon( couponCode,  orderId);
	* </code></pre></p>
	* @param couponCode 
	* @param orderId Unique identifier of the order with the coupon to remove.
	* @return com.mozu.api.contracts.commerceruntime.orders.Order
	* @see com.mozu.api.contracts.commerceruntime.orders.Order
	*/
	public com.mozu.api.contracts.commerceruntime.orders.Order removeCoupon(String couponCode, String orderId) throws Exception
	{
		return removeCoupon( couponCode,  orderId,  null,  null);
	}

/**
	* Removes a coupon previously applied to the order.
	* <p><pre><code>
	*    AppliedDiscount applieddiscount = new AppliedDiscount();
	*   Order order = applieddiscount.RemoveCoupon( couponCode,  orderId,  updateMode,  version);
	* </code></pre></p>
	* @param couponCode 
	* @param orderId Unique identifier of the order with the coupon to remove.
	* @param updateMode Specifies whether to remove the coupon by updating the original order, updating the order in draft mode, or updating the order in draft mode and then committing the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal", "ApplyToDraft", or "ApplyAndCommit".
	* @param version If applicable, the version of the order or order draft from which to remove the coupon.
	* @return com.mozu.api.contracts.commerceruntime.orders.Order
	* @see com.mozu.api.contracts.commerceruntime.orders.Order
	*/
	public com.mozu.api.contracts.commerceruntime.orders.Order removeCoupon(String couponCode, String orderId, String updateMode, String version) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.AppliedDiscountClient.removeCouponClient( couponCode,  orderId,  updateMode,  version);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

/**
	* Removes all coupons previously applied to the order.
	* <p><pre><code>
	*    AppliedDiscount applieddiscount = new AppliedDiscount();
	*   Order order = applieddiscount.RemoveCoupons( orderId);
	* </code></pre></p>
	* @param orderId Unique identifier of the order with the coupons to remove.
	* @return com.mozu.api.contracts.commerceruntime.orders.Order
	* @see com.mozu.api.contracts.commerceruntime.orders.Order
	*/
	public com.mozu.api.contracts.commerceruntime.orders.Order removeCoupons(String orderId) throws Exception
	{
		return removeCoupons( orderId,  null,  null);
	}

/**
	* Removes all coupons previously applied to the order.
	* <p><pre><code>
	*    AppliedDiscount applieddiscount = new AppliedDiscount();
	*   Order order = applieddiscount.RemoveCoupons( orderId,  updateMode,  version);
	* </code></pre></p>
	* @param orderId Unique identifier of the order with the coupons to remove.
	* @param updateMode Specifies whether to remove coupons by updating the original order, updating the order in draft mode, or updating the order in draft mode and then committing the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal", "ApplyToDraft", or "ApplyAndCommit".
	* @param version If applicable, the version of the order or order draft from which to remove coupons.
	* @return com.mozu.api.contracts.commerceruntime.orders.Order
	* @see com.mozu.api.contracts.commerceruntime.orders.Order
	*/
	public com.mozu.api.contracts.commerceruntime.orders.Order removeCoupons(String orderId, String updateMode, String version) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.AppliedDiscountClient.removeCouponsClient( orderId,  updateMode,  version);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}


}



