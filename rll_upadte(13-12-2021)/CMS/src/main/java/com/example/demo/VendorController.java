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
	public class VendorController {

		@Autowired
	    private VendorService service;
	    
	  
		 @RequestMapping(value="/showvendor")
		    public List<Vendor> list() {
		        return service.showVendor();
		    }
		 
		 @GetMapping("/vendor/{id}")
		    public ResponseEntity<Vendor> get(@PathVariable Integer id) {
		        try {
		            Vendor vendor = service.get(id);
		            return new ResponseEntity<Vendor>(vendor, HttpStatus.OK);
		        } catch (NoSuchElementException e) {
		            return new ResponseEntity<Vendor>(HttpStatus.NOT_FOUND);
		        }      
		    }
		 
		 
	}

