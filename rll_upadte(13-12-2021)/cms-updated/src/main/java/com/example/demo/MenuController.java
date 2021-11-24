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
public class MenuController {
@Autowired
private MenuService service;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value="/showMenu")
public List<Menu> list(){
	return service.showMenu();
}
@CrossOrigin(origins = "http://localhost:4200")
@GetMapping("/menu/{id}")
public ResponseEntity<Menu> get(@PathVariable Integer id){
	Menu menu;
	try {
		menu = service.get(id);
		return new ResponseEntity<Menu>(menu, HttpStatus.OK);

	} 
	catch (NoSuchElementException e) {
		return new ResponseEntity<Menu>(HttpStatus.NOT_FOUND);
	}
	
}
@CrossOrigin(origins = "http://localhost:4200")
@PostMapping("/addMenu")
public void add(@RequestBody Menu menu) {
    service.save(menu);
}
}
