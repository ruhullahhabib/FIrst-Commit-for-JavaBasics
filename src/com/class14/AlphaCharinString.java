package com.class14;

public class AlphaCharinString {

	public static void main(String[] args) {
		
		String str = "HellO TheRe MiStER WOndErfuL";
		
		int upperCase = 0;
		
		char ch;
		
		for (int i=0; i<str.length(); i++) {
			
			
			if (Character.isUpperCase(str.charAt(i))) {
		
				upperCase= upperCase + 1;
			}
			
		}
			
			System.out.println("Number of uppercase letters are " +upperCase);
		

	}

}
