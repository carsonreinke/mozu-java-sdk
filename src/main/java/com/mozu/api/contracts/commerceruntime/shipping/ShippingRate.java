
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.contracts.commerceruntime.shipping;

import java.util.ArrayList;
import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
*	Properties of a shipping price rate based on the type of shipping service per carrier.
*/
public class ShippingRate implements Serializable
{
	/** Default Serial Version UID  */
	private static final long serialVersionUID = 1L;

	/**
	*3-letter ISO 4217 standard global currency code. Currently, only "USD" (US Dollar) is supported.
	*/
	@JsonProperty("ISOCurrencyCode")
	protected String iSOCurrencyCode;

	public String getISOCurrencyCode() {
		return this.iSOCurrencyCode;
	}

	public void setISOCurrencyCode(String iSOCurrencyCode) {
		this.iSOCurrencyCode = iSOCurrencyCode;
	}

	/**
	*If true, the shipping rate for the service type is valid for the carrier.
	*/
	@JsonProperty("IsValid")
	protected Boolean isValid;

	public Boolean getIsValid() {
		return this.isValid;
	}

	public void setIsValid(Boolean isValid) {
		this.isValid = isValid;
	}

	/**
	*Collection of messages that indicate reasons why a shipping rate is invalid.
	*/
	@JsonProperty("Messages")
	protected ArrayList<String> messages;
	public ArrayList<String> getMessages() {
		return this.messages;
	}
	public void setMessages(ArrayList<String> messages) {
		this.messages = messages;
	}

	/**
	*The amount a shopper pays for shipping, which can include any merchant-provided offers or discounts on shipping.
	*/
	@JsonProperty("Price")
	protected Double price;

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	*The code associated with the carrier's shipping method service type. Service type codes include a prefix that indicates the carrier. For example: FEDEX_INTERNATIONAL_STANDARD
	*/
	@JsonProperty("ShippingMethodCode")
	protected String shippingMethodCode;

	public String getShippingMethodCode() {
		return this.shippingMethodCode;
	}

	public void setShippingMethodCode(String shippingMethodCode) {
		this.shippingMethodCode = shippingMethodCode;
	}

	/**
	*Carrier-supplied name of a service type, such as "UPS Ground" or "2nd Day Air".
	*/
	@JsonProperty("ShippingMethodName")
	protected String shippingMethodName;

	public String getShippingMethodName() {
		return this.shippingMethodName;
	}

	public void setShippingMethodName(String shippingMethodName) {
		this.shippingMethodName = shippingMethodName;
	}

}
