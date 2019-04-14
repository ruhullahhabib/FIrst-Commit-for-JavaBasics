package com.class23;

public class Employee {
	
	//create instance variables for inheritance
	
	public static String department= "IT";
	int salary;//default
	protected int salary1;//protected
	
	protected void test() {
		System.out.println("I am a protected method");
	}
	
	void testOne() {
		System.out.println("I am a defaut method");
	}
	
	public void getPaid() {
		System.out.println("Employess get's paid " +salary);
	}
	
	public static void work() {
		System.out.println("Employee works in " +department+" department");
	}

}
