package com.class5;

public class LogicalOperators {

	public static void main(String[] args) {
		// if number is between 1-10 -> number is small
		//if number is between 11-100-> number is medium
		//if number is between 101-1001-> number is large
		//
		
		int num=15;
		
		if (num>=1 && num<=10) {
			System.out.println("number is small");
			//false and false = false
			
		}else if (num>=11 && num<=100) {
			System.out.println("number is medium");
			//true and true = true
			
		}else if (num>=101 && num<=1000) {
		System.out.println("number is large");
		//false and true = false
		
		}else {
		System.out.println("number is not in range");
	
		}

	}

}
