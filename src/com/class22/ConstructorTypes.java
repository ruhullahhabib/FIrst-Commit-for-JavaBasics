package com.class22;

public class ConstructorTypes {
	
	ConstructorTypes() {
		System.out.println("I am a constructor with no parameters");
	}
	
	//variable str that lives in constructor is known as a local variable
	ConstructorTypes (String str) {
		System.out.println("I am a constructor with 1 parameter");
	}
	
	ConstructorTypes (int a, String str) {
		System.out.println("I am a constructor with 2 parameters "+a+ " and " +str);
	}
	
	public static void main (String [] args) {
		
		ConstructorTypes obj = new ConstructorTypes();
		
		//locates constructor with same parameter type
		
		ConstructorTypes obj1 = new ConstructorTypes("String");
		
		ConstructorTypes obj3 = new ConstructorTypes(124, "String");
		
		
		
	}

}
