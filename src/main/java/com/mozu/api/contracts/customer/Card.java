/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.customer;

import java.io.Serializable;
import java.util.Date;

public class Card implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected String cardNumberPart;

	public String getCardNumberPart() {
		return this.cardNumberPart;
	}

	public void setCardNumberPart(String cardNumberPart) {
		this.cardNumberPart = cardNumberPart;
	}

	protected String cardType;

	public String getCardType() {
		return this.cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	protected short expireMonth;

	public short getExpireMonth() {
		return this.expireMonth;
	}

	public void setExpireMonth(short expireMonth) {
		this.expireMonth = expireMonth;
	}

	protected short expireYear;

	public short getExpireYear() {
		return this.expireYear;
	}

	public void setExpireYear(short expireYear) {
		this.expireYear = expireYear;
	}

	protected String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	protected String nameOnCard;

	public String getNameOnCard() {
		return this.nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

}
