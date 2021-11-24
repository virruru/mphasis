package com.java.hib;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class EmployShow {

	public static void main(String[] args) {
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Query q = s.createQuery("from Employ");
		List<Employ> employList = q.list();
		for (Employ employ : employList) {
			System.out.println("Employ No  " +employ.getEmpno());
			System.out.println("Employ Name  " +employ.getName());
			System.out.println("Department  " +employ.getDept());
			System.out.println("Gender  " +employ.getGender());
			System.out.println("Designation  " +employ.getDesig());
			System.out.println("Basic   " +employ.getBasic());
			System.out.println("-------------------------------------");
		}
	}
}
