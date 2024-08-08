package com.learnspring.autowiringannotation.copy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/learnspring/autowiringannotation/copy/config.xml");
        Employee em1 = context.getBean("Ram", Employee.class);
        System.out.println(em1);
	
	}

}
