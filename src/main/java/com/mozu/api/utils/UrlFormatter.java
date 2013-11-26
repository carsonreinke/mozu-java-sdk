package com.mozu.api.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.mozu.api.ApiException;

public class UrlFormatter {
	public String resourceUrl;
	
	public UrlFormatter(String resourceUrl) {
		this.resourceUrl = resourceUrl;
	}
	
	public String getResourceUrl() {
		return resourceUrl;
	}
	
	public void formatUrl() {
		String removeString = "/?";
        if (resourceUrl.endsWith(removeString)) 
        	resourceUrl =resourceUrl.replace(removeString, "");

        if (resourceUrl.endsWith("/")) 
        	resourceUrl = resourceUrl.substring(0, resourceUrl.length()-1);
        
        if (resourceUrl.endsWith(removeString + "&")) 
        	resourceUrl= resourceUrl.replace(removeString+"&", "");
 	}
	
	public void formatUrl(String paramName, Object value)
    {
	    String encodedValue = null;
        try {
            encodedValue = URLEncoder.encode(String.valueOf(value), "UTF-8");
        } catch (UnsupportedEncodingException uee) {
            throw new ApiException("Bad encoding of URL" + uee.getMessage());
        }
		resourceUrl = resourceUrl.replace("{"+paramName+"}", value == null ? "" : encodedValue);
		resourceUrl = resourceUrl.replace("{*"+paramName+"}", value == null ? "" : encodedValue);
        String removeString = "&" + paramName + "=";
        if (value == null && resourceUrl.contains(removeString)) 
        	resourceUrl= resourceUrl.replace(removeString,"");

        removeString = paramName + "=";
        if (value == null && resourceUrl.contains(removeString)) 
        	resourceUrl = resourceUrl.replace(removeString, "");

        formatUrl();
    }
}
