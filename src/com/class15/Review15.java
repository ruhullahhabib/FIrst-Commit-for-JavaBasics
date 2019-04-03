package com.class15;

public class Review15 {

	public static void main(String[] args) {
		// found at 4th index//tutorial and sutorial are not found 
		String name = "Syntax";

		String Str = new String("Welcome on Board");
		
		String SubStr1 = new String("Tutorials");
		String SubStr2 = new String("Sutorials");
		
		System.out.print("Found Index :" );
		System.out.println(Str.indexOf( 'o' ));
		
		System.out.print("Found Index :" );
		System.out.println( Str.indexOf( SubStr1 ));
		
		System.out.print("Found Index :" );
		System.out.println(Str.indexOf( SubStr2 )); 
		
		String mix="3213Hello 89 World354545 *&***^&*^&*";
		System.out.println(mix.replaceAll("[0-9]", ""));
		System.out.println(mix.replaceAll("[a-z]", ""));
		System.out.println(mix.replaceAll("[a-z A-Z]", ""));
		System.out.println(mix.replaceAll("[^A-Za-z0-9]", ""));
		
		char[] array=name.toCharArray();//array={'S', 'y', 'n', 't', 'a', 'x'}
		System.out.println(array.length);
		
		//System.out.println(array[1]); printing 1 value
		for (int i=0; i<array.length; i++) {
		System.out.println(array[i]);
		
		
		String subject="I love Java and I want to learn more";
		//Using space “ ” as a delimiter
		//Split returns an array of Strings
		String [] splittedSub = subject.split(" ");
		
		System.out.println(splittedSub.length);
		
		//Looping through the array to get all the values
		
		for (int h = 0; h< splittedSub.length; h++) {
			
			
			System.out.print(splittedSub[h]);
	
		}}
	}
}
