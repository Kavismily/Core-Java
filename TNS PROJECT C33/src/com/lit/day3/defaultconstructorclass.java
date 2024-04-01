package com.lit.day3;
// default constructor is atomatically created by compiler

public class defaultconstructorclass {
	private int CustomerID;
	private String name;
	private int Age;
	
	public defaultconstructorclass() {//default constructor
		System.out.println("Hello CONSTRUTOR");
	}
	public int getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	@Override
	public String toString() {
		return "DEMOdefaultconstructor [CustomerID=" + CustomerID + ", name=" + name + ", Age=" + Age + "]";
	}
	
	      
	}
	
	
	


