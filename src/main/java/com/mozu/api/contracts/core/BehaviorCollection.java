/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.core;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.core.Behavior;

/**
 *	***Always private and should not be published.***
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BehaviorCollection implements Serializable
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
	protected List<Behavior> items;
	public List<Behavior> getItems() {
		return this.items;
	}
	public void setItems(List<Behavior> items) {
		this.items = items;
	}

}
