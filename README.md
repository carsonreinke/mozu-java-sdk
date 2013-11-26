
java-mozu-api
=============
<b>Usage</b><br/>

1. Authenticating an application<br/>
	- com.mozu.api.security.AppAuthenticator.initialize(AppAuthInfo,<Mozu Reverse Proxy Url>);
	
2. If you want the ability to control Access/Refresh token refresh interval use the below code (Expiration interval in seconds)

var refreshInterval = new RefreshInterval(300, 6000);<br/>
com.mozu.api.security.Authentication.initialize(AppAuthInfo,<Mozu Reverse Proxy Url>, refreshInterval);

3. SDK provides static methods to generate resource URLs, Clients.

	- com.mozu.api.urls contains the methods to generate the resource URL. 
	- com.mozu.api.clients contains the methods to build a MozuClient with all the required information filled in.

4. SDK also provides methods to invoke the api's and return the result
	- com.mozu.api.resources contains the methods to execute a request and return a strongly typed object
	- To query for a tenant:
		o ApiContext apiContext = new com.mozu.api.MozuApiContext();
		o TenantResource tenantResource = new TenantResource(apiContext);
		o Tenant tenant = tenantResource.getTenant(<tenantId>);
        
    - To Query for Products
       o ApiContext apiContext = new com.mozu.api.ApiContext(TenantId, SiteId};
       o ProductResource productResource = new ProductResource(apiContext);
       o List<Product> productCollection = productResource.getProducts(); //There are overloaded methods with optional parameters. 

5. A MozuClient is provided which is a wrapper around the HttpClient, below is a sample code to build and execute a request using MozuClient
	- String url = com.mozu.api.urls.platform.TenantUrl.getTenantUrl(tenantId);
		MozuClient<List<com.mozu.api.contracts.sitesettings.general.TaxableTerritory>> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(taxableterritories);
		if (authTicket != null)
			mozuClient.setUserAuth(authTicket);
    - Execute the request - mozuClient.executeRequest();
 		     client.executeRequest();
		     return client.getResult();
