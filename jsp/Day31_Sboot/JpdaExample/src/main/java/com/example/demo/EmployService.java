package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EmployService {

	@Autowired
    private EmployRepository repo;
	
	public List<Employ> showEmploy() {
		return repo.findAll();
	}

}
