
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.contracts.shippingadmin;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
*	Complex type that contains content for a language specified by LocaleCode.
*/
public class ServiceTypeLocalizedContent implements Serializable
{
	/** Default Serial Version UID  */
	private static final long serialVersionUID = 1L;

	/**
	*Language used for the entity. Currently, only "en-US" is supported.
	*/
	@JsonProperty("LocaleCode")
	protected String localeCode;

	public String getLocaleCode() {
		return this.localeCode;
	}

	public void setLocaleCode(String localeCode) {
		this.localeCode = localeCode;
	}

	/**
	*The localized name of this shipping service type.
	*/
	@JsonProperty("Name")
	protected String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
