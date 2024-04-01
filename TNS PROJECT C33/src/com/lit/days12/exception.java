package com.lit.days12;
// unchecked exception
public class exception {
	public static void main(String args[])
	{
		int arr[];
		arr = new int[]{1,2,3,4,5,6};
		System.out.println(arr[6]);
	}
// runtime exception occurs becoz 6 index is not present in arr
}
