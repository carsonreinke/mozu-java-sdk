
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.contracts.shippingruntime;

import java.io.Serializable;
import java.util.Date;



/**
*	Calculated properties of a shipping total based on the supplied amount and currency code.
*/
public class Money implements Serializable
{
	/** Default Serial Version UID  */
	private static final long serialVersionUID = 1L;

	protected String currencyCode;

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	/**
	*Amount value of the calculated shipping total.
	*/
	protected Double value;

	public Double getValue() {
		return this.value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

}
