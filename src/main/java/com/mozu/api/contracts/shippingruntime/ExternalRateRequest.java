
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

import com.mozu.api.contracts.shippingruntime.CarrierMethods;
import com.mozu.api.contracts.shippingruntime.CustomAttribute;
import com.mozu.api.contracts.core.Address;
import com.mozu.api.contracts.shippingruntime.RateRequestItem;


/**
*	Properties of a shipping rate calculation request to retrieve from an external application, including carrier and address information.
*/
public class ExternalRateRequest implements Serializable
{
	/** Default Serial Version UID  */
	private static final long serialVersionUID = 1L;

	protected Date estimatedShipmentDate;

	public Date getEstimatedShipmentDate() {
		return this.estimatedShipmentDate;
	}

	public void setEstimatedShipmentDate(Date estimatedShipmentDate) {
		this.estimatedShipmentDate = estimatedShipmentDate;
	}

	/**
	*If true, the destination shipping address is a commercial address.
	*/
	protected Boolean isDestinationAddressCommercial;

	public Boolean getIsDestinationAddressCommercial() {
		return this.isDestinationAddressCommercial;
	}

	public void setIsDestinationAddressCommercial(Boolean isDestinationAddressCommercial) {
		this.isDestinationAddressCommercial = isDestinationAddressCommercial;
	}

	protected String iSOCurrencyCode;

	public String getISOCurrencyCode() {
		return this.iSOCurrencyCode;
	}

	public void setISOCurrencyCode(String iSOCurrencyCode) {
		this.iSOCurrencyCode = iSOCurrencyCode;
	}

	/**
	*The total amount of the order associated with this shipping rate request.
	*/
	protected Double orderTotal;

	public Double getOrderTotal() {
		return this.orderTotal;
	}

	public void setOrderTotal(Double orderTotal) {
		this.orderTotal = orderTotal;
	}

	/**
	*Array list of shipping carriers and the rate to calculate for each request.
	*/
	protected List<CarrierMethods> carrierRates;
	public List<CarrierMethods> getCarrierRates() {
		return this.carrierRates;
	}
	public void setCarrierRates(List<CarrierMethods> carrierRates) {
		this.carrierRates = carrierRates;
	}

	protected List<CustomAttribute> customAttributes;
	public List<CustomAttribute> getCustomAttributes() {
		return this.customAttributes;
	}
	public void setCustomAttributes(List<CustomAttribute> customAttributes) {
		this.customAttributes = customAttributes;
	}

	/**
	*The final destination address to which the package will ship.
	*/
	protected Address destinationAddress;

	public Address getDestinationAddress() {
		return this.destinationAddress;
	}

	public void setDestinationAddress(Address destinationAddress) {
		this.destinationAddress = destinationAddress;
	}

	protected List<RateRequestItem> items;
	public List<RateRequestItem> getItems() {
		return this.items;
	}
	public void setItems(List<RateRequestItem> items) {
		this.items = items;
	}

	/**
	*The origin address from which packages will ship.
	*/
	protected Address originAddress;

	public Address getOriginAddress() {
		return this.originAddress;
	}

	public void setOriginAddress(Address originAddress) {
		this.originAddress = originAddress;
	}

}
