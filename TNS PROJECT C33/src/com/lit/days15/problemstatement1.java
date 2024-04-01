package com.lit.days15;
import java.util.PriorityQueue;
import java.util.Queue;
public class problemstatement1 {

	public static void main(String[] args) {
		Queue<Integer>q = new PriorityQueue<>();
		q.add(45);
		q.add(25);
		q.add(55);
		q.add(15);
		q.add(35);
		System.out.println(q);
		while(!q.isEmpty())
		{
			System.out.print(q.poll()  +  "");
		}
		
		
		
		
		

	}

}
