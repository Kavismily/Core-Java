package com.lit.day7overriding;

public class methodoverriding {
	public static void main(String args[])
	{
		LITcollege LIT;
		LIT= new LITcollege();
		System.out.println("results are"+LIT.getresults());
		LIT=new ITdepartment();
		System.out.println("result is"+LIT.getresults());
		LIT= new CSEdeparrtment();
		System.out.println("result is"+LIT.getresults());
		LIT = new EEEdepartment();
		System.out.println("result is"+LIT.getresults());
		LIT= new ECEdepartment();
		System.out.println("result is"+LIT.getresults());
		
	}

}
