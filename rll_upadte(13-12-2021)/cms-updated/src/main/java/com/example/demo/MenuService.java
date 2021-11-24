package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class MenuService {
	@Autowired
private MenuRepository menurepository;
	@Autowired
	private MenuDAO dao;
	public List<Menu> showMenu(){
		return menurepository.findAll();
	}
	public Menu get(Integer id) {
		return menurepository.findById(id).get();
	}
	 public void save(Menu menu) {
	    	menu.setMen_id(dao.generatemenid());

         menurepository.save(menu);
     }
}
