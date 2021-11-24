package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
	public class VendorService {
	    @Autowired
	    private VendorRepository repo;
	    
	    public List<Vendor> showVendor() {
	        return repo.findAll();
	    }
	    
	    public Vendor get(Integer id) {
            return repo.findById(id).get();
           
        }
	    public void save(Vendor vendor) {
            repo.save(vendor);
        }
	    
	}
