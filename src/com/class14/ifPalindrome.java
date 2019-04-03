package com.class14;

import java.util.Scanner;

public class ifPalindrome {

	public static void main(String[] args) {
		// if palindrome
		
		String original = "";
		String reverse = "";
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter your word");
		original = scan.nextLine();
		
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
