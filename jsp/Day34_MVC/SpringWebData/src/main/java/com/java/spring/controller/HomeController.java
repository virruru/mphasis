package com.java.spring.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/name")
	public ModelAndView showName(HttpServletRequest req) {
		String firstName,lastName,fullName;
		firstName=req.getParameter("firstName");
		lastName=req.getParameter("lastName");
		fullName = firstName + " " +lastName;
		return new ModelAndView("nameresult","fullName",fullName);
		
	}
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("name");
	}
}
