/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.pricingruntime;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import com.mozu.api.contracts.pricingruntime.ProductProperty;

/**
 *	Properties of a line item in an order that is subject to tax.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaxableLineItem implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Unique identifier of the taxable line item.
	 */
	protected String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * If true, the line item in the order is subject to tax.
	 */
	protected Boolean isTaxable;

	public Boolean getIsTaxable() {
		return this.isTaxable;
	}

	public void setIsTaxable(Boolean isTaxable) {
		this.isTaxable = isTaxable;
	}

	/**
	 * The sale price of the line item in the order.
	 */
	protected Double lineItemPrice;

	public Double getLineItemPrice() {
		return this.lineItemPrice;
	}

	public void setLineItemPrice(Double lineItemPrice) {
		this.lineItemPrice = lineItemPrice;
	}

	/**
	 * Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 */
	protected String productCode;

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	protected String productName;

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * The quantity of the line item in the order.
	 */
	protected Integer quantity;

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	protected String reason;

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	/**
	 * The amount of shipping calculated for a line item in an order.
	 */
	protected Double shippingAmount;

	public Double getShippingAmount() {
		return this.shippingAmount;
	}

	public void setShippingAmount(Double shippingAmount) {
		this.shippingAmount = shippingAmount;
	}

	/**
	 * Properties of the product that represents the line item in the order.
	 */
	protected List<ProductProperty> productProperties;
	public List<ProductProperty> getProductProperties() {
		return this.productProperties;
	}
	public void setProductProperties(List<ProductProperty> productProperties) {
		this.productProperties = productProperties;
	}

}
