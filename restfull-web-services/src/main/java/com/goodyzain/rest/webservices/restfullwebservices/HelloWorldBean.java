package com.goodyzain.rest.webservices.restfullwebservices;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class HelloWorldBean{

	private String message;
	
	public HelloWorldBean(String message) {
		this.message= message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	

	public HelloWorldBean() {
		
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}

	
}
