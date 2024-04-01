package com.lit.day5hierachical;

public class employee extends person
{
	private int id;
	private int mobno;
	//constructor
	public employee(long adhar, int age,int id , int mobno) {
	super(adhar,age);
	this.id=id;
	this.mobno=mobno;
	}
	//getter setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getSalary() {
		return mobno;
	}
	public void setSalary(int mobno) {
		this.mobno= mobno;
	}
	// to string
	@Override
	public String toString() {
		return "employee [id=" + id + ", mobno=" + mobno+ ", getAdhar()=" + getAdhar() + ", getAge()=" + getAge()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
