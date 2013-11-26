/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.catalog.admin;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class FacetUrl
{

	/**
	 * Get Resource Url for GetFacet
	 * @param facetId 
	 * @param validate 
	 * @return   String Resource Url
	 */
	public static MozuUrl getFacetUrl(Integer facetId, Boolean validate)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/facets/{facetId}?validate={validate}");
		formatter.formatUrl("facetId", facetId);
		formatter.formatUrl("validate", validate);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetFacetCategoryList
	 * @param categoryId 
	 * @param includeAvailable 
	 * @param validate 
	 * @return   String Resource Url
	 */
	public static MozuUrl getFacetCategoryListUrl(Integer categoryId, Boolean includeAvailable, Boolean validate)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/facets/category/{categoryId}?includAvaliable={includeAvailable}&validate={validate}");
		formatter.formatUrl("categoryId", categoryId);
		formatter.formatUrl("includeAvailable", includeAvailable);
		formatter.formatUrl("validate", validate);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddFacet
	 * @return   String Resource Url
	 */
	public static MozuUrl addFacetUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/facets/");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateFacet
	 * @param facetId 
	 * @return   String Resource Url
	 */
	public static MozuUrl updateFacetUrl(Integer facetId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/facets/{facetId}");
		formatter.formatUrl("facetId", facetId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteFacetById
	 * @param facetId 
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteFacetByIdUrl(Integer facetId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/facets/{facetId}");
		formatter.formatUrl("facetId", facetId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

