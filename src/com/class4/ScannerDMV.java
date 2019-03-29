package com.class4;

import java.util.Scanner;

public class ScannerDMV {

	public static void main(String[] args) {
		// DMV Above 18 Drivers License below 18 Learners Permit
		
		int age;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter your current age");
		
		age = scan.nextInt();
		
		if (age>=18) {
			System.out.println("Please stand here to take a photo for your Drivers License.");
		}else {
			System.out.println("Thank you, please stand here for your Learners Permit.");
			
		}

	}

}
