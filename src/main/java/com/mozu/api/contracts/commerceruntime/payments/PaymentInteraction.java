/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.payments;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import com.mozu.api.contracts.core.AuditInfo;

/**
 *	Properties of a resulting payment interaction that occurs when a payment action is performed.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentInteraction implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The status of this payment interaction. Possible values are New, Authorized, Captured, Declined, Failed, Voided, Credited, CheckRequested, or RolledBack.
	 */
	protected String status;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * If applicable, the total monetary amount associated with this payment interaction.
	 */
	protected Double amount;

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	/**
	 * If applicable, the check number associated with this payment interaction.
	 */
	protected String checkNumber;

	public String getCheckNumber() {
		return this.checkNumber;
	}

	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}

	/**
	 * 3-letter ISO 4217 standard global currency code. Currently, only "USD" (US Dollar) is supported.
	 */
	protected String currencyCode;

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	/**
	 * If required by the payment gateway, the authorization code of the transaction.
	 */
	protected String gatewayAuthCode;

	public String getGatewayAuthCode() {
		return this.gatewayAuthCode;
	}

	public void setGatewayAuthCode(String gatewayAuthCode) {
		this.gatewayAuthCode = gatewayAuthCode;
	}

	/**
	 * AVS codes supplied by the payment gateway.
	 */
	protected String gatewayAVSCodes;

	public String getGatewayAVSCodes() {
		return this.gatewayAVSCodes;
	}

	public void setGatewayAVSCodes(String gatewayAVSCodes) {
		this.gatewayAVSCodes = gatewayAVSCodes;
	}

	/**
	 * CVV2 codes supplied by the payment gateway.
	 */
	protected String gatewayCVV2Codes;

	public String getGatewayCVV2Codes() {
		return this.gatewayCVV2Codes;
	}

	public void setGatewayCVV2Codes(String gatewayCVV2Codes) {
		this.gatewayCVV2Codes = gatewayCVV2Codes;
	}

	/**
	 * Unique identifier of the gateway interaction. Used for credit card transactions where the payment creates a GatewayInteractionId for each interaction. System-supplied and read-only.
	 */
	protected Integer gatewayInteractionId;

	public Integer getGatewayInteractionId() {
		return this.gatewayInteractionId;
	}

	public void setGatewayInteractionId(Integer gatewayInteractionId) {
		this.gatewayInteractionId = gatewayInteractionId;
	}

	/**
	 * Response code from the gateway associated with the payment interaction. For example, if the gateway returns "Not Authorized," an interaction for voiding the payment transaction would result.
	 */
	protected String gatewayResponseCode;

	public String getGatewayResponseCode() {
		return this.gatewayResponseCode;
	}

	public void setGatewayResponseCode(String gatewayResponseCode) {
		this.gatewayResponseCode = gatewayResponseCode;
	}

	/**
	 * Unique identifier of the gateway transaction associated with the payment interaction.
	 */
	protected String gatewayTransactionId;

	public String getGatewayTransactionId() {
		return this.gatewayTransactionId;
	}

	public void setGatewayTransactionId(String gatewayTransactionId) {
		this.gatewayTransactionId = gatewayTransactionId;
	}

	/**
	 * Unique identifier of the payment interaction.
	 */
	protected String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Date and time the payment interaction occured.
	 */
	protected Date interactionDate;

	public Date getInteractionDate() {
		return this.interactionDate;
	}

	public void setInteractionDate(Date interactionDate) {
		this.interactionDate = interactionDate;
	}

	/**
	 * The type of payment interaction, such as Capture or CheckReceived.
	 */
	protected String interactionType;

	public String getInteractionType() {
		return this.interactionType;
	}

	public void setInteractionType(String interactionType) {
		this.interactionType = interactionType;
	}

	/**
	 * If true, the payment interaction was manually defined s part of offline order processing.
	 */
	protected Boolean isManual;

	public Boolean getIsManual() {
		return this.isManual;
	}

	public void setIsManual(Boolean isManual) {
		this.isManual = isManual;
	}

	/**
	 * If true, this payment interaction repeats on a scheduled interval.
	 */
	protected Boolean isRecurring;

	public Boolean getIsRecurring() {
		return this.isRecurring;
	}

	public void setIsRecurring(Boolean isRecurring) {
		this.isRecurring = isRecurring;
	}

	/**
	 * Note content entered for a payment interaction.
	 */
	protected String note;

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	/**
	 * Unique identifier of the order associated with this payment interaction.
	 */
	protected String orderId;

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	/**
	 * The status of the payment prior to the interaction being performed, which enables manual rollback of previous transactions.
	 */
	protected String paymentEntryStatus;

	public String getPaymentEntryStatus() {
		return this.paymentEntryStatus;
	}

	public void setPaymentEntryStatus(String paymentEntryStatus) {
		this.paymentEntryStatus = paymentEntryStatus;
	}

	/**
	 * Unique identifier of the payment associated with this transaction.
	 */
	protected String paymentId;

	public String getPaymentId() {
		return this.paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	/**
	 * Unique identifier of previous interaction that this payment interaction is modifying. For example, when refunding a payment, the crediting interaction would reference the capture interaction.
	 */
	protected Integer paymentTransactionInteractionIdReference;

	public Integer getPaymentTransactionInteractionIdReference() {
		return this.paymentTransactionInteractionIdReference;
	}

	public void setPaymentTransactionInteractionIdReference(Integer paymentTransactionInteractionIdReference) {
		this.paymentTransactionInteractionIdReference = paymentTransactionInteractionIdReference;
	}

	/**
	 * Identifier and datetime stamp information recorded when a user or application creates, updates, or deletes a resource entity. This value is system-supplied and read-only.
	 */
	protected AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

}
