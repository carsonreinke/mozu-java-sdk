
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.contracts.commerceruntime.shipping;

import java.util.ArrayList;
import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.core.Contact;


/**
*	Properties of a shipment for an order.
*/
public class Shipment implements Serializable
{
	/** Default Serial Version UID  */
	private static final long serialVersionUID = 1L;

	/**
	*The total merchant cost of the order shipment for accounting purposes.
	*/
	@JsonProperty("Cost")
	protected Double cost;

	public Double getCost() {
		return this.cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	/**
	*Unique identifier of the order shipment.
	*/
	@JsonProperty("Id")
	protected String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("ISOCurrencyCode")
	protected String iSOCurrencyCode;

	public String getISOCurrencyCode() {
		return this.iSOCurrencyCode;
	}

	public void setISOCurrencyCode(String iSOCurrencyCode) {
		this.iSOCurrencyCode = iSOCurrencyCode;
	}

	/**
	*List of unique identifiers of packages associated with this shipment.
	*/
	@JsonProperty("PackageIds")
	protected ArrayList<String> packageIds;
	public ArrayList<String> getPackageIds() {
		return this.packageIds;
	}
	public void setPackageIds(ArrayList<String> packageIds) {
		this.packageIds = packageIds;
	}

	/**
	*Code for the shipping carrier service type used to ship the order shipment.
	*/
	@JsonProperty("ShippingMethodCode")
	protected String shippingMethodCode;

	public String getShippingMethodCode() {
		return this.shippingMethodCode;
	}

	public void setShippingMethodCode(String shippingMethodCode) {
		this.shippingMethodCode = shippingMethodCode;
	}

	/**
	*If true, a shopper signature is required to deliver the order shipment.
	*/
	@JsonProperty("SignatureRequired")
	protected Boolean signatureRequired;

	public Boolean getSignatureRequired() {
		return this.signatureRequired;
	}

	public void setSignatureRequired(Boolean signatureRequired) {
		this.signatureRequired = signatureRequired;
	}

	/**
	*Tracking number the shipping carrier supplied for the order shipment.
	*/
	@JsonProperty("TrackingNumber")
	protected String trackingNumber;

	public String getTrackingNumber() {
		return this.trackingNumber;
	}

	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	@JsonProperty("AuditInfo")
	protected AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	@JsonProperty("DestinationAddress")
	protected Contact destinationAddress;

	public Contact getDestinationAddress() {
		return this.destinationAddress;
	}

	public void setDestinationAddress(Contact destinationAddress) {
		this.destinationAddress = destinationAddress;
	}

	/**
	*The physical address from which the order shipment will be sent.
	*/
	@JsonProperty("OriginAddress")
	protected Contact originAddress;

	public Contact getOriginAddress() {
		return this.originAddress;
	}

	public void setOriginAddress(Contact originAddress) {
		this.originAddress = originAddress;
	}

}
