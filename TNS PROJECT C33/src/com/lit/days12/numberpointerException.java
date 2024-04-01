package com.lit.days12;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class numberpointerException {

	public static void divide(int x,int y) {
		int z = 0 ;
		try {
			z = x/y;
			System.out.println(" result is:"+z);
			
		}catch(ArithmeticException ex) {
			System.err.println(" a number cannot be divided by 0");
			
		}
		//for wrong input as alphabet we can make another exception as showm below
		// catch(Exceotion ae){
		//System.out.println(" missmatching only alphabets");
		
	}
	
	public static void main(String args[])
	{
		int x,y,z;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number x");
		 x = sc.nextInt() ;
		 System.out.println("Enter the number y");
		 y = sc.nextInt();
		 divide(x,y);
	}
	
	
	
	
	

}
