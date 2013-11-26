/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.util.List;
import java.io.Serializable;
import java.util.Date;
import com.mozu.api.contracts.core.Measurement;
import com.mozu.api.contracts.productadmin.Discount;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.productadmin.ProductLocalizedContent;
import com.mozu.api.contracts.productadmin.ProductExtra;
import com.mozu.api.contracts.productadmin.ProductInventoryInfo;
import com.mozu.api.contracts.productadmin.ProductOption;
import com.mozu.api.contracts.productadmin.ProductPrice;
import com.mozu.api.contracts.productadmin.ProductInCatalogInfo;
import com.mozu.api.contracts.productadmin.ProductProperty;
import com.mozu.api.contracts.productadmin.ProductPublishingInfo;
import com.mozu.api.contracts.productadmin.ProductLocalizedSEOContent;
import com.mozu.api.contracts.productadmin.ProductVariationOption;

public class Product implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected String baseProductCode;

	public String getBaseProductCode() {
		return this.baseProductCode;
	}

	public void setBaseProductCode(String baseProductCode) {
		this.baseProductCode = baseProductCode;
	}

	protected Boolean hasConfigurableOptions;

	public Boolean getHasConfigurableOptions() {
		return this.hasConfigurableOptions;
	}

	public void setHasConfigurableOptions(Boolean hasConfigurableOptions) {
		this.hasConfigurableOptions = hasConfigurableOptions;
	}

	protected Boolean hasStandAloneOptions;

	public Boolean getHasStandAloneOptions() {
		return this.hasStandAloneOptions;
	}

	public void setHasStandAloneOptions(Boolean hasStandAloneOptions) {
		this.hasStandAloneOptions = hasStandAloneOptions;
	}

	protected Boolean isPackagedStandAlone;

	public Boolean getIsPackagedStandAlone() {
		return this.isPackagedStandAlone;
	}

	public void setIsPackagedStandAlone(Boolean isPackagedStandAlone) {
		this.isPackagedStandAlone = isPackagedStandAlone;
	}

	protected Boolean isRecurring;

	public Boolean getIsRecurring() {
		return this.isRecurring;
	}

	public void setIsRecurring(Boolean isRecurring) {
		this.isRecurring = isRecurring;
	}

	protected Boolean isTaxable;

	public Boolean getIsTaxable() {
		return this.isTaxable;
	}

	public void setIsTaxable(Boolean isTaxable) {
		this.isTaxable = isTaxable;
	}

	protected Boolean isValidForProductType;

	public Boolean getIsValidForProductType() {
		return this.isValidForProductType;
	}

	public void setIsValidForProductType(Boolean isValidForProductType) {
		this.isValidForProductType = isValidForProductType;
	}

	protected Boolean isVariation;

	public Boolean getIsVariation() {
		return this.isVariation;
	}

	public void setIsVariation(Boolean isVariation) {
		this.isVariation = isVariation;
	}

	protected Integer masterCatalogId;

	public Integer getMasterCatalogId() {
		return this.masterCatalogId;
	}

	public void setMasterCatalogId(Integer masterCatalogId) {
		this.masterCatalogId = masterCatalogId;
	}

	protected String productCode;

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	protected Integer productSequence;

	public Integer getProductSequence() {
		return this.productSequence;
	}

	public void setProductSequence(Integer productSequence) {
		this.productSequence = productSequence;
	}

	protected Integer productTypeId;

	public Integer getProductTypeId() {
		return this.productTypeId;
	}

	public void setProductTypeId(Integer productTypeId) {
		this.productTypeId = productTypeId;
	}

	protected Integer shippingClassId;

	public Integer getShippingClassId() {
		return this.shippingClassId;
	}

	public void setShippingClassId(Integer shippingClassId) {
		this.shippingClassId = shippingClassId;
	}

	protected String standAlonePackageType;

	public String getStandAlonePackageType() {
		return this.standAlonePackageType;
	}

	public void setStandAlonePackageType(String standAlonePackageType) {
		this.standAlonePackageType = standAlonePackageType;
	}

	protected String upc;

	public String getUpc() {
		return this.upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	protected String variationKey;

	public String getVariationKey() {
		return this.variationKey;
	}

	public void setVariationKey(String variationKey) {
		this.variationKey = variationKey;
	}

	protected Measurement packageLength;

	public Measurement getPackageLength() {
		return this.packageLength;
	}

	public void setPackageLength(Measurement packageLength) {
		this.packageLength = packageLength;
	}

	protected List<Discount> applicableDiscounts;
	public List<Discount> getApplicableDiscounts() {
		return this.applicableDiscounts;
	}
	public void setApplicableDiscounts(List<Discount> applicableDiscounts) {
		this.applicableDiscounts = applicableDiscounts;
	}

	protected AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	protected ProductLocalizedContent content;

	public ProductLocalizedContent getContent() {
		return this.content;
	}

	public void setContent(ProductLocalizedContent content) {
		this.content = content;
	}

	protected List<ProductExtra> extras;
	public List<ProductExtra> getExtras() {
		return this.extras;
	}
	public void setExtras(List<ProductExtra> extras) {
		this.extras = extras;
	}

	protected ProductInventoryInfo inventoryInfo;

	public ProductInventoryInfo getInventoryInfo() {
		return this.inventoryInfo;
	}

	public void setInventoryInfo(ProductInventoryInfo inventoryInfo) {
		this.inventoryInfo = inventoryInfo;
	}

	protected List<ProductOption> options;
	public List<ProductOption> getOptions() {
		return this.options;
	}
	public void setOptions(List<ProductOption> options) {
		this.options = options;
	}

	protected Measurement packageHeight;

	public Measurement getPackageHeight() {
		return this.packageHeight;
	}

	public void setPackageHeight(Measurement packageHeight) {
		this.packageHeight = packageHeight;
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

	protected List<ProductInCatalogInfo> productInCatalogs;
	public List<ProductInCatalogInfo> getProductInCatalogs() {
		return this.productInCatalogs;
	}
	public void setProductInCatalogs(List<ProductInCatalogInfo> productInCatalogs) {
		this.productInCatalogs = productInCatalogs;
	}

	protected List<ProductProperty> properties;
	public List<ProductProperty> getProperties() {
		return this.properties;
	}
	public void setProperties(List<ProductProperty> properties) {
		this.properties = properties;
	}

	protected ProductPublishingInfo publishingInfo;

	public ProductPublishingInfo getPublishingInfo() {
		return this.publishingInfo;
	}

	public void setPublishingInfo(ProductPublishingInfo publishingInfo) {
		this.publishingInfo = publishingInfo;
	}

	protected ProductLocalizedSEOContent seoContent;

	public ProductLocalizedSEOContent getSeoContent() {
		return this.seoContent;
	}

	public void setSeoContent(ProductLocalizedSEOContent seoContent) {
		this.seoContent = seoContent;
	}

	protected List<ProductVariationOption> variationOptions;
	public List<ProductVariationOption> getVariationOptions() {
		return this.variationOptions;
	}
	public void setVariationOptions(List<ProductVariationOption> variationOptions) {
		this.variationOptions = variationOptions;
	}

}
