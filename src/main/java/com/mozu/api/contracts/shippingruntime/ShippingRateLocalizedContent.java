
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.contracts.shippingruntime;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ShippingRateLocalizedContent implements Serializable
{
	/** Default Serial Version UID  */
	private static final long serialVersionUID = 1L;

	@JsonProperty("LocaleCode")
	protected String localeCode;

	public String getLocaleCode() {
		return this.localeCode;
	}

	public void setLocaleCode(String localeCode) {
		this.localeCode = localeCode;
	}

	@JsonProperty("Name")
	protected String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
