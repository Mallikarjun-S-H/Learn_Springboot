package com.learnspring.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ApplicationContext context = new ClassPathXmlApplicationContext("com/learnspring/primitive/config.xml");
			Student st = context.getBean("st2",Student.class);
			System.out.println(st);
					
	}

}
