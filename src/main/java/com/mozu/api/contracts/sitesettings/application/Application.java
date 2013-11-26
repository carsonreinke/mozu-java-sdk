/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.sitesettings.application;

import java.util.List;
import java.io.Serializable;
import java.util.Date;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.core.thirdparty.Capability;
import com.mozu.api.contracts.tenant.Entitlement;

public class Application implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected String appId;

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	protected Boolean enabled;

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	protected Boolean initialized;

	public Boolean getInitialized() {
		return this.initialized;
	}

	public void setInitialized(Boolean initialized) {
		this.initialized = initialized;
	}

	protected String uiConfigurationUrl;

	public String getUiConfigurationUrl() {
		return this.uiConfigurationUrl;
	}

	public void setUiConfigurationUrl(String uiConfigurationUrl) {
		this.uiConfigurationUrl = uiConfigurationUrl;
	}

	protected AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	protected List<Capability> capabilities;
	public List<Capability> getCapabilities() {
		return this.capabilities;
	}
	public void setCapabilities(List<Capability> capabilities) {
		this.capabilities = capabilities;
	}

	protected Entitlement entitlement;

	public Entitlement getEntitlement() {
		return this.entitlement;
	}

	public void setEntitlement(Entitlement entitlement) {
		this.entitlement = entitlement;
	}

}
