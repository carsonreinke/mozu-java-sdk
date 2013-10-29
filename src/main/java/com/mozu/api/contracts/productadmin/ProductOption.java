
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.contracts.productadmin;

import java.util.ArrayList;
import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mozu.api.contracts.productadmin.ProductOptionValue;


/**
*	Properties of the product option to create such as attribute detail, fully qualified name, and list of product option values.
*/
public class ProductOption implements Serializable
{
	/** Default Serial Version UID  */
	private static final long serialVersionUID = 1L;

	/**
	*The fully qualified name of the attribute, which is a user defined attribute identifier.
	*/
	@JsonProperty("AttributeFQN")
	protected String attributeFQN;

	public String getAttributeFQN() {
		return this.attributeFQN;
	}

	public void setAttributeFQN(String attributeFQN) {
		this.attributeFQN = attributeFQN;
	}

	/**
	*List of values for the product option. Each value includes an attribute vocabulary value detail and value object.
	*/
	@JsonProperty("Values")
	protected ArrayList<ProductOptionValue> values;
	public ArrayList<ProductOptionValue> getValues() {
		return this.values;
	}
	public void setValues(ArrayList<ProductOptionValue> values) {
		this.values = values;
	}

}