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
	 
	    @Autowired
	    private CustomerDAO dao;
	    
	    public String authenticate(String user,String pwd) {
	        return dao.authenticate(user, pwd);
	    }
	    
	    public Customer showonecustomer(String user) {
	        return dao.showonecustomer(user);
	    }
	    
	    public List<Customer> showCustomer() {
	        return repo.findAll();
	    }
	    
	    public Customer get(Integer id) {
         return repo.findById(id).get();
        
     }
	    
	    public void save(Customer customer) {
            repo.save(customer);
        }

}
