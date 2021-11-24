package com.java.spring.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/names")
	public ModelAndView show() {
		List<String> names = new ArrayList<String>();
		names.add("Ashwin");
		names.add("Sowmya");
		names.add("Vallabha");
		names.add("Divyanshu");
		names.add("Rahul");
		return new ModelAndView("names", "students", names);
	}
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
}
