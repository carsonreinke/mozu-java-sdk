/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.appdev;

import java.util.List;
import java.io.Serializable;
import java.util.Date;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.appdev.ApplicationVersion;

public class Application implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected String applicationType;

	public String getApplicationType() {
		return this.applicationType;
	}

	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
	}

	protected Integer id;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	protected String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	protected List<ApplicationVersion> versions;
	public List<ApplicationVersion> getVersions() {
		return this.versions;
	}
	public void setVersions(List<ApplicationVersion> versions) {
		this.versions = versions;
	}

}