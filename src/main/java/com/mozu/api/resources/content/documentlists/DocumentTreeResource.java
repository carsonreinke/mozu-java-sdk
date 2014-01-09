/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.content.documentlists;

import com.mozu.api.ApiContext;
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
public class DocumentTreeResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;
	public DocumentTreeResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * Retrieves a document based on its document list and folder path in the document hierarchy.
	 * <p><pre><code>
	 *	DocumentTree documenttree = new DocumentTree();
	 *	Document document = documenttree.GetTreeDocument(dataViewMode,  documentListName,  documentName, authTicket);
	 * </code></pre></p>
	 * @param documentListName The name of the document list associated with the document.
	 * @param documentName The name of the document, which is unique within its folder.
	 * @param authTicket User Auth Ticket
	 * @return com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 */
	public com.mozu.api.contracts.content.Document getTreeDocument(com.mozu.api.DataViewMode dataViewMode, String documentListName, String documentName, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.Document> client = com.mozu.api.clients.content.documentlists.DocumentTreeClient.getTreeDocumentClient(dataViewMode,  documentListName,  documentName, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieve the content associated with the document, such as a product image or PDF specifications file.
	 * <p><pre><code>
	 *	DocumentTree documenttree = new DocumentTree();
	 *	Stream stream = documenttree.GetTreeDocumentContent(dataViewMode,  documentListName,  documentName, authTicket);
	 * </code></pre></p>
	 * @param documentListName The name of the document list associated with the document.
	 * @param documentName The name of the document, which is unique within its folder.
	 * @param authTicket User Auth Ticket
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream getTreeDocumentContent(com.mozu.api.DataViewMode dataViewMode, String documentListName, String documentName, AuthTicket authTicket) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.content.documentlists.DocumentTreeClient.getTreeDocumentContentClient(dataViewMode,  documentListName,  documentName, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates the content associated with a document, such as a product image or PDF specifications file, based on the document's position in the document hierarchy.
	 * <p><pre><code>
	 *	DocumentTree documenttree = new DocumentTree();
	 *	documenttree.UpdateTreeDocumentContent(dataViewMode,  stream,  documentListName,  documentName, authTicket);
	 * </code></pre></p>
	 * @param documentListName The name of the document list associated with the document.
	 * @param documentName The name of the document, which is unique within its folder.
	 * @param authTicket User Auth Ticket
	 * @param stream 
	 * @return 
	 * @see Stream
	 */
	public void updateTreeDocumentContent(com.mozu.api.DataViewMode dataViewMode, java.io.InputStream stream, String documentListName, String documentName, AuthTicket authTicket) throws Exception
	{
		MozuClient client = com.mozu.api.clients.content.documentlists.DocumentTreeClient.updateTreeDocumentContentClient(dataViewMode,  stream,  documentListName,  documentName, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();

	}

	/**
	 * Deletes the content associated with a document, such as a product image or PDF specifications file.
	 * <p><pre><code>
	 *	DocumentTree documenttree = new DocumentTree();
	 *	documenttree.DeleteTreeDocumentContent(dataViewMode,  stream,  documentListName,  documentName, authTicket);
	 * </code></pre></p>
	 * @param documentListName The name of the document list associated with the document.
	 * @param documentName The name of the document, which is unique within its folder.
	 * @param authTicket User Auth Ticket
	 * @param stream 
	 * @return 
	 * @see Stream
	 */
	public void deleteTreeDocumentContent(com.mozu.api.DataViewMode dataViewMode, java.io.InputStream stream, String documentListName, String documentName, AuthTicket authTicket) throws Exception
	{
		MozuClient client = com.mozu.api.clients.content.documentlists.DocumentTreeClient.deleteTreeDocumentContentClient(dataViewMode,  stream,  documentListName,  documentName, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();

	}

}



