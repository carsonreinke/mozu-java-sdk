/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.catalog.storefront;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class ProductSearchResultUrl
{

	/**
	 * Get Resource Url for Search
	 * @param facet Individually list the facet fields you want to display in a storefront product search.
	 * @param facetFieldRangeQuery Display a range facet not specified in a template in a storefront product search by listing the facet field and the range to display.
	 * @param facetHierDepth If filtering using category facets in a hierarchy, the number of category hierarchy levels to return for the facet. This option is only available for category facets.
	 * @param facetHierPrefix If filtering using category facets in a hierarchy, the parent categories you want to skip in the storefront product search. This parameter is only available for category facets.
	 * @param facetHierValue If filtering using category facets in a hierarchy, the category in the hierarchy to begin faceting on. This parameter is only available for category facets.
	 * @param facetPageSize The number of facet values to return for one or more facets.
	 * @param facetSettings Settings reserved for future facet search functionality on a storefront product search.
	 * @param facetStartIndex When paging through multiple facets, the startIndex value for each facet.
	 * @param facetTemplate The facet template to use on the storefront. A template displays all facets associated with the template on the storefront product search. Currently, only category-level facet templates are available.
	 * @param facetTemplateSubset Display a subset of the facets defined in the template specified in facetTemplate parameter.
	 * @param facetValueFilter The facet values to apply to the filter.
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. You can filter product search results by any of its properties, including product code, type, category, and name. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=categoryId+eq+12"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param query The terms to search on.
	 * @param sortBy 
	 * @param startIndex 
	 * @return   String Resource Url
	 */
	public static MozuUrl searchUrl(String facet, String facetFieldRangeQuery, String facetHierDepth, String facetHierPrefix, String facetHierValue, String facetPageSize, String facetSettings, String facetStartIndex, String facetTemplate, String facetTemplateSubset, String facetValueFilter, String filter, Integer pageSize, String query, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/storefront/productsearch/search/?query={query}&filter={filter}&facetTemplate={facetTemplate}&facetTemplateSubset={facetTemplateSubset}&facet={facet}&facetFieldRangeQuery={facetFieldRangeQuery}&facetHierPrefix={facetHierPrefix}&facetHierValue={facetHierValue}&facetHierDepth={facetHierDepth}&facetStartIndex={facetStartIndex}&facetPageSize={facetPageSize}&facetSettings={facetSettings}&facetValueFilter={facetValueFilter}&sortBy={sortBy}&pageSize={pageSize}&startIndex={startIndex}");
		formatter.formatUrl("facet", facet);
		formatter.formatUrl("facetFieldRangeQuery", facetFieldRangeQuery);
		formatter.formatUrl("facetHierDepth", facetHierDepth);
		formatter.formatUrl("facetHierPrefix", facetHierPrefix);
		formatter.formatUrl("facetHierValue", facetHierValue);
		formatter.formatUrl("facetPageSize", facetPageSize);
		formatter.formatUrl("facetSettings", facetSettings);
		formatter.formatUrl("facetStartIndex", facetStartIndex);
		formatter.formatUrl("facetTemplate", facetTemplate);
		formatter.formatUrl("facetTemplateSubset", facetTemplateSubset);
		formatter.formatUrl("facetValueFilter", facetValueFilter);
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("query", query);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for Suggest
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param q Text that the shopper is currently entering.
	 * @return   String Resource Url
	 */
	public static MozuUrl suggestUrl(Integer pageSize, String q)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/storefront/productsearch/suggest?q={q}&pageSize={pageSize}");
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("q", q);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

