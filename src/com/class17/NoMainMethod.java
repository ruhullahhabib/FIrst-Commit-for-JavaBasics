package com.class17;

public class NoMainMethod {
	
	String str;
	int num;
	
	void hello() {
		System.out.println("hello");
		System.out.println("hello youngins");
	}
	void bye() {
		System.out.println("Bye");
	}
	
	public static void main (String [] args) {
		
		NoMainMethod obj = new NoMainMethod ();
		
		obj.hello();// calling method hello //when debugging use step into to get into the method
		obj.bye();
		
	}
}
