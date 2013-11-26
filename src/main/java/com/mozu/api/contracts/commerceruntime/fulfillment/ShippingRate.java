/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.fulfillment;

import java.util.List;
import java.io.Serializable;
import java.util.Date;

public class ShippingRate implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected String currencyCode;

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	protected Boolean isValid;

	public Boolean getIsValid() {
		return this.isValid;
	}

	public void setIsValid(Boolean isValid) {
		this.isValid = isValid;
	}

	protected List<String> messages;
	public List<String> getMessages() {
		return this.messages;
	}
	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	protected Double price;

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	protected String shippingMethodCode;

	public String getShippingMethodCode() {
		return this.shippingMethodCode;
	}

	public void setShippingMethodCode(String shippingMethodCode) {
		this.shippingMethodCode = shippingMethodCode;
	}

	protected String shippingMethodName;

	public String getShippingMethodName() {
		return this.shippingMethodName;
	}

	public void setShippingMethodName(String shippingMethodName) {
		this.shippingMethodName = shippingMethodName;
	}

}