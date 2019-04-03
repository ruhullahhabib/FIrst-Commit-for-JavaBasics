package com.class14;

public class WithoutSpaces {

	public static void main(String[] args) {
		// Task 1
		
		String  s= "hold a sentence? you want me to hold a sentence?";
		
		String [] n= s.split("\\?");
		
		for(String substring:n) {
		
		System.out.println(substring);
		
		

	}
		
		//task 2
		
		String sentence = "This$#@is&*$^a^%#^sentence";
		String sentence2 = sentence.replaceAll("[^A-Z a-z]", " ");
		System.out.println(sentence2);
		System.out.println(sentence2.length());
		


	//Task 3
	
			String a = "do we have class today/ is it raining/";
			String [] array1= a.split("/");
			
			for (String something:array1) {
				
				System.out.println(something);
			System.out.println(array1.length);
						}
			
	}
	
}
