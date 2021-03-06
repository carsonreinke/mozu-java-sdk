/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.returns;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

/**
 *	The reason for which the item is returned. Valid values include Damaged, Defective, MissingParts, DifferentExpectations, Late, NoLongerWanted, or Other.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReturnReason implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The quantity of the item returned for the specified reason.
	 */
	protected Integer quantity;

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * The reason for which an item is returned to the merchant.
	 */
	protected String reason;

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

}
