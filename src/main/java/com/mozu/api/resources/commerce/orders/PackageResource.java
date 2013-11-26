/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.orders;

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
	 *	Package package = package.GetPackage( orderId,  packageId, authTicket);
	 * </code></pre></p>
	 * @param orderId 
	 * @param packageId 
	 * @param authTicket User Auth Ticket
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public com.mozu.api.contracts.commerceruntime.fulfillment.Package getPackage(String orderId, String packageId, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> client = com.mozu.api.clients.commerce.orders.PackageClient.getPackageClient( orderId,  packageId, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	string string = package.GetAvailablePackageFulfillmentActions( orderId,  packageId, authTicket);
	 * </code></pre></p>
	 * @param orderId 
	 * @param packageId 
	 * @param authTicket User Auth Ticket
	 * @return List<string>
	 * @see string
	 */
	public List<String> getAvailablePackageFulfillmentActions(String orderId, String packageId, AuthTicket authTicket) throws Exception
	{
		MozuClient<List<String>> client = com.mozu.api.clients.commerce.orders.PackageClient.getAvailablePackageFulfillmentActionsClient( orderId,  packageId, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	package.GetPackageLabel( orderId,  packageId, authTicket);
	 * </code></pre></p>
	 * @param orderId 
	 * @param packageId 
	 * @param authTicket User Auth Ticket
	 * @return 
	 */
	public void getPackageLabel(String orderId, String packageId, AuthTicket authTicket) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.orders.PackageClient.getPackageLabelClient( orderId,  packageId, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	Package package = package.CreatePackage( pkg,  orderId, authTicket);
	 * </code></pre></p>
	 * @param orderId 
	 * @param authTicket User Auth Ticket
	 * @param package 
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public com.mozu.api.contracts.commerceruntime.fulfillment.Package createPackage(com.mozu.api.contracts.commerceruntime.fulfillment.Package pkg, String orderId, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> client = com.mozu.api.clients.commerce.orders.PackageClient.createPackageClient( pkg,  orderId, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	Package package = package.UpdatePackage( pkg,  orderId,  packageId, authTicket);
	 * </code></pre></p>
	 * @param orderId 
	 * @param packageId 
	 * @param authTicket User Auth Ticket
	 * @param package 
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public com.mozu.api.contracts.commerceruntime.fulfillment.Package updatePackage(com.mozu.api.contracts.commerceruntime.fulfillment.Package pkg, String orderId, String packageId, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> client = com.mozu.api.clients.commerce.orders.PackageClient.updatePackageClient( pkg,  orderId,  packageId, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Package package = new Package();
	 *	package.DeletePackage( orderId,  packageId, authTicket);
	 * </code></pre></p>
	 * @param orderId 
	 * @param packageId 
	 * @param authTicket User Auth Ticket
	 * @return 
	 */
	public void deletePackage(String orderId, String packageId, AuthTicket authTicket) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.orders.PackageClient.deletePackageClient( orderId,  packageId, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();

	}

}



