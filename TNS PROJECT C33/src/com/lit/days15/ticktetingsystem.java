package com.lit.days15;

import java.util.LinkedList;
import java.util.Queue;

public class ticktetingsystem {

	public static void main(String[] args) {
		Queue<String>customer=new LinkedList<>();
		//customer arrive and join queue
		customer.add("customer1");
		customer.add("customer2");
		customer.add("customer3");
		//process customer in order they join
		while(!customer.isEmpty())
		{
			String customers = customer.poll();
		
		System.out.println( " serving:"+customers);
		}
			
		
		

	}

}
