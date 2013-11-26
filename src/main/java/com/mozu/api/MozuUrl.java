package com.mozu.api;

public class MozuUrl {
    public enum UrlLocation {
        HOME_POD, TENANT_POD
    }

    public String url = null;
    public UrlLocation location = null;

    public MozuUrl() {
    }

    public MozuUrl(String url, UrlLocation location) {
        this.url = url;
        this.location = location;
    }

   public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public UrlLocation getLocation() {
        return location;
    }

    public void setLocation(UrlLocation location) {
        this.location = location;
    }
}
