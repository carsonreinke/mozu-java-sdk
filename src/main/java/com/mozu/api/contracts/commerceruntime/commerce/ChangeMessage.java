/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.commerce;

import java.io.Serializable;
import java.util.Date;

public class ChangeMessage implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected Date createDate;

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	protected String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	protected String identifier;

	public String getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	protected String message;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	protected String newValue;

	public String getNewValue() {
		return this.newValue;
	}

	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}

	protected String oldValue;

	public String getOldValue() {
		return this.oldValue;
	}

	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}

	protected String subject;

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	protected String subjectType;

	public String getSubjectType() {
		return this.subjectType;
	}

	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}

	protected String verb;

	public String getVerb() {
		return this.verb;
	}

	public void setVerb(String verb) {
		this.verb = verb;
	}

}
