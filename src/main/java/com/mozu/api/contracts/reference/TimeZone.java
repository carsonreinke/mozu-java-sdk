/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.reference;

import java.io.Serializable;
import java.util.Date;

public class TimeZone implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	protected Boolean isDaylightSavingsTime;

	public Boolean getIsDaylightSavingsTime() {
		return this.isDaylightSavingsTime;
	}

	public void setIsDaylightSavingsTime(Boolean isDaylightSavingsTime) {
		this.isDaylightSavingsTime = isDaylightSavingsTime;
	}

	protected double offset;

	public double getOffset() {
		return this.offset;
	}

	public void setOffset(double offset) {
		this.offset = offset;
	}

}
