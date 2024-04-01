package com.lit.days15;

import java.util.LinkedList;
import java.util.Queue;

public class Queueclass {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		  for(int i = 0;i<6;i++)	
		  {//adding in Queue
			  q.add(i);
			  System.out.println(i);
		  }
		  //displaying the elements in queue
		  System.out.println("elements in Queue:"+q);
			// to remove head of the Queue we can use poll()
		  
		  System.out.println(q.poll());
		  System.out.println(q.poll());
		  System.out.println(q);
		  //to return head of the Queue we can use peek()
		  System.out.println(q.peek());
		  System.out.println(q);
		  
				

	}

}
