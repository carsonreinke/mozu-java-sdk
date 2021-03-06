package com.mozu.api.security;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Test;

import com.mozu.api.ApiException;
import com.mozu.api.contracts.tenant.Tenant;
import com.mozu.api.resources.platform.TenantResource;

public class AppAuthenticatorTest extends SecurityTestBase {
	@After
	public void tearDown() throws Exception {
		super.tearDown();
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

		TenantResource tenantsApi = new TenantResource();
		Tenant tenant = tenantsApi.getTenant(TENANT_ID,null);
		assertNotNull(tenant);

	}

	@Test
	public void testLoadConfigProperties() throws Exception {
		AppAuthenticator.initialize();

		TenantResource tenantsApi = new TenantResource();
		Tenant tenant = tenantsApi.getTenant(TENANT_ID,null);
		assertNotNull(tenant);

	}
	
    @Test
    public void testRefreshInterval() throws Exception {
        String url = URL;
        String appId = APP_ID;
        String sharedSecret = SHARED_SECRET;

        RefreshInterval refreshInterval = new RefreshInterval(1000, 200000);
        AppAuthenticator.initialize(createAppAuthInfo(appId, sharedSecret), url, refreshInterval);
        // wait so we have to refresh
        Thread.sleep(1001);
        TenantResource tenantsApi = new TenantResource();
        Tenant tenant = tenantsApi.getTenant(TENANT_ID,null);
        assertNotNull(tenant);

    }

}
