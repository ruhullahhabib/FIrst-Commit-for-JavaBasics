package com.class5;

import java.util.Scanner;

public class LogicalConditionsAll {

	public static void main(String[] args) {
		
		// user enter price and boolean value for sale
		//based on the sale we will check the price;
		// if price < $20 we have to apply discount 20% and give final price 
		// if price> $20 but <$100 apply discount 30% and give final price
		// if price is >100 and less than 500 apply discount and give final price
		
		Scanner scan;
		
		boolean sale;
		int discount;
		int price;
		double finalPrice;
		
		scan = new Scanner (System.in); //gets input from out keyboard
		
		System.out.println("Please enter if there is a Sale");
		sale = scan.nextBoolean();
		
		if (sale) {
			System.out.println("We will check for discounts");
			
			System.out.println("Please enter price of the item");
			price = scan.nextInt();
			
			 if (price < 20 ) {
				discount = 20;
				finalPrice = price- (price * 0.2);
				
			} else if (price >= 20 && price < 100) {
				discount = 30;
				finalPrice = price - (price * 0.3);
				
			}else if (price >= 100 && price < 500) {
				discount = 50;
				finalPrice = price - (price * 0.5);
				
			}else {
				discount = 75;
				finalPrice = price - (price * 0.75);
								
			}
			 
			 System.out.println("Final price is "+finalPrice);
			 
			
		}else {
			System.out.println("No Sale");
			
			
		}
		

	}

}
