package com.learnspring.javaconfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Config {
	
	@Bean
	@Primary
	public Address add() {
		return new Address(01, "RNR", "KARNATAKA", "INDIA");
	}
	
	@Bean
	public Address getAddress() {
		return new Address(02, "HKR", "KARNATAKA", "INDIA");
	}
	
	@Bean
	public Employee getEmp() {
		return new Employee( 101, "Ram", "100000", add());
	}
}
