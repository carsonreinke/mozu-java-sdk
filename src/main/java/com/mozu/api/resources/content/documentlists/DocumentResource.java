/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.resources.content.documentlists;

import com.mozu.api.ApiContext;
import com.mozu.api.resources.BaseResource;
import java.util.ArrayList;
import com.mozu.api.MozuClient;

/// <summary>
/// Use this subresource to manage documents in a document list.
/// </summary>
public class DocumentResource extends BaseResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;
	
	public DocumentResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	* Retrieve the content associated with a document, such as a product image or PDF specifications file, by supplying the document ID.
	* <p><pre><code>
	*    Document document = new Document();
	*   document.GetDocumentContent( documentId,  documentListName);
	* </code></pre></p>
	* @param documentId Unique identifier of the document.
	* @param documentListName The name of the document list associated with the document.
	* @return 
	*/
	public void getDocumentContent(String documentId, String documentListName) throws Exception
	{
		getDocumentContent( documentId,  documentListName,  null);
	}

/**
	* Retrieve the content associated with a document, such as a product image or PDF specifications file, by supplying the document ID.
	* <p><pre><code>
	*    Document document = new Document();
	*   document.GetDocumentContent( documentId,  documentListName,  publishState);
	* </code></pre></p>
	* @param documentId Unique identifier of the document.
	* @param documentListName The name of the document list associated with the document.
	* @param publishState The current state of the document, which is Active, Draft, or Latest. Active documents are published and cannot be deleted. Querying Latest returns the most recent version of the document, regardless of whether it is published or a draft.
	* @return 
	*/
	public void getDocumentContent(String documentId, String documentListName, String publishState) throws Exception
	{
		MozuClient client = com.mozu.api.clients.content.documentlists.DocumentClient.getDocumentContentClient( documentId,  documentListName,  publishState);
		setContext(_apiContext, client,true);
		client.executeRequest();

	}

/**
	* Retrieves a specific document within the specified document list by providing the document ID.
	* <p><pre><code>
	*    Document document = new Document();
	*   Document document = document.GetDocument( documentId,  documentListName);
	* </code></pre></p>
	* @param documentId Identifier of the document being retrieved.
	* @param documentListName The name of the document list associated with the document to retrieve.
	* @return com.mozu.api.contracts.content.Document
	* @see com.mozu.api.contracts.content.Document
	*/
	public com.mozu.api.contracts.content.Document getDocument(String documentId, String documentListName) throws Exception
	{
		return getDocument( documentId,  documentListName,  null);
	}

/**
	* Retrieves a specific document within the specified document list by providing the document ID.
	* <p><pre><code>
	*    Document document = new Document();
	*   Document document = document.GetDocument( documentId,  documentListName,  publishState);
	* </code></pre></p>
	* @param documentId Identifier of the document being retrieved.
	* @param documentListName The name of the document list associated with the document to retrieve.
	* @param publishState The current state of the document, which is Active, Draft, or Latest. Active documents are published and cannot be deleted. Querying Latest returns the most recent version of the document, regardless of whether it is published or a draft.
	* @return com.mozu.api.contracts.content.Document
	* @see com.mozu.api.contracts.content.Document
	*/
	public com.mozu.api.contracts.content.Document getDocument(String documentId, String documentListName, String publishState) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.Document> client = com.mozu.api.clients.content.documentlists.DocumentClient.getDocumentClient( documentId,  documentListName,  publishState);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

/**
	* Retrieves a collection of documents according to any filter and sort criteria.
	* <p><pre><code>
	*    Document document = new Document();
	*   DocumentCollection documentCollection = document.GetDocuments( documentListName);
	* </code></pre></p>
	* @param documentListName The name of the document list.
	* @return com.mozu.api.contracts.content.DocumentCollection
	* @see com.mozu.api.contracts.content.DocumentCollection
	*/
	public com.mozu.api.contracts.content.DocumentCollection getDocuments(String documentListName) throws Exception
	{
		return getDocuments( documentListName,  null,  null,  null,  null,  null);
	}

/**
	* Retrieves a collection of documents according to any filter and sort criteria.
	* <p><pre><code>
	*    Document document = new Document();
	*   DocumentCollection documentCollection = document.GetDocuments( documentListName,  filter,  pageSize,  publishState,  sortBy,  startIndex);
	* </code></pre></p>
	* @param documentListName The name of the document list.
	* @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. You can filter a document's search results by any of its properties, including its name or folder path. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). <b>For example - "filter=Name+sw+Events"</b>
	* @param pageSize Specifies the number of results to display on each page when creating paged results from a query. The maximum value is 200.
	* @param publishState The current state of the document, which is Active, Draft, or Latest. Active documents are published and cannot be deleted. Querying Latest returns the most recent version of the document, regardless of whether it is published or a draft.
	* @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	* @param startIndex Indicates the zero-based offset in the complete result set where the returned entities begin, when creating paged results from a query. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	* @return com.mozu.api.contracts.content.DocumentCollection
	* @see com.mozu.api.contracts.content.DocumentCollection
	*/
	public com.mozu.api.contracts.content.DocumentCollection getDocuments(String documentListName, String filter, Long pageSize, String publishState, String sortBy, Long startIndex) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.DocumentCollection> client = com.mozu.api.clients.content.documentlists.DocumentClient.getDocumentsClient( documentListName,  filter,  pageSize,  publishState,  sortBy,  startIndex);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

	/**
	* Creates a new document in an existing list.
	* <p><pre><code>
	*    Document document = new Document();
	*   Document document = document.CreateDocument( documentListName,  document);
	* </code></pre></p>
	* @param documentListName The descriptive alphanumeric document list name being created.
	* @param document The descriptive name of the newly created document.
	* @return com.mozu.api.contracts.content.Document
	* @see com.mozu.api.contracts.content.Document
	* @see com.mozu.api.contracts.content.Document
	*/
	public com.mozu.api.contracts.content.Document createDocument(String documentListName, com.mozu.api.contracts.content.Document document) throws Exception
	{
		return createDocument( documentListName,  null,  document);
	}

/**
	* Creates a new document in an existing list.
	* <p><pre><code>
	*    Document document = new Document();
	*   Document document = document.CreateDocument( documentListName,  publishState,  document);
	* </code></pre></p>
	* @param documentListName The descriptive alphanumeric document list name being created.
	* @param publishState The current state of the document, which is Active, Draft, or Latest. Active documents are published and cannot be deleted. Querying Latest returns the most recent version of the document, regardless of whether it is published or a draft.
	* @param document The descriptive name of the newly created document.
	* @return com.mozu.api.contracts.content.Document
	* @see com.mozu.api.contracts.content.Document
	* @see com.mozu.api.contracts.content.Document
	*/
	public com.mozu.api.contracts.content.Document createDocument(String documentListName, String publishState, com.mozu.api.contracts.content.Document document) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.Document> client = com.mozu.api.clients.content.documentlists.DocumentClient.createDocumentClient( documentListName,  publishState,  document);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

	/**
	* Updates the content associated with a document, such as a product image or PDF specifications file, by supplying the document ID.
	* <p><pre><code>
	*    Document document = new Document();
	*   document.UpdateDocumentContent( documentId,  documentListName);
	* </code></pre></p>
	* @param documentId Unique identifier of the document.
	* @param documentListName The name of the document list associated with the document.
	* @return 
	*/
	public void updateDocumentContent(String documentId, String documentListName) throws Exception
	{
		MozuClient client = com.mozu.api.clients.content.documentlists.DocumentClient.updateDocumentContentClient( documentId,  documentListName);
		setContext(_apiContext, client,true);
		client.executeRequest();

	}

/**
	* Updates a document in a document list.
	* <p><pre><code>
	*    Document document = new Document();
	*   Document document = document.UpdateDocument( documentId,  documentListName,  document);
	* </code></pre></p>
	* @param documentId Unique identifier of the document to update.
	* @param documentListName Name of the document list associated with the document.
	* @param document Properties of the document to update.
	* @return com.mozu.api.contracts.content.Document
	* @see com.mozu.api.contracts.content.Document
	* @see com.mozu.api.contracts.content.Document
	*/
	public com.mozu.api.contracts.content.Document updateDocument(String documentId, String documentListName, com.mozu.api.contracts.content.Document document) throws Exception
	{
		return updateDocument( documentId,  documentListName,  null,  document);
	}

/**
	* Updates a document in a document list.
	* <p><pre><code>
	*    Document document = new Document();
	*   Document document = document.UpdateDocument( documentId,  documentListName,  publishState,  document);
	* </code></pre></p>
	* @param documentId Unique identifier of the document to update.
	* @param documentListName Name of the document list associated with the document.
	* @param publishState The current state of the document, which is Active, Draft, or Latest. Active documents are published and cannot be deleted. Querying Latest returns the most recent version of the document, regardless of whether it is published or a draft.
	* @param document Properties of the document to update.
	* @return com.mozu.api.contracts.content.Document
	* @see com.mozu.api.contracts.content.Document
	* @see com.mozu.api.contracts.content.Document
	*/
	public com.mozu.api.contracts.content.Document updateDocument(String documentId, String documentListName, String publishState, com.mozu.api.contracts.content.Document document) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.Document> client = com.mozu.api.clients.content.documentlists.DocumentClient.updateDocumentClient( documentId,  documentListName,  publishState,  document);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

	/**
	* Deletes the content associated with a document, such as a product image or PDF specification, by supplying the document ID.
	* <p><pre><code>
	*    Document document = new Document();
	*   document.DeleteDocumentContent( documentId,  documentListName);
	* </code></pre></p>
	* @param documentId Unique identifier of the document.
	* @param documentListName The name of the document list associated with the document.
	* @return 
	*/
	public void deleteDocumentContent(String documentId, String documentListName) throws Exception
	{
		MozuClient client = com.mozu.api.clients.content.documentlists.DocumentClient.deleteDocumentContentClient( documentId,  documentListName);
		setContext(_apiContext, client,true);
		client.executeRequest();

	}

/**
	* Deletes a specific document based on the specified document ID.
	* <p><pre><code>
	*    Document document = new Document();
	*   document.DeleteDocument( documentId,  documentListName);
	* </code></pre></p>
	* @param documentId Identifier of the document being deleted.
	* @param documentListName The name of the document list associated with the document list being deleted.
	* @return 
	*/
	public void deleteDocument(String documentId, String documentListName) throws Exception
	{
		deleteDocument( documentId,  documentListName,  null);
	}

/**
	* Deletes a specific document based on the specified document ID.
	* <p><pre><code>
	*    Document document = new Document();
	*   document.DeleteDocument( documentId,  documentListName,  publishState);
	* </code></pre></p>
	* @param documentId Identifier of the document being deleted.
	* @param documentListName The name of the document list associated with the document list being deleted.
	* @param publishState The current state of the document, which is Active, Draft, or Latest. Active documents are published and cannot be deleted. Querying Latest returns the most recent version of the document, regardless of whether it is published or a draft.
	* @return 
	*/
	public void deleteDocument(String documentId, String documentListName, String publishState) throws Exception
	{
		MozuClient client = com.mozu.api.clients.content.documentlists.DocumentClient.deleteDocumentClient( documentId,  documentListName,  publishState);
		setContext(_apiContext, client,true);
		client.executeRequest();

	}


}


