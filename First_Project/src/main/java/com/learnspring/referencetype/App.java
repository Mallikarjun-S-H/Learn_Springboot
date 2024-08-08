package com.learnspring.referencetype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/learnspring/referencetype/config.xml");
		
		Employee em1 = context.getBean("Ram", Employee.class);
		
		System.out.println(em1.getAddress().getCountry());
	
	}

}
