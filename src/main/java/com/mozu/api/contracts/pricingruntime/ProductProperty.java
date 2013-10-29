
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.contracts.pricingruntime;

import java.util.ArrayList;
import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mozu.api.contracts.pricingruntime.ProductAttribute;
import com.mozu.api.contracts.pricingruntime.ProductPropertyValue;


/**
*	Details of a property defined for a product.
*/
public class ProductProperty implements Serializable
{
	/** Default Serial Version UID  */
	private static final long serialVersionUID = 1L;

	@JsonProperty("AttributeFQN")
	protected String attributeFQN;

	public String getAttributeFQN() {
		return this.attributeFQN;
	}

	public void setAttributeFQN(String attributeFQN) {
		this.attributeFQN = attributeFQN;
	}

	/**
	*If true, this product property does not appear on the storefront.
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
	*If true, the product property has multiple values.
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
	*Details of a product attribute.
	*/
	@JsonProperty("AttributeDetail")
	protected ProductAttribute attributeDetail;

	public ProductAttribute getAttributeDetail() {
		return this.attributeDetail;
	}

	public void setAttributeDetail(ProductAttribute attributeDetail) {
		this.attributeDetail = attributeDetail;
	}

	@JsonProperty("Values")
	protected ArrayList<ProductPropertyValue> values;
	public ArrayList<ProductPropertyValue> getValues() {
		return this.values;
	}
	public void setValues(ArrayList<ProductPropertyValue> values) {
		this.values = values;
	}

}