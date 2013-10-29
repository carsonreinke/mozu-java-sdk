
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.contracts.productadmin;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
*	Localized content displayed in the storefront for this attribute.
*/
public class AttributeLocalizedContent implements Serializable
{
	/** Default Serial Version UID  */
	private static final long serialVersionUID = 1L;

	/**
	*Localized content for the description of this attribute displayed in the storefront.
	*/
	@JsonProperty("Description")
	protected String description;

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

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
	*Localized content for the attribute name displayed in the storefront.
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