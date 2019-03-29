package com.class5;

public class NestedIfPractice {

	public static void main(String[] args) {
		//check if user has credit card -> check the balance
		//balance more than 1000? pay off immediatley
		//balance less than 1000? you good son
		
		boolean creditCard=true;
		int balance = 10000; 
		
		if (creditCard) {
			System.out.println("Lets check your balance");
			if (balance>=1000) {
				System.out.println("Pay off your balance");
				
			}else {
				System.out.println("You are good");
			}
		}else {
			System.out.println("Would you like a credit card?");
		}

	}

}
