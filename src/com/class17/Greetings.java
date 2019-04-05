package com.class17;

public class Greetings {

	public static void main(String[] args) {
		
		Greetings obj = new Greetings();
		
		obj.askHowAreYou("Omer"); //calling the method
		
	}
	void askHowAreYou(String name) {
		System.out.println("How are you " +name);
	}

}
