package com.class17;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Palindrome obj = new Palindrome();
		
		obj.palin("racecar");

	}
	
	void palin(String original) {
		
		String reverse = "";
		
		
		int length = original.length();
		
		
		for (int i =length-1; i>=0; i-- ) {
			
			reverse = reverse + original.charAt(i);
		}
		
		System.out.println(reverse);

	System.out.println("----------------");
	
	if (original.equals(reverse)) {
		System.out.println("The string is a palindrome");
	}else {
		System.out.println("The string is not a palindrome");
	}
	}

}
