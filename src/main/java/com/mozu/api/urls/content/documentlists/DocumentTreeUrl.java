
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.urls.content.documentlists;

import com.mozu.api.utils.UrlFormatter;


public class DocumentTreeUrl
{

	/**
        * Get Resource Url for GetTreeDocumentContent
        * @param documentListName The name of the document list associated with the document.
        * @param documentName The name of the document, which is unique within its folder.
        * @param folderId If applicable, the unique identifier of the folder that contains the document.
        * @param folderPath If applicable, the path of the folder hierarchy location associated with the document.
        * @param publishState The current state of the document, which is Active, Draft, or Latest. Active documents are published and cannot be deleted. Querying Latest returns the most recent version of the document, regardless of whether it is published or a draft.
        * @return    String Resource Url
    */
	public static String getTreeDocumentContentUrl(String documentListName, String documentName, String folderId, String folderPath, String publishState)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/{documentListName}/documentTree/{documentName}/content?folderPath={folderPath}&folderId={folderId}&publishState={publishState}");
		formatter.formatUrl("documentListName", documentListName);
		formatter.formatUrl("documentName", documentName);
		formatter.formatUrl("folderId", folderId);
		formatter.formatUrl("folderPath", folderPath);
		formatter.formatUrl("publishState", publishState);
		return formatter.getResourceUrl();
	}

	/**
        * Get Resource Url for GetTreeDocument
        * @param documentListName The name of the document list associated with the document.
        * @param documentName The name of the document, which is unique within its folder.
        * @param folderId If applicable, the unique identifier of the folder that contains the document.
        * @param folderPath If applicable, the path of the folder hierarchy location that contains the document.
        * @param publishState The current state of the document, which is Active, Draft, or Latest. Active documents are published and cannot be deleted. Querying Latest returns the most recent version of the document, regardless of whether it is published or a draft.
        * @return    String Resource Url
    */
	public static String getTreeDocumentUrl(String documentListName, String documentName, String folderId, String folderPath, String publishState)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/{documentListName}/documentTree/{documentName}?folderPath={folderPath}&folderId={folderId}&publishState={publishState}");
		formatter.formatUrl("documentListName", documentListName);
		formatter.formatUrl("documentName", documentName);
		formatter.formatUrl("folderId", folderId);
		formatter.formatUrl("folderPath", folderPath);
		formatter.formatUrl("publishState", publishState);
		return formatter.getResourceUrl();
	}

			/**
        * Get Resource Url for UpdateTreeDocumentContent
        * @param documentListName The name of the document list associated with the document.
        * @param documentName The name of the document, which is unique within its folder.
        * @param folderId If applicable, the unique identifier of the folder that contains the document.
        * @param folderPath If applicable, the path of the folder hierarchy location associated with the document.
        * @return    String Resource Url
    */
	public static String updateTreeDocumentContentUrl(String documentListName, String documentName, String folderId, String folderPath)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/{documentListName}/documentTree/{documentName}/content?folderPath={folderPath}&folderId={folderId}");
		formatter.formatUrl("documentListName", documentListName);
		formatter.formatUrl("documentName", documentName);
		formatter.formatUrl("folderId", folderId);
		formatter.formatUrl("folderPath", folderPath);
		return formatter.getResourceUrl();
	}

		/**
        * Get Resource Url for DeleteTreeDocumentContent
        * @param documentListName The name of the document list associated with the document.
        * @param documentName The name of the document, which is unique within its folder.
        * @param folderId If applicable, the unique identifier of the folder that contains the document.
        * @param folderPath If applicable, the path of the folder hierarchy location associated with the document.
        * @return    String Resource Url
    */
	public static String deleteTreeDocumentContentUrl(String documentListName, String documentName, String folderId, String folderPath)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/{documentListName}/documentTree/{documentName}/content?folderPath={folderPath}&folderId={folderId}");
		formatter.formatUrl("documentListName", documentListName);
		formatter.formatUrl("documentName", documentName);
		formatter.formatUrl("folderId", folderId);
		formatter.formatUrl("folderPath", folderPath);
		return formatter.getResourceUrl();
	}

	
}
