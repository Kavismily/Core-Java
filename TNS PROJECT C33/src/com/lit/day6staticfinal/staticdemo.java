package com.lit.day6staticfinal;

public class staticdemo {
	private int rollno;
	private static int mobno;
	static {
		System.out.println("i am static");
		mobno=123;
		}
	//constructor
	public staticdemo() {
		System.out.println(" i am constructor");
		rollno++;
		mobno++;
		
	}
	//tostring
	@Override
	public String toString() {
		return "staticdemo [rollno=" + rollno + " + mobno="+ mobno+"]";
	}
	static void display()
	{
		System.out.println("mobno is"+mobno);
		
	}
	
}
