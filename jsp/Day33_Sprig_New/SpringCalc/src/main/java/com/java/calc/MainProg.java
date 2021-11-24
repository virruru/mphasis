package com.java.calc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/calc/Calc.xml");
		Calculation calc = (Calculation)ctx.getBean("beanCalc");
		System.out.println("Sum is  " +calc.sum());
		System.out.println("Sub is  " +calc.sub());
		System.out.println("Mult is  " +calc.mult());
	}
}
