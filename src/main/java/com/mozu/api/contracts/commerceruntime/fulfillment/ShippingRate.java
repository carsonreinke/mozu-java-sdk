/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.fulfillment;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

/**
 *	Properties of an estimated shipping rate for a shipment.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShippingRate implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * 3-letter ISO 4217 standard global currency code. Currently, only "USD" (US Dollar) is supported.
	 */
	protected String currencyCode;

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	/**
	 * If true, the estimated shipping rate is valid.
	 */
	protected Boolean isValid;

	public Boolean getIsValid() {
		return this.isValid;
	}

	public void setIsValid(Boolean isValid) {
		this.isValid = isValid;
	}

	/**
	 * Array list of validation messages associated with the shipping rate.
	 */
	protected List<String> messages;
	public List<String> getMessages() {
		return this.messages;
	}
	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	/**
	 * The amount the company and the shopper pay for shipping based on the current rate. Depending on any company discounts or fees, the price the company pays for shipping may differ from what the shopper pays.
	 */
	protected Double price;

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * The code that identifies the service type shipping method, such as FED_EX_INTERNATIONAL.
	 */
	protected String shippingMethodCode;

	public String getShippingMethodCode() {
		return this.shippingMethodCode;
	}

	public void setShippingMethodCode(String shippingMethodCode) {
		this.shippingMethodCode = shippingMethodCode;
	}

	/**
	 * The name of the shipping method associated with the estimated rate, such as "UPS Ground".
	 */
	protected String shippingMethodName;

	public String getShippingMethodName() {
		return this.shippingMethodName;
	}

	public void setShippingMethodName(String shippingMethodName) {
		this.shippingMethodName = shippingMethodName;
	}

}
