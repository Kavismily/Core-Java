package com.lit.days13;

public class Threadclass extends Thread{
	private int n;
	private String message;
	//constructor
	public Threadclass(int n, String message) {
		super();
		this.n = n;
		this.message = message;
	}
	public void run() {
		for(int i=0; i<n; i++) {
		try {
			Thread.sleep(2000);//2 seconds
			
		}catch(InterruptedException ae) {
			System.err.println("Thread interrupted:"+ ae.getMessage());
			Thread.currentThread().interrupt();//restore interupted status
		}
		System.out.println(message+""+i+Thread.currentThread().getName());
	}
	}
}


