/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.io.Serializable;
import java.util.Date;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.productadmin.DiscountLocalizedContent;
import com.mozu.api.contracts.productadmin.DiscountTarget;

public class Discount implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected Double amount;

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	protected String amountType;

	public String getAmountType() {
		return this.amountType;
	}

	public void setAmountType(String amountType) {
		this.amountType = amountType;
	}

	protected String couponCode;

	public String getCouponCode() {
		return this.couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	protected Integer currentRedemptionCount;

	public Integer getCurrentRedemptionCount() {
		return this.currentRedemptionCount;
	}

	public void setCurrentRedemptionCount(Integer currentRedemptionCount) {
		this.currentRedemptionCount = currentRedemptionCount;
	}

	protected Date expirationDate;

	public Date getExpirationDate() {
		return this.expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	protected Integer id;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	protected Integer maxRedemptionCount;

	public Integer getMaxRedemptionCount() {
		return this.maxRedemptionCount;
	}

	public void setMaxRedemptionCount(Integer maxRedemptionCount) {
		this.maxRedemptionCount = maxRedemptionCount;
	}

	protected Boolean requiresCoupon;

	public Boolean getRequiresCoupon() {
		return this.requiresCoupon;
	}

	public void setRequiresCoupon(Boolean requiresCoupon) {
		this.requiresCoupon = requiresCoupon;
	}

	protected String scope;

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	protected Date startDate;

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	protected String status;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	protected AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	protected DiscountLocalizedContent content;

	public DiscountLocalizedContent getContent() {
		return this.content;
	}

	public void setContent(DiscountLocalizedContent content) {
		this.content = content;
	}

	protected DiscountTarget target;

	public DiscountTarget getTarget() {
		return this.target;
	}

	public void setTarget(DiscountTarget target) {
		this.target = target;
	}

}
