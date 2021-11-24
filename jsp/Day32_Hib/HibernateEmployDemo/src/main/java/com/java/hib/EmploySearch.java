package com.java.hib;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class EmploySearch {

	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Emply No   ");
		empno=sc.nextInt();
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Query q = s.createQuery("from Employ where empno="+empno);
		List<Employ> employList =q.list();
		if (employList.size() > 0) {
			Employ employ = employList.get(0);
			System.out.println("Employ Name  " +employ.getName());
			System.out.println("Department  " +employ.getDept());
			System.out.println("Gender  " +employ.getGender());
			System.out.println("Designation  " +employ.getDesig());
			System.out.println("Basic   " +employ.getBasic());
		} else {
			System.out.println("*** Record Not Found ***");
		}
	}
}
