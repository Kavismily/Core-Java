
	package com.lit.day9;
//  the methods declared in the interface class must be in implemented class // use implements keyword
	public class interfaceclass implements interfacedemo
	{
		public void speak()
		{
			System.out.println(" its human");
		}
	    public void walk()
	    {
	    	System.out.println(" obviously its mammals");
	    	
	    }
		@Override
		public String toString() {
			return "interfaceclass [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ",  +]";
		}

	}

