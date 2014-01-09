/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.wishlists;

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
 *	Properties of an item in a shopper wish list.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WishlistItem implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Shopper-entered comments for an item in a wish list.
	 */
	protected String comments;

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	/**
	 * The subtotal of the wishlist item including any applied discount calculations. This property value is not calculated at this time and is reserved for future functionality.
	 */
	protected Double discountedTotal;

	public Double getDiscountedTotal() {
		return this.discountedTotal;
	}

	public void setDiscountedTotal(Double discountedTotal) {
		this.discountedTotal = discountedTotal;
	}

	/**
	 * Estimated amount of discounts applied to the item in the wish list, which is system-supplied and read-only.                      This property value is not calculated at this time and is reserved for future functionality.
	 */
	protected Double discountTotal;

	public Double getDiscountTotal() {
		return this.discountTotal;
	}

	public void setDiscountTotal(Double discountTotal) {
		this.discountTotal = discountTotal;
	}

	/**
	 * The extended total of an item in a wish list. This property value is not calculated at this time and is reserved for future functionality.
	 */
	protected Double extendedTotal;

	public Double getExtendedTotal() {
		return this.extendedTotal;
	}

	public void setExtendedTotal(Double extendedTotal) {
		this.extendedTotal = extendedTotal;
	}

	/**
	 * The fee total of an item in a wish list. This property value is not calculated at this time and is reserved for future functionality.
	 */
	protected Double feeTotal;

	public Double getFeeTotal() {
		return this.feeTotal;
	}

	public void setFeeTotal(Double feeTotal) {
		this.feeTotal = feeTotal;
	}

	/**
	 * Unique identifier of an item in a shopper wish list.
	 */
	protected String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * If true, the item in the wish list is a recurring purchase, such as a subscription. This property is reserved for future use and is system-supplied and read only.
	 */
	protected Boolean isRecurring;

	public Boolean getIsRecurring() {
		return this.isRecurring;
	}

	public void setIsRecurring(Boolean isRecurring) {
		this.isRecurring = isRecurring;
	}

	/**
	 * If true, the item in a wish list is subject to sales tax.
	 */
	protected Boolean isTaxable;

	public Boolean getIsTaxable() {
		return this.isTaxable;
	}

	public void setIsTaxable(Boolean isTaxable) {
		this.isTaxable = isTaxable;
	}

	/**
	 * The total sales tax of the item in the wish list. This property value is not calculated at this time, and is reserved for future functionality.
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
	 * User-defined string that indicates the priority of an item in a wish list. Possible values are Lowest, Low, Medium, High, and Highest.
	 */
	protected String priorityType;

	public String getPriorityType() {
		return this.priorityType;
	}

	public void setPriorityType(String priorityType) {
		this.priorityType = priorityType;
	}

	/**
	 * The status of the item that indicates whether an item in a wish list can be purchased. Possible values are "Purchasable" which indicates the item can be purchased, "NotPurchasable" which indicates the item is out of stock or otherwise unavailable, or "Missing" which indicates the item has been deleted from the catalog since it was added to the wish list.
	 */
	protected String purchasableStatusType;

	public String getPurchasableStatusType() {
		return this.purchasableStatusType;
	}

	public void setPurchasableStatusType(String purchasableStatusType) {
		this.purchasableStatusType = purchasableStatusType;
	}

	/**
	 * The quantity of an item in a shopper wish list.
	 */
	protected Integer quantity;

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * The total amount of tax levied against shipping charges for an item in a wish list. This property is not calculated at this time and is reserved for future functionality.
	 */
	protected Double shippingTaxTotal;

	public Double getShippingTaxTotal() {
		return this.shippingTaxTotal;
	}

	public void setShippingTaxTotal(Double shippingTaxTotal) {
		this.shippingTaxTotal = shippingTaxTotal;
	}

	/**
	 * The total amount of shipping for an item in a wish list. This property is not calculated at this time and is reserved for future functionality.
	 */
	protected Double shippingTotal;

	public Double getShippingTotal() {
		return this.shippingTotal;
	}

	public void setShippingTotal(Double shippingTotal) {
		this.shippingTotal = shippingTotal;
	}

	/**
	 * The subtotal of an item in a wish list. This property is not calculated at this time and is reserved for future functionality.
	 */
	protected Double subtotal;

	public Double getSubtotal() {
		return this.subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	/**
	 * The taxable total of an item in a wish list. This property is not calculated at this time and is reserved for future functionality.
	 */
	protected Double taxableTotal;

	public Double getTaxableTotal() {
		return this.taxableTotal;
	}

	public void setTaxableTotal(Double taxableTotal) {
		this.taxableTotal = taxableTotal;
	}

	/**
	 * The total of an item in a wish list. This property is not calculated at this time and is reserved for future functionality.
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
	 * The properties of the product associated with an item in a wish list.
	 */
	protected Product product;

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	/**
	 * Array of product discounts applicable to an item in a wish list. This property is not used at this time and is reserved for future functionality.
	 */
	protected List<AppliedProductDiscount> productDiscounts;
	public List<AppliedProductDiscount> getProductDiscounts() {
		return this.productDiscounts;
	}
	public void setProductDiscounts(List<AppliedProductDiscount> productDiscounts) {
		this.productDiscounts = productDiscounts;
	}

	/**
	 * Array of shipping discounts applicable for an item in a wish list. This property is not used at this time and is reserved for future functionality.
	 */
	protected List<ShippingDiscount> shippingDiscounts;
	public List<ShippingDiscount> getShippingDiscounts() {
		return this.shippingDiscounts;
	}
	public void setShippingDiscounts(List<ShippingDiscount> shippingDiscounts) {
		this.shippingDiscounts = shippingDiscounts;
	}

	/**
	 * The unit price of an item in a wish list. This property is not calculated at this time and is reserved for future functionality.
	 */
	protected CommerceUnitPrice unitPrice;

	public CommerceUnitPrice getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(CommerceUnitPrice unitPrice) {
		this.unitPrice = unitPrice;
	}

}
