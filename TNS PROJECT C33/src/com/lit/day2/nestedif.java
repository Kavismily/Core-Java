package com.lit.day2;
// nested if is used to check condition inside the ifelse loop//we can add so many condition using if as our wish
public class nestedif {

	public static void main(String[] args) {
		int a=10;int b=11;int c=20;
	if(a>b) {
		if(a>c) {
			System.out.println("a is greater");
		}
		else {
			System.out.println("a is smaller");
		}
	}
    else {
    	if(b>c) {
    		System.out.println("b is greater");
    	}
    	else {
    		System.out.println("c is greater");
    	}
    }
		
 }
	
	}



