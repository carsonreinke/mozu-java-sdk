/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.content.documentlists;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;

/** <summary>
 * Use the document tree subresource to retrieve documents and manage content within the document hierarchy.
 * </summary>
 */
public class DocumentTreeClient {
	
	/**
	 * Retrieve the content associated with the document, such as a product image or PDF specifications file.
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=GetTreeDocumentContentClient(dataViewMode,  documentListName,  documentName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param documentListName The name of the document list associated with the document.
	 * @param documentName The name of the document, which is unique within its folder.
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> getTreeDocumentContentClient(com.mozu.api.DataViewMode dataViewMode, String documentListName, String documentName) throws Exception
	{
		return getTreeDocumentContentClient(dataViewMode,  documentListName,  documentName,  null,  null, null);
	}

	/**
	 * Retrieve the content associated with the document, such as a product image or PDF specifications file.
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=GetTreeDocumentContentClient(dataViewMode,  documentListName,  documentName,  folderPath,  folderId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param documentListName The name of the document list associated with the document.
	 * @param documentName The name of the document, which is unique within its folder.
	 * @param folderId If applicable, the unique identifier of the folder that contains the document.
	 * @param folderPath If applicable, the path of the folder hierarchy location associated with the document.
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> getTreeDocumentContentClient(com.mozu.api.DataViewMode dataViewMode, String documentListName, String documentName, String folderPath, String folderId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.documentlists.DocumentTreeUrl.getTreeDocumentContentUrl(documentListName, documentName, folderId, folderPath);
		String verb = "GET";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * Retrieves a document based on its document list and folder path in the document hierarchy.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.Document> mozuClient=GetTreeDocumentClient(dataViewMode,  documentListName,  documentName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Document document = client.Result();
	 * </code></pre></p>
	 * @param documentListName The name of the document list associated with the document.
	 * @param documentName The name of the document, which is unique within its folder.
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.Document>
	 * @see com.mozu.api.contracts.content.Document
	 */
	public static MozuClient<com.mozu.api.contracts.content.Document> getTreeDocumentClient(com.mozu.api.DataViewMode dataViewMode, String documentListName, String documentName) throws Exception
	{
		return getTreeDocumentClient(dataViewMode,  documentListName,  documentName,  null,  null, null);
	}

	/**
	 * Retrieves a document based on its document list and folder path in the document hierarchy.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.Document> mozuClient=GetTreeDocumentClient(dataViewMode,  documentListName,  documentName,  folderPath,  folderId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Document document = client.Result();
	 * </code></pre></p>
	 * @param documentListName The name of the document list associated with the document.
	 * @param documentName The name of the document, which is unique within its folder.
	 * @param folderId If applicable, the unique identifier of the folder that contains the document.
	 * @param folderPath If applicable, the path of the folder hierarchy location that contains the document.
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.Document>
	 * @see com.mozu.api.contracts.content.Document
	 */
	public static MozuClient<com.mozu.api.contracts.content.Document> getTreeDocumentClient(com.mozu.api.DataViewMode dataViewMode, String documentListName, String documentName, String folderPath, String folderId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.documentlists.DocumentTreeUrl.getTreeDocumentUrl(documentListName, documentName, folderId, folderPath);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.content.Document.class;
		MozuClient<com.mozu.api.contracts.content.Document> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * Updates the content associated with a document, such as a product image or PDF specifications file, based on the document's position in the document hierarchy.
	 * <p><pre><code>
	 * MozuClient mozuClient=UpdateTreeDocumentContentClient(dataViewMode,  stream,  documentListName,  documentName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param documentListName The name of the document list associated with the document.
	 * @param documentName The name of the document, which is unique within its folder.
	 * @param authTicket User Auth Ticket
	 * @param stream 
	 * @return Mozu.Api.MozuClient 
	 * @see Stream
	 */
	public static MozuClient updateTreeDocumentContentClient(com.mozu.api.DataViewMode dataViewMode, java.io.InputStream stream, String documentListName, String documentName) throws Exception
	{
		return updateTreeDocumentContentClient(dataViewMode,  stream,  documentListName,  documentName,  null,  null, null);
	}

	/**
	 * Updates the content associated with a document, such as a product image or PDF specifications file, based on the document's position in the document hierarchy.
	 * <p><pre><code>
	 * MozuClient mozuClient=UpdateTreeDocumentContentClient(dataViewMode,  stream,  documentListName,  documentName,  folderPath,  folderId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param documentListName The name of the document list associated with the document.
	 * @param documentName The name of the document, which is unique within its folder.
	 * @param folderId If applicable, the unique identifier of the folder that contains the document.
	 * @param folderPath If applicable, the path of the folder hierarchy location associated with the document.
	 * @param authTicket User Auth Ticket
	 * @param stream 
	 * @return Mozu.Api.MozuClient 
	 * @see Stream
	 */
	public static MozuClient updateTreeDocumentContentClient(com.mozu.api.DataViewMode dataViewMode, java.io.InputStream stream, String documentListName, String documentName, String folderPath, String folderId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.documentlists.DocumentTreeUrl.updateTreeDocumentContentUrl(documentListName, documentName, folderId, folderPath);
		String verb = "PUT";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(stream);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * Deletes the content associated with a document, such as a product image or PDF specifications file.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteTreeDocumentContentClient(dataViewMode,  stream,  documentListName,  documentName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param documentListName The name of the document list associated with the document.
	 * @param documentName The name of the document, which is unique within its folder.
	 * @param authTicket User Auth Ticket
	 * @param stream 
	 * @return Mozu.Api.MozuClient 
	 * @see Stream
	 */
	public static MozuClient deleteTreeDocumentContentClient(com.mozu.api.DataViewMode dataViewMode, java.io.InputStream stream, String documentListName, String documentName) throws Exception
	{
		return deleteTreeDocumentContentClient(dataViewMode,  stream,  documentListName,  documentName,  null,  null, null);
	}

	/**
	 * Deletes the content associated with a document, such as a product image or PDF specifications file.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteTreeDocumentContentClient(dataViewMode,  stream,  documentListName,  documentName,  folderPath,  folderId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param documentListName The name of the document list associated with the document.
	 * @param documentName The name of the document, which is unique within its folder.
	 * @param folderId If applicable, the unique identifier of the folder that contains the document.
	 * @param folderPath If applicable, the path of the folder hierarchy location associated with the document.
	 * @param authTicket User Auth Ticket
	 * @param stream 
	 * @return Mozu.Api.MozuClient 
	 * @see Stream
	 */
	public static MozuClient deleteTreeDocumentContentClient(com.mozu.api.DataViewMode dataViewMode, java.io.InputStream stream, String documentListName, String documentName, String folderPath, String folderId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.documentlists.DocumentTreeUrl.deleteTreeDocumentContentUrl(documentListName, documentName, folderId, folderPath);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(stream);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

}



