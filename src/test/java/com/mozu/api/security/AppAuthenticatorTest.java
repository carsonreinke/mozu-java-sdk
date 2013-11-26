package com.mozu.api.security;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mozu.api.ApiContext;
import com.mozu.api.ApiException;
import com.mozu.api.MozuApiContext;
import com.mozu.api.contracts.appdev.AppAuthInfo;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.resources.platform.TenantResource;
import com.mozu.api.security.AppAuthenticator;

public class AppAuthenticatorTest {
    static public final String URL = "http://home.mozu-ci.volusion.com";
    static public final String APP_ID = "cec2822bdec54d2c9715a26c010941b1";
    static public final String SHARED_SECRET = "b832b3a6127741be8dd4a26c010941b1";
    
    static public final int TENANT_ID = 8787;
    

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
		AppAuthenticator.invalidateAuth();
	}

	@Test
	public void testBadLoginApi() throws Exception {
		String url = URL;
		String appId = "NON_EXISTANT";
		String sharedSecret = "BAD_SHARED_SECRET";
		
		try {
			AppAuthenticator.initialize(createAppAuthInfo(appId, sharedSecret), url, null);

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
		String url = URL;
		String appId = APP_ID;
		String sharedSecret = SHARED_SECRET;

		AppAuthenticator.initialize(createAppAuthInfo(appId, sharedSecret), url, null);

		ApiContext context = new MozuApiContext();

		TenantResource tenantsApi = new TenantResource();
		Tenant tenant = tenantsApi.getTenant(TENANT_ID,null);
		assertNotNull(tenant);

	}

	@Test
	public void testLoadConfigProperties() throws Exception {
		AppAuthenticator.initialize();

		ApiContext context = new MozuApiContext();

		TenantResource tenantsApi = new TenantResource();
		Tenant tenant = tenantsApi.getTenant(5812,null);
		assertNotNull(tenant);

	}

	
	private AppAuthInfo createAppAuthInfo(String appId, String sharedSecret) {
		AppAuthInfo appAuthInfo = new AppAuthInfo();
		appAuthInfo.setApplicationId(appId);
		appAuthInfo.setSharedSecret(sharedSecret);
		
		return appAuthInfo;
	}
}
