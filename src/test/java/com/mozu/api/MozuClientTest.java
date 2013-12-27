package com.mozu.api;

import java.io.InputStream;

import static org.junit.Assert.*;

import org.junit.Test;

import com.mozu.api.resources.content.documentlists.DocumentResource;
import com.mozu.api.resources.platform.developer.ApplicationVersionResource;
import com.mozu.api.security.AuthenticationProfile;
import com.mozu.api.security.AuthenticationScope;
import com.mozu.api.security.SecurityTestBase;

public class MozuClientTest extends SecurityTestBase {
    @Test
    public void MozuClientInputStreamTest () throws Exception {
        AuthenticationProfile authenticationProfile = authenticateUser(AuthenticationScope.Tenant, USER_TENANT);
        ApiContext apiContext = new MozuApiContext(7804, null, 1, 1);
        
        DocumentResource resource = new DocumentResource(apiContext);

        InputStream inputStream = resource.getDocumentContent(DataViewMode.Live, "files", "9c363f6e-117b-4bf5-94a1-270359d933c5", null);

        assertNotNull(inputStream);
        
        
    }
   
}
