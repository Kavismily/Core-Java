package com.lit.day6staticfinal;

public class finalvariable {
	final int x = 100;
	final static int y;
	final int z = 30;
	static {
		y = 200;
	}
	void show()
	{
		System.out.println("i am final");
	}
	@Override
	public String toString() {
		return "finalvariable [x=" + x + ", z=" + z + ",y="+ y +"]";
	}
	

	
}
