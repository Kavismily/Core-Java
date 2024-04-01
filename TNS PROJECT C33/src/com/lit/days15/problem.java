package com.lit.days15;

import java.util.LinkedList;

public class problem {

	public static void main(String[] args) {
	LinkedList<Character> p = new LinkedList<Character>();
	p.add('s');
	p.add('m');
	p.add('p');
	p.add('t');
	while(!p.isEmpty())
	{
		System.out.print(p.poll()+"-->");
	}
	

	}

}
