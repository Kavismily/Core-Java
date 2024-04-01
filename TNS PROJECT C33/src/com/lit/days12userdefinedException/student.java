package com.lit.days12userdefinedException;

public class student {
	private int rollno;
	private String name;
	private int age;
	private int[] marks;
	private int noOfSubject;
	private float percent;
	//constructor
      public student(int rollno, String name, int age, int[] marks, int noOfSubject, float percent) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.noOfSubject = noOfSubject;
		this.percent = percent;
	}
	public student() {
		
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public int getNoOfSubject() {
		return noOfSubject;
	}
	public void setNoOfSubject(int noOfSubject) {
		this.noOfSubject = noOfSubject;
	}
	public float getPercent() {
		return percent;
	}
	public void setPercent(float percent) {
		this.percent = percent;
	}
	//toString
	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", name=" + name + ", age=" + age + ", marks=" + marks + ", noOfSubject="
				+ noOfSubject + ", percent=" + percent + "]";
	}
	
	

}
