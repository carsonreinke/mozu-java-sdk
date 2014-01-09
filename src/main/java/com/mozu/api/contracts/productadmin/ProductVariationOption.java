/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent;

/**
 *	Details of a product variation option.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductVariationOption implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The fully qualified name of the attribute, which is a user defined attribute identifier.
	 */
	protected String attributeFQN;

	public String getAttributeFQN() {
		return this.attributeFQN;
	}

	public void setAttributeFQN(String attributeFQN) {
		this.attributeFQN = attributeFQN;
	}

	/**
	 * The value of an attribute option specified for this product variation.
	 */
	protected Object value;

	public Object getValue() {
		return this.value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	/**
	 * Complex type that contains content for a language specified by LocaleCode.
	 */
	protected AttributeVocabularyValueLocalizedContent content;

	public AttributeVocabularyValueLocalizedContent getContent() {
		return this.content;
	}

	public void setContent(AttributeVocabularyValueLocalizedContent content) {
		this.content = content;
	}

}
