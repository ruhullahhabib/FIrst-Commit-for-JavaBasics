package com.class22;

public class StaticVsNonStatic {
	
	public String name = "John";//instance variable//only accessible with obj
	
	public static String lastName= "Snow";//static variable
	
	public static void main (String [] args) {
		
		StaticVsNonStatic obj = new StaticVsNonStatic();
		
		obj.getInfo();
		
		getInfo1();//within same class we can call it by using method/variable name
		
		System.out.println(lastName);
	}
	
	//non static method - can access both instance and static variables
	public void getInfo() {
		System.out.println("My name is " +name+ " and my last name is "+lastName);
		//can access static method within non-static method
	}
	
	public static void getInfo1() {
		//System.out.println("My name is " +name+ " and my last name is "+lastName);
		//will get error 
		//static method can have an access to only static methods 
		System.out.println("I am a static method");
	}

}
