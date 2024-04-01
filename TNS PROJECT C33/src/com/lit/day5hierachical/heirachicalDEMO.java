package com.lit.day5hierachical;

public class heirachicalDEMO {

	public static void main(String[] args) {
          person p ;
		p = new person(1234567,20);
		if( p instanceof person)
			System.out.println("person details"+p);
		p=  new students(1234568,21,"KAVITHA","LIT");
		 if( p instanceof person)
				System.out.println("students details" + p);
		p = new employee(1234569,23,20,30);
				if(p instanceof person)
					System.out.println("students detail"+ p);
		
	}

}
