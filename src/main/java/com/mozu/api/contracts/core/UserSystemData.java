
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.contracts.core;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
*	System-supplied and read-only information about the user.
*/
public class UserSystemData implements Serializable
{
	/** Default Serial Version UID  */
	private static final long serialVersionUID = 1L;

	/**
	*Date and time when the entity was created, represented in UTC Date/Time.
	*/
	@JsonProperty("CreatedOn")
	protected Date createdOn;

	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	/**
	*The number of failed authentication attempts associated with the user.
	*/
	@JsonProperty("FailedLoginAttemptCount")
	protected Byte failedLoginAttemptCount;

	public Byte getFailedLoginAttemptCount() {
		return this.failedLoginAttemptCount;
	}

	public void setFailedLoginAttemptCount(Byte failedLoginAttemptCount) {
		this.failedLoginAttemptCount = failedLoginAttemptCount;
	}

	/**
	*The date and time the initial login was unsuccessful. Each time a user attempts to authenticate and it fails, an update occurs on this field. System-supplied and read-only.
	*/
	@JsonProperty("FirstFailedLoginAttemptOn")
	protected Date firstFailedLoginAttemptOn;

	public Date getFirstFailedLoginAttemptOn() {
		return this.firstFailedLoginAttemptOn;
	}

	public void setFirstFailedLoginAttemptOn(Date firstFailedLoginAttemptOn) {
		this.firstFailedLoginAttemptOn = firstFailedLoginAttemptOn;
	}

	/**
	*If true, the user account is locked due to multiple failed authentication attempts.
	*/
	@JsonProperty("IsLocked")
	protected Boolean isLocked;

	public Boolean getIsLocked() {
		return this.isLocked;
	}

	public void setIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
	}

	/**
	*If true, the login requires a password change for increased security. If false, the login does not require a password change.
	*/
	@JsonProperty("IsPasswordChangeRequired")
	protected Boolean isPasswordChangeRequired;

	public Boolean getIsPasswordChangeRequired() {
		return this.isPasswordChangeRequired;
	}

	public void setIsPasswordChangeRequired(Boolean isPasswordChangeRequired) {
		this.isPasswordChangeRequired = isPasswordChangeRequired;
	}

	/**
	*When the user's account was last locked. System-supplied and read-only.
	*/
	@JsonProperty("LastLockedOn")
	protected Date lastLockedOn;

	public Date getLastLockedOn() {
		return this.lastLockedOn;
	}

	public void setLastLockedOn(Date lastLockedOn) {
		this.lastLockedOn = lastLockedOn;
	}

	/**
	* When the user last logged into the store. System-supplied and read-only.
	*/
	@JsonProperty("LastLoginOn")
	protected Date lastLoginOn;

	public Date getLastLoginOn() {
		return this.lastLoginOn;
	}

	public void setLastLoginOn(Date lastLoginOn) {
		this.lastLoginOn = lastLoginOn;
	}

	/**
	* When the password was last modified. System-supplied and read-only.
	*/
	@JsonProperty("LastPasswordChangeOn")
	protected Date lastPasswordChangeOn;

	public Date getLastPasswordChangeOn() {
		return this.lastPasswordChangeOn;
	}

	public void setLastPasswordChangeOn(Date lastPasswordChangeOn) {
		this.lastPasswordChangeOn = lastPasswordChangeOn;
	}

	/**
	*The number of login attempts left for the user. The user must login successfully before this value reaches zero otherwise the account will be locked.
	*/
	@JsonProperty("RemainingLoginAttempts")
	protected Integer remainingLoginAttempts;

	public Integer getRemainingLoginAttempts() {
		return this.remainingLoginAttempts;
	}

	public void setRemainingLoginAttempts(Integer remainingLoginAttempts) {
		this.remainingLoginAttempts = remainingLoginAttempts;
	}

	/**
	*Date and time when the entity was last updated, represented in UTC Date/Time.
	*/
	@JsonProperty("UpdatedOn")
	protected Date updatedOn;

	public Date getUpdatedOn() {
		return this.updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

}
