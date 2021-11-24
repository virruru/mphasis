package com.java.spr.dao;

import java.util.List;

import com.java.spr.model.Employ;

public interface EmployDAO {

	List<Employ> list();
	Employ searchEmploy(int empno);
	void updateEmploy(Employ employ);
	void addEmploy(Employ employ);
	void deleteEmploy(int empno);
}
