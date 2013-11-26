/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.customer;

import java.util.List;
import java.io.Serializable;
import java.util.Date;
import com.mozu.api.contracts.customer.Transaction;

public class Visit implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected Integer accountId;

	public Integer getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	protected String browserLocationCode;

	public String getBrowserLocationCode() {
		return this.browserLocationCode;
	}

	public void setBrowserLocationCode(String browserLocationCode) {
		this.browserLocationCode = browserLocationCode;
	}

	protected Date date;

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	protected String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	protected String locationCode;

	public String getLocationCode() {
		return this.locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	protected String type;

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	protected String userId;

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	protected String webReferrer;

	public String getWebReferrer() {
		return this.webReferrer;
	}

	public void setWebReferrer(String webReferrer) {
		this.webReferrer = webReferrer;
	}

	protected String webSessionId;

	public String getWebSessionId() {
		return this.webSessionId;
	}

	public void setWebSessionId(String webSessionId) {
		this.webSessionId = webSessionId;
	}

	protected Integer webSiteId;

	public Integer getWebSiteId() {
		return this.webSiteId;
	}

	public void setWebSiteId(Integer webSiteId) {
		this.webSiteId = webSiteId;
	}

	protected String webUserAgent;

	public String getWebUserAgent() {
		return this.webUserAgent;
	}

	public void setWebUserAgent(String webUserAgent) {
		this.webUserAgent = webUserAgent;
	}

	protected List<Transaction> transactions;
	public List<Transaction> getTransactions() {
		return this.transactions;
	}
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

}
