/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.sitesettings.general;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

/**
 *	Properties of the territory which is subject to sales tax.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaxableTerritory implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The 2-letter geographic code representing the country for the physical or mailing address. Currently limited to the US.
	 */
	protected String countryCode;

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/**
	 * If true, all shipping charges for this territory are subject to sales tax.
	 */
	protected Boolean isShippingTaxable;

	public Boolean getIsShippingTaxable() {
		return this.isShippingTaxable;
	}

	public void setIsShippingTaxable(Boolean isShippingTaxable) {
		this.isShippingTaxable = isShippingTaxable;
	}

	/**
	 * The two-letter geographic code representing the state for the physical or mailing address. This is currently limited to the US.
	 */
	protected String stateOrProvinceCode;

	public String getStateOrProvinceCode() {
		return this.stateOrProvinceCode;
	}

	public void setStateOrProvinceCode(String stateOrProvinceCode) {
		this.stateOrProvinceCode = stateOrProvinceCode;
	}

}
