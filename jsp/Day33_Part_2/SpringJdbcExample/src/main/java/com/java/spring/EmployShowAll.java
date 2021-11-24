package com.java.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployShowAll {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/spring/jdbc.xml");
		EmployDAO dao =(EmployDAO)ctx.getBean("employDao");
		Employ[] result = dao.showEmploy();
		for (Employ employ : result) {
			System.out.println(employ);
		}
	}
}
