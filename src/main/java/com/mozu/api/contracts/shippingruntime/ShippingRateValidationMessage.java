
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.contracts.shippingruntime;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ShippingRateValidationMessage implements Serializable
{
	/** Default Serial Version UID  */
	private static final long serialVersionUID = 1L;

	@JsonProperty("HelpLink")
	protected String helpLink;

	public String getHelpLink() {
		return this.helpLink;
	}

	public void setHelpLink(String helpLink) {
		this.helpLink = helpLink;
	}

	@JsonProperty("Message")
	protected String message;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@JsonProperty("Severity")
	protected String severity;

	public String getSeverity() {
		return this.severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

}