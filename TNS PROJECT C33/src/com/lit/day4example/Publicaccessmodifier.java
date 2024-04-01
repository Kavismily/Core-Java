package com.lit.day4example;
import com.lit.day4.*;
public class Publicaccessmodifier {

	public static void main(String[] args) {
		accessmodifierclass ac2 = new accessmodifierclass();
		   ac2.varPublic=30;
		   ac2.methodPublic();
		   
		   
		   
		   
		   //accessed from another package // public is accessed by anywhere
		                                //amc.varPrivate = 20;// these is unable to accessed by another 
		                                //amc.varDefauult==10;// these is unable to accessed by another
	                                  	//amc.varProtected=40;// inheritance is not used so unable to access
		   
		  
  
	}

}
