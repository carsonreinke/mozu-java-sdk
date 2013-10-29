
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.urls.commerce.settings.general;

import com.mozu.api.utils.UrlFormatter;


public class IPBlockUrl
{

	/**
        * Get Resource Url for GetIPBlocks
        * @return    String Resource Url
    */
	public static String getIPBlocksUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/settings/general/ipblocks");
		return formatter.getResourceUrl();
	}

	/**
        * Get Resource Url for GetIPBlock
        * @param ipBlockId Unique identifier of the IP block.
        * @return    String Resource Url
    */
	public static String getIPBlockUrl(Integer ipBlockId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/settings/general/ipblocks/{ipBlockId}");
		formatter.formatUrl("ipBlockId", ipBlockId);
		return formatter.getResourceUrl();
	}

		/**
        * Get Resource Url for CreateIPBlock
        * @return    String Resource Url
    */
	public static String createIPBlockUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/settings/general/ipblocks");
		return formatter.getResourceUrl();
	}

		/**
        * Get Resource Url for UpdateIPBlock
        * @param ipBlockId Identifier of the IP block.
        * @return    String Resource Url
    */
	public static String updateIPBlockUrl(Integer ipBlockId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/settings/general/ipblocks/{ipBlockId}");
		formatter.formatUrl("ipBlockId", ipBlockId);
		return formatter.getResourceUrl();
	}

		/**
        * Get Resource Url for DeleteIPBlock
        * @param ipBlockId Unique identifier of the IP block.
        * @return    String Resource Url
    */
	public static String deleteIPBlockUrl(Integer ipBlockId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/settings/general/ipblocks/{ipBlockId}");
		formatter.formatUrl("ipBlockId", ipBlockId);
		return formatter.getResourceUrl();
	}

	
}

