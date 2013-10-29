
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.contracts.productruntime;

import java.util.ArrayList;
import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mozu.api.contracts.productruntime.AttributeDetail;
import com.mozu.api.contracts.productruntime.ProductPropertyValue;


/**
*	Details of a property attribute defined for a product.
*/
public class ProductProperty implements Serializable
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
	*If true, the product property does not appear for the product in the storefront.
	*/
	@JsonProperty("IsHidden")
	protected Boolean isHidden;

	public Boolean getIsHidden() {
		return this.isHidden;
	}

	public void setIsHidden(Boolean isHidden) {
		this.isHidden = isHidden;
	}

	/**
	*If true, the product property can have more than one selected value.
	*/
	@JsonProperty("IsMultiValue")
	protected Boolean isMultiValue;

	public Boolean getIsMultiValue() {
		return this.isMultiValue;
	}

	public void setIsMultiValue(Boolean isMultiValue) {
		this.isMultiValue = isMultiValue;
	}

	/**
	*Details of the attribute defined as a product property.
	*/
	@JsonProperty("AttributeDetail")
	protected AttributeDetail attributeDetail;

	public AttributeDetail getAttributeDetail() {
		return this.attributeDetail;
	}

	public void setAttributeDetail(AttributeDetail attributeDetail) {
		this.attributeDetail = attributeDetail;
	}

	/**
	*List of values defined for the product property attribute.
	*/
	@JsonProperty("Values")
	protected ArrayList<ProductPropertyValue> values;
	public ArrayList<ProductPropertyValue> getValues() {
		return this.values;
	}
	public void setValues(ArrayList<ProductPropertyValue> values) {
		this.values = values;
	}

}