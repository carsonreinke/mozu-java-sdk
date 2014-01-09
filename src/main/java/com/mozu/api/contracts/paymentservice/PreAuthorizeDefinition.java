/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.paymentservice;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.paymentservice.PreAuthorizeTransactionTypeDataContract;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PreAuthorizeDefinition implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Identifier of the entity.
	 */
	protected Integer id;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	protected String preAuthorizeProdUrl;

	public String getPreAuthorizeProdUrl() {
		return this.preAuthorizeProdUrl;
	}

	public void setPreAuthorizeProdUrl(String preAuthorizeProdUrl) {
		this.preAuthorizeProdUrl = preAuthorizeProdUrl;
	}

	protected String preAuthorizeTestUrl;

	public String getPreAuthorizeTestUrl() {
		return this.preAuthorizeTestUrl;
	}

	public void setPreAuthorizeTestUrl(String preAuthorizeTestUrl) {
		this.preAuthorizeTestUrl = preAuthorizeTestUrl;
	}

	protected PreAuthorizeTransactionTypeDataContract type;

	public PreAuthorizeTransactionTypeDataContract getType() {
		return this.type;
	}

	public void setType(PreAuthorizeTransactionTypeDataContract type) {
		this.type = type;
	}

}
