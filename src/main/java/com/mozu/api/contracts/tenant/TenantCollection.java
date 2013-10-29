
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.contracts.tenant;

import java.util.ArrayList;
import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mozu.api.contracts.tenant.Tenant;


/**
*	A paged collection containing a grouping of tenant details.
*/
public class TenantCollection implements Serializable
{
	/** Default Serial Version UID  */
	private static final long serialVersionUID = 1L;

	/**
	*The number of pages returned based on the startIndex and pageSize values specified. This value is system-supplied and read-only.
	*/
	@JsonProperty("PageCount")
	protected Integer pageCount;

	public Integer getPageCount() {
		return this.pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	/**
	*Specifies the number of results to display on each page when creating paged results from a query. The maximum value is 200.
	*/
	@JsonProperty("PageSize")
	protected Integer pageSize;

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	@JsonProperty("StartIndex")
	protected Integer startIndex;

	public Integer getStartIndex() {
		return this.startIndex;
	}

	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
	}

	/**
	*The number of results listed in the query collection, represented by a signed 64-bit (8-byte) integer. This value is system-supplied and read-only.
	*/
	@JsonProperty("TotalCount")
	protected Integer totalCount;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	/**
	*An array list of objects in the returned collection.
	*/
	@JsonProperty("Items")
	protected ArrayList<Tenant> items;
	public ArrayList<Tenant> getItems() {
		return this.items;
	}
	public void setItems(ArrayList<Tenant> items) {
		this.items = items;
	}

}
