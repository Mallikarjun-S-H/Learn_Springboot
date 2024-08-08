package com.learnspring.autowiringannotation.copy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Employee {

	private int id;
	private String name;
	private String salary;
	
	@Autowired
	@Qualifier("ad2")
	private Address address;
	
	/*
	 * public Employee(int id, String name, String salary, Address address) {
	 * super(); this.id = id; this.name = name; this.salary = salary; this.address =
	 * address; System.out.println("constructor injection"); }
	 */
	 
	
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
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("setter injection");
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}
	
	
}
