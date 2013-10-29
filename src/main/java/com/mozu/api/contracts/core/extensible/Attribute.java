
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.contracts.core.extensible;

import java.util.ArrayList;
import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mozu.api.contracts.core.extensible.AttributeMetadataItem;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.core.extensible.AttributeLocalizedContent;
import com.mozu.api.contracts.core.extensible.AttributeValidation;
import com.mozu.api.contracts.core.extensible.AttributeVocabularyValue;


/**
*	The properties of the attribute to extend for either customers or orders.
*/
public class Attribute implements Serializable
{
	/** Default Serial Version UID  */
	private static final long serialVersionUID = 1L;

	/**
	*Name of this extensible attribute in Mozu Admin.
	*/
	@JsonProperty("AdminName")
	protected String adminName;

	public String getAdminName() {
		return this.adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	/**
	*Merchant-defined code for an extensible attribute.
	*/
	@JsonProperty("AttributeCode")
	protected String attributeCode;

	public String getAttributeCode() {
		return this.attributeCode;
	}

	public void setAttributeCode(String attributeCode) {
		this.attributeCode = attributeCode;
	}

	@JsonProperty("AttributeFQN")
	protected String attributeFQN;

	public String getAttributeFQN() {
		return this.attributeFQN;
	}

	public void setAttributeFQN(String attributeFQN) {
		this.attributeFQN = attributeFQN;
	}

	/**
	*The data type of the attribute. There are four valid data types: "Bool", "DateTime", "Number", "String"
	*/
	@JsonProperty("DataType")
	protected String dataType;

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	/**
	*Unique identifier of the extensible attribute.
	*/
	@JsonProperty("Id")
	protected Integer id;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/**
	*There are six valid input types: "YesNo", "Date", "DateTime", "List", "TextBox", "TextArea"
	*/
	@JsonProperty("InputType")
	protected String inputType;

	public String getInputType() {
		return this.inputType;
	}

	public void setInputType(String inputType) {
		this.inputType = inputType;
	}

	/**
	*If true, the customer or order attribute is active.
	*/
	@JsonProperty("IsActive")
	protected Boolean isActive;

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	/**
	*Namespace associated with this extensible attribute.
	*/
	@JsonProperty("Namespace")
	protected String namespace;

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	/**
	*List of metadata defined for an extensible attribute.
	*/
	@JsonProperty("AttributeMetadata")
	protected ArrayList<AttributeMetadataItem> attributeMetadata;
	public ArrayList<AttributeMetadataItem> getAttributeMetadata() {
		return this.attributeMetadata;
	}
	public void setAttributeMetadata(ArrayList<AttributeMetadataItem> attributeMetadata) {
		this.attributeMetadata = attributeMetadata;
	}

	@JsonProperty("AuditInfo")
	protected AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	/**
	*List of localized content properties for the extensible attribute.
	*/
	@JsonProperty("Content")
	protected AttributeLocalizedContent content;

	public AttributeLocalizedContent getContent() {
		return this.content;
	}

	public void setContent(AttributeLocalizedContent content) {
		this.content = content;
	}

	/**
	*Properties used when validating a value entered for an extensible attribute.
	*/
	@JsonProperty("Validation")
	protected AttributeValidation validation;

	public AttributeValidation getValidation() {
		return this.validation;
	}

	public void setValidation(AttributeValidation validation) {
		this.validation = validation;
	}

	/**
	*List of valid vocabulary values defined for an attribute.
	*/
	@JsonProperty("VocabularyValues")
	protected ArrayList<AttributeVocabularyValue> vocabularyValues;
	public ArrayList<AttributeVocabularyValue> getVocabularyValues() {
		return this.vocabularyValues;
	}
	public void setVocabularyValues(ArrayList<AttributeVocabularyValue> vocabularyValues) {
		this.vocabularyValues = vocabularyValues;
	}

}
