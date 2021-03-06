/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.pricingruntime.thirdparty;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.pricingruntime.thirdparty.ItemTaxContext;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderTaxContext implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected Double handlingFeeTax;

	public Double getHandlingFeeTax() {
		return this.handlingFeeTax;
	}

	public void setHandlingFeeTax(Double handlingFeeTax) {
		this.handlingFeeTax = handlingFeeTax;
	}

	protected Double orderTax;

	public Double getOrderTax() {
		return this.orderTax;
	}

	public void setOrderTax(Double orderTax) {
		this.orderTax = orderTax;
	}

	protected Double shippingTax;

	public Double getShippingTax() {
		return this.shippingTax;
	}

	public void setShippingTax(Double shippingTax) {
		this.shippingTax = shippingTax;
	}

	protected List<ItemTaxContext> itemTaxContexts;
	public List<ItemTaxContext> getItemTaxContexts() {
		return this.itemTaxContexts;
	}
	public void setItemTaxContexts(List<ItemTaxContext> itemTaxContexts) {
		this.itemTaxContexts = itemTaxContexts;
	}

}
