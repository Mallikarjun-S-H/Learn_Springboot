package com.learnspring.sterotype;

import org.springframework.stereotype.Component;

@Component
public class Address {

	private int id;
	private String location;
	private String State;
	private String country;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "Address [id=" + id + ", location=" + location + ", State=" + State + ", country=" + country + "]";
	}
		
}
