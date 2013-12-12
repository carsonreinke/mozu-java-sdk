/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import com.mozu.api.contracts.core.Measurement;
import com.mozu.api.contracts.productadmin.ProductPrice;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BundledProduct implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected String productCode;

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	protected String productName;

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	protected Integer quantity;

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	protected Measurement packageHeight;

	public Measurement getPackageHeight() {
		return this.packageHeight;
	}

	public void setPackageHeight(Measurement packageHeight) {
		this.packageHeight = packageHeight;
	}

	protected Measurement packageLength;

	public Measurement getPackageLength() {
		return this.packageLength;
	}

	public void setPackageLength(Measurement packageLength) {
		this.packageLength = packageLength;
	}

	protected Measurement packageWeight;

	public Measurement getPackageWeight() {
		return this.packageWeight;
	}

	public void setPackageWeight(Measurement packageWeight) {
		this.packageWeight = packageWeight;
	}

	protected Measurement packageWidth;

	public Measurement getPackageWidth() {
		return this.packageWidth;
	}

	public void setPackageWidth(Measurement packageWidth) {
		this.packageWidth = packageWidth;
	}

	protected ProductPrice price;

	public ProductPrice getPrice() {
		return this.price;
	}

	public void setPrice(ProductPrice price) {
		this.price = price;
	}

}
