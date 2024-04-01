package com.lit.days10;
import java.io.*;
public class StringOperations {
	
	
	      
	
	  public static void main(String args[])
	  {
		StringBuffer buffer = new StringBuffer("hello");
		System.out.println("Buffer:"+buffer);
		System.out.println("Buffer length: "+buffer.length());
		System.out.println("Buffer capacity:"+buffer.capacity());
		//append
		String s;
		int a = 42;
		buffer = new StringBuffer(40);
		s=buffer.append("a=").append(a).append("!").toString();
		System.out.println(s);
		System.out.println(buffer);
		//insert
		buffer = new StringBuffer("i  book");
		buffer.insert(2 , "need");
		System.out.println(buffer);
		// delete
		buffer.delete(2, 7);
		System.out.println(buffer);
		
		  
		   
		   
	  }

}
