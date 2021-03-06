/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.productadmin.ProductOptionValue;

/**
 *	Properties of the product option to create such as attribute detail, fully qualified name, and list of product option values.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductOption implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The fully qualified name of the attribute, which is a user defined attribute identifier.
	 */
	protected String attributeFQN;

	public String getAttributeFQN() {
		return this.attributeFQN;
	}

	public void setAttributeFQN(String attributeFQN) {
		this.attributeFQN = attributeFQN;
	}

	/**
	 * List of values for the product option. Each value includes an attribute vocabulary value detail and value object.
	 */
	protected List<ProductOptionValue> values;
	public List<ProductOptionValue> getValues() {
		return this.values;
	}
	public void setValues(List<ProductOptionValue> values) {
		this.values = values;
	}

}
