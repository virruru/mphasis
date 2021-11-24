package com.java.hib;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployDelete {

	public static void main(String[] args) {
		SessionFactory sf = SessionHelper.getFactory();
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Emply No   ");
		empno=sc.nextInt();
		Session s = sf.openSession();
		Query q = s.createQuery("from Employ where empno="+empno);
		List<Employ> employList =q.list();
		if (employList.size() > 0) {
			Employ employ = employList.get(0);
			Transaction t = s.beginTransaction();
			s.delete(employ);
			t.commit();
			System.out.println("*** Record Deleted ***");
		}
	}
}
