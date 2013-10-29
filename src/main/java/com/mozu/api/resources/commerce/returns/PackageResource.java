/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.resources.commerce.returns;

import com.mozu.api.ApiContext;
import com.mozu.api.resources.BaseResource;
import java.util.ArrayList;
import com.mozu.api.MozuClient;

/// <summary>
/// Use the return packages subresource to manage packages used to ship return replacement items.
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
	* Retrieves the details of a package of return replacement items.
	* <p><pre><code>
	*    Package package = new Package();
	*   Package package = package.GetPackage( packageId,  returnId);
	* </code></pre></p>
	* @param packageId Unique identifier of the return replacement package to retrieve.
	* @param returnId Unique identifier of the return associated with the replacement package to retrieve.
	* @return com.mozu.api.contracts.commerceruntime.shipping.Package
	* @see com.mozu.api.contracts.commerceruntime.shipping.Package
	*/
	public com.mozu.api.contracts.commerceruntime.shipping.Package getPackage(String packageId, String returnId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.shipping.Package> client = com.mozu.api.clients.commerce.returns.PackageClient.getPackageClient( packageId,  returnId);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

/**
	* Retrieves the package label image supplied by the carrier for a return replacement.
	* <p><pre><code>
	*    Package package = new Package();
	*   package.GetPackageLabel( packageId,  returnId);
	* </code></pre></p>
	* @param packageId Unique identifier of the return replacement package for which to retrieve the label.
	* @param returnId Unique identifier of the return associated with the replacement package label to retrieve.
	* @return 
	*/
	public void getPackageLabel(String packageId, String returnId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.returns.PackageClient.getPackageLabelClient( packageId,  returnId);
		setContext(_apiContext, client,true);
		client.executeRequest();

	}

	/**
	* Creates a new physical package of return replacement items.
	* <p><pre><code>
	*    Package package = new Package();
	*   Package package = package.CreatePackage( returnId,  pkg);
	* </code></pre></p>
	* @param returnId Unique identifier of the return for which to create a replacement package.
	* @param package Properties of the physical package for a return replacement.
	* @return com.mozu.api.contracts.commerceruntime.shipping.Package
	* @see com.mozu.api.contracts.commerceruntime.shipping.Package
	* @see com.mozu.api.contracts.commerceruntime.shipping.Package
	*/
	public com.mozu.api.contracts.commerceruntime.shipping.Package createPackage(String returnId, com.mozu.api.contracts.commerceruntime.shipping.Package pkg) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.shipping.Package> client = com.mozu.api.clients.commerce.returns.PackageClient.createPackageClient( returnId,  pkg);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

	/**
	* Updates one or more properties of a package associated with a return replacement.
	* <p><pre><code>
	*    Package package = new Package();
	*   Package package = package.UpdatePackage( packageId,  returnId,  pkg);
	* </code></pre></p>
	* @param packageId Unique identifier of the return replacement package to update.
	* @param returnId Unique identifier of the return associated with the replacement package to update.
	* @param package Properties of the return replacement package to update.
	* @return com.mozu.api.contracts.commerceruntime.shipping.Package
	* @see com.mozu.api.contracts.commerceruntime.shipping.Package
	* @see com.mozu.api.contracts.commerceruntime.shipping.Package
	*/
	public com.mozu.api.contracts.commerceruntime.shipping.Package updatePackage(String packageId, String returnId, com.mozu.api.contracts.commerceruntime.shipping.Package pkg) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.shipping.Package> client = com.mozu.api.clients.commerce.returns.PackageClient.updatePackageClient( packageId,  returnId,  pkg);
		setContext(_apiContext, client,true);
		client.executeRequest();
		return client.getResult();

	}

	/**
	* Deletes a package associated with a return replacement.
	* <p><pre><code>
	*    Package package = new Package();
	*   package.DeletePackage( packageId,  returnId);
	* </code></pre></p>
	* @param packageId Unique identifier of the return replacement package to delete.
	* @param returnId Unique identifier of the return associated with the replacement package to delete.
	* @return 
	*/
	public void deletePackage(String packageId, String returnId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.returns.PackageClient.deletePackageClient( packageId,  returnId);
		setContext(_apiContext, client,true);
		client.executeRequest();

	}


}



