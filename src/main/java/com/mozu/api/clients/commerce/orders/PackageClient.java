/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.orders;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;

/** <summary>
 * Use the packages subresource to manage the physical packages to ship for an order.
 * </summary>
 */
public class PackageClient {
	
	/**
	 * Retrieves the details of a package of order items.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> mozuClient=GetPackageClient( orderId,  packageId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Package package = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the package to retrieve.
	 * @param packageId Unique identifier of the package to retrieve.
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.Package>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> getPackageClient(String orderId, String packageId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.PackageUrl.getPackageUrl(orderId, packageId);
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
	 * Retrieves a list of the actions available to perform for a package associated with order fulfillment.
	 * <p><pre><code>
	 * MozuClient<List<String>> mozuClient=GetAvailablePackageFulfillmentActionsClient( orderId,  packageId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * string string = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the package fulfillment.
	 * @param packageId Unique identifier of the package associated with the fulfillment actions to retrieve.
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <List<string>>
	 * @see string
	 */
	public static MozuClient<List<String>> getAvailablePackageFulfillmentActionsClient(String orderId, String packageId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.PackageUrl.getAvailablePackageFulfillmentActionsUrl(orderId, packageId);
		String verb = "GET";
		Class<?> clz = new ArrayList<String>(){}.getClass();
		MozuClient<List<String>> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

	/**
	 * Retrieves the package label image supplied by the carrier.
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=GetPackageLabelClient( orderId,  packageId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the package label to retrieve.
	 * @param packageId Unique identifier of the package for which to retrieve the label.
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> getPackageLabelClient(String orderId, String packageId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.PackageUrl.getPackageLabelUrl(orderId, packageId);
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
	 * Creates a new physical package of order items.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> mozuClient=CreatePackageClient( pkg,  orderId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Package package = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with this package.
	 * @param authTicket User Auth Ticket
	 * @param package Properties of the physical package of order items.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.Package>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> createPackageClient(com.mozu.api.contracts.commerceruntime.fulfillment.Package pkg, String orderId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.PackageUrl.createPackageUrl(orderId);
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
	 * Updates one or more properties of a physical package of order items.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> mozuClient=UpdatePackageClient( pkg,  orderId,  packageId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Package package = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the package to update.
	 * @param packageId Unique identifier of the package of order items to update.
	 * @param authTicket User Auth Ticket
	 * @param package Wrapper of properties for the package of order items to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.Package>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Package> updatePackageClient(com.mozu.api.contracts.commerceruntime.fulfillment.Package pkg, String orderId, String packageId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.PackageUrl.updatePackageUrl(orderId, packageId);
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
	 * Removes a physical package of items from the specified order.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeletePackageClient( orderId,  packageId, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the package to delete.
	 * @param packageId Unique identifier of the package to delete.
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deletePackageClient(String orderId, String packageId, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.PackageUrl.deletePackageUrl(orderId, packageId);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

}



