
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.contracts.productadmin;

import java.util.ArrayList;
import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mozu.api.contracts.productadmin.SiteGroup;


public class SiteGroupCollection implements Serializable
{
	/** Default Serial Version UID  */
	private static final long serialVersionUID = 1L;

	@JsonProperty("PageCount")
	protected Integer pageCount;

	public Integer getPageCount() {
		return this.pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

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

	@JsonProperty("TotalCount")
	protected Integer totalCount;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	@JsonProperty("Items")
	protected ArrayList<SiteGroup> items;
	public ArrayList<SiteGroup> getItems() {
		return this.items;
	}
	public void setItems(ArrayList<SiteGroup> items) {
		this.items = items;
	}

}
