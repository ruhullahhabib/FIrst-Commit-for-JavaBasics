package com.class5;

import java.util.Scanner;

public class LogicalDailySales {

	public static void main(String[] args) {
		// write a java program to ask user enter daily sales amount
		//based on the sale range commission will be different;
		//ex sales less than <100== commission 2%
		// sales more than 100 and <200 = 5%
		
		Scanner scan;
		
		int sales;
		int commission;
		//commission variable is used to equate the if statement to what commission it is matched to.
		//print at the end to declare the results
		
		
		scan = new Scanner (System.in);
		
		System.out.println("Please enter Sales Amount");
		sales = scan.nextInt();
		
		if (sales < 100 && sales >0) {
			commission = 2;
			
		}else if (sales >=100 && sales <200) {
			commission = 5;
			
		}else if (sales >= 200 && sales <500) {
			commission = 10;
			
		}else if (sales >= 500) {
			commission = 20;
			
		}else {
			commission = 0;
		}
			System.out.println("Your commission rate is " + commission);
			
		}
		
		

	}


