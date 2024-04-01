package com.lit.day3;
// encapsulation is binding of data member with member function in single unit
//encapsulation is used for security // getter setter to string are necessary for encapsulation

public class encapsulationclass {
	private int Idname;
	private String name;
	private int age;
	//getter setter
	public int getIdname() {
		return Idname;
	}
	public void setIdname(int idname) {
		this.Idname = idname;
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
	//to String
	@Override
	public String toString() {
		return "Oopsconcept [idname=" + Idname + ", name=" + name + ", age=" + age + "]";
	}
	
}
