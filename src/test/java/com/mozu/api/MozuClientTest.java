package com.mozu.api;

import java.io.InputStream;

import static org.junit.Assert.*;

import org.junit.Test;

import com.mozu.api.resources.content.documentlists.DocumentResource;
import com.mozu.api.resources.platform.developer.ApplicationVersionResource;
import com.mozu.api.security.AuthenticationProfile;
import com.mozu.api.security.AuthenticationScope;
import com.mozu.api.security.SecurityTestBase;
import com.mozu.api.utils.ConfigProperties;

public class MozuClientTest extends SecurityTestBase {
    @Test
    public void MozuClientInputStreamTest () throws Exception {
        AuthenticationProfile authenticationProfile = authenticateUser(AuthenticationScope.Tenant, USER_TENANT);
        ApiContext apiContext = new MozuApiContext(TENANT_ID, null, 1, 1);
        
        DocumentResource resource = new DocumentResource(apiContext);

        InputStream inputStream = resource.getDocumentContent(DataViewMode.Live, "files", ConfigProperties.getStringProperty("documentTest.id"), null);

        assertNotNull(inputStream);
        
        
    }
   
}
