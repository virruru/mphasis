package com.java.spr.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.java.spr.dao.EmployDAO;
import com.java.spr.model.Employ;

@Controller
public class HomeController {

	 @Autowired
	 private EmployDAO employDAO;

	 @RequestMapping(value = "/deleteemploy", method = RequestMethod.GET)
	 public ModelAndView deleteEmploy(HttpServletRequest request) {
	     int empno = Integer.parseInt(request.getParameter("empno"));
	     employDAO.deleteEmploy(empno);
	     return new ModelAndView("redirect:/");
	 }

	 @RequestMapping(value = "/saveemploy", method = RequestMethod.POST)
	 public ModelAndView saveEmploy(@ModelAttribute Employ employ) {
	     employDAO.addEmploy(employ);
	     return new ModelAndView("redirect:/");
	 }
	 
	 @RequestMapping(value = "/newemploy", method = RequestMethod.GET)
	 public ModelAndView newContact(ModelAndView model) {
	     Employ employ = new Employ();
	     return new ModelAndView("employform", "employ",employ);
	 }
	 
	 @RequestMapping(value = "/updateemploy", method = RequestMethod.POST)
	 public ModelAndView updateEmploy(@ModelAttribute Employ employ) {
	     employDAO.updateEmploy(employ);
	     return new ModelAndView("redirect:/");
	 }
	 @RequestMapping(value="/editemploy")
		public ModelAndView editEmploy(HttpServletRequest request) {
		    int empno = Integer.parseInt(request.getParameter("empno"));
		    Employ employ = employDAO.searchEmploy(empno);
		    return new ModelAndView("employsearchform", "employ", employ);
		}
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		  List<Employ> listEmploy = employDAO.list();
		     //model.addObject("listEmploy", listEmploy);
		     //model.setViewName("home");
		  
		     //return model;

		return new ModelAndView("home","listEmploy",listEmploy);
	}
}
