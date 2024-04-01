package com.lit.day7;
//Overloading means two or more method name can be same with different signature
public class MethodoverLOADING
{
	
public static int subtraction(int a ,int b)
{
	return a - b;
}
public static int subtraction(int a , int b , int c)
{
	return a-(b-c);
	
}
public static int subtraction(int b, int a,int c, int d)
{
	return (a-b)-(c-d);
	

}
public static int subtraction(int a)
{
	return a;
}

}
