package com.lit.days10;

public class stringDemo {
	public static void main (String args[])
	{
		char c[] = { 'i','l','u','v','m','e'};// basic string
	String	s1 = new String(c);
		String s2 = new String(c);
		System.out.println(s1);
	System.out.println(s2);
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	
	//concalcnation to prevent long lines
	
	String longStr = "MYSELF KAVITHA"+"  I WANT TO BECOME"+ " SOFTWARE ENGINNER .";
     
	System.out.println(longStr);

	
}
}
 

