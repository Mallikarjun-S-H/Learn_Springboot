package com.learnspring.sterotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {
	@Value("101")
	private int id;
	@Value("Mohan")
	private String name;
	@Value("100001")
	private String salary;
	@Value("#{add}")
	private List<String> address;
	
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
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}
	
	
	
}
