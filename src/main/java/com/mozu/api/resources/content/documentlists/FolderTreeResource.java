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
/// Use the folder tree subresource to view individual folders in the document hierarchy.
/// </summary>
public class FolderTreeResource extends BaseResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;
	
	public FolderTreeResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	* Retrieves the folder hierarchy used to organize documents in lists.
	* <p><pre><code>
	*    FolderTree foldertree = new FolderTree();
	*   FolderTree folderTree = foldertree.GetFolderTree( documentListName);
	* </code></pre></p>
	* @param documentListName The name of the document list that contains this folder hierarchy.
	* @return com.mozu.api.contracts.content.FolderTree
	* @see com.mozu.api.contracts.content.FolderTree
	*/
	public com.mozu.api.contracts.content.FolderTree getFolderTree(String documentListName) throws Exception
	{
		return getFolderTree( documentListName,  null,  null,  null);
	}

/**
	* Retrieves the folder hierarchy used to organize documents in lists.
	* <p><pre><code>
	*    FolderTree foldertree = new FolderTree();
	*   FolderTree folderTree = foldertree.GetFolderTree( documentListName,  levels,  rootFolderId,  rootFolderPath);
	* </code></pre></p>
	* @param documentListName The name of the document list that contains this folder hierarchy.
	* @param levels The number of levels in the folder hierarchy to return.
	* @param rootFolderId The unique identifier of the top-level folder in the document list.
	* @param rootFolderPath The location in the document hierarchy of the top-level folder in the document list.
	* @return com.mozu.api.contracts.content.FolderTree
	* @see com.mozu.api.contracts.content.FolderTree
	*/
	public com.mozu.api.contracts.content.FolderTree getFolderTree(String documentListName, Long levels, String rootFolderId, String rootFolderPath) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.FolderTree> client = com.mozu.api.clients.content.documentlists.FolderTreeClient.getFolderTreeClient( documentListName,  levels,  rootFolderId,  rootFolderPath);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

			
}


