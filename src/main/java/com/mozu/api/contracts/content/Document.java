
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.contracts.content;

import java.util.ArrayList;
import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mozu.api.contracts.content.PropertyValue;


/**
*	The document properties that define the content used by the content management system (CMS).
*/
public class Document implements Serializable
{
	/** Default Serial Version UID  */
	private static final long serialVersionUID = 1L;

	/**
	*The character length associated with the document content.
	*/
	@JsonProperty("ContentLength")
	protected Long contentLength;

	public Long getContentLength() {
		return this.contentLength;
	}

	public void setContentLength(Long contentLength) {
		this.contentLength = contentLength;
	}

	/**
	*The mime type associated with the document content, if applicable.
	*/
	@JsonProperty("ContentMimeType")
	protected String contentMimeType;

	public String getContentMimeType() {
		return this.contentMimeType;
	}

	public void setContentMimeType(String contentMimeType) {
		this.contentMimeType = contentMimeType;
	}

	/**
	*The date and time the most recent content update was made. UTC date/time. System-supplied and read-only.
	*/
	@JsonProperty("ContentUpdateDate")
	protected Date contentUpdateDate;

	public Date getContentUpdateDate() {
		return this.contentUpdateDate;
	}

	public void setContentUpdateDate(Date contentUpdateDate) {
		this.contentUpdateDate = contentUpdateDate;
	}

	/**
	*The name of the document list associated with the document.
	*/
	@JsonProperty("DocumentListName")
	protected String documentListName;

	public String getDocumentListName() {
		return this.documentListName;
	}

	public void setDocumentListName(String documentListName) {
		this.documentListName = documentListName;
	}

	/**
	*The type of document used in the CMS such as "web_page" or "template" or "image_url".
	*/
	@JsonProperty("DocumentType")
	protected String documentType;

	public String getDocumentType() {
		return this.documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	/**
	*If applicable, the file extension associated with the document content.
	*/
	@JsonProperty("Extension")
	protected String extension;

	public String getExtension() {
		return this.extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	/**
	*Unique identifier of the folder that contains the document.
	*/
	@JsonProperty("FolderId")
	protected String folderId;

	public String getFolderId() {
		return this.folderId;
	}

	public void setFolderId(String folderId) {
		this.folderId = folderId;
	}

	/**
	*Unique identifier of the document.
	*/
	@JsonProperty("Id")
	protected String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	*When the document was added to the document list. System-supplied and read-only.
	*/
	@JsonProperty("InsertDate")
	protected Date insertDate;

	public Date getInsertDate() {
		return this.insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

	/**
	*The name of the document, which is unique within its folder.
	*/
	@JsonProperty("Name")
	protected String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	*The location of the document in the document list and folder hierarchy.
	*/
	@JsonProperty("Path")
	protected String path;

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	/**
	*The current state of the document, which is Active, Draft, or Latest. Active documents are published and cannot be deleted. Querying Latest returns the most recent version of the document, regardless of whether it is published or a draft.
	*/
	@JsonProperty("PublishState")
	protected String publishState;

	public String getPublishState() {
		return this.publishState;
	}

	public void setPublishState(String publishState) {
		this.publishState = publishState;
	}

	/**
	*Date and time when the entity was last updated, represented in UTC Date/Time.
	*/
	@JsonProperty("UpdateDate")
	protected Date updateDate;

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	/**
	*List of properties for the given property value.
	*/
	@JsonProperty("Properties")
	protected ArrayList<PropertyValue> properties;
	public ArrayList<PropertyValue> getProperties() {
		return this.properties;
	}
	public void setProperties(ArrayList<PropertyValue> properties) {
		this.properties = properties;
	}

}