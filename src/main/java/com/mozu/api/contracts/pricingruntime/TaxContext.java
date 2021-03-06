/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.pricingruntime;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.core.Address;

/**
 *	The tax properties associated with the order.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaxContext implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Unique identifier of the customer.
	 */
	protected String customerId;

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	/**
	 * Unique identifier of the tax context.
	 */
	protected String taxContextId;

	public String getTaxContextId() {
		return this.taxContextId;
	}

	public void setTaxContextId(String taxContextId) {
		this.taxContextId = taxContextId;
	}

	/**
	 * If the order is exempt from sales tax, the unique identifier of the tax exempt entity.
	 */
	protected String taxExemptId;

	public String getTaxExemptId() {
		return this.taxExemptId;
	}

	public void setTaxExemptId(String taxExemptId) {
		this.taxExemptId = taxExemptId;
	}

	/**
	 * The address to which the order ships.
	 */
	protected Address destinationAddress;

	public Address getDestinationAddress() {
		return this.destinationAddress;
	}

	public void setDestinationAddress(Address destinationAddress) {
		this.destinationAddress = destinationAddress;
	}

	/**
	 * The address from which the order ships.
	 */
	protected Address originAddress;

	public Address getOriginAddress() {
		return this.originAddress;
	}

	public void setOriginAddress(Address originAddress) {
		this.originAddress = originAddress;
	}

}
