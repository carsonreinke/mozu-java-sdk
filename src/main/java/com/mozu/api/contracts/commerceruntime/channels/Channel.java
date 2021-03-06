/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.channels;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.core.AuditInfo;

/**
 *	Properties of a channel used to divide a company into logical business divisions, such as "US Retail," "US Online," or "Amazon." All sites and orders are associated with a channel.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Channel implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * User-defined code that uniquely identifies the channel.
	 */
	protected String code;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	protected String countryCode;

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/**
	 * User-defined code that identifies the channel group.
	 */
	protected String groupCode;

	public String getGroupCode() {
		return this.groupCode;
	}

	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}

	/**
	 * User-defined name of the channel.
	 */
	protected String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The geographical region associated with this channel. This region could represent any geographical entity from a state to a continent.
	 */
	protected String region;

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 * Array list of site identifiers associated with this channel. Each tenant site must have a channel association.
	 */
	protected List<Integer> siteIds;
	public List<Integer> getSiteIds() {
		return this.siteIds;
	}
	public void setSiteIds(List<Integer> siteIds) {
		this.siteIds = siteIds;
	}

	/**
	 * Unique identifier of the Mozu tenant.
	 */
	protected Integer tenantId;

	public Integer getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
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

}
