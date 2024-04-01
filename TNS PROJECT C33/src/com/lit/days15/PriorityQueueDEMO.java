package com.lit.days15;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;



public class PriorityQueueDEMO {

	public static void main(String[] args) {
		Queue<String> pq=new PriorityQueue<>();
		pq.add("Kavitha");
		pq.add("nivetha");
		pq.add("AMMU");
		pq.add("chinnu");
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		Iterator<String>hw= pq.iterator();
		while(hw.hasNext())
		{
			System.out.println(hw.next()+"");
		}
		

	}

}
