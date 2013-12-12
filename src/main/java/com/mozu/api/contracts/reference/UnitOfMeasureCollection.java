/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.reference;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import com.mozu.api.contracts.reference.UnitOfMeasure;

/**
 *	The paged collection of all units of measure that the system currently supports.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UnitOfMeasureCollection implements Serializable
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
	protected List<UnitOfMeasure> items;
	public List<UnitOfMeasure> getItems() {
		return this.items;
	}
	public void setItems(List<UnitOfMeasure> items) {
		this.items = items;
	}

}
