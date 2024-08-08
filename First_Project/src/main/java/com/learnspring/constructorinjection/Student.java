package com.learnspring.constructorinjection;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {
	private int id;
	private String name;

	

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}	

}
