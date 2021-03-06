/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.pricingruntime.thirdparty;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.core.Address;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TaxContext implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected String customerId;

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	protected String taxContextId;

	public String getTaxContextId() {
		return this.taxContextId;
	}

	public void setTaxContextId(String taxContextId) {
		this.taxContextId = taxContextId;
	}

	protected String taxExemptId;

	public String getTaxExemptId() {
		return this.taxExemptId;
	}

	public void setTaxExemptId(String taxExemptId) {
		this.taxExemptId = taxExemptId;
	}

	protected Boolean taxShipping;

	public Boolean getTaxShipping() {
		return this.taxShipping;
	}

	public void setTaxShipping(Boolean taxShipping) {
		this.taxShipping = taxShipping;
	}

	protected Address destinationAddress;

	public Address getDestinationAddress() {
		return this.destinationAddress;
	}

	public void setDestinationAddress(Address destinationAddress) {
		this.destinationAddress = destinationAddress;
	}

	protected Address originAddress;

	public Address getOriginAddress() {
		return this.originAddress;
	}

	public void setOriginAddress(Address originAddress) {
		this.originAddress = originAddress;
	}

}
