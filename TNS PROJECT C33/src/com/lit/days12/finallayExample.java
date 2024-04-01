package com.lit.days12;

import java.util.Scanner;
   
public class finallayExample {
	public static void main(String args[])
	{
	
	
		int a = 20,b= 0, c ;
		try {
			c = a/b;
			System.out.println(" result:"+c);
		}finally {
			System.out.println(" i am in final block");
		
		}
		
		
	}
	
	
		
}

