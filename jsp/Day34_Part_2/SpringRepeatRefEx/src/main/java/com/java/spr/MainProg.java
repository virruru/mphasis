package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/spr/person.xml");
		Person personSakshi = (Person)ctx.getBean("beanSakshi");
		personSakshi.showAllInfo();
		
		Person personAseem = (Person)ctx.getBean("beanAseem");
		personAseem.showAllInfo();
		
		Person personSowmya = (Person)ctx.getBean("beanSowmya");
		personSowmya.showAllInfo();
	}
}
