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
 * 
 * </summary>
 */
public class FolderTreeResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;
	public FolderTreeResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * 
	 * <p><pre><code>
	 *	FolderTree foldertree = new FolderTree();
	 *	FolderTree folderTree = foldertree.GetFolderTree( documentListName);
	 * </code></pre></p>
	 * @param documentListName 
	 * @param authTicket User Auth Ticket
	 * @return com.mozu.api.contracts.content.FolderTree
	 * @see com.mozu.api.contracts.content.FolderTree
	 */
	public com.mozu.api.contracts.content.FolderTree getFolderTree(String documentListName) throws Exception
	{
		return getFolderTree( documentListName,  null,  null,  null, null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	FolderTree foldertree = new FolderTree();
	 *	FolderTree folderTree = foldertree.GetFolderTree( documentListName,  levels,  rootFolderId,  rootFolderPath, authTicket);
	 * </code></pre></p>
	 * @param documentListName 
	 * @param levels 
	 * @param rootFolderId 
	 * @param rootFolderPath 
	 * @param authTicket User Auth Ticket
	 * @return com.mozu.api.contracts.content.FolderTree
	 * @see com.mozu.api.contracts.content.FolderTree
	 */
	public com.mozu.api.contracts.content.FolderTree getFolderTree(String documentListName, Integer levels, String rootFolderId, String rootFolderPath, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.FolderTree> client = com.mozu.api.clients.content.documentlists.FolderTreeClient.getFolderTreeClient( documentListName,  levels,  rootFolderId,  rootFolderPath, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



