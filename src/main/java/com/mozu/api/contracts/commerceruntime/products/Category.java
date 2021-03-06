/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.products;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.commerceruntime.products.Category;

/**
 *	The category into which products are classified.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Category implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Identifier of the category.
	 */
	protected Integer id;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * If applicable, the parent category in the category tree.
	 */
	protected Category parent;

	public Category getParent() {
		return this.parent;
	}

	public void setParent(Category parent) {
		this.parent = parent;
	}

}
