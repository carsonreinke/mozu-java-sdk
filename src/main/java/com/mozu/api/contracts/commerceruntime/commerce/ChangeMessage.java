
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.contracts.commerceruntime.commerce;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
*	Properties of a system message displayed when a change, such as a change in product price, occurs for a cart or order.
*/
public class ChangeMessage implements Serializable
{
	/** Default Serial Version UID  */
	private static final long serialVersionUID = 1L;

	/**
	*Date and time when the entity was created, represented in UTC Date/Time.
	*/
	@JsonProperty("CreateDate")
	protected Date createDate;

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	*Unique identifier of the change message. System-supplied and read-only.
	*/
	@JsonProperty("Id")
	protected String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	*Identifier for the object associated with the change message, which can represent a cart, cart item, or an order.
	*/
	@JsonProperty("Identifier")
	protected String identifier;

	public String getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	/**
	*The text of the change message, such as "This product is no longer available". System-supplied and read-only.
	*/
	@JsonProperty("Message")
	protected String message;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	/**
	*The new value of the object affected by the change, such as the new price of the product. System-supplied and read-only.
	*/
	@JsonProperty("NewValue")
	protected String newValue;

	public String getNewValue() {
		return this.newValue;
	}

	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}

	/**
	*The prior value of the object affected by the change, such as the price of the product when it was added to the cart. System-supplied and read-only.
	*/
	@JsonProperty("OldValue")
	protected String oldValue;

	public String getOldValue() {
		return this.oldValue;
	}

	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}

	/**
	*The text that appears on the subject line of the message, such as "The product price has changed."
	*/
	@JsonProperty("Subject")
	protected String subject;

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	*Represents the type of object affected by the change, such as Cart Item or Product. System-supplied and read-only.
	*/
	@JsonProperty("SubjectType")
	protected String subjectType;

	public String getSubjectType() {
		return this.subjectType;
	}

	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}

	/**
	*The action associated with this message. For example, if the price of a product changes, the verb could be "Increased" or "Decreased". If the product is no longer available, the verb could be "Invalidated". System-supplied and read-only.
	*/
	@JsonProperty("Verb")
	protected String verb;

	public String getVerb() {
		return this.verb;
	}

	public void setVerb(String verb) {
		this.verb = verb;
	}

}
