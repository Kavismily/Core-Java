package com.lit.days12userdefinedException;

import java.util.Scanner;

public class userdefinedException {
	public static void main(String[] args)
	{
		try {
			Scanner sc = new Scanner(System.in);
			//accept students details
			student s1=new student();
			System.out.println("Enter the rollno:");
			 int rollno = sc.nextInt();
			 System.out.println("Enter the name");
			 String name = sc.next();
			 System.out.println("Enter the age");
			 int age = sc.nextInt();
			 System.out.println("Enter  no of subject");
			 int sub = sc.nextInt();
			 System.out.println("Enter the Marks");
			 int[] intArr = new int[sub];
			 for(int i = 0;i<sub;i++) {
				 intArr[i] = sc.nextInt();
			 }
			 // valid marks
			 if(Service.validateMarks(intArr)) {
				 s1.setMarks(intArr);
				 s1.setPercent(Service.calculatepercentage(intArr));
			 }
		}catch(InvalidMarksException e) {
		 System.err.println(e.getMessage());
		}
		
	
		 }
			 
			 
			 
	
		
			
		
	}
	
	
	


