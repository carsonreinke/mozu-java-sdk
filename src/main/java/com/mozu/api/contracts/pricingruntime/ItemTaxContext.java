/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.pricingruntime;

import java.io.Serializable;
import java.util.Date;

public class ItemTaxContext implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	protected String productCode;

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	protected Integer quantity;

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	protected Double shippingTax;

	public Double getShippingTax() {
		return this.shippingTax;
	}

	public void setShippingTax(Double shippingTax) {
		this.shippingTax = shippingTax;
	}

	protected Double tax;

	public Double getTax() {
		return this.tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

}
