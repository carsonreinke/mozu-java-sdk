/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.products;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.commerceruntime.products.BundledProduct;
import com.mozu.api.contracts.commerceruntime.products.Category;
import com.mozu.api.contracts.commerceruntime.commerce.PackageMeasurements;
import com.mozu.api.contracts.commerceruntime.products.ProductOption;
import com.mozu.api.contracts.commerceruntime.products.ProductPrice;
import com.mozu.api.contracts.commerceruntime.products.ProductProperty;

/**
 *	Properties of a product set up in admin and added as an item in a cart or order.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 */
	protected String productCode;

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	/**
	 * Short description of the product in the language specified in the locale code for the storefront.
	 */
	protected String description;

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * The alternate image description defined for the product, in the language specified in the locale code for the storefront.
	 */
	protected String imageAlternateText;

	public String getImageAlternateText() {
		return this.imageAlternateText;
	}

	public void setImageAlternateText(String imageAlternateText) {
		this.imageAlternateText = imageAlternateText;
	}

	protected String imageUrl;

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	protected Boolean isPackagedStandAlone;

	public Boolean getIsPackagedStandAlone() {
		return this.isPackagedStandAlone;
	}

	public void setIsPackagedStandAlone(Boolean isPackagedStandAlone) {
		this.isPackagedStandAlone = isPackagedStandAlone;
	}

	/**
	 * If true, the product can be purchased or fulfilled at regular intervals such as a monthly billing cycle or a digital or physical subscription.
	 */
	protected Boolean isRecurring;

	public Boolean getIsRecurring() {
		return this.isRecurring;
	}

	public void setIsRecurring(Boolean isRecurring) {
		this.isRecurring = isRecurring;
	}

	/**
	 * If true, the entity is subject to sales tax based on the relevant tax rate.
	 */
	protected Boolean isTaxable;

	public Boolean getIsTaxable() {
		return this.isTaxable;
	}

	public void setIsTaxable(Boolean isTaxable) {
		this.isTaxable = isTaxable;
	}

	/**
	 * The name of the product that appears on the storefront.
	 */
	protected String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected Integer productReservationId;

	public Integer getProductReservationId() {
		return this.productReservationId;
	}

	public void setProductReservationId(Integer productReservationId) {
		this.productReservationId = productReservationId;
	}

	/**
	 * The product type template associated with the product on the storefront.
	 */
	protected String productType;

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	protected String productUsage;

	public String getProductUsage() {
		return this.productUsage;
	}

	public void setProductUsage(String productUsage) {
		this.productUsage = productUsage;
	}

	/**
	 * Merchant-created code associated with a specific product variation. Variation product codes maintain an association with the base product code.
	 */
	protected String variationProductCode;

	public String getVariationProductCode() {
		return this.variationProductCode;
	}

	public void setVariationProductCode(String variationProductCode) {
		this.variationProductCode = variationProductCode;
	}

	protected List<BundledProduct> bundledProducts;
	public List<BundledProduct> getBundledProducts() {
		return this.bundledProducts;
	}
	public void setBundledProducts(List<BundledProduct> bundledProducts) {
		this.bundledProducts = bundledProducts;
	}

	/**
	 * The list of all categories associated with the product.
	 */
	protected List<Category> categories;
	public List<Category> getCategories() {
		return this.categories;
	}
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	/**
	 * Dimensions of the packaged product.
	 */
	protected PackageMeasurements measurements;

	public PackageMeasurements getMeasurements() {
		return this.measurements;
	}

	public void setMeasurements(PackageMeasurements measurements) {
		this.measurements = measurements;
	}

	/**
	 * The list of option attributes configured for the product.
	 */
	protected List<ProductOption> options;
	public List<ProductOption> getOptions() {
		return this.options;
	}
	public void setOptions(List<ProductOption> options) {
		this.options = options;
	}

	/**
	 * The price of the product that appears on the storefront including any applied discounts.
	 */
	protected ProductPrice price;

	public ProductPrice getPrice() {
		return this.price;
	}

	public void setPrice(ProductPrice price) {
		this.price = price;
	}

	protected List<ProductProperty> properties;
	public List<ProductProperty> getProperties() {
		return this.properties;
	}
	public void setProperties(List<ProductProperty> properties) {
		this.properties = properties;
	}

}
