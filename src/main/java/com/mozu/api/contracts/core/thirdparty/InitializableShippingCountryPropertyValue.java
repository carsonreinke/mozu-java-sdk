/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.core.thirdparty;

import java.util.List;
import java.io.Serializable;
import java.util.Date;
import com.mozu.api.contracts.core.thirdparty.InitializablePropertyValue;

public class InitializableShippingCountryPropertyValue implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected Boolean initialized;

	public Boolean getInitialized() {
		return this.initialized;
	}

	public void setInitialized(Boolean initialized) {
		this.initialized = initialized;
	}

	protected String value;

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	protected List<InitializablePropertyValue> child;
	public List<InitializablePropertyValue> getChild() {
		return this.child;
	}
	public void setChild(List<InitializablePropertyValue> child) {
		this.child = child;
	}

}