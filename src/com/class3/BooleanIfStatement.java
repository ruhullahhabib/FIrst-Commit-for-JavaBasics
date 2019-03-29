package com.class3;

public class BooleanIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// if statement!! declare price and if price is higher than expected price= dont
		// buy it

		double shoePrice = 220.99;
		double allowance = 200.00;

		if (shoePrice > allowance) {
			System.out.println("We cant buy it :(");
		} else {
			System.out.println("We can buy it :D");

		}
		
		//declare boolean variable its raining and if it is true your program should say take an umbrella
		
		boolean isRaining = true;
		
		if (isRaining) {
			System.out.println("stay home and code");
		}else {
			System.out.println("take a walk and listen to java");
		}
	}

}
