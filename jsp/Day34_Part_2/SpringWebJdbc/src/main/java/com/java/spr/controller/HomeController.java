package com.java.spr.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.spr.dao.EmployDAO;
import com.java.spr.model.Employ;

@Controller
public class HomeController {

	 @Autowired
	 private EmployDAO employDAO;
	 
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		  List<Employ> listEmploy = employDAO.list();
		     //model.addObject("listEmploy", listEmploy);
		     //model.setViewName("home");
		  
		     //return model;

		return new ModelAndView("home","listEmploy",listEmploy);
	}
}
