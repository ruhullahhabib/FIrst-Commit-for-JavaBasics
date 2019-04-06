package com.class17_2;

import java.util.Scanner;

public class TaskTwo {

	public static void main(String[] args) {
		// TODO Ask user to enter the item they want to buy and  the price for the item. 
		//Then ask user to pay for it. Every time user enters money accumulate the amount and tell user
		//how much is left to pay off the amount. Whenever user done with payments tell them "Thank you for shopping!"
		
		Scanner scan=new Scanner(System.in);
		
		String item;
		double price;
		double cash;
		double sum=0;
		
		System.out.println("Please enter item name");
		item=scan.nextLine();
		
		System.out.println("Please enter item price");
		price=scan.nextDouble();
		
		System.out.println("Please pay for item in cash");
		cash=scan.nextDouble();
		
		for (double i=price; i>=cash; i--) {
			
			
			
			sum-=i;
			
			System.out.println("The remainder of the item is " +sum);
		}
			
	}
	
}


