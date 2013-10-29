package com.mozu.api;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiError {
	
	@JsonProperty("ApplicationName")
	protected String applicationName;

	@JsonProperty("AdditionalErrorData")
    public List<AdditionalErrorData> additionalErrors;
	
	@JsonProperty("ErrorCode")
	protected String errorCode;
	
	@JsonProperty("Message")
	protected String message;
	
	@JsonProperty ("ExceptionDetail")
	protected ExceptionDetail exceptionDetail;
	
	@JsonProperty ("Items")
	protected List<Item> items; 
	
	static public class ExceptionDetail {
		@JsonProperty("Message")
		protected String message;
		
		@JsonProperty("Source")
		protected String source;
		
		@JsonProperty("StackTrace")
		protected String stackTrace;
		
		@JsonProperty ("TargetSite")
		protected String targetSite;
		
		@JsonProperty ("Type")
		protected String type;
		
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public String getSource() {
			return source;
		}
		public void setSource(String source) {
			this.source = source;
		}
		public String getStackTrace() {
			return stackTrace;
		}
		public void setStackTrace(String stackTrace) {
			this.stackTrace = stackTrace;
		}
		public String getTargetSite() {
			return targetSite;
		}
		public void setTargetSite(String targetSite) {
			this.targetSite = targetSite;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		
		
	}
	
    static public class AdditionalErrorData
    {
    	@JsonProperty ("Name")
    	public String name;
    	@JsonProperty ("Value")
        public String value;
    	
    	public AdditionalErrorData () {
    		
    	}
    	
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
    	
    }

    static public class Item
    {
    	@JsonProperty("ApplicationErrorData")
        public List<AdditionalErrorData> ApplicationErrors;
    	
    	@JsonProperty("ApplicationName")
        public String applicationName;
    	
    	@JsonProperty("ErrorCode")
        public String errorCode;
    	
    	@JsonProperty("Message")
        public String message;
    }

	public ApiError() {
		this.exceptionDetail = new ExceptionDetail();
	}
	
	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ExceptionDetail getExceptionDetail() {
		return exceptionDetail;
	}

	public void setExceptionDetail(ExceptionDetail exceptionDetail) {
		this.exceptionDetail = exceptionDetail;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	
}


