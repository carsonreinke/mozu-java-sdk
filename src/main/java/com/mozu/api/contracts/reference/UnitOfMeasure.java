/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.reference;

import java.io.Serializable;
import java.util.Date;

public class UnitOfMeasure implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected String pluralName;

	public String getPluralName() {
		return this.pluralName;
	}

	public void setPluralName(String pluralName) {
		this.pluralName = pluralName;
	}

	protected String symbol;

	public String getSymbol() {
		return this.symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	protected String unitOfMeasureType;

	public String getUnitOfMeasureType() {
		return this.unitOfMeasureType;
	}

	public void setUnitOfMeasureType(String unitOfMeasureType) {
		this.unitOfMeasureType = unitOfMeasureType;
	}

}
