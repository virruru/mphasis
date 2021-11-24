package com.java.rest;

import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloService {

	@GET
	@Path("/first")
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello() {
		return "Welcome to Restful Webservices...";
	}
	
	@GET
	@Path("/company")
	@Produces(MediaType.TEXT_PLAIN)
	public String company() {
		return "From Mphasis...";
	}
}
