/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;

/**
 *	Product definition targeted for a defined discount.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TargetedProduct implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected String productCode;

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
