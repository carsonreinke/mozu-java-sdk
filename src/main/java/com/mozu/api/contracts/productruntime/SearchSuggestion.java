
/**
*     This code was auto-generated by a tool.     
*
*     Changes to this file may cause incorrect behavior and will be lost if
*     the code is regenerated.
*/
package com.mozu.api.contracts.productruntime;

import java.util.ArrayList;
import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
*	Suggest product search terms to a customer based on defined queries.
*/
public class SearchSuggestion implements Serializable
{
	/** Default Serial Version UID  */
	private static final long serialVersionUID = 1L;

	/**
	*The query term entered by the shopper.
	*/
	@JsonProperty("Query")
	protected String query;

	public String getQuery() {
		return this.query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	/**
	*The term suggestions to return based on the specified query value.
	*/
	@JsonProperty("Suggestions")
	protected ArrayList<String> suggestions;
	public ArrayList<String> getSuggestions() {
		return this.suggestions;
	}
	public void setSuggestions(ArrayList<String> suggestions) {
		this.suggestions = suggestions;
	}

}
