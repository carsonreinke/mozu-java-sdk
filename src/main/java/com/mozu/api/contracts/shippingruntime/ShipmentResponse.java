
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.contracts.shippingruntime;

import java.util.List;
import java.io.Serializable;
import java.util.Date;

import com.mozu.api.contracts.shippingruntime.CustomAttribute;
import com.mozu.api.contracts.shippingruntime.Notification;
import com.mozu.api.contracts.shippingruntime.PackageResponse;
import com.mozu.api.contracts.shippingruntime.Money;


/**
*	Properties of the shipping label information generated for the shipment.
*/
public class ShipmentResponse implements Serializable
{
	/** Default Serial Version UID  */
	private static final long serialVersionUID = 1L;

	/**
	*If true, the shipment request for shipping label generation was successful. Unsuccessful requests include logged messages.
	*/
	protected Boolean isSuccessful;

	public Boolean getIsSuccessful() {
		return this.isSuccessful;
	}

	public void setIsSuccessful(Boolean isSuccessful) {
		this.isSuccessful = isSuccessful;
	}

	/**
	*The tracking code associated with the package shipping label.
	*/
	protected String trackingNumber;

	public String getTrackingNumber() {
		return this.trackingNumber;
	}

	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	/**
	*Collection of carrier-specific key-value attribute pairs returned for the generated shipping label.
	*/
	protected List<CustomAttribute> customAttributes;
	public List<CustomAttribute> getCustomAttributes() {
		return this.customAttributes;
	}
	public void setCustomAttributes(List<CustomAttribute> customAttributes) {
		this.customAttributes = customAttributes;
	}

	/**
	*Collection of messages returned for the shipment request, including any success failure notifications.
	*/
	protected List<Notification> messages;
	public List<Notification> getMessages() {
		return this.messages;
	}
	public void setMessages(List<Notification> messages) {
		this.messages = messages;
	}

	/**
	*Collection of responses for each package, which includes the shipping label image.
	*/
	protected List<PackageResponse> packageResponses;
	public List<PackageResponse> getPackageResponses() {
		return this.packageResponses;
	}
	public void setPackageResponses(List<PackageResponse> packageResponses) {
		this.packageResponses = packageResponses;
	}

	/**
	*The calculated shipping total based on the supplied currency code and amount.
	*/
	protected Money shippingTotal;

	public Money getShippingTotal() {
		return this.shippingTotal;
	}

	public void setShippingTotal(Money shippingTotal) {
		this.shippingTotal = shippingTotal;
	}

}
