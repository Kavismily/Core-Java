package com.lit.day5hierachical;

public class students extends person
{
 private  String name;
private  String clgname;
//constructor

public students(long adhar, int age,String name,String clgname) {
	super(adhar, age);
	this.name=name;
	this.clgname=clgname;
	
}
//gettter setter
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getClgname() {
	return clgname;
}
public void setClgname(String clgname) {
	this.clgname = clgname;
}
// tostring
@Override
public String toString() {
	return "students [name=" + name + ", clgname=" + clgname + ", getAdhar()=" + getAdhar() + ", getAge()=" + getAge()
			+ ", toString()=" + super.toString() + "]";
}



}
