package com.mozu.api.security;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Crypto {
    private static final Logger logger = LoggerFactory.getLogger(Crypto.class);
    private static final String ENCODER_ALGORITHM = "SHA-256";
    private static final String CHARSET = "UTF-8";
    
    public static String getHash(String secretKey, String body) {
        String payload = secretKey.concat(body);
        String hash = null;
        try {
            MessageDigest digest = MessageDigest.getInstance(ENCODER_ALGORITHM);
            byte[] payloadByteArray = digest.digest(payload.getBytes(CHARSET));
            hash = Base64.encodeBase64String(payloadByteArray);
        } catch (NoSuchAlgorithmException nae) {
            logger.error("Bad encoding algorithm " + ENCODER_ALGORITHM + ": " + nae.getMessage() );
        } catch (UnsupportedEncodingException uee) {
            logger.error("Unsupported character set: " + CHARSET + ": " + uee.getMessage() );
        }
        return hash;
    }

}
