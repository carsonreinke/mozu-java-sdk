/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.carts;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.commerceruntime.products.Product;
import com.mozu.api.contracts.commerceruntime.discounts.AppliedProductDiscount;
import com.mozu.api.contracts.commerceruntime.discounts.ShippingDiscount;
import com.mozu.api.contracts.commerceruntime.commerce.CommerceUnitPrice;

/**
 *	Properties of an item added to an active shopping cart.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CartItem implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The subtotal of the cart item including any applied discount calculations.
	 */
	protected Double discountedTotal;

	public Double getDiscountedTotal() {
		return this.discountedTotal;
	}

	public void setDiscountedTotal(Double discountedTotal) {
		this.discountedTotal = discountedTotal;
	}

	/**
	 * Estimated amount of discounts applied to the item in the cart, which is system-supplied and read-only.
	 */
	protected Double discountTotal;

	public Double getDiscountTotal() {
		return this.discountTotal;
	}

	public void setDiscountTotal(Double discountTotal) {
		this.discountTotal = discountTotal;
	}

	/**
	 * Represents the total price of the cart item extended to the shopper. This begins with the Unit Price, then uses any of the following prices if they are defined, in the following order: Override Amount, Sale Amount, List Amount.
	 */
	protected Double extendedTotal;

	public Double getExtendedTotal() {
		return this.extendedTotal;
	}

	public void setExtendedTotal(Double extendedTotal) {
		this.extendedTotal = extendedTotal;
	}

	/**
	 * The total amount of all fees incurred for the item.
	 */
	protected Double feeTotal;

	public Double getFeeTotal() {
		return this.feeTotal;
	}

	public void setFeeTotal(Double feeTotal) {
		this.feeTotal = feeTotal;
	}

	/**
	 * The location code associated with the location where this cart item will be fulfilled.
	 */
	protected String fulfillmentLocationCode;

	public String getFulfillmentLocationCode() {
		return this.fulfillmentLocationCode;
	}

	public void setFulfillmentLocationCode(String fulfillmentLocationCode) {
		this.fulfillmentLocationCode = fulfillmentLocationCode;
	}

	/**
	 * The method used to fulfill this cart item, which is direct ship or in-store pickup.
	 */
	protected String fulfillmentMethod;

	public String getFulfillmentMethod() {
		return this.fulfillmentMethod;
	}

	public void setFulfillmentMethod(String fulfillmentMethod) {
		this.fulfillmentMethod = fulfillmentMethod;
	}

	/**
	 * Unique identifier of the cart item.
	 */
	protected String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * If true, the item can be purchased or fulfilled at regular intervals, such as a monthly billing cycle. For example, digital or physical product subscriptions are recurring cart items. This property is not used at this time and is reserved for future functionality.
	 */
	protected Boolean isRecurring;

	public Boolean getIsRecurring() {
		return this.isRecurring;
	}

	public void setIsRecurring(Boolean isRecurring) {
		this.isRecurring = isRecurring;
	}

	/**
	 * If true, the entity is subject to tax based on the relevant tax rate.
	 */
	protected Boolean isTaxable;

	public Boolean getIsTaxable() {
		return this.isTaxable;
	}

	public void setIsTaxable(Boolean isTaxable) {
		this.isTaxable = isTaxable;
	}

	/**
	 * The total amount of tax for the item in the cart.
	 */
	protected Double itemTaxTotal;

	public Double getItemTaxTotal() {
		return this.itemTaxTotal;
	}

	public void setItemTaxTotal(Double itemTaxTotal) {
		this.itemTaxTotal = itemTaxTotal;
	}

	/**
	 * Language used for the entity. Currently, only "en-US" is supported.
	 */
	protected String localeCode;

	public String getLocaleCode() {
		return this.localeCode;
	}

	public void setLocaleCode(String localeCode) {
		this.localeCode = localeCode;
	}

	/**
	 * The specified quantity of the cart item.
	 */
	protected Integer quantity;

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * The total amount of tax incurred on the shipping charges in the cart.
	 */
	protected Double shippingTaxTotal;

	public Double getShippingTaxTotal() {
		return this.shippingTaxTotal;
	}

	public void setShippingTaxTotal(Double shippingTaxTotal) {
		this.shippingTaxTotal = shippingTaxTotal;
	}

	/**
	 * The estimated total amount of shipping fees for the item in the cart.
	 */
	protected Double shippingTotal;

	public Double getShippingTotal() {
		return this.shippingTotal;
	}

	public void setShippingTotal(Double shippingTotal) {
		this.shippingTotal = shippingTotal;
	}

	/**
	 * Estimated amount of the item in the cart without sales tax, shipping costs, and other fees.
	 */
	protected Double subtotal;

	public Double getSubtotal() {
		return this.subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	/**
	 * The amount of the item in the cart that is subject to tax.
	 */
	protected Double taxableTotal;

	public Double getTaxableTotal() {
		return this.taxableTotal;
	}

	public void setTaxableTotal(Double taxableTotal) {
		this.taxableTotal = taxableTotal;
	}

	/**
	 * Estimated total amount of the item, including the product price, sales tax, shipping costs, and other fees.
	 */
	protected Double total;

	public Double getTotal() {
		return this.total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	/**
	 * Identifier and datetime stamp information recorded when a user or application creates, updates, or deletes a resource entity. This value is system-supplied and read-only.
	 */
	protected AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	/**
	 * The properties of the associated product.
	 */
	protected Product product;

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	/**
	 * List of product-level discounts projected to apply to the cart item at checkout.
	 */
	protected List<AppliedProductDiscount> productDiscounts;
	public List<AppliedProductDiscount> getProductDiscounts() {
		return this.productDiscounts;
	}
	public void setProductDiscounts(List<AppliedProductDiscount> productDiscounts) {
		this.productDiscounts = productDiscounts;
	}

	/**
	 * List of shipping discounts projected to apply to the cart item at checkout.
	 */
	protected List<ShippingDiscount> shippingDiscounts;
	public List<ShippingDiscount> getShippingDiscounts() {
		return this.shippingDiscounts;
	}
	public void setShippingDiscounts(List<ShippingDiscount> shippingDiscounts) {
		this.shippingDiscounts = shippingDiscounts;
	}

	/**
	 * Properties of the unit price associated with the cart item.
	 */
	protected CommerceUnitPrice unitPrice;

	public CommerceUnitPrice getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(CommerceUnitPrice unitPrice) {
		this.unitPrice = unitPrice;
	}

}
