package com.class23;

public class Addition {
	
	//overloading methods by changing number of parameters
	//OR change the type of the parameters
	
	public void add (int a, int b) {
		System.out.println(a+b);
		System.out.println("Method to add two integers");
	}
	
	//methods have same name but different parameters called method overloading 
	//can be achieved by number of arguments or methods
	public void add (int a) {
		System.out.println(a+100);
		System.out.println("Method to add one integers");
	}
	
	//overloading the add method 
	public void add (int a, int b, int c) {
		System.out.println(a+b+c);
		System.out.println("Method to add three integers");
	}
	
	public void add (double a, double b) {
		System.out.println(a+b);
		System.out.println("Method to add two doubles");
	}
	public void add (int a, double b) {
		System.out.println(a+b);
		System.out.println("Method to add one integer and one double");
	}
	public void add (double a, double b, double c) {
		System.out.println(a+b+c);
		System.out.println("Method to add three doubles");
		
	}

}
