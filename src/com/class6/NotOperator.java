package com.class6;

public class NotOperator {

	public static void main(String[] args) {
		// notoperator !
		
		boolean a = !true;
		
		//! creates a not statement
		
		System.out.println("The value of boolean variable is "+a);
		
		boolean snow = true;
		
		//if it is not snowing then i will come to the class//else i will stay at home
		
		if (!snow) {
			System.out.println("I will come to the class");	
		}
		
		int x=10;
		int y=20;
		
		if (!(x>y)) {
			System.out.println("x is larger than y");
		}

	}

}
