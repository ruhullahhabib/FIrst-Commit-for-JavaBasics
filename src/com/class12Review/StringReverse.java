package com.class12Review;

public class StringReverse {

	public static void main(String[] args) {
		// print in reverse
		
		String day = "Sunday";
		
		String reverse = "";
		
		for (int i=day.length()-1; i>=0; i-- ) {
			reverse = reverse + day.charAt(i);
		}
		
		System.out.println(reverse);

	}

}



