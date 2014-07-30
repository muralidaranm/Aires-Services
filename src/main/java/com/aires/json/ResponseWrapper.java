package com.aires.json;

import java.util.List;

public class ResponseWrapper {

	public enum Status { SUCCESS , FAILURE };
	
	private List< ? extends Object > response;
	
	private String message = " "; 
	
	public void setResponseContent(List<? extends Object> content){
		this.response = content;
	}
	
	public void setMessage(Status status){
		if(status == Status.SUCCESS)
			message = " ";
		else
			message = "Invalid or Missing parameters";
	}
	
}
