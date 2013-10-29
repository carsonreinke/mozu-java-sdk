
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.contracts.core;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
*	Address information to supply for a contact.
*/
public class Address implements Serializable
{
	/** Default Serial Version UID  */
	private static final long serialVersionUID = 1L;

	/**
	*Physical or mailing address line one. Usually includes the street number and street name or it could be a P.O. Box. Max length: 200.
	*/
	@JsonProperty("Address1")
	protected String address1;

	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	/**
	*Physical or mailing address line two. Usually supplements the main street address with apartment, floor, suite, building, or unit information. Max length: 200.
	*/
	@JsonProperty("Address2")
	protected String address2;

	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	/**
	*Physical or mailing address line three. Max length: 200.
	*/
	@JsonProperty("Address3")
	protected String address3;

	public String getAddress3() {
		return this.address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	/**
	*Physical or mailing address line four. Max length: 200.
	*/
	@JsonProperty("Address4")
	protected String address4;

	public String getAddress4() {
		return this.address4;
	}

	public void setAddress4(String address4) {
		this.address4 = address4;
	}

	/**
	*City or town for the physical or mailing address. The maximum character length is 100.
	*/
	@JsonProperty("CityOrTown")
	protected String cityOrTown;

	public String getCityOrTown() {
		return this.cityOrTown;
	}

	public void setCityOrTown(String cityOrTown) {
		this.cityOrTown = cityOrTown;
	}

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
	*If true, the address has been verified by an address validation service.
	*/
	@JsonProperty("IsValidated")
	protected Boolean isValidated;

	public Boolean getIsValidated() {
		return this.isValidated;
	}

	public void setIsValidated(Boolean isValidated) {
		this.isValidated = isValidated;
	}

	/**
	*The postal or zip code for the address. For example, a USPS-approved ZIP code standard is ZIP+4: 12345-6789. The maximum character length is 100.
	*/
	@JsonProperty("PostalOrZipCode")
	protected String postalOrZipCode;

	public String getPostalOrZipCode() {
		return this.postalOrZipCode;
	}

	public void setPostalOrZipCode(String postalOrZipCode) {
		this.postalOrZipCode = postalOrZipCode;
	}

	/**
	*The two-letter geographic code representing the state for the physical or mailing address. This is currently limited to the US.
	*/
	@JsonProperty("StateOrProvince")
	protected String stateOrProvince;

	public String getStateOrProvince() {
		return this.stateOrProvince;
	}

	public void setStateOrProvince(String stateOrProvince) {
		this.stateOrProvince = stateOrProvince;
	}

	/**
	*The type of address, which is commercial or residential.
	*/
	@JsonProperty("AddressType")
	protected String addressType;

	public String getAddressType() {
		return this.addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

}