/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.location;

import java.io.Serializable;
import java.util.Date;
import com.mozu.api.contracts.location.Hours;

public class RegularHours implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected Hours friday;

	public Hours getFriday() {
		return this.friday;
	}

	public void setFriday(Hours friday) {
		this.friday = friday;
	}

	protected Hours monday;

	public Hours getMonday() {
		return this.monday;
	}

	public void setMonday(Hours monday) {
		this.monday = monday;
	}

	protected Hours saturday;

	public Hours getSaturday() {
		return this.saturday;
	}

	public void setSaturday(Hours saturday) {
		this.saturday = saturday;
	}

	protected Hours sunday;

	public Hours getSunday() {
		return this.sunday;
	}

	public void setSunday(Hours sunday) {
		this.sunday = sunday;
	}

	protected Hours thursday;

	public Hours getThursday() {
		return this.thursday;
	}

	public void setThursday(Hours thursday) {
		this.thursday = thursday;
	}

	protected Hours tuesday;

	public Hours getTuesday() {
		return this.tuesday;
	}

	public void setTuesday(Hours tuesday) {
		this.tuesday = tuesday;
	}

	protected Hours wednesday;

	public Hours getWednesday() {
		return this.wednesday;
	}

	public void setWednesday(Hours wednesday) {
		this.wednesday = wednesday;
	}

}
