/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productruntime;

import java.util.List;
import java.io.Serializable;
import java.util.Date;
import com.mozu.api.contracts.productruntime.LocationInventory;

public class LocationInventoryCollection implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected Long totalCount;

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	protected List<LocationInventory> items;
	public List<LocationInventory> getItems() {
		return this.items;
	}
	public void setItems(List<LocationInventory> items) {
		this.items = items;
	}

}
