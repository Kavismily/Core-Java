package com.lit.days11;
import java.util.Scanner;
public class problemStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// scanner object
		System.out.println("Enter the  no of elements");
		int noelements = sc.nextInt();// get no of elements
		System.out.println(" Enter the elements");// get elements in array
		int[] elements = new int[noelements];// create array to store elements
		
		for (int i = 0;i< noelements;i ++)// read each elements and store in array
		{
			elements[i] = sc.nextInt();// 
			
			
		}
		int sum = 0 ;
		for(int element:elements)// cal sum
		{
			sum += element;
		
		}
		 if(sum % 2 == 0 )// check even or odd
		 {
			 System.out.println("Even");
		 }
		 else
		 {
			 System.out.println("Odd");
		 }
		 
		 if(sum % 2 == 0)
			 
		 {
            System.out.println(" sum is even ="+ sum);  	
            
		 }
		 
		 else
		 {
			 int product  = 1;
			 for(int element : elements) {
				 product*= element;
			 
			 
		 }
		 System.out.println(" sum is odd = "+ product);
		 
		 }
	
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
}
}