package com.learnspring.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/learnspring/sterotype/config.xml");
        Employee em = context.getBean("emp",Employee.class);
        System.out.println(em);
	
	}

}
