package com.java.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployDAO {

	static SessionFactory sessionFactory;
	
	static {
		sessionFactory = SessionHelper.getFactory();
	}
	
	public String deleteEmploy(int empno) {
		Employ employ = searchEmploy(empno);
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		session.delete(employ);
		t.commit();
		return "Record Deleted...";
	}
	
	public String addEmploy(Employ employ) {
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		session.save(employ);
		t.commit();
		return "Record Inserted...";
		
	}
	
	public Employ searchEmploy(int empno) {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Employ where empno="+empno);
		List<Employ> employList = query.list();
		if (employList.size()==1) {
			return employList.get(0);
		}
		return null;
	}
	
	public List<Employ> showEmploy() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Employ");
		List<Employ> employList = query.list();
		return employList;
	}
}
