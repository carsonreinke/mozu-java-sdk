/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.sitesettings.application;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.core.thirdparty.Capability;
import com.mozu.api.contracts.tenant.Entitlement;

/**
 *	Properties of an application installed in a tenant.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Application implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The unique identifier of the application in Mozu Dev Center.
	 */
	protected String appId;

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	/**
	 * If true, the application is enabled for the tenant. System-supplied and read-only.
	 */
	protected Boolean enabled;

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * If true, the third party application settings have been configured and the application is initialized.
	 */
	protected Boolean initialized;

	public Boolean getInitialized() {
		return this.initialized;
	}

	public void setInitialized(Boolean initialized) {
		this.initialized = initialized;
	}

	protected Boolean isExtension;

	public Boolean getIsExtension() {
		return this.isExtension;
	}

	public void setIsExtension(Boolean isExtension) {
		this.isExtension = isExtension;
	}

	/**
	 * URL of the application's setting configuration user interface, supplied by the capability developer in Dev Center.
	 */
	protected String uiConfigurationUrl;

	public String getUiConfigurationUrl() {
		return this.uiConfigurationUrl;
	}

	public void setUiConfigurationUrl(String uiConfigurationUrl) {
		this.uiConfigurationUrl = uiConfigurationUrl;
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
	 * List of capabilities installed in a tenant.
	 */
	protected List<Capability> capabilities;
	public List<Capability> getCapabilities() {
		return this.capabilities;
	}
	public void setCapabilities(List<Capability> capabilities) {
		this.capabilities = capabilities;
	}

	/**
	 * Properties of the application entitlement record, including the merchant it is licensed to and the duration of the license.
	 */
	protected Entitlement entitlement;

	public Entitlement getEntitlement() {
		return this.entitlement;
	}

	public void setEntitlement(Entitlement entitlement) {
		this.entitlement = entitlement;
	}

}
