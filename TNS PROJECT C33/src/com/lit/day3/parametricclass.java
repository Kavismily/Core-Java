package com.lit.day3;
// for parametric constructor need to declare constructor with parameters in the brackets

public class parametricclass 
{
	private int customerId;
	private String name;
	private int Age;
 //getter setter
   public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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

	public parametricclass(int customerId, String name, int age) {//parametric constructor
		super();
		this.customerId = customerId;
		this.name = name;
		 this.Age = age;
	}
//tostring
	@Override
	public String toString() {
		return "ConstructorDemo [customerId=" + customerId + ", name=" + name + ", Age=" + Age + "]";
	}
	
	
}

  