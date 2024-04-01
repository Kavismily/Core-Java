package com.lit.day4;
//access modifier are public,private,protected,default
//needs void for each access variable (void method)
public class accessmodifierclass {
	int varDefault=10;// can be accessed within class,package
	private int varPrivate=20;// can be accessed only within class// one way is getter setter for varible to access by other class
	                          //no method can be accessed by other class or package
	public int varPublic= 30;//can be acessed by same class, diffrent class , within package, by another package
	protected int varProtected=40;//can be accessed by same class, other class , within package and by other package by inheritance 
	
	 
	void methodDefault()// method for default to access
	{
		System.out.println("access modifier is default");
	System.out.println("10");
		}
   
	 public void methodPublic()//method for public to access
	{
       System.out.println("acess modifier is public");
       System.out.println("30");
	}
	void methodProtected()// method for protected to acess
	{
		System.out.println("access modifier is protected");
		System.out.println("40");
	}


	@Override
	public String toString() {
		return "accessmodifierclass [varDefault=" + varDefault + ", varPrivate=" + varPrivate + ", varPublic="
				+ varPublic + ", varProtected=" + varProtected + "]";
	}


	
	
}
