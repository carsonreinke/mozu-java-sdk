/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productruntime;

import java.io.Serializable;
import java.util.Date;
import com.mozu.api.contracts.productruntime.AttributeValidation;

public class AttributeDetail implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected String dataType;

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	protected Integer dataTypeSequence;

	public Integer getDataTypeSequence() {
		return this.dataTypeSequence;
	}

	public void setDataTypeSequence(Integer dataTypeSequence) {
		this.dataTypeSequence = dataTypeSequence;
	}

	protected String description;

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	protected String inputType;

	public String getInputType() {
		return this.inputType;
	}

	public void setInputType(String inputType) {
		this.inputType = inputType;
	}

	protected String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected String usageType;

	public String getUsageType() {
		return this.usageType;
	}

	public void setUsageType(String usageType) {
		this.usageType = usageType;
	}

	protected String valueType;

	public String getValueType() {
		return this.valueType;
	}

	public void setValueType(String valueType) {
		this.valueType = valueType;
	}

	protected AttributeValidation validation;

	public AttributeValidation getValidation() {
		return this.validation;
	}

	public void setValidation(AttributeValidation validation) {
		this.validation = validation;
	}

}
