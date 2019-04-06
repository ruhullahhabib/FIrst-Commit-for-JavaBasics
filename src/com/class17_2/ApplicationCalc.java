package com.class17_2;

import com.class17.Calculator;

public class ApplicationCalc {

	public static void main(String[] args) {
		// call from calculator class from Class 17 // class17.Calculator was imported
		
		Calculator obj = new Calculator();
		
		
		
		System.out.println(obj.sum(5, 4));
		System.out.println(obj.sub(1, 4));
		System.out.println(obj.div(1, 4));
		System.out.println(obj.mult(1, 4));
		
		ApplicationCalc app = new ApplicationCalc();
		
		System.out.println(app.example6('f'));
		

	}
	
	void example() {
		System.out.println("no parameters/no return values");
		
	}
	
	void example2 (String name) {
		System.out.println("with parameters : "+name);
	}
	
	boolean example3 () {
		System.out.println("with return value and No Parameters");
		return true;
	}
	
	void example4 (String name) {
		System.out.println("no return value but with parameters : "+name);
	}
	
	boolean example5 (String name) {
		System.out.println("return type with parameters : "+name);
		return false;
		}
	//return any data type but the body needs to match the data type
	char example6 (char name) {
		System.out.println("no return value but with parameters : "+name);
		
		return name;
	}

}
