package com.lit.day4;

public class AccessModifiers {

	public static void main(String[] args) {
	    accessmodifierclass ac = new accessmodifierclass();//object is created 
	    ac.varDefault=10;
	    ac.methodDefault();
	    ac.varPublic=30;
	    ac.methodPublic();
	    ac.varProtected=40;
	    ac.methodProtected();
	    System.out.println(ac);

	}

}
