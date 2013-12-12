/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.content.documentlists;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class FolderUrl
{

	/**
	 * Get Resource Url for GetFolder
	 * @param documentListName The name of the document list associated with the folder to retrieve.
	 * @param folderId The unique identifier of the folder to retrieve.
	 * @return   String Resource Url
	 */
	public static MozuUrl getFolderUrl(String documentListName, String folderId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/{documentListName}/folders/{folderId}");
		formatter.formatUrl("documentListName", documentListName);
		formatter.formatUrl("folderId", folderId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetFolders
	 * @param documentListName The name of the document list that contains this folder.
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param sort The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return   String Resource Url
	 */
	public static MozuUrl getFoldersUrl(String documentListName, String filter, Integer pageSize, String sort, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/{documentListName}/folders?filter={filter}&pageSize={pageSize}&startIndex={startIndex}&sortBy={sort}");
		formatter.formatUrl("documentListName", documentListName);
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("sort", sort);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreateFolder
	 * @param documentListName The name of the document list for which to create a new folder.
	 * @return   String Resource Url
	 */
	public static MozuUrl createFolderUrl(String documentListName)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/{documentListName}/folders");
		formatter.formatUrl("documentListName", documentListName);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateFolder
	 * @param documentListName The name of the document list that contains this folder.
	 * @param folderId Unique identifier of the folder.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateFolderUrl(String documentListName, String folderId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/{documentListName}/folders/{folderId}");
		formatter.formatUrl("documentListName", documentListName);
		formatter.formatUrl("folderId", folderId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteFolder
	 * @param documentListName The name of the document list associated with the folder to delete.
	 * @param folderId The unique identifier of the folder to delete.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteFolderUrl(String documentListName, String folderId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/{documentListName}/folders/{folderId}");
		formatter.formatUrl("documentListName", documentListName);
		formatter.formatUrl("folderId", folderId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

