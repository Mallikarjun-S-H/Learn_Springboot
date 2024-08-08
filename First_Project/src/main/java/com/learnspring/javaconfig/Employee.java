package com.learnspring.javaconfig;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Employee {
	private int id;
	private String name;
	private String salary;
	
	@Autowired
	private Address address;
	
	
	
	
	  public Employee(int id, String name, String salary, Address address) {
	  this.id = id; this.name = name; this.salary = salary; this.address = address;
	  }
	 
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}
	
	
	
}
