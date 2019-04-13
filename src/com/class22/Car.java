package com.class22;

public class Car {
	
	public static String make = "Toyota";
	String color;
	String model;
	int doors;
	boolean engine;
	
	Car() {//constructor
		
		System.out.println("I am a constructor");
		System.out.println("Hello from constructor");
	}
	
	//access modifier//non access modifier//Return Type//name of the method//parameters an array of strings with name args
	public static void main (String [] args) {
		
//class name//reference variable//object name//= is assigning operator//new - keyword that creates an object//Car()-Constructor
		//complier creates the constructor for us
		Car obj = new Car();
		//constructor gives initial value of null for string.
		System.out.println(obj.color);
		System.out.println(obj.doors);
		System.out.println(obj.engine);
		hello();
		
	}
	
	public static void hello() {
		
		//before using variable you have to initialize it
		String name;
		System.out.println(name);
		System.out.println("I am a static hello method");
	}

}
