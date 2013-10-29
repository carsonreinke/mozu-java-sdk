/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.clients.commerce.catalog.storefront;

import java.util.ArrayList;
import com.mozu.api.MozuClient;

/// <summary>
/// Provide dynamic search results to shoppers as they browse and search for products on the storefront. Suggest possible search terms as the shopper enters text.
/// </summary>
public class ProductSearchResultClient {
	
	
	/**
	* Searches the categories displayed on the storefront for products or product options that the shopper types in a search query.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.productruntime.ProductSearchResult> mozuClient=SearchClient();
	* client.setBaseAddress(url);
	* client.executeRequest();
	* ProductSearchResult productSearchResult = client.Result();
	* </code></pre></p>
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.ProductSearchResult>
	* @see com.mozu.api.contracts.productruntime.ProductSearchResult
	*/
	public static MozuClient<com.mozu.api.contracts.productruntime.ProductSearchResult> searchClient() throws Exception
	{
		return searchClient( null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null);
	}

/**
	* Searches the categories displayed on the storefront for products or product options that the shopper types in a search query.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.productruntime.ProductSearchResult> mozuClient=SearchClient( facet,  facetFieldRangeQuery,  facetHierDepth,  facetHierPrefix,  facetHierValue,  facetPageSize,  facetSettings,  facetStartIndex,  facetTemplate,  facetTemplateSubset,  facetValueFilter,  filter,  pageSize,  query,  sortBy,  startIndex);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* ProductSearchResult productSearchResult = client.Result();
	* </code></pre></p>
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
	* @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. You can filter product search results by any of its properties, including product code, type, category, and name. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). <b>For example - "filter=categoryId+eq+12"</b>
	* @param pageSize Specifies the number of results to display on each page when creating paged results from a query. The maximum value is 200.
	* @param query The terms to search on.
	* @param sortBy 
	* @param startIndex 
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.ProductSearchResult>
	* @see com.mozu.api.contracts.productruntime.ProductSearchResult
	*/
	public static MozuClient<com.mozu.api.contracts.productruntime.ProductSearchResult> searchClient(String facet, String facetFieldRangeQuery, String facetHierDepth, String facetHierPrefix, String facetHierValue, String facetPageSize, String facetSettings, String facetStartIndex, String facetTemplate, String facetTemplateSubset, String facetValueFilter, String filter, Integer pageSize, String query, String sortBy, Integer startIndex) throws Exception
	{
		String url = com.mozu.api.urls.commerce.catalog.storefront.ProductSearchResultUrl.searchUrl(facet, facetFieldRangeQuery, facetHierDepth, facetHierPrefix, facetHierValue, facetPageSize, facetSettings, facetStartIndex, facetTemplate, facetTemplateSubset, facetValueFilter, filter, pageSize, query, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productruntime.ProductSearchResult.class;
		MozuClient<com.mozu.api.contracts.productruntime.ProductSearchResult> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

/**
	* Suggests possible search terms as the shopper enters search text.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.productruntime.SearchSuggestion> mozuClient=SuggestClient();
	* client.setBaseAddress(url);
	* client.executeRequest();
	* SearchSuggestion searchSuggestion = client.Result();
	* </code></pre></p>
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.SearchSuggestion>
	* @see com.mozu.api.contracts.productruntime.SearchSuggestion
	*/
	public static MozuClient<com.mozu.api.contracts.productruntime.SearchSuggestion> suggestClient() throws Exception
	{
		return suggestClient( null,  null);
	}

/**
	* Suggests possible search terms as the shopper enters search text.
	* <p><pre><code>
	*   MozuClient<com.mozu.api.contracts.productruntime.SearchSuggestion> mozuClient=SuggestClient( pageSize,  q);
	* client.setBaseAddress(url);
	* client.executeRequest();
	* SearchSuggestion searchSuggestion = client.Result();
	* </code></pre></p>
	* @param pageSize Specifies the number of results to display on each page when creating paged results from a query. The maximum value is 200.
	* @param q Text that the shopper is currently entering.
	* @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.SearchSuggestion>
	* @see com.mozu.api.contracts.productruntime.SearchSuggestion
	*/
	public static MozuClient<com.mozu.api.contracts.productruntime.SearchSuggestion> suggestClient(Integer pageSize, String q) throws Exception
	{
		String url = com.mozu.api.urls.commerce.catalog.storefront.ProductSearchResultUrl.suggestUrl(pageSize, q);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productruntime.SearchSuggestion.class;
		MozuClient<com.mozu.api.contracts.productruntime.SearchSuggestion> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

			
}



