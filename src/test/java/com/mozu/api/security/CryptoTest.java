package com.mozu.api.security;

import static org.junit.Assert.*;
import org.junit.Test;

public class CryptoTest {
    @Test
    public void testCryptoHash () {
        String body = "This is the body...blah, blah, blah";
        String secretKey = "b832b3a6127741be8dd4a26c010941b1";
        // Test that values going through the crypto work...
        String hash1 = Crypto.getHash(secretKey, body);
        String hash2 = Crypto.getHash(secretKey, body);
        
        assertEquals(hash1, hash2);
    
        assertEquals("wEwBV8dL6d2uaIvtLCncbHTZJgelBRsWC00h1nyGUko=", hash1);
    }
    
    
}
