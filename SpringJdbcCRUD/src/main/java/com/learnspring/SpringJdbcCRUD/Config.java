package com.learnspring.SpringJdbcCRUD;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import Dao.StudentDao;
import Dao.StudentDaoImpl;

@Configuration
@ComponentScan(basePackages = "dao")
public class Config {
	
	@Bean
	public DataSource getDataSource() {	
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/student_jdbc?createDatabaseIfNotExist=true");
		ds.setUsername("root");
		ds.setPassword("root");	
		 return ds;
	}
	
	
	
	@Bean("jdbc")
	public JdbcTemplate getJdbcTemplate() {
		/*
		 * JdbcTemplate jt = new JdbcTemplate(); jt.setDataSource(getDataSource());
		 * return jt;
		 */
		return new JdbcTemplate(getDataSource());
	}
	
	
//	@Bean
//	public StudentDao getStudentDao() {
//        StudentDaoImpl stDao = new StudentDaoImpl();
//        stDao.setJt(getJdbcTemplate());
//        return stDao;
//    }
//	
}
