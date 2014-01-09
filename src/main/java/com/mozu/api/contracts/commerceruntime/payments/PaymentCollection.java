/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.payments;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.commerceruntime.payments.Payment;

/**
 *	Collection of payment transactions associated with an order.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentCollection implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The number of results listed in the query collection, represented by a signed 64-bit (8-byte) integer. This value is system-supplied and read-only.
	 */
	protected Long totalCount;

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	/**
	 * An array list of objects in the returned collection.
	 */
	protected List<Payment> items;
	public List<Payment> getItems() {
		return this.items;
	}
	public void setItems(List<Payment> items) {
		this.items = items;
	}

}
