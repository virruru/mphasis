package com.java.name;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/name/Name.xml");
		Name objAshwin=(Name)ctx.getBean("beanAshwin");
		System.out.println(objAshwin.fullName());
		
		Name objRiya = (Name)ctx.getBean("beanRiya");
		System.out.println(objRiya.fullName());
		
		Name objSangram = (Name)ctx.getBean("beanSangram");
		System.out.println(objSangram.fullName());
	}
}
