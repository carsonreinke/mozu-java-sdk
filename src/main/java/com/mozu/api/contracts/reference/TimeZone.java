
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.contracts.reference;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
*	A world date and time standard such as "Dateline Standard Time" or "UTC-12".
*/
public class TimeZone implements Serializable
{
	/** Default Serial Version UID  */
	private static final long serialVersionUID = 1L;

	/**
	*Identifier of the time zone.
	*/
	@JsonProperty("Id")
	protected String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	*If true, the time zone standard observes daylight savings time advancements, for example, twice a year so that evenings have more daylight and mornings have less. If false, the time zone standard does not adhere to daylight savings changes.
	*/
	@JsonProperty("IsDaylightSavingsTime")
	protected Boolean isDaylightSavingsTime;

	public Boolean getIsDaylightSavingsTime() {
		return this.isDaylightSavingsTime;
	}

	public void setIsDaylightSavingsTime(Boolean isDaylightSavingsTime) {
		this.isDaylightSavingsTime = isDaylightSavingsTime;
	}

	/**
	*The offset associated with the time zone, such as "-12".
	*/
	@JsonProperty("Offset")
	protected double offset;

	public double getOffset() {
		return this.offset;
	}

	public void setOffset(double offset) {
		this.offset = offset;
	}

}