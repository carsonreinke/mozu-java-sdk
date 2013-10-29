
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.contracts.productruntime;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
*	Properties of a message displayed when a product validation failure occurs for a shopper in a storefront.
*/
public class ValidationMessage implements Serializable
{
	/** Default Serial Version UID  */
	private static final long serialVersionUID = 1L;

	/**
	*The contents of the message displayed to the user when the product validation failure occurs.
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
	*The severity level of the product validation failure.
	*/
	@JsonProperty("Severity")
	protected String severity;

	public String getSeverity() {
		return this.severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	/**
	*The entity that triggered the product validation.
	*/
	@JsonProperty("Source")
	protected String source;

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	/**
	*Unique identifier of the entity that triggered the validation.
	*/
	@JsonProperty("SourceId")
	protected String sourceId;

	public String getSourceId() {
		return this.sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

}