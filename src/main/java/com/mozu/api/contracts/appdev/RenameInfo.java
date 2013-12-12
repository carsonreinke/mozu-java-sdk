/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.appdev;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;

/**
 *	Information required to update the name of a file in a package, which consists of the original name and the new name.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RenameInfo implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The destination file location and file name to specify.
	 */
	protected String newFullPath;

	public String getNewFullPath() {
		return this.newFullPath;
	}

	public void setNewFullPath(String newFullPath) {
		this.newFullPath = newFullPath;
	}

	/**
	 * The original file location and file name.
	 */
	protected String oldFullPath;

	public String getOldFullPath() {
		return this.oldFullPath;
	}

	public void setOldFullPath(String oldFullPath) {
		this.oldFullPath = oldFullPath;
	}

}
