
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.contracts.core.extensible;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mozu.api.contracts.core.extensible.AttributeValueLocalizedContent;


/**
*	Properties of a vocabulary value defined for an extensible attribute.
*/
public class AttributeVocabularyValue implements Serializable
{
	/** Default Serial Version UID  */
	private static final long serialVersionUID = 1L;

	/**
	*The numeric order of a vocabulary value defined for an extensible attribute.
	*/
	@JsonProperty("Sequence")
	protected Integer sequence;

	public Integer getSequence() {
		return this.sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	/**
	*Possible value associated with a vocabulary value defined for an extensible attribute.
	*/
	@JsonProperty("Value")
	protected String value;

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	/**
	*List of content associated with a vocabulary value defined for an extensible attribute.
	*/
	@JsonProperty("Content")
	protected AttributeValueLocalizedContent content;

	public AttributeValueLocalizedContent getContent() {
		return this.content;
	}

	public void setContent(AttributeValueLocalizedContent content) {
		this.content = content;
	}

}
