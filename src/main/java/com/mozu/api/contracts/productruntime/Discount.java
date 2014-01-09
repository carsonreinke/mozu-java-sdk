/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productruntime;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

/**
 *	Properties of a defined product discount.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Discount implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Unique identifier of the discount. System-supplied and read only.
	 */
	protected Integer discountId;

	public Integer getDiscountId() {
		return this.discountId;
	}

	public void setDiscountId(Integer discountId) {
		this.discountId = discountId;
	}

	/**
	 * The date and time when the product discount will no longer be active. Date in UTC Date/Time. System-supplied and read-only.
	 */
	protected DateTime expirationDate;

	public DateTime getExpirationDate() {
		return this.expirationDate;
	}

	public void setExpirationDate(DateTime expirationDate) {
		this.expirationDate = expirationDate;
	}

	/**
	 * The name assigned for the product discount.
	 */
	protected String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
