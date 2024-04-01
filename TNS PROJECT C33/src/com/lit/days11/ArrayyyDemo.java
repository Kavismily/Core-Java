package com.lit.days11;
import java.util.Arrays;
public class ArrayyyDemo {

	public static void main(String[] args) {
		 int intArr[] = { 90,20,30,60,50};
		 System.out.println(intArr[4]);
		 
		 // print all elements in Arr
		 System.out.println(("Array is:"+Arrays.toString(intArr)));
		
		// sorting 
		 
		 Arrays.sort(intArr);
		 
		 System.out.println("Affter sorting");
		 System.out.println("Array is:"+ Arrays.toString(intArr));
		 
		 //find
		 int intkey = 30;
		 System.out.println(intkey+"found at index"+Arrays.binarySearch(intArr, intkey));
		
		
}
}