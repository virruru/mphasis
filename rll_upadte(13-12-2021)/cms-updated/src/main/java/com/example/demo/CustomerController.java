package com.example.demo;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	@Autowired
    private CustomerService service;
	
    
   @RequestMapping(value="/")
   public String sayHello() {
       return "welcome";
   }
   @CrossOrigin(origins = "http://localhost:4200")
   @RequestMapping("/customerAuthenticate/{user}/{pwd}")
   public String autneticateion(@PathVariable String user, @PathVariable String pwd) {
       return service.authenticate(user, pwd);
   }
   @CrossOrigin(origins = "http://localhost:4200")
	 @RequestMapping(value="/showcustomer")
	    public List<Customer> list() {
	        return service.showCustomer();
	    }
   
   @CrossOrigin(origins = "http://localhost:4200")
   @RequestMapping("/showonecustomer/{user}")
   public Customer showonecustomer(@PathVariable String user) {
       return service.showonecustomer(user);
   }
   @CrossOrigin(origins = "http://localhost:4200")
	 @GetMapping("/customer/{id}")
	    public ResponseEntity<Customer> get(@PathVariable Integer id) {
	        try {
	            Customer customer = service.get(id);
	            return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	        } catch (NoSuchElementException e) {
	            return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
	        }      
	    }
   @CrossOrigin(origins = "http://localhost:4200")
   @PostMapping("/addCustomer")
   public void add(@RequestBody Customer customer) {
       service.save(customer);
   }

}
