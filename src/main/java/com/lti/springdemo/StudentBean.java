package com.lti.springdemo;

public class StudentBean {
   private	String name;
   private String city;

	public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
public void displayInfo() {
	System.out.println("Hello : "+name);
	System.out.println("Welcome to  "+city);

	
}
}
