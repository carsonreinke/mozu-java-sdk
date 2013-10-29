
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.contracts.commerceruntime.discounts;

import java.util.ArrayList;
import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
*	Properties of a discount defined for a product or order in a storefront.
*/
public class Discount implements Serializable
{
	/** Default Serial Version UID  */
	private static final long serialVersionUID = 1L;

	/**
	*The date and time at which the discount can no longer be applied to a product or order.
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
	*Unique identifier of the discount.
	*/
	@JsonProperty("Id")
	protected Integer id;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/**
	*List of cart or order items to which the discount applies, if applicable.
	*/
	@JsonProperty("ItemIds")
	protected ArrayList<String> itemIds;
	public ArrayList<String> getItemIds() {
		return this.itemIds;
	}
	public void setItemIds(ArrayList<String> itemIds) {
		this.itemIds = itemIds;
	}

	/**
	*The name of the discount, in the language specified by the LocaleCode of the storefront.
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