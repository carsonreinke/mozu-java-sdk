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
 * Use the Properties resource to configure a property attribute for an individual product associated with a product type that uses the property attribute, as well as set property values for the product.
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
	 * Retrieves a list of the property attributes configured for the product specified in the request.
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
	 * Retrieves the details of a property attribute configuration for the product specified in the request.
	 * <p><pre><code>
	 *	ProductProperty productproperty = new ProductProperty();
	 *	ProductProperty productProperty = productproperty.GetProperty(dataViewMode,  productCode,  attributeFQN, authTicket);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode 
	 * @param authTicket User Auth Ticket
	 * @return com.mozu.api.contracts.productadmin.ProductProperty
	 * @see com.mozu.api.contracts.productadmin.ProductProperty
	 */
	public com.mozu.api.contracts.productadmin.ProductProperty getProperty(com.mozu.api.DataViewMode dataViewMode, String productCode, String attributeFQN, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductProperty> client = com.mozu.api.clients.commerce.catalog.admin.products.ProductPropertyClient.getPropertyClient(dataViewMode,  productCode,  attributeFQN, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Configures a property attribute for the product specified in the request.
	 * <p><pre><code>
	 *	ProductProperty productproperty = new ProductProperty();
	 *	ProductProperty productProperty = productproperty.AddProperty(dataViewMode,  productProperty,  productCode, authTicket);
	 * </code></pre></p>
	 * @param productCode 
	 * @param authTicket User Auth Ticket
	 * @param productProperty Properties of the property attribute to configure for a product.
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
	 * Update one or more details of a property attribute configuration for the product specified in the request.
	 * <p><pre><code>
	 *	ProductProperty productproperty = new ProductProperty();
	 *	ProductProperty productProperty = productproperty.UpdateProperty(dataViewMode,  productProperty,  productCode,  attributeFQN, authTicket);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode 
	 * @param authTicket User Auth Ticket
	 * @param productProperty Details of the property attribute to update for the product configuration.
	 * @return com.mozu.api.contracts.productadmin.ProductProperty
	 * @see com.mozu.api.contracts.productadmin.ProductProperty
	 * @see com.mozu.api.contracts.productadmin.ProductProperty
	 */
	public com.mozu.api.contracts.productadmin.ProductProperty updateProperty(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductProperty productProperty, String productCode, String attributeFQN, AuthTicket authTicket) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductProperty> client = com.mozu.api.clients.commerce.catalog.admin.products.ProductPropertyClient.updatePropertyClient(dataViewMode,  productProperty,  productCode,  attributeFQN, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Deletes the configuration of a property attribute for the product specified in the request.
	 * <p><pre><code>
	 *	ProductProperty productproperty = new ProductProperty();
	 *	productproperty.DeleteProperty(dataViewMode,  productCode,  attributeFQN, authTicket);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode 
	 * @param authTicket User Auth Ticket
	 * @return 
	 */
	public void deleteProperty(com.mozu.api.DataViewMode dataViewMode, String productCode, String attributeFQN, AuthTicket authTicket) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.products.ProductPropertyClient.deletePropertyClient(dataViewMode,  productCode,  attributeFQN, authTicket);
		client.setContext(_apiContext);
		client.executeRequest();

	}

}



