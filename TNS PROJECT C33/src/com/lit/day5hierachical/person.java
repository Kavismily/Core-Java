package com.lit.day5hierachical;
// only one super class and many subclass are there
public class person {
private  long adhar;
private int age;

public person(long adhar, int age) {
	
	this.adhar = adhar;
	this.age = age;

}
// getter setter
public long getAdhar() {
	return adhar;
}
public void setAdhar(long adhar) {
	this.adhar = adhar;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
//toString
@Override
public String toString() {
	return "person [adhar=" + adhar + ", age=" + age + "]";
}


}
