/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin.attributedefinition.attributes;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;

/** <summary>
 * Type rules are subresources of product attributes which could be specifications that can be shared across products in a store or assigned to specific products. Attribute type rules provide definitions of how attribute types will appear on the user interface.
 * </summary>
 */
public class AttributeTypeRuleClient {
	
	/**
	 * Retrieves a list of attribute type rules according to optional filter criteria and sort options. Attribute type rules help drive the behavior of attributes on a storefront page.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeTypeRuleCollection> mozuClient=GetAttributeTypeRulesClient(dataViewMode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeTypeRuleCollection attributeTypeRuleCollection = client.Result();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeTypeRuleCollection>
	 * @see com.mozu.api.contracts.productadmin.AttributeTypeRuleCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeTypeRuleCollection> getAttributeTypeRulesClient(com.mozu.api.DataViewMode dataViewMode) throws Exception
	{
		return getAttributeTypeRulesClient(dataViewMode,  null,  null,  null,  null, null);
	}

	/**
	 * Retrieves a list of attribute type rules according to optional filter criteria and sort options. Attribute type rules help drive the behavior of attributes on a storefront page.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeTypeRuleCollection> mozuClient=GetAttributeTypeRulesClient(dataViewMode,  startIndex,  pageSize,  sortBy,  filter, authTicket);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeTypeRuleCollection attributeTypeRuleCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param sortBy 
	 * @param startIndex 
	 * @param dataViewMode DataViewMode
	 * @param authTicket User Auth Ticket
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeTypeRuleCollection>
	 * @see com.mozu.api.contracts.productadmin.AttributeTypeRuleCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeTypeRuleCollection> getAttributeTypeRulesClient(com.mozu.api.DataViewMode dataViewMode, Integer startIndex, Integer pageSize, String sortBy, String filter, AuthTicket authTicket) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.attributes.AttributeTypeRuleUrl.getAttributeTypeRulesUrl(filter, pageSize, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.AttributeTypeRuleCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.AttributeTypeRuleCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
		return mozuClient;

	}

}



