package com.lit.day4;

public  class privateconstructorclass {
	private static privateconstructorclass obj = new privateconstructorclass();
	 private int id;
	 private String name;
	 private int age;
	 //private constructor
  private privateconstructorclass()
	{
		System.out.println(" i am privateconstructor");
	}
  // getter setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//factory method
 public static privateconstructorclass getObject()
   {
	   return obj;
   }
	//tostring
		
	@Override
	public String toString() {
		return "privateconstructorclass [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	
	

}
