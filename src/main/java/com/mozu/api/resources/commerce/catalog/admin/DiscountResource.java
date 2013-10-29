/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.resources.commerce.catalog.admin;

import com.mozu.api.ApiContext;
import com.mozu.api.resources.BaseResource;
import java.util.ArrayList;
import com.mozu.api.MozuClient;

/// <summary>
/// Define and manage discounts to apply to products, product categories, or orders. The discounts can be a specified amount off the price, percentage off the price, or for free shipping. Create a coupon code that shoppers can use to redeem the discount.
/// </summary>
public class DiscountResource extends BaseResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;
	
	public DiscountResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	* Retrieves a list of discounts according to any specified filter criteria and sort options.
	* <p><pre><code>
	*    Discount discount = new Discount();
	*   DiscountCollection discountCollection = discount.GetDiscounts();
	* </code></pre></p>
	* @return com.mozu.api.contracts.productadmin.DiscountCollection
	* @see com.mozu.api.contracts.productadmin.DiscountCollection
	*/
	public com.mozu.api.contracts.productadmin.DiscountCollection getDiscounts() throws Exception
	{
		return getDiscounts( null,  null,  null,  null);
	}

/**
	* Retrieves a list of discounts according to any specified filter criteria and sort options.
	* <p><pre><code>
	*    Discount discount = new Discount();
	*   DiscountCollection discountCollection = discount.GetDiscounts( filter,  pageSize,  sortBy,  startIndex);
	* </code></pre></p>
	* @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	* @param pageSize Specifies the number of results to display on each page when creating paged results from a query. The maximum value is 200.
	* @param sortBy 
	* @param startIndex 
	* @return com.mozu.api.contracts.productadmin.DiscountCollection
	* @see com.mozu.api.contracts.productadmin.DiscountCollection
	*/
	public com.mozu.api.contracts.productadmin.DiscountCollection getDiscounts(String filter, Integer pageSize, String sortBy, Integer startIndex) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.DiscountCollection> client = com.mozu.api.clients.commerce.catalog.admin.DiscountClient.getDiscountsClient( filter,  pageSize,  sortBy,  startIndex);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

/**
	* Retrieves the details of a single discount.
	* <p><pre><code>
	*    Discount discount = new Discount();
	*   Discount discount = discount.GetDiscount( discountId);
	* </code></pre></p>
	* @param discountId Unique identifier of the discount. System-supplied and read-only.
	* @return com.mozu.api.contracts.productadmin.Discount
	* @see com.mozu.api.contracts.productadmin.Discount
	*/
	public com.mozu.api.contracts.productadmin.Discount getDiscount(Integer discountId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.Discount> client = com.mozu.api.clients.commerce.catalog.admin.DiscountClient.getDiscountClient( discountId);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

/**
	* Retrieves the localized content specified for the specified discount.
	* <p><pre><code>
	*    Discount discount = new Discount();
	*   DiscountLocalizedContent discountLocalizedContent = discount.GetDiscountContent( discountId);
	* </code></pre></p>
	* @param discountId Unique identifier of the discount. System-supplied and read-only.
	* @return com.mozu.api.contracts.productadmin.DiscountLocalizedContent
	* @see com.mozu.api.contracts.productadmin.DiscountLocalizedContent
	*/
	public com.mozu.api.contracts.productadmin.DiscountLocalizedContent getDiscountContent(Integer discountId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.DiscountLocalizedContent> client = com.mozu.api.clients.commerce.catalog.admin.DiscountClient.getDiscountContentClient( discountId);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

/**
	* Generates a random code for a coupon.
	* <p><pre><code>
	*    Discount discount = new Discount();
	*   string string = discount.GenerateRandomCoupon();
	* </code></pre></p>
	* @return string
	* @see string
	*/
	public String generateRandomCoupon() throws Exception
	{
		MozuClient<String> client = com.mozu.api.clients.commerce.catalog.admin.DiscountClient.generateRandomCouponClient();
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

	/**
	* Creates a discount.
	* <p><pre><code>
	*    Discount discount = new Discount();
	*   Discount discount = discount.CreateDiscount( discount);
	* </code></pre></p>
	* @param discount Properties of the discount to create. Required properties: Content.Name, AmountType, StartDate, and Target.Type.
	* @return com.mozu.api.contracts.productadmin.Discount
	* @see com.mozu.api.contracts.productadmin.Discount
	* @see com.mozu.api.contracts.productadmin.Discount
	*/
	public com.mozu.api.contracts.productadmin.Discount createDiscount(com.mozu.api.contracts.productadmin.Discount discount) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.Discount> client = com.mozu.api.clients.commerce.catalog.admin.DiscountClient.createDiscountClient( discount);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

/**
	* Redeems a discount configured in the product admin.
	* <p><pre><code>
	*    Discount discount = new Discount();
	*   Redemption redemption = discount.RedeemDiscount( redemption);
	* </code></pre></p>
	* @param redemption Properties of the product discount redemption.
	* @return com.mozu.api.contracts.productadmin.discounts.Redemption
	* @see com.mozu.api.contracts.productadmin.discounts.Redemption
	* @see com.mozu.api.contracts.productadmin.discounts.Redemption
	*/
	public com.mozu.api.contracts.productadmin.discounts.Redemption redeemDiscount(com.mozu.api.contracts.productadmin.discounts.Redemption redemption) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.discounts.Redemption> client = com.mozu.api.clients.commerce.catalog.admin.DiscountClient.redeemDiscountClient( redemption);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

	/**
	* Modifies a discount.
	* <p><pre><code>
	*    Discount discount = new Discount();
	*   Discount discount = discount.UpdateDiscount( discountId,  discount);
	* </code></pre></p>
	* @param discountId Unique identifier of the discount. System-supplied and read-only.
	* @param discount Properties of the discount to update. Required properties: Content.Name, AmountType, StartDate, and Target.Type. Any unspecified properties are set to null and boolean variables are set to false.
	* @return com.mozu.api.contracts.productadmin.Discount
	* @see com.mozu.api.contracts.productadmin.Discount
	* @see com.mozu.api.contracts.productadmin.Discount
	*/
	public com.mozu.api.contracts.productadmin.Discount updateDiscount(Integer discountId, com.mozu.api.contracts.productadmin.Discount discount) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.Discount> client = com.mozu.api.clients.commerce.catalog.admin.DiscountClient.updateDiscountClient( discountId,  discount);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

/**
	* Modifies the localized content for the specified discount. Rename the discount without modifying any other discount properties.
	* <p><pre><code>
	*    Discount discount = new Discount();
	*   DiscountLocalizedContent discountLocalizedContent = discount.UpdateDiscountContent( discountId,  content);
	* </code></pre></p>
	* @param discountId Unique identifier of the discount. System-supplied and read-only.
	* @param content New Name and/or LocaleCode. Properties of the content to update. Required property: Name.
	* @return com.mozu.api.contracts.productadmin.DiscountLocalizedContent
	* @see com.mozu.api.contracts.productadmin.DiscountLocalizedContent
	* @see com.mozu.api.contracts.productadmin.DiscountLocalizedContent
	*/
	public com.mozu.api.contracts.productadmin.DiscountLocalizedContent updateDiscountContent(Integer discountId, com.mozu.api.contracts.productadmin.DiscountLocalizedContent content) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.DiscountLocalizedContent> client = com.mozu.api.clients.commerce.catalog.admin.DiscountClient.updateDiscountContentClient( discountId,  content);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

	/**
	* Deletes a discount specified by its discount ID.
	* <p><pre><code>
	*    Discount discount = new Discount();
	*   discount.DeleteDiscount( discountId);
	* </code></pre></p>
	* @param discountId Unique identifier of the discount. System-supplied and read-only.
	* @return 
	*/
	public void deleteDiscount(Integer discountId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.DiscountClient.deleteDiscountClient( discountId);
		setContext(_apiContext, client,true);
		client.executeRequest();

	}

/**
	* Deletes a previous discount redemption from an order.
	* <p><pre><code>
	*    Discount discount = new Discount();
	*   discount.UnRedeemDiscount();
	* </code></pre></p>
	* @return 
	*/
	public void unRedeemDiscount() throws Exception
	{
		unRedeemDiscount( null,  null);
	}

/**
	* Deletes a previous discount redemption from an order.
	* <p><pre><code>
	*    Discount discount = new Discount();
	*   discount.UnRedeemDiscount( discountId,  orderNumber);
	* </code></pre></p>
	* @param discountId Unique identifier of the previously redeemed discount. System-supplied and read only.
	* @param orderNumber The number of the order associated with the redeemed product discount.
	* @return 
	*/
	public void unRedeemDiscount(Integer discountId, Integer orderNumber) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.DiscountClient.unRedeemDiscountClient( discountId,  orderNumber);
		setContext(_apiContext, client,true);
		client.executeRequest();

	}


}


