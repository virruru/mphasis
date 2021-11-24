package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class CustomerService {
	 @Autowired
	    private CustomerRepository repo;
	    
	    public List<Customer> showCustomer() {
	        return repo.findAll();
	    }
	    
	    public Customer get(Integer id) {
         return repo.findById(id).get();
        
     }

}
