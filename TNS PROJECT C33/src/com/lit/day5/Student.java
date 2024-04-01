package com.lit.day5;

public class Student extends Citizen 
{
  private int rollno;
  private String name;
  


private Student() {
	super();
	
}
public  Student(int age, String addhar, String city, int rollno, String name) {
	super(age, addhar, city);
	this.rollno = rollno;
	this.name = name;
	
			
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", getAge()=" + getAge() + ", getAddhar()=" + getAddhar()
			+ ", getCity()=" + getCity()
			+ "]";
}
  
  
}
