
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.contracts.commerceruntime.orders;

import java.util.ArrayList;
import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mozu.api.contracts.commerceruntime.orders.OrderItem;


/**
*	Collection of all order items that appear on the order.
*/
public class OrderItemCollection implements Serializable
{
	/** Default Serial Version UID  */
	private static final long serialVersionUID = 1L;

	/**
	*The number of results listed in the query collection, represented by a signed 64-bit (8-byte) integer. This value is system-supplied and read-only.
	*/
	@JsonProperty("TotalCount")
	protected Integer totalCount;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	/**
	*An array list of objects in the returned collection.
	*/
	@JsonProperty("Items")
	protected ArrayList<OrderItem> items;
	public ArrayList<OrderItem> getItems() {
		return this.items;
	}
	public void setItems(ArrayList<OrderItem> items) {
		this.items = items;
	}

}
