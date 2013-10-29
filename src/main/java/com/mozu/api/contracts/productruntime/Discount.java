
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.contracts.productruntime;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
*	Properties of a defined product discount.
*/
public class Discount implements Serializable
{
	/** Default Serial Version UID  */
	private static final long serialVersionUID = 1L;

	@JsonProperty("DiscountId")
	protected Integer discountId;

	public Integer getDiscountId() {
		return this.discountId;
	}

	public void setDiscountId(Integer discountId) {
		this.discountId = discountId;
	}

	/**
	*The date and time when the product discount will no longer be active. Date in UTC Date/Time. System-supplied and read-only.
	*/
	@JsonProperty("ExpirationDate")
	protected Date expirationDate;

	public Date getExpirationDate() {
		return this.expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	/**
	*The name assigned for the product discount.
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