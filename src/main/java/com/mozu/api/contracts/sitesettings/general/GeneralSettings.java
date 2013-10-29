
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.contracts.sitesettings.general;

import java.util.ArrayList;
import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.sitesettings.general.TaxableTerritory;


/**
*	General settings used on the storefront site.
*/
public class GeneralSettings implements Serializable
{
	/** Default Serial Version UID  */
	private static final long serialVersionUID = 1L;

	/**
	*If true, the site allows entry of addresses not verified by an address validation service.
	*/
	@JsonProperty("AllowInvalidAddresses")
	protected Boolean allowInvalidAddresses;

	public Boolean getAllowInvalidAddresses() {
		return this.allowInvalidAddresses;
	}

	public void setAllowInvalidAddresses(Boolean allowInvalidAddresses) {
		this.allowInvalidAddresses = allowInvalidAddresses;
	}

	/**
	*The physical directory path or URL where the mobile favicon image file is stored. The favicon icon is generally 57x57 pixels. The icon appears on a mobile website or on the mobile device's OS Home.
	*/
	@JsonProperty("FavIconMobilePath")
	protected String favIconMobilePath;

	public String getFavIconMobilePath() {
		return this.favIconMobilePath;
	}

	public void setFavIconMobilePath(String favIconMobilePath) {
		this.favIconMobilePath = favIconMobilePath;
	}

	/**
	*The physical directory path or URL where the mobile favicon image file is stored. The favicon icon is generally 16x16 pixels. The icon appears on a a browser tab as the website's mini logo or on a browser address bar, or next to the page name in a list of bookmarks.
	*/
	@JsonProperty("FavIconPath")
	protected String favIconPath;

	public String getFavIconPath() {
		return this.favIconPath;
	}

	public void setFavIconPath(String favIconPath) {
		this.favIconPath = favIconPath;
	}

	/**
	*The Google Analytics code associated with a particular store. This could be the web tracking code.
	*/
	@JsonProperty("GoogleAnalyticsCode")
	protected String googleAnalyticsCode;

	public String getGoogleAnalyticsCode() {
		return this.googleAnalyticsCode;
	}

	public void setGoogleAnalyticsCode(String googleAnalyticsCode) {
		this.googleAnalyticsCode = googleAnalyticsCode;
	}

	/**
	*If true, a service to verify addresses as valid is enabled for the site.
	*/
	@JsonProperty("IsAddressValidationEnabled")
	protected Boolean isAddressValidationEnabled;

	public Boolean getIsAddressValidationEnabled() {
		return this.isAddressValidationEnabled;
	}

	public void setIsAddressValidationEnabled(Boolean isAddressValidationEnabled) {
		this.isAddressValidationEnabled = isAddressValidationEnabled;
	}

	/**
	*If true, the Google analytics for eCommerce is enabled for this site. If false, the analytics are not enabled.
	*/
	@JsonProperty("IsGoogleAnalyticsEcommerceEnabled")
	protected Boolean isGoogleAnalyticsEcommerceEnabled;

	public Boolean getIsGoogleAnalyticsEcommerceEnabled() {
		return this.isGoogleAnalyticsEcommerceEnabled;
	}

	public void setIsGoogleAnalyticsEcommerceEnabled(Boolean isGoogleAnalyticsEcommerceEnabled) {
		this.isGoogleAnalyticsEcommerceEnabled = isGoogleAnalyticsEcommerceEnabled;
	}

	/**
	*If true, enable Google analytics for this site. If false, analytics are not enabled.
	*/
	@JsonProperty("IsGoogleAnalyticsEnabled")
	protected Boolean isGoogleAnalyticsEnabled;

	public Boolean getIsGoogleAnalyticsEnabled() {
		return this.isGoogleAnalyticsEnabled;
	}

	public void setIsGoogleAnalyticsEnabled(Boolean isGoogleAnalyticsEnabled) {
		this.isGoogleAnalyticsEnabled = isGoogleAnalyticsEnabled;
	}

	/**
	*They physical directory path or URL where the website logo is stored.
	*/
	@JsonProperty("LogoPath")
	protected String logoPath;

	public String getLogoPath() {
		return this.logoPath;
	}

	public void setLogoPath(String logoPath) {
		this.logoPath = logoPath;
	}

	/**
	*The tagline or text that appears when hovering over the site logo.
	*/
	@JsonProperty("LogoText")
	protected String logoText;

	public String getLogoText() {
		return this.logoText;
	}

	public void setLogoText(String logoText) {
		this.logoText = logoText;
	}

	/**
	*The mobile theme is the storefront name for the theme.
	*/
	@JsonProperty("MobileTheme")
	protected String mobileTheme;

	public String getMobileTheme() {
		return this.mobileTheme;
	}

	public void setMobileTheme(String mobileTheme) {
		this.mobileTheme = mobileTheme;
	}

	/**
	*Email address to display on email messages sent from the site.
	*/
	@JsonProperty("ReplyToEmailAddress")
	protected String replyToEmailAddress;

	public String getReplyToEmailAddress() {
		return this.replyToEmailAddress;
	}

	public void setReplyToEmailAddress(String replyToEmailAddress) {
		this.replyToEmailAddress = replyToEmailAddress;
	}

	/**
	*Email address to set up so that shoppers and users browsing the site can use to contact the merchant.
	*/
	@JsonProperty("SenderEmailAddress")
	protected String senderEmailAddress;

	public String getSenderEmailAddress() {
		return this.senderEmailAddress;
	}

	public void setSenderEmailAddress(String senderEmailAddress) {
		this.senderEmailAddress = senderEmailAddress;
	}

	/**
	*Choose a format to use on the site: 12-hour (hh:mm:ss tt) or 24-hour format (HH:mm:ss).
	*/
	@JsonProperty("SiteTimeFormat")
	protected String siteTimeFormat;

	public String getSiteTimeFormat() {
		return this.siteTimeFormat;
	}

	public void setSiteTimeFormat(String siteTimeFormat) {
		this.siteTimeFormat = siteTimeFormat;
	}

	/**
	*Choose the time zone to use for the site.
	*/
	@JsonProperty("SiteTimeZone")
	protected String siteTimeZone;

	public String getSiteTimeZone() {
		return this.siteTimeZone;
	}

	public void setSiteTimeZone(String siteTimeZone) {
		this.siteTimeZone = siteTimeZone;
	}

	/**
	*The name of the theme used on the storefront.
	*/
	@JsonProperty("Theme")
	protected String theme;

	public String getTheme() {
		return this.theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	/**
	*The name of the website to display on the storefront with no spaces.
	*/
	@JsonProperty("WebsiteName")
	protected String websiteName;

	public String getWebsiteName() {
		return this.websiteName;
	}

	public void setWebsiteName(String websiteName) {
		this.websiteName = websiteName;
	}

	/**
	*Identifier and datetime stamp information recorded when creating or updating a resource entity. This value is system-supplied and read-only.
	*/
	@JsonProperty("AuditInfo")
	protected AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	/**
	*The territories configured for the site that are subject to sales tax.
	*/
	@JsonProperty("TaxableTerritories")
	protected ArrayList<TaxableTerritory> taxableTerritories;
	public ArrayList<TaxableTerritory> getTaxableTerritories() {
		return this.taxableTerritories;
	}
	public void setTaxableTerritories(ArrayList<TaxableTerritory> taxableTerritories) {
		this.taxableTerritories = taxableTerritories;
	}

}