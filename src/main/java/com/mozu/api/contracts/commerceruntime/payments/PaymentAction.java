/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.payments;

import java.io.Serializable;
import java.util.Date;
import com.mozu.api.contracts.commerceruntime.payments.PaymentGatewayInteraction;
import com.mozu.api.contracts.commerceruntime.payments.BillingInfo;

public class PaymentAction implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected String actionName;

	public String getActionName() {
		return this.actionName;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	protected Double amount;

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	protected String cancelUrl;

	public String getCancelUrl() {
		return this.cancelUrl;
	}

	public void setCancelUrl(String cancelUrl) {
		this.cancelUrl = cancelUrl;
	}

	protected String checkNumber;

	public String getCheckNumber() {
		return this.checkNumber;
	}

	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}

	protected String currencyCode;

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	protected Date interactionDate;

	public Date getInteractionDate() {
		return this.interactionDate;
	}

	public void setInteractionDate(Date interactionDate) {
		this.interactionDate = interactionDate;
	}

	protected String referenceSourcePaymentId;

	public String getReferenceSourcePaymentId() {
		return this.referenceSourcePaymentId;
	}

	public void setReferenceSourcePaymentId(String referenceSourcePaymentId) {
		this.referenceSourcePaymentId = referenceSourcePaymentId;
	}

	protected String returnUrl;

	public String getReturnUrl() {
		return this.returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	protected PaymentGatewayInteraction manualGatewayInteraction;

	public PaymentGatewayInteraction getManualGatewayInteraction() {
		return this.manualGatewayInteraction;
	}

	public void setManualGatewayInteraction(PaymentGatewayInteraction manualGatewayInteraction) {
		this.manualGatewayInteraction = manualGatewayInteraction;
	}

	protected BillingInfo newBillingInfo;

	public BillingInfo getNewBillingInfo() {
		return this.newBillingInfo;
	}

	public void setNewBillingInfo(BillingInfo newBillingInfo) {
		this.newBillingInfo = newBillingInfo;
	}

}
