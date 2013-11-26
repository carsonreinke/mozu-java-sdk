/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.returns;

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
public class PackageResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;
	public PackageResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * 
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	Package package = package.GetPackage( packageId,  returnId, authTicket);
	 * </code></pre></p>
	 * @param packageId 
	 * @param returnId 
	 * @param authTicket User Auth Ticket
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public com.mozu.api.contracts.commerceruntime.fulfillment.Package getPackage(String packageId, String returnId, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> client = com.mozu.api.clients.commerce.returns.PackageClient.getPackageClient( packageId,  returnId, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	package.GetPackageLabel( packageId,  returnId, authTicket);
	 * </code></pre></p>
	 * @param packageId 
	 * @param returnId 
	 * @param authTicket User Auth Ticket
	 * @return 
	 */
	public void getPackageLabel(String packageId, String returnId, AuthTicket authTicket) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.returns.PackageClient.getPackageLabelClient( packageId,  returnId, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	Package package = package.CreatePackage( pkg,  returnId, authTicket);
	 * </code></pre></p>
	 * @param returnId 
	 * @param authTicket User Auth Ticket
	 * @param package 
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public com.mozu.api.contracts.commerceruntime.fulfillment.Package createPackage(com.mozu.api.contracts.commerceruntime.fulfillment.Package pkg, String returnId, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> client = com.mozu.api.clients.commerce.returns.PackageClient.createPackageClient( pkg,  returnId, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	Package package = package.UpdatePackage( pkg,  packageId,  returnId, authTicket);
	 * </code></pre></p>
	 * @param packageId 
	 * @param returnId 
	 * @param authTicket User Auth Ticket
	 * @param package 
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public com.mozu.api.contracts.commerceruntime.fulfillment.Package updatePackage(com.mozu.api.contracts.commerceruntime.fulfillment.Package pkg, String packageId, String returnId, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> client = com.mozu.api.clients.commerce.returns.PackageClient.updatePackageClient( pkg,  packageId,  returnId, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	package.DeletePackage( packageId,  returnId, authTicket);
	 * </code></pre></p>
	 * @param packageId 
	 * @param returnId 
	 * @param authTicket User Auth Ticket
	 * @return 
	 */
	public void deletePackage(String packageId, String returnId, AuthTicket authTicket) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.returns.PackageClient.deletePackageClient( packageId,  returnId, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();

	}

}



