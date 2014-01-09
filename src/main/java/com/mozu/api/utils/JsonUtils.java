package com.mozu.api.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.joda.JodaModule;

public class JsonUtils {
    static public ObjectMapper initObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JodaModule());
        objectMapper.configure(com.fasterxml.jackson.databind.SerializationFeature.
            WRITE_DATES_AS_TIMESTAMPS , false);
        return objectMapper;
    }
}
