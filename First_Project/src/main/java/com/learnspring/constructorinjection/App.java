package com.learnspring.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main (String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/learnspring/constructorinjection/config.xml");
		
		Student st1 = context.getBean("st1", Student.class);
		System.out.println(st1);
	}
}
