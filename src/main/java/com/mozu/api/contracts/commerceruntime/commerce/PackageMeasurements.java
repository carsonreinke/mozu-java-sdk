/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.commerce;

import java.io.Serializable;
import java.util.Date;
import com.mozu.api.contracts.core.Measurement;

public class PackageMeasurements implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected Measurement height;

	public Measurement getHeight() {
		return this.height;
	}

	public void setHeight(Measurement height) {
		this.height = height;
	}

	protected Measurement length;

	public Measurement getLength() {
		return this.length;
	}

	public void setLength(Measurement length) {
		this.length = length;
	}

	protected Measurement weight;

	public Measurement getWeight() {
		return this.weight;
	}

	public void setWeight(Measurement weight) {
		this.weight = weight;
	}

	protected Measurement width;

	public Measurement getWidth() {
		return this.width;
	}

	public void setWidth(Measurement width) {
		this.width = width;
	}

}
