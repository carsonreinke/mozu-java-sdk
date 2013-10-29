
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.contracts.productadmin;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
*	Shipping method service type, such as UPS Ground or USPS Priority Mail, targeted for a defined discount.
*/
public class TargetedShippingMethod implements Serializable
{
	/** Default Serial Version UID  */
	private static final long serialVersionUID = 1L;

	/**
	*The code associated with the carrier's shipping method service type. Service type codes include a prefix that indicates the carrier. For example: FEDEX_INTERNATIONAL_STANDARD
	*/
	@JsonProperty("Code")
	protected String code;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	/**
	*Name of the shipping method service type associated with the targeted discount.
	*/
	@JsonProperty("Name")
	protected String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}