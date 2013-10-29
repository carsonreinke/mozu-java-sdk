
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.contracts.productruntime;

import java.util.ArrayList;
import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mozu.api.contracts.productruntime.FacetValue;


/**
*	The value selected for a facet when indexing a product search.
*/
public class FacetValue implements Serializable
{
	/** Default Serial Version UID  */
	private static final long serialVersionUID = 1L;

	/**
	*The number of facet value selections in a product search result set.
	*/
	@JsonProperty("Count")
	protected Integer count;

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	/**
	*Submits the selected facet value as a facet value filter.
	*/
	@JsonProperty("FilterValue")
	protected String filterValue;

	public String getFilterValue() {
		return this.filterValue;
	}

	public void setFilterValue(String filterValue) {
		this.filterValue = filterValue;
	}

	/**
	*If true, the facet value is applied as a filter in the storefront product search.
	*/
	@JsonProperty("IsApplied")
	protected Boolean isApplied;

	public Boolean getIsApplied() {
		return this.isApplied;
	}

	public void setIsApplied(Boolean isApplied) {
		this.isApplied = isApplied;
	}

	/**
	*The descriptive label of the facet value.
	*/
	@JsonProperty("Label")
	protected String label;

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	/**
	*If applicable, the values of any parent category facets in a hierarchy. Hierarchical facets only apply for product categories.
	*/
	@JsonProperty("ParentFacetValue")
	protected String parentFacetValue;

	public String getParentFacetValue() {
		return this.parentFacetValue;
	}

	public void setParentFacetValue(String parentFacetValue) {
		this.parentFacetValue = parentFacetValue;
	}

	/**
	*The maximum value selected or entered for the facet range query.
	*/
	@JsonProperty("RangeQueryValueEnd")
	protected String rangeQueryValueEnd;

	public String getRangeQueryValueEnd() {
		return this.rangeQueryValueEnd;
	}

	public void setRangeQueryValueEnd(String rangeQueryValueEnd) {
		this.rangeQueryValueEnd = rangeQueryValueEnd;
	}

	/**
	*The minimum value selected or entered for the facet range query.
	*/
	@JsonProperty("RangeQueryValueStart")
	protected String rangeQueryValueStart;

	public String getRangeQueryValueStart() {
		return this.rangeQueryValueStart;
	}

	public void setRangeQueryValueStart(String rangeQueryValueStart) {
		this.rangeQueryValueStart = rangeQueryValueStart;
	}

	/**
	*String representation of the facet value selected for the product search.
	*/
	@JsonProperty("Value")
	protected String value;

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	/**
	*If applicable, the values of any subcategory facets in a hierarchy. Hierarchical facets only apply for product categories.
	*/
	@JsonProperty("ChildrenFacetValues")
	protected ArrayList<FacetValue> childrenFacetValues;
	public ArrayList<FacetValue> getChildrenFacetValues() {
		return this.childrenFacetValues;
	}
	public void setChildrenFacetValues(ArrayList<FacetValue> childrenFacetValues) {
		this.childrenFacetValues = childrenFacetValues;
	}

}
