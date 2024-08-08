package com.learnspring.springBootExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringBootExampleApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext();
				ctx.getBean();
	
	
	
	}

}
