package com.lit.day3;
  import java.util.Scanner;// for scanner class we have to import scanner package

public class ScannerDemo {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter id'");
       int Serialno = sc.nextInt();// for integer sc.nextInt
       System.out.println("enter name");
       String name = sc.next();//for string sc.next()
       System.out.println("enter age");
       int age = sc.nextInt();
       System.out.println("enter gender");
       String gender = sc.next();
       //for understanding what happen when scanner is not used
      
         scannerperson p = new scannerperson();
         p.setSerialno(Serialno);
         p.setName(name);
         p.setAge(age);
         p.setGender(gender);
         System.out.println(p);
         // with scanner we can give multiple input and we can change it as our wish (dynamic input )can be modified
         //with out scanner the out put is in string format (satic input)constant input and cannot be modified
         
       
    		   
       
       
       
       
       
       
	}

}
