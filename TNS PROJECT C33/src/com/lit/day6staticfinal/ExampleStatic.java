package com.lit.day6staticfinal;

public class ExampleStatic {
  private String name;
  private int age;
  
  static String collegename = "LIT";

public ExampleStatic(String name, int age) {
	
	this.name = name;
	this.age = age;
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

@Override
public String toString() {
	return "ExampleStatic [name=" + name + ", age=" + age + ",collegename="+ collegename+"]";
}
  
  
}
