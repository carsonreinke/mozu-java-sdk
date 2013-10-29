
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
import com.mozu.api.contracts.core.extensible.AttributeSetAssignment;
import com.mozu.api.contracts.core.extensible.Subsystem;


/**
*	A location is a system-defined identifier such as page or screen location that describes where in the application, such as a page, where the attribute definition renders.
*/
public class Location implements Serializable
{
	/** Default Serial Version UID  */
	private static final long serialVersionUID = 1L;

	/**
	*Unique identifier of the location.
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
	*The name associated with the location.
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
	*List of location assignments.
	*/
	@JsonProperty("Assignments")
	protected ArrayList<AttributeSetAssignment> assignments;
	public ArrayList<AttributeSetAssignment> getAssignments() {
		return this.assignments;
	}
	public void setAssignments(ArrayList<AttributeSetAssignment> assignments) {
		this.assignments = assignments;
	}

	/**
	*The resource for which the attribute definition renders. Possible values are "Customer" and "Orders".
	*/
	@JsonProperty("Subsystem")
	protected Subsystem subsystem;

	public Subsystem getSubsystem() {
		return this.subsystem;
	}

	public void setSubsystem(Subsystem subsystem) {
		this.subsystem = subsystem;
	}

}
