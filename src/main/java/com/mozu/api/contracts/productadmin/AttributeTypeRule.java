/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

/**
 *	Properties of the attribute type rule.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AttributeTypeRule implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The data type of the attribute. There are four valid data types: "Bool", "DateTime", "Number", "String"
	 */
	protected String attributeDataType;

	public String getAttributeDataType() {
		return this.attributeDataType;
	}

	public void setAttributeDataType(String attributeDataType) {
		this.attributeDataType = attributeDataType;
	}

	/**
	 * An attribute's data type would be either "NotSpecified", "Textbox", "Textarea", "Date", "DateTime", "Dropdown", "Listbox", "Radio", "Currency", or "Checkbox" and will be a valid value defined in the type rules resource.
	 */
	protected String attributeInputType;

	public String getAttributeInputType() {
		return this.attributeInputType;
	}

	public void setAttributeInputType(String attributeInputType) {
		this.attributeInputType = attributeInputType;
	}

	/**
	 * Describes how an attribute will be used. Valid types are "Extra", "Option", and "Property".
	 */
	protected String attributeUsageType;

	public String getAttributeUsageType() {
		return this.attributeUsageType;
	}

	public void setAttributeUsageType(String attributeUsageType) {
		this.attributeUsageType = attributeUsageType;
	}

	/**
	 * An attribute value type is either predefined vocabulary by the admin during product attribute set up or it can be "AdminEntered" or "ShopperEntered". The difference between predefined values versus manually entered values is such that the first choice is a set of options to choose from. AdminEntered and ShopperEntered are values that are entered rather than system-supplied and are not stored in the database, but captured during a live commerce operations such as during an order.
	 */
	protected String attributeValueType;

	public String getAttributeValueType() {
		return this.attributeValueType;
	}

	public void setAttributeValueType(String attributeValueType) {
		this.attributeValueType = attributeValueType;
	}

}
