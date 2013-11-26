/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.admin.products;

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
public class ProductPropertyResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;
	public ProductPropertyResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * 
	 * <p><pre><code>
	 *	ProductProperty productproperty = new ProductProperty();
	 *	ProductProperty productProperty = productproperty.GetProperties(dataViewMode,  productCode, authTicket);
	 * </code></pre></p>
	 * @param productCode 
	 * @param authTicket User Auth Ticket
	 * @return List<com.mozu.api.contracts.productadmin.ProductProperty>
	 * @see com.mozu.api.contracts.productadmin.ProductProperty
	 */
	public List<com.mozu.api.contracts.productadmin.ProductProperty> getProperties(com.mozu.api.DataViewMode dataViewMode, String productCode, AuthTicket authTicket) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.ProductProperty>> client = com.mozu.api.clients.commerce.catalog.admin.products.ProductPropertyClient.getPropertiesClient(dataViewMode,  productCode, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductProperty productproperty = new ProductProperty();
	 *	ProductProperty productProperty = productproperty.GetProperty(dataViewMode,  attributeFQN,  productCode, authTicket);
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param productCode 
	 * @param authTicket User Auth Ticket
	 * @return com.mozu.api.contracts.productadmin.ProductProperty
	 * @see com.mozu.api.contracts.productadmin.ProductProperty
	 */
	public com.mozu.api.contracts.productadmin.ProductProperty getProperty(com.mozu.api.DataViewMode dataViewMode, String attributeFQN, String productCode, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductProperty> client = com.mozu.api.clients.commerce.catalog.admin.products.ProductPropertyClient.getPropertyClient(dataViewMode,  attributeFQN,  productCode, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductProperty productproperty = new ProductProperty();
	 *	ProductProperty productProperty = productproperty.AddProperty(dataViewMode,  productProperty,  productCode, authTicket);
	 * </code></pre></p>
	 * @param productCode 
	 * @param authTicket User Auth Ticket
	 * @param productProperty 
	 * @return com.mozu.api.contracts.productadmin.ProductProperty
	 * @see com.mozu.api.contracts.productadmin.ProductProperty
	 * @see com.mozu.api.contracts.productadmin.ProductProperty
	 */
	public com.mozu.api.contracts.productadmin.ProductProperty addProperty(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductProperty productProperty, String productCode, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductProperty> client = com.mozu.api.clients.commerce.catalog.admin.products.ProductPropertyClient.addPropertyClient(dataViewMode,  productProperty,  productCode, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductProperty productproperty = new ProductProperty();
	 *	ProductProperty productProperty = productproperty.UpdateProperty(dataViewMode,  productProperty,  attributeFQN,  productCode, authTicket);
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param productCode 
	 * @param authTicket User Auth Ticket
	 * @param productProperty 
	 * @return com.mozu.api.contracts.productadmin.ProductProperty
	 * @see com.mozu.api.contracts.productadmin.ProductProperty
	 * @see com.mozu.api.contracts.productadmin.ProductProperty
	 */
	public com.mozu.api.contracts.productadmin.ProductProperty updateProperty(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductProperty productProperty, String attributeFQN, String productCode, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductProperty> client = com.mozu.api.clients.commerce.catalog.admin.products.ProductPropertyClient.updatePropertyClient(dataViewMode,  productProperty,  attributeFQN,  productCode, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ProductProperty productproperty = new ProductProperty();
	 *	productproperty.DeleteProperty(dataViewMode,  attributeFQN,  productCode, authTicket);
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param productCode 
	 * @param authTicket User Auth Ticket
	 * @return 
	 */
	public void deleteProperty(com.mozu.api.DataViewMode dataViewMode, String attributeFQN, String productCode, AuthTicket authTicket) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.products.ProductPropertyClient.deletePropertyClient(dataViewMode,  attributeFQN,  productCode, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();

	}

}



