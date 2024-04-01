package com.lit.day3;

public class scannerperson
{
	 private int Serialno;
	 private String name;
	 private int age;
	 private String gender;
	public int getSerialno() {
		return Serialno;
	}
	public void setSerialno(int serialno) {
		Serialno = serialno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "PerosnScanner [Serialno=" + Serialno + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	 
	 
	
	

}
