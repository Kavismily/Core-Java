package com.lit.days15;

import java.util.ArrayDeque;
import java.util.Deque;

public class dequeDEMO {

	public static void main(String[] args) {
	Deque<String>de=new ArrayDeque<String>();
	de.add("A");
	de.add("B");
	de.add("c");
	de.add("D");
	de.add("E");
	System.out.println(de);
	de.offerFirst("E");
	de.offerLast("A");
	System.out.println(de);

	}

}
