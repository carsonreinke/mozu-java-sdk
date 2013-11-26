/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.payments;

import java.io.Serializable;
import java.util.Date;

public class PaymentGatewayInteraction implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected String gatewayAuthCode;

	public String getGatewayAuthCode() {
		return this.gatewayAuthCode;
	}

	public void setGatewayAuthCode(String gatewayAuthCode) {
		this.gatewayAuthCode = gatewayAuthCode;
	}

	protected String gatewayAVSCodes;

	public String getGatewayAVSCodes() {
		return this.gatewayAVSCodes;
	}

	public void setGatewayAVSCodes(String gatewayAVSCodes) {
		this.gatewayAVSCodes = gatewayAVSCodes;
	}

	protected String gatewayCVV2Codes;

	public String getGatewayCVV2Codes() {
		return this.gatewayCVV2Codes;
	}

	public void setGatewayCVV2Codes(String gatewayCVV2Codes) {
		this.gatewayCVV2Codes = gatewayCVV2Codes;
	}

	protected Integer gatewayInteractionId;

	public Integer getGatewayInteractionId() {
		return this.gatewayInteractionId;
	}

	public void setGatewayInteractionId(Integer gatewayInteractionId) {
		this.gatewayInteractionId = gatewayInteractionId;
	}

	protected String gatewayResponseCode;

	public String getGatewayResponseCode() {
		return this.gatewayResponseCode;
	}

	public void setGatewayResponseCode(String gatewayResponseCode) {
		this.gatewayResponseCode = gatewayResponseCode;
	}

	protected String gatewayTransactionId;

	public String getGatewayTransactionId() {
		return this.gatewayTransactionId;
	}

	public void setGatewayTransactionId(String gatewayTransactionId) {
		this.gatewayTransactionId = gatewayTransactionId;
	}

}
