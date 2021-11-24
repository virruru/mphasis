package com.java.rest;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/employ")
public class EmployService {

	@POST
	@Path("/addemploy")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String addEmploy(Employ employ) throws ClassNotFoundException, SQLException {
		EmployDAO dao = new EmployDAO();
		return dao.addEmploy(employ);
	}
	
	@GET
	@Path("/showemploy")
	@Produces(MediaType.APPLICATION_JSON)
	public Employ[] showEmploy() throws ClassNotFoundException, SQLException {
		EmployDAO dao = new EmployDAO();
		Employ[] emps = dao.showEmploy();
		return emps;
	}
	
	@GET
	@Path("/searchemploy/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employ searchEmploy(@PathParam("id") int id) throws ClassNotFoundException, SQLException {
		EmployDAO dao = new EmployDAO();
		Employ employ = dao.searchEmploy(id);
		return employ;
	}
}
