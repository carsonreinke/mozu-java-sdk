/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.productadmin.ProductLocalizedImage;

/**
 *	The localized product content in the language specified by the LocaleCode.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductLocalizedContent implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Language used for the entity. Currently, only "en-US" is supported.
	 */
	protected String localeCode;

	public String getLocaleCode() {
		return this.localeCode;
	}

	public void setLocaleCode(String localeCode) {
		this.localeCode = localeCode;
	}

	/**
	 * More detailed or full product description typically used for a product details page.
	 */
	protected String productFullDescription;

	public String getProductFullDescription() {
		return this.productFullDescription;
	}

	public void setProductFullDescription(String productFullDescription) {
		this.productFullDescription = productFullDescription;
	}

	/**
	 * The descriptive brief product name.
	 */
	protected String productName;

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * Brief description of the product typically used when the product is displayed in a list or in search results.
	 */
	protected String productShortDescription;

	public String getProductShortDescription() {
		return this.productShortDescription;
	}

	public void setProductShortDescription(String productShortDescription) {
		this.productShortDescription = productShortDescription;
	}

	/**
	 * List of product images associated with a product.
	 */
	protected List<ProductLocalizedImage> productImages;
	public List<ProductLocalizedImage> getProductImages() {
		return this.productImages;
	}
	public void setProductImages(List<ProductLocalizedImage> productImages) {
		this.productImages = productImages;
	}

}
