
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.contracts.productadmin;

import java.util.ArrayList;
import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice;
import com.mozu.api.contracts.productadmin.ProductVariationOption;
import com.mozu.api.contracts.productadmin.StockOnHandAdjustment;


/**
*	Properties of a specific product variation.
*/
public class ProductVariation implements Serializable
{
	/** Default Serial Version UID  */
	private static final long serialVersionUID = 1L;

	/**
	*The difference between the base weight for a product and this variation of the product, which can be a positive or negative decimal value.
	*/
	@JsonProperty("DeltaWeight")
	protected Double deltaWeight;

	public Double getDeltaWeight() {
		return this.deltaWeight;
	}

	public void setDeltaWeight(Double deltaWeight) {
		this.deltaWeight = deltaWeight;
	}

	/**
	*If true, this variation of this product is marked available for sale.
	*/
	@JsonProperty("IsActive")
	protected Boolean isActive;

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	/**
	*If true, the production variation is no longer available for sale. For example, if a merchant stops selling all "small" shirts, all product variations with the "small" option are set to IsOrphan. System-supplied and read-only.
	*/
	@JsonProperty("IsOrphan")
	protected Boolean isOrphan;

	public Boolean getIsOrphan() {
		return this.isOrphan;
	}

	public void setIsOrphan(Boolean isOrphan) {
		this.isOrphan = isOrphan;
	}

	/**
	*The number of product variations currently available in inventory.
	*/
	@JsonProperty("StockOnHand")
	protected Integer stockOnHand;

	public Integer getStockOnHand() {
		return this.stockOnHand;
	}

	public void setStockOnHand(Integer stockOnHand) {
		this.stockOnHand = stockOnHand;
	}

	/**
	*The number of product variations that are unavailable for current purchase, but placed on back order so that the shopper's order can still be fulfilled, for example, by dropshipping or just waiting for stock to be available again.
	*/
	@JsonProperty("StockOnOrder")
	protected Integer stockOnOrder;

	public Integer getStockOnOrder() {
		return this.stockOnOrder;
	}

	public void setStockOnOrder(Integer stockOnOrder) {
		this.stockOnOrder = stockOnOrder;
	}

	/**
	*If true, one or more product variations are configured for the specified product code.
	*/
	@JsonProperty("VariationExists")
	protected Boolean variationExists;

	public Boolean getVariationExists() {
		return this.variationExists;
	}

	public void setVariationExists(Boolean variationExists) {
		this.variationExists = variationExists;
	}

	/**
	*System-generated key that represents the attribute values that uniquely identify a specific product variation.
	*/
	@JsonProperty("Variationkey")
	protected String variationkey;

	public String getVariationkey() {
		return this.variationkey;
	}

	public void setVariationkey(String variationkey) {
		this.variationkey = variationkey;
	}

	/**
	*Merchant-created code associated with a specific product variation. Variation product codes maintain an association with the base product code.
	*/
	@JsonProperty("VariationProductCode")
	protected String variationProductCode;

	public String getVariationProductCode() {
		return this.variationProductCode;
	}

	public void setVariationProductCode(String variationProductCode) {
		this.variationProductCode = variationProductCode;
	}

	/**
	*The difference between the base price for the product and this variation of the product, which can be a positive or negative decimal value. For example, if the base price for a t-shirt product is $10, but the XL variation should cost $12, the DeltaPrice value should be "2". However, if the XS variation should only cost $8, the DeltaPrice value should be "-2".
	*/
	@JsonProperty("DeltaPrice")
	protected ProductVariationDeltaPrice deltaPrice;

	public ProductVariationDeltaPrice getDeltaPrice() {
		return this.deltaPrice;
	}

	public void setDeltaPrice(ProductVariationDeltaPrice deltaPrice) {
		this.deltaPrice = deltaPrice;
	}

	/**
	*Wrapper for the list of option attributes configured for the product variation.
	*/
	@JsonProperty("Options")
	protected ArrayList<ProductVariationOption> options;
	public ArrayList<ProductVariationOption> getOptions() {
		return this.options;
	}
	public void setOptions(ArrayList<ProductVariationOption> options) {
		this.options = options;
	}

	/**
	*The change made to the number of product variations currently available in inventory.
	*/
	@JsonProperty("StockOnHandAdjustment")
	protected StockOnHandAdjustment stockOnHandAdjustment;

	public StockOnHandAdjustment getStockOnHandAdjustment() {
		return this.stockOnHandAdjustment;
	}

	public void setStockOnHandAdjustment(StockOnHandAdjustment stockOnHandAdjustment) {
		this.stockOnHandAdjustment = stockOnHandAdjustment;
	}

}