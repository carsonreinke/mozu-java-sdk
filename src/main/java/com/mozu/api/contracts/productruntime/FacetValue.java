/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productruntime;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.productruntime.FacetValue;

/**
 *	The value selected for a facet when indexing a product search.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FacetValue implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The number of facet value selections in a product search result set.
	 */
	protected Integer count;

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	/**
	 * Submits the selected facet value as a facet value filter.
	 */
	protected String filterValue;

	public String getFilterValue() {
		return this.filterValue;
	}

	public void setFilterValue(String filterValue) {
		this.filterValue = filterValue;
	}

	/**
	 * If true, the facet value is applied as a filter in the storefront product search.
	 */
	protected Boolean isApplied;

	public Boolean getIsApplied() {
		return this.isApplied;
	}

	public void setIsApplied(Boolean isApplied) {
		this.isApplied = isApplied;
	}

	/**
	 * The descriptive label of the facet value.
	 */
	protected String label;

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * If applicable, the values of any parent category facets in a hierarchy. Hierarchical facets only apply for product categories.
	 */
	protected String parentFacetValue;

	public String getParentFacetValue() {
		return this.parentFacetValue;
	}

	public void setParentFacetValue(String parentFacetValue) {
		this.parentFacetValue = parentFacetValue;
	}

	/**
	 * The maximum value selected or entered for the facet range query.
	 */
	protected String rangeQueryValueEnd;

	public String getRangeQueryValueEnd() {
		return this.rangeQueryValueEnd;
	}

	public void setRangeQueryValueEnd(String rangeQueryValueEnd) {
		this.rangeQueryValueEnd = rangeQueryValueEnd;
	}

	/**
	 * The minimum value selected or entered for the facet range query.
	 */
	protected String rangeQueryValueStart;

	public String getRangeQueryValueStart() {
		return this.rangeQueryValueStart;
	}

	public void setRangeQueryValueStart(String rangeQueryValueStart) {
		this.rangeQueryValueStart = rangeQueryValueStart;
	}

	/**
	 * String representation of the facet value selected for the product search.
	 */
	protected String value;

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * If applicable, the values of any subcategory facets in a hierarchy. Hierarchical facets only apply for product categories.
	 */
	protected List<FacetValue> childrenFacetValues;
	public List<FacetValue> getChildrenFacetValues() {
		return this.childrenFacetValues;
	}
	public void setChildrenFacetValues(List<FacetValue> childrenFacetValues) {
		this.childrenFacetValues = childrenFacetValues;
	}

}
