package com.java.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/demo")
public class DemoService {

	@GET
	@Path("/greeting/{name}")
	@Produces(MediaType.TEXT_PLAIN)
	public String greetMe(@PathParam("name") String name) {
		return "Welcome to " +name+ " How are you...";
	}
	
	@GET
	@Path("/topic/{trainer}")
	@Produces(MediaType.TEXT_PLAIN)
	public String topic(@PathParam("trainer") String trainer) {
		return "Restful Webservices from " +trainer;
	}
}
