/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.customer;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LoginState implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected Date createdOn;

	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	protected Integer failedLoginAttemptCount;

	public Integer getFailedLoginAttemptCount() {
		return this.failedLoginAttemptCount;
	}

	public void setFailedLoginAttemptCount(Integer failedLoginAttemptCount) {
		this.failedLoginAttemptCount = failedLoginAttemptCount;
	}

	protected Date firstFailedLoginAttemptOn;

	public Date getFirstFailedLoginAttemptOn() {
		return this.firstFailedLoginAttemptOn;
	}

	public void setFirstFailedLoginAttemptOn(Date firstFailedLoginAttemptOn) {
		this.firstFailedLoginAttemptOn = firstFailedLoginAttemptOn;
	}

	protected Boolean isLocked;

	public Boolean getIsLocked() {
		return this.isLocked;
	}

	public void setIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
	}

	protected Boolean isPasswordChangeRequired;

	public Boolean getIsPasswordChangeRequired() {
		return this.isPasswordChangeRequired;
	}

	public void setIsPasswordChangeRequired(Boolean isPasswordChangeRequired) {
		this.isPasswordChangeRequired = isPasswordChangeRequired;
	}

	protected Date lastLockedOn;

	public Date getLastLockedOn() {
		return this.lastLockedOn;
	}

	public void setLastLockedOn(Date lastLockedOn) {
		this.lastLockedOn = lastLockedOn;
	}

	protected Date lastLoginOn;

	public Date getLastLoginOn() {
		return this.lastLoginOn;
	}

	public void setLastLoginOn(Date lastLoginOn) {
		this.lastLoginOn = lastLoginOn;
	}

	protected Date lastPasswordChangeOn;

	public Date getLastPasswordChangeOn() {
		return this.lastPasswordChangeOn;
	}

	public void setLastPasswordChangeOn(Date lastPasswordChangeOn) {
		this.lastPasswordChangeOn = lastPasswordChangeOn;
	}

	protected Integer remainingLoginAttempts;

	public Integer getRemainingLoginAttempts() {
		return this.remainingLoginAttempts;
	}

	public void setRemainingLoginAttempts(Integer remainingLoginAttempts) {
		this.remainingLoginAttempts = remainingLoginAttempts;
	}

	protected Date updatedOn;

	public Date getUpdatedOn() {
		return this.updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

}
