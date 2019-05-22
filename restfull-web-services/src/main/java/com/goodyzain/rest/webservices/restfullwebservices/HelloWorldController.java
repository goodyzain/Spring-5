package com.goodyzain.rest.webservices.restfullwebservices;


import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	private Client client;

	private WebTarget target;

	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}

	/// hello-world-bean/pathVariable/{name}
	@GetMapping(path = "/hello-world-bean/pathVariable/{name}")
	public HelloWorldBean helloWorldBean(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}

	@GetMapping(path = "/req-ncbi")
	public void requestNCBI() {
		 client = ClientBuilder.newClient();
	        target = client.target("http://localhost:8080/hello-world-bean/pathVariable/goodyzain");
//	        .queryParam("appid", apikey);
	        HelloWorldBean helloObject = target.request(MediaType.APPLICATION_XML).get(HelloWorldBean.class);
	        System.out.println("Yappy Got It ? :"+helloObject);
	}

}
