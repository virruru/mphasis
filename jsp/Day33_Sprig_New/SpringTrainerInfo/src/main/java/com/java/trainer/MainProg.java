package com.java.trainer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/trainer/trainer.xml");
		Trainer trainer = (Trainer)ctx.getBean("beanTrainer");
		trainer.showInfo();
	}
}
