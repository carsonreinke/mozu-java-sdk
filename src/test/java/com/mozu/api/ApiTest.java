package com.mozu.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpHost;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mozu.api.contracts.appdev.AppAuthInfo;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.resources.platform.TenantResource;
import com.mozu.api.security.Authentication;
import com.mozu.api.utils.ConfigProperties;

public class ApiTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		Authentication.invalidateAuth();
	}

	@Test
	public void testBadLoginApi() throws Exception {
		String url = "http://mozu-si.com";
		String appId = "NON_EXISTANT";
		String sharedSecret = "BAD_SHARED_SECRET";
		
		try {
			Authentication.initialize(createAppAuthInfo(appId, sharedSecret), url);

			fail("Should have failed login");
		} catch (ApiException ae) {
			assertEquals("Error Message Wrong in API", "Mozu Error: Invalid Credentials: Invalid credentials. ", ae.getMessage());
			assertNotNull(ae.getApiError());
		} catch (Exception e) {
			fail ("wrong exception");
		}
	}

	@Test
	public void testLoginApi() throws Exception {
		String url = "http://mozu-si.com";
		String appId = "ffe0ea180c8a45fa8d3da231009187d5";
		String sharedSecret = "5d0023246ec842d391d8a231009187d5";

		String proxyHost = ConfigProperties.getStringProperty(ConfigProperties.PROXY_HOST);
		HttpHost httpHost = null;
		if (StringUtils.isNotBlank(proxyHost) ) {
			int proxyPort = ConfigProperties.getIntProperty(ConfigProperties.PROXY_PORT);
			 httpHost = new HttpHost(proxyHost, proxyPort); 
		}
		
		Authentication.initialize(createAppAuthInfo(appId, sharedSecret), url, null, httpHost);

		ApiContext context = new ApiContext(url);

		TenantResource tenantsApi = new TenantResource(context);
		Tenant tenant = tenantsApi.getTenant(5812);
		assertNotNull(tenant);

	}

	@Test
	public void testLoadConfigProperties() throws Exception {
		Authentication.initialize();

		ApiContext context = new ApiContext(ConfigProperties.getStringProperty(ConfigProperties.MOZU_BASE_URL));

		TenantResource tenantsApi = new TenantResource(context);
		Tenant tenant = tenantsApi.getTenant(5812);
		assertNotNull(tenant);

	}

	
	private AppAuthInfo createAppAuthInfo(String appId, String sharedSecret) {
		AppAuthInfo appAuthInfo = new AppAuthInfo();
		appAuthInfo.setApplicationId(appId);
		appAuthInfo.setSharedSecret(sharedSecret);
		
		return appAuthInfo;
	}
}
