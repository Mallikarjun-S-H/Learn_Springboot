package com.learnspring.First_Project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	Action ac = new Shyam();
//    	ac.eat();
//    	ac.sleep();
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/learnspring/First_Project/config.xml");   	
    	System.out.println(context.toString());
    	
    	Shyam rm =  context.getBean("Shyam", Shyam.class);
    	rm.eat();
    	rm.sleep();
    }
}
