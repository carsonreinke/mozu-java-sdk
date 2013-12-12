/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.location;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;

/**
 *	Configuration properties of a location usage type for a specified site. The direct ship location usage type consists of a single location that represents location that supports direct ship (DS) fulfillment. The in-store pickup location usage type consists of a list of location types that represent locations that support in-store pickup (SP) fulfillment. The store finder location usage type consists of a list of location codes, location types, or both.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationUsage implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * List of location codes to associate with the location usage. At this time, you can only specify one location code in the request for the direct ship location usage type.
	 */
	protected List<String> locationCodes;
	public List<String> getLocationCodes() {
		return this.locationCodes;
	}
	public void setLocationCodes(List<String> locationCodes) {
		this.locationCodes = locationCodes;
	}

	/**
	 * List of location type codes associated with the location usage. The location service identifies the locations of the designated type. The in-store pickup (SP) and store finder (storeFinder) location usage types allow specification or multiple location type codes.
	 */
	protected List<String> locationTypeCodes;
	public List<String> getLocationTypeCodes() {
		return this.locationTypeCodes;
	}
	public void setLocationTypeCodes(List<String> locationTypeCodes) {
		this.locationTypeCodes = locationTypeCodes;
	}

	/**
	 * The system-defined code used to identify the location usage type, which is "DS" for direct ship, "SP" for in-store pickup, or "storeFinder".
	 */
	protected String locationUsageTypeCode;

	public String getLocationUsageTypeCode() {
		return this.locationUsageTypeCode;
	}

	public void setLocationUsageTypeCode(String locationUsageTypeCode) {
		this.locationUsageTypeCode = locationUsageTypeCode;
	}

}
