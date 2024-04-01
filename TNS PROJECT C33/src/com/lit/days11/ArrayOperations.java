package com.lit.days11;

public class ArrayOperations 
{ 
	 // print the array
	static void printArray( int[] arr)
	{
		for (int i = 0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"\t");
		}
		
		System.out.println();
		
		
	}
	 
	
	// count the no. of. odd elements
	 public int getOddCount (int b[])
	
	{
		int count = 0;
		for( int i=0;i<b.length;i++)
		{
			if ( b[i] % 2 != 0)
			System.out.println( "odd numbers are"+ b[i]);
			
			
		}
		     
		
		return count;
	
	 }


	
	


	
	 	 
	 
	 
}

	
	 
	

