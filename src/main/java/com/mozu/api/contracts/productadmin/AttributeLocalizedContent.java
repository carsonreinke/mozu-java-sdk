/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.io.Serializable;
import java.util.Date;

public class AttributeLocalizedContent implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected String description;

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	protected String localeCode;

	public String getLocaleCode() {
		return this.localeCode;
	}

	public void setLocaleCode(String localeCode) {
		this.localeCode = localeCode;
	}

	protected String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
