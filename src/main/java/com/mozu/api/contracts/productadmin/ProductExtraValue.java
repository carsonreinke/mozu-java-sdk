/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.io.Serializable;
import java.util.Date;
import com.mozu.api.contracts.productadmin.AttributeVocabularyValue;
import com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice;

public class ProductExtraValue implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected Double deltaWeight;

	public Double getDeltaWeight() {
		return this.deltaWeight;
	}

	public void setDeltaWeight(Double deltaWeight) {
		this.deltaWeight = deltaWeight;
	}

	protected Boolean isDefaulted;

	public Boolean getIsDefaulted() {
		return this.isDefaulted;
	}

	public void setIsDefaulted(Boolean isDefaulted) {
		this.isDefaulted = isDefaulted;
	}

	protected Object value;

	public Object getValue() {
		return this.value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	protected AttributeVocabularyValue attributeVocabularyValueDetail;

	public AttributeVocabularyValue getAttributeVocabularyValueDetail() {
		return this.attributeVocabularyValueDetail;
	}

	public void setAttributeVocabularyValueDetail(AttributeVocabularyValue attributeVocabularyValueDetail) {
		this.attributeVocabularyValueDetail = attributeVocabularyValueDetail;
	}

	protected ProductExtraValueDeltaPrice deltaPrice;

	public ProductExtraValueDeltaPrice getDeltaPrice() {
		return this.deltaPrice;
	}

	public void setDeltaPrice(ProductExtraValueDeltaPrice deltaPrice) {
		this.deltaPrice = deltaPrice;
	}

}
