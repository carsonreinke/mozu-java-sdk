/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.returns;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.commerceruntime.returns.ReturnBundle;
import com.mozu.api.contracts.commerceruntime.orders.OrderNote;
import com.mozu.api.contracts.commerceruntime.products.Product;
import com.mozu.api.contracts.commerceruntime.returns.ReturnReason;

/**
 *	Properties of a previously fulfilled item associated with a return.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReturnItem implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Unique identifier of the item in the original completed order. All return items should be associated with a corresponding order item.
	 */
	protected String orderItemId;

	public String getOrderItemId() {
		return this.orderItemId;
	}

	public void setOrderItemId(String orderItemId) {
		this.orderItemId = orderItemId;
	}

	/**
	 * The total value of the product returned to the merchant for accounting purposes, calculated by multiplying the cost of the item by its quantity returned.
	 */
	protected Double productLossAmount;

	public Double getProductLossAmount() {
		return this.productLossAmount;
	}

	public void setProductLossAmount(Double productLossAmount) {
		this.productLossAmount = productLossAmount;
	}

	/**
	 * The total tax amount levied on the product loss amount.
	 */
	protected Double productLossTaxAmount;

	public Double getProductLossTaxAmount() {
		return this.productLossTaxAmount;
	}

	public void setProductLossTaxAmount(Double productLossTaxAmount) {
		this.productLossTaxAmount = productLossTaxAmount;
	}

	/**
	 * The actual quantity received for the return item.
	 */
	protected Integer quantityReceived;

	public Integer getQuantityReceived() {
		return this.quantityReceived;
	}

	public void setQuantityReceived(Integer quantityReceived) {
		this.quantityReceived = quantityReceived;
	}

	/**
	 * The quantity of returned items that can be returned to active product stock.
	 */
	protected Integer quantityRestockable;

	public Integer getQuantityRestockable() {
		return this.quantityRestockable;
	}

	public void setQuantityRestockable(Integer quantityRestockable) {
		this.quantityRestockable = quantityRestockable;
	}

	/**
	 * The quantity of the item shipped to the shopper in the event of a return item replacement.
	 */
	protected Integer quantityShipped;

	public Integer getQuantityShipped() {
		return this.quantityShipped;
	}

	public void setQuantityShipped(Integer quantityShipped) {
		this.quantityShipped = quantityShipped;
	}

	/**
	 * The total value of shipping the returned product to the merchant for accounting purposes, calculated by multiplying the shipping cost of the item by its quantity returned.
	 */
	protected Double shippingLossAmount;

	public Double getShippingLossAmount() {
		return this.shippingLossAmount;
	}

	public void setShippingLossAmount(Double shippingLossAmount) {
		this.shippingLossAmount = shippingLossAmount;
	}

	/**
	 * The total tax amount levied on the shipping loss amount.
	 */
	protected Double shippingLossTaxAmount;

	public Double getShippingLossTaxAmount() {
		return this.shippingLossTaxAmount;
	}

	public void setShippingLossTaxAmount(Double shippingLossTaxAmount) {
		this.shippingLossTaxAmount = shippingLossTaxAmount;
	}

	protected List<ReturnBundle> bundledProducts;
	public List<ReturnBundle> getBundledProducts() {
		return this.bundledProducts;
	}
	public void setBundledProducts(List<ReturnBundle> bundledProducts) {
		this.bundledProducts = bundledProducts;
	}

	/**
	 * List of merchant-supplied notes associated with the return item.
	 */
	protected List<OrderNote> notes;
	public List<OrderNote> getNotes() {
		return this.notes;
	}
	public void setNotes(List<OrderNote> notes) {
		this.notes = notes;
	}

	/**
	 * Properties of the product definition associated with the item in the return.
	 */
	protected Product product;

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	/**
	 * The list of return reasons for the item and the quantity associated with each return reason.
	 */
	protected List<ReturnReason> reasons;
	public List<ReturnReason> getReasons() {
		return this.reasons;
	}
	public void setReasons(List<ReturnReason> reasons) {
		this.reasons = reasons;
	}

}
