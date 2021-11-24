package com.java.spring;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmploySearchMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/spring/jdbc.xml");
		EmployDAO dao = (EmployDAO)ctx.getBean("employDao");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No   ");
		int empno = sc.nextInt();
		Employ employ = dao.searchEmploy(empno);
		System.out.println(employ);
	}
}
