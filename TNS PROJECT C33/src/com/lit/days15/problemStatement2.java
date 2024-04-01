package com.lit.days15;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class problemStatement2 {

	public static void main(String[] args) {
		Deque<String> de = new ArrayDeque<String>();
		de.add("a");
		de.add("b");
		de.add("c");
		de.add("d");
		System.out.println(de.poll());
		System.out.println(de.poll());
		System.out.println(de.poll());
		System.out.println(de.poll());
		Deque<String> s = new LinkedList<>();
		s.add("a");
		s.add("a");
		s.add("b");
		s.add("b");
		s.add("c");
		s.add("c");
		s.add("d");
		s.add("d");
		System.out.println(s);
		s.poll();
		s.poll();
		s.poll();
		s.poll();
		s.poll();
		s.poll();
		s.poll();
		s.poll();
		System.out.println(s);
		

	}

}
