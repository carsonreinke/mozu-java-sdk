/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.util.List;
import java.io.Serializable;
import java.util.Date;
import com.mozu.api.contracts.productadmin.FacetSource;
import com.mozu.api.contracts.productadmin.Facet;

public class FacetSet implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected List<FacetSource> available;
	public List<FacetSource> getAvailable() {
		return this.available;
	}
	public void setAvailable(List<FacetSource> available) {
		this.available = available;
	}

	protected List<Facet> configured;
	public List<Facet> getConfigured() {
		return this.configured;
	}
	public void setConfigured(List<Facet> configured) {
		this.configured = configured;
	}

}
