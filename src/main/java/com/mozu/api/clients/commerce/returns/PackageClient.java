/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.returns;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;

/** <summary>
 * Use the return packages subresource to manage physical packages used to ship return replacement items.
 * </summary>
 */
public class PackageClient {
	
	/**
	 * Retrieves the details of a package of return replacement items.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> mozuClient=GetPackageClient( returnId,  packageId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Package package = client.Result();
	 * </code></pre></p>
	 * @param packageId Unique identifier of the return replacement package to retrieve.
	 * @param returnId Unique identifier of the return associated with the replacement package to retrieve.
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.Package>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> getPackageClient(String returnId, String packageId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.returns.PackageUrl.getPackageUrl(packageId, returnId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.fulfillment.Package.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * Retrieves the package label image supplied by the carrier for a return replacement.
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=GetPackageLabelClient( returnId,  packageId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param packageId Unique identifier of the return replacement package for which to retrieve the label.
	 * @param returnId Unique identifier of the return associated with the replacement package label to retrieve.
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> getPackageLabelClient(String returnId, String packageId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.returns.PackageUrl.getPackageLabelUrl(packageId, returnId);
		String verb = "GET";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * Creates a new physical package of return replacement items.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> mozuClient=CreatePackageClient( pkg,  returnId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Package package = client.Result();
	 * </code></pre></p>
	 * @param returnId Unique identifier of the return for which to create a replacement package.
	 * @param authTicket User Auth Ticket
	 * @param package Properties of the physical package for a return replacement.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.Package>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> createPackageClient(com.mozu.api.contracts.commerceruntime.fulfillment.Package pkg, String returnId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.returns.PackageUrl.createPackageUrl(returnId);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.fulfillment.Package.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(pkg);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * Updates one or more properties of a package associated with a return replacement.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> mozuClient=UpdatePackageClient( pkg,  returnId,  packageId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Package package = client.Result();
	 * </code></pre></p>
	 * @param packageId Unique identifier of the return replacement package to update.
	 * @param returnId Unique identifier of the return associated with the replacement package to update.
	 * @param authTicket User Auth Ticket
	 * @param package Properties of the return replacement package to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.Package>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> updatePackageClient(com.mozu.api.contracts.commerceruntime.fulfillment.Package pkg, String returnId, String packageId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.returns.PackageUrl.updatePackageUrl(packageId, returnId);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.fulfillment.Package.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(pkg);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * Deletes a package associated with a return replacement.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeletePackageClient( returnId,  packageId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param packageId Unique identifier of the return replacement package to delete.
	 * @param returnId Unique identifier of the return associated with the replacement package to delete.
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deletePackageClient(String returnId, String packageId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.returns.PackageUrl.deletePackageUrl(packageId, returnId);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

}



