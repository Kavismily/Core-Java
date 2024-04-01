package com.lit.days15;

public class Task {
	private String name;
	private int priority;
	//getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	//constructor
	public Task(String name, int priority) {
		super();
		this.name = name;
		this.priority = priority;
	}
	//toString
	@Override
	public String toString() {
		return "Task [name=" + name + ", priority=" + priority + "]";
	}
	 public int compareTo(Task other)
	 {
		 return Integer.compare(priority, priority);
		 
	 }
	
	

}
