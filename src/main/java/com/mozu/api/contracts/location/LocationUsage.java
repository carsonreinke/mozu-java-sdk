/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.location;

import java.util.List;
import java.io.Serializable;
import java.util.Date;

public class LocationUsage implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected List<String> locationCodes;
	public List<String> getLocationCodes() {
		return this.locationCodes;
	}
	public void setLocationCodes(List<String> locationCodes) {
		this.locationCodes = locationCodes;
	}

	protected List<String> locationTypeCodes;
	public List<String> getLocationTypeCodes() {
		return this.locationTypeCodes;
	}
	public void setLocationTypeCodes(List<String> locationTypeCodes) {
		this.locationTypeCodes = locationTypeCodes;
	}

	protected String locationUsageTypeCode;

	public String getLocationUsageTypeCode() {
		return this.locationUsageTypeCode;
	}

	public void setLocationUsageTypeCode(String locationUsageTypeCode) {
		this.locationUsageTypeCode = locationUsageTypeCode;
	}

}