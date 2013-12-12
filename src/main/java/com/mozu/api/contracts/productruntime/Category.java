/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productruntime;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import com.mozu.api.contracts.productruntime.CategoryContent;
import com.mozu.api.contracts.productruntime.Category;

/**
 *	Properties of the product category that appears on the storefront.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Category implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Unique identifier for the storefront container used to organize products.
	 */
	protected Integer categoryId;

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * The numeric value that denotes the place this entity occupies in the order of the entity list.
	 */
	protected Integer sequence;

	public Integer getSequence() {
		return this.sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	/**
	 * Complex type that contains content for a language specified by LocaleCode.
	 */
	protected CategoryContent content;

	public CategoryContent getContent() {
		return this.content;
	}

	public void setContent(CategoryContent content) {
		this.content = content;
	}

	/**
	 * List of the subcategories in the hierarchy for the specified categories.
	 */
	protected List<Category> childrenCategories;
	public List<Category> getChildrenCategories() {
		return this.childrenCategories;
	}
	public void setChildrenCategories(List<Category> childrenCategories) {
		this.childrenCategories = childrenCategories;
	}

	/**
	 * If applicable, the parent category in the hierarchy for the specified category.
	 */
	protected Category parentCategory;

	public Category getParentCategory() {
		return this.parentCategory;
	}

	public void setParentCategory(Category parentCategory) {
		this.parentCategory = parentCategory;
	}

}
