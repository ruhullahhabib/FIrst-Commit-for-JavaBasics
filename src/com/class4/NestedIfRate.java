package com.class4;

public class NestedIfRate {

	public static void main(String[] args) {
		// var mortgage rate and mortgage price//rate higher than 4.5 will not buy house//else user will consider buying
		//decides to buy house//price of house larger than 200,000 user will take loan//else user will pay cash
		
		double mortgageRate = 3.6;
		int mortgagePrice = 200000;
		
		if (mortgageRate>4.5) {
			System.out.println("User will not buy house.");
		}else { 
			System.out.println("User will consider buying house");
			
			if (mortgagePrice>=200000) {
				System.out.println("User will take loan");
			}else { 
				System.out.println("User will pay cash");
				
			}
		}

	}

}
