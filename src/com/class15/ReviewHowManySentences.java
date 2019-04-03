package com.class15;

public class ReviewHowManySentences {

	public static void main(String[] args) {
		// How many sentences in string. Use sentence delimitter int count = str.split("[!?.:]+").length; The + sign allows for multiple
		
		 String original = "Is it saturday? Is it raining? Do we have a Java Class today?";
		 
		 String [] split = original.split("[?]+");
		 
		 System.out.println(split.length);
		 
		 for (int i=0; i<split.length; i++) {
			 System.out.println(split[i]);
		 }
		 

	}

}
