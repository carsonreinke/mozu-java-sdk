
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.contracts.commerceruntime.shipping;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
*	Properties of an item shipped in a physical package.
*/
public class PackageItem implements Serializable
{
	/** Default Serial Version UID  */
	private static final long serialVersionUID = 1L;

	/**
	*Identifier of the item in the order associated with the item in the specified package.
	*/
	@JsonProperty("OrderItemId")
	protected String orderItemId;

	public String getOrderItemId() {
		return this.orderItemId;
	}

	public void setOrderItemId(String orderItemId) {
		this.orderItemId = orderItemId;
	}

	/**
	*The quantity of an item shipped in the specified package.
	*/
	@JsonProperty("Quantity")
	protected Integer quantity;

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
