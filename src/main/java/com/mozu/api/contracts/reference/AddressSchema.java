
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.contracts.reference;

import java.util.ArrayList;
import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mozu.api.contracts.reference.Field;


/**
*	The structure of postal addresses based on the country specified. Since addresses vary from country to country, this schema allows a flexible storage structure.
*/
public class AddressSchema implements Serializable
{
	/** Default Serial Version UID  */
	private static final long serialVersionUID = 1L;

	/**
	*2 letter geographic code representing the country for the physical or mailing address. Currently limited to the US.
	*/
	@JsonProperty("CountryCode")
	protected String countryCode;

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/**
	*The label associated with this country.
	*/
	@JsonProperty("CountryLabel")
	protected String countryLabel;

	public String getCountryLabel() {
		return this.countryLabel;
	}

	public void setCountryLabel(String countryLabel) {
		this.countryLabel = countryLabel;
	}

	/**
	*The unique identifier of this postal address schema.
	*/
	@JsonProperty("Id")
	protected Long id;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	*The fields to display for postal addresses associated with this country.
	*/
	@JsonProperty("Fields")
	protected ArrayList<Field> fields;
	public ArrayList<Field> getFields() {
		return this.fields;
	}
	public void setFields(ArrayList<Field> fields) {
		this.fields = fields;
	}

}
