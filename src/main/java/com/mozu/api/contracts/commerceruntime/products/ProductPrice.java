
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.contracts.commerceruntime.products;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
*	The price of a product that appears on a storefront after any applied discounts.
*/
public class ProductPrice implements Serializable
{
	/** Default Serial Version UID  */
	private static final long serialVersionUID = 1L;

	/**
	*The price the merchant charges for a product on a storefront if no sales price is defined.
	*/
	@JsonProperty("Price")
	protected Double price;

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	*Current sale price defined for a product on a storefront.
	*/
	@JsonProperty("SalePrice")
	protected Double salePrice;

	public Double getSalePrice() {
		return this.salePrice;
	}

	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}

}