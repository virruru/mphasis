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
	public List<Menu> showMenu(){
		return menurepository.findAll();
	}
	public Menu get(Integer id) {
		return menurepository.findById(id).get();
	}

}
