package com.lit.day6staticfinal;

public class finalDEMO2 extends finalDEMO
{

void display()
{
	System.out.println(" i am not final:");
	
}
	// final method cannot be overwritten


public static void main(String arg[]) {
	finalDEMO obj = new finalDEMO();
	System.out.println(obj);
}
}