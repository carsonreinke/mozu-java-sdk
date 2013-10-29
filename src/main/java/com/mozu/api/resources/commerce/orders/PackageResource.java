/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.resources.commerce.orders;

import com.mozu.api.ApiContext;
import com.mozu.api.resources.BaseResource;
import java.util.ArrayList;
import com.mozu.api.MozuClient;

/// <summary>
/// Use the packages subresource to manage the physical packages to ship for an order.
/// </summary>
public class PackageResource extends BaseResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;
	
	public PackageResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	* Retrieves the details of a package of order items.
	* <p><pre><code>
	*    Package package = new Package();
	*   Package package = package.GetPackage( orderId,  packageId);
	* </code></pre></p>
	* @param orderId Unique identifier of the order associated with the package to retrieve.
	* @param packageId Unique identifier of the package to retrieve.
	* @return com.mozu.api.contracts.commerceruntime.shipping.Package
	* @see com.mozu.api.contracts.commerceruntime.shipping.Package
	*/
	public com.mozu.api.contracts.commerceruntime.shipping.Package getPackage(String orderId, String packageId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.shipping.Package> client = com.mozu.api.clients.commerce.orders.PackageClient.getPackageClient( orderId,  packageId);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

/**
	* Retrieves the package label image supplied by the carrier.
	* <p><pre><code>
	*    Package package = new Package();
	*   package.GetPackageLabel( orderId,  packageId);
	* </code></pre></p>
	* @param orderId Unique identifier of the order associated with the package label to retrieve.
	* @param packageId Unique identifier of the package for which to retrieve the label.
	* @return 
	*/
	public void getPackageLabel(String orderId, String packageId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.orders.PackageClient.getPackageLabelClient( orderId,  packageId);
		setContext(_apiContext, client,true);
		client.executeRequest();

	}

	/**
	* Creates a new physical package of order items.
	* <p><pre><code>
	*    Package package = new Package();
	*   Package package = package.CreatePackage( orderId,  pkg);
	* </code></pre></p>
	* @param orderId Unique identifier of the order associated with this package.
	* @param package Properties of the physical package of order items.
	* @return com.mozu.api.contracts.commerceruntime.shipping.Package
	* @see com.mozu.api.contracts.commerceruntime.shipping.Package
	* @see com.mozu.api.contracts.commerceruntime.shipping.Package
	*/
	public com.mozu.api.contracts.commerceruntime.shipping.Package createPackage(String orderId, com.mozu.api.contracts.commerceruntime.shipping.Package pkg) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.shipping.Package> client = com.mozu.api.clients.commerce.orders.PackageClient.createPackageClient( orderId,  pkg);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

	/**
	* Updates one or more properties of a physical package of order items.
	* <p><pre><code>
	*    Package package = new Package();
	*   Package package = package.UpdatePackage( orderId,  packageId,  pkg);
	* </code></pre></p>
	* @param orderId Unique identifier of the order associated with the package to update.
	* @param packageId Unique identifier of the package of order items to update.
	* @param package Wrapper of properties for the package of order items to update.
	* @return com.mozu.api.contracts.commerceruntime.shipping.Package
	* @see com.mozu.api.contracts.commerceruntime.shipping.Package
	* @see com.mozu.api.contracts.commerceruntime.shipping.Package
	*/
	public com.mozu.api.contracts.commerceruntime.shipping.Package updatePackage(String orderId, String packageId, com.mozu.api.contracts.commerceruntime.shipping.Package pkg) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.shipping.Package> client = com.mozu.api.clients.commerce.orders.PackageClient.updatePackageClient( orderId,  packageId,  pkg);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

	/**
	* Removes a physical package of items from the specified order.
	* <p><pre><code>
	*    Package package = new Package();
	*   package.DeletePackage( orderId,  packageId);
	* </code></pre></p>
	* @param orderId Unique identifier of the order associated with the package to delete.
	* @param packageId Unique identifier of the package to delete.
	* @return 
	*/
	public void deletePackage(String orderId, String packageId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.orders.PackageClient.deletePackageClient( orderId,  packageId);
		setContext(_apiContext, client,true);
		client.executeRequest();

	}


}



