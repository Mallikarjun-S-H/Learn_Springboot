package com.learnspring.SpringJdbcJava;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {

	public static void main(String[] args) throws SQLException {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		JdbcTemplate jt = context.getBean("jdbc", JdbcTemplate.class);
		
		System.out.println(jt.getDataSource().getConnection());
	}
}
