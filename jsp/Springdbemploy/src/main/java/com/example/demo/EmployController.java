package com.example.demo;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployController {

	@Autowired
    private EmployService service;
    
   @RequestMapping(value="/")
   public String sayHello() {
       return "welcome";
   }
	 @RequestMapping(value="/showemploy")
	    public List<Employ> list() {
	        return service.showEmploy();
	    }
	 
	 @GetMapping("/employ/{id}")
	    public ResponseEntity<Employ> get(@PathVariable Integer id) {
	        try {
	            Employ employ = service.get(id);
	            return new ResponseEntity<Employ>(employ, HttpStatus.OK);
	        } catch (NoSuchElementException e) {
	            return new ResponseEntity<Employ>(HttpStatus.NOT_FOUND);
	        }      
	    }
	 @PostMapping("/employs")
	    public void add(@RequestBody Employ employ) {
	        service.save(employ);
	    }
	 
}
