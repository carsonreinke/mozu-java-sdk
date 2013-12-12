/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.customer;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import com.mozu.api.contracts.customer.CustomerAttribute;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.customer.CommerceSummary;
import com.mozu.api.contracts.customer.CustomerContact;
import com.mozu.api.contracts.customer.CustomerGroup;
import com.mozu.api.contracts.customer.CustomerNote;

/**
 *	Properties of the customer account.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerAccount implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * If true, the customer prefers to receive marketing material such as newsletters or email offers.
	 */
	protected Boolean acceptsMarketing;

	public Boolean getAcceptsMarketing() {
		return this.acceptsMarketing;
	}

	public void setAcceptsMarketing(Boolean acceptsMarketing) {
		this.acceptsMarketing = acceptsMarketing;
	}

	/**
	 * The legal or doing business as (DBA) or tradestyle name of the business or organization. The maximum character length is 200.
	 */
	protected String companyOrOrganization;

	public String getCompanyOrOrganization() {
		return this.companyOrOrganization;
	}

	public void setCompanyOrOrganization(String companyOrOrganization) {
		this.companyOrOrganization = companyOrOrganization;
	}

	protected String emailAddress;

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	protected String externalId;

	public String getExternalId() {
		return this.externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	protected String firstName;

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Identifier of the entity.
	 */
	protected Integer id;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	protected String lastName;

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	protected String localeCode;

	public String getLocaleCode() {
		return this.localeCode;
	}

	public void setLocaleCode(String localeCode) {
		this.localeCode = localeCode;
	}

	/**
	 * If true, this customer account has tax exempt status.
	 */
	protected Boolean taxExempt;

	public Boolean getTaxExempt() {
		return this.taxExempt;
	}

	public void setTaxExempt(Boolean taxExempt) {
		this.taxExempt = taxExempt;
	}

	/**
	 * The tax identification number associated with the customer account.
	 */
	protected String taxId;

	public String getTaxId() {
		return this.taxId;
	}

	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}

	/**
	 * Unique identifier of the user associated with the customer account.
	 */
	protected String userId;

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	protected String userName;

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * Collection of customer account attributes.
	 */
	protected List<CustomerAttribute> attributes;
	public List<CustomerAttribute> getAttributes() {
		return this.attributes;
	}
	public void setAttributes(List<CustomerAttribute> attributes) {
		this.attributes = attributes;
	}

	/**
	 * Identifier and datetime stamp information recorded when a user or application creates, updates, or deletes a resource entity. This value is system-supplied and read-only.
	 */
	protected AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	/**
	 * Properties of the commerce summary associated with a customer account, which includes details about the shopper's most recent order, wish lists, and total order value over time.
	 */
	protected CommerceSummary commerceSummary;

	public CommerceSummary getCommerceSummary() {
		return this.commerceSummary;
	}

	public void setCommerceSummary(CommerceSummary commerceSummary) {
		this.commerceSummary = commerceSummary;
	}

	/**
	 * Contact information, including the contact's name, address, phone numbers, email addresses, and company (if supplied). Also indicates whether this is a billing, shipping, or billing and shipping contact.
	 */
	protected List<CustomerContact> contacts;
	public List<CustomerContact> getContacts() {
		return this.contacts;
	}
	public void setContacts(List<CustomerContact> contacts) {
		this.contacts = contacts;
	}

	/**
	 * List of groups associated with this customer account.
	 */
	protected List<CustomerGroup> groups;
	public List<CustomerGroup> getGroups() {
		return this.groups;
	}
	public void setGroups(List<CustomerGroup> groups) {
		this.groups = groups;
	}

	/**
	 * List of customer account notes.
	 */
	protected List<CustomerNote> notes;
	public List<CustomerNote> getNotes() {
		return this.notes;
	}
	public void setNotes(List<CustomerNote> notes) {
		this.notes = notes;
	}

}
