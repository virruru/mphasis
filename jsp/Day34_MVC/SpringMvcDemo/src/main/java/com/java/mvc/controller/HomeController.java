package com.java.mvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public ModelAndView home() {
		return new ModelAndView("home");
	}

	@RequestMapping("/pragathi")
	public ModelAndView pragathi() {
		return new ModelAndView("pragathi");
	}
	@RequestMapping(value="/poorna")
	public ModelAndView poorna() {
		return new ModelAndView("poornaresult");
	}
	@RequestMapping(value="/aseem")
	public ModelAndView aseem() {
		return new ModelAndView("aseem");
	}
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
}
