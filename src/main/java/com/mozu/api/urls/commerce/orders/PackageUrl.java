
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.urls.commerce.orders;

import com.mozu.api.utils.UrlFormatter;


public class PackageUrl
{

	/**
        * Get Resource Url for GetPackage
        * @param orderId Unique identifier of the order associated with the package to retrieve.
        * @param packageId Unique identifier of the package to retrieve.
        * @return    String Resource Url
    */
	public static String getPackageUrl(String orderId, String packageId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/packages/{packageId}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("packageId", packageId);
		return formatter.getResourceUrl();
	}

	/**
        * Get Resource Url for GetPackageLabel
        * @param orderId Unique identifier of the order associated with the package label to retrieve.
        * @param packageId Unique identifier of the package for which to retrieve the label.
        * @return    String Resource Url
    */
	public static String getPackageLabelUrl(String orderId, String packageId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/packages/{packageId}/label");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("packageId", packageId);
		return formatter.getResourceUrl();
	}

		/**
        * Get Resource Url for CreatePackage
        * @param orderId Unique identifier of the order associated with this package.
        * @return    String Resource Url
    */
	public static String createPackageUrl(String orderId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/packages");
		formatter.formatUrl("orderId", orderId);
		return formatter.getResourceUrl();
	}

		/**
        * Get Resource Url for UpdatePackage
        * @param orderId Unique identifier of the order associated with the package to update.
        * @param packageId Unique identifier of the package of order items to update.
        * @return    String Resource Url
    */
	public static String updatePackageUrl(String orderId, String packageId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/packages/{packageId}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("packageId", packageId);
		return formatter.getResourceUrl();
	}

		/**
        * Get Resource Url for DeletePackage
        * @param orderId Unique identifier of the order associated with the package to delete.
        * @param packageId Unique identifier of the package to delete.
        * @return    String Resource Url
    */
	public static String deletePackageUrl(String orderId, String packageId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/packages/{packageId}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("packageId", packageId);
		return formatter.getResourceUrl();
	}

	
}
