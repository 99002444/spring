package com.courseApp.model;

import org.springframework.stereotype.Component;

@Component
public class Address {
	String city, State;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public Address(String city, String state) {
		super();
		this.city = city;
		State = state;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
