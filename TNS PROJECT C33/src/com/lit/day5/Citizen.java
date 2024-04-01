package com.lit.day5;

public class Citizen {
	private int age;
	private String addhar;
	private String city;
	
	// constructor
	public Citizen()
	{
		System.out.println("default");
	}
	public Citizen(int age, String addhar, String city) {
		super();
		this.age = age;
		this.addhar = addhar;
		this.city = city;
	}

	public int getAge() {
		return age;
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddhar() {
		return addhar;
	}
	public void setAddhar(String addhar) {
		this.addhar = addhar;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Citizen [age=" + age + ", addhar=" + addhar + ", city=" + city + "]";
	}
	

}
