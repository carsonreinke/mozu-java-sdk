package com.mozu.api.utils;

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
		resourceUrl = resourceUrl.replace("{"+paramName+"}", value == null ? "" : String.valueOf(value));
		resourceUrl = resourceUrl.replace("{*"+paramName+"}", value == null ? "" : String.valueOf(value));
        String removeString = "&" + paramName + "=";
        if (value == null && resourceUrl.contains(removeString)) 
        	resourceUrl= resourceUrl.replace(removeString,"");

        removeString = paramName + "=";
        if (value == null && resourceUrl.contains(removeString)) 
        	resourceUrl = resourceUrl.replace(removeString, "");

        formatUrl();
    }
}
