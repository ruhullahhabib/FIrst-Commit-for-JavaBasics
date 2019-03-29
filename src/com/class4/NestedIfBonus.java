package com.class4;

import java.util.Scanner;

public class NestedIfBonus {

	public static void main(String[] args) {

		int years;
		int salary;

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter number of work years");

		years = scan.nextInt();


		if (years >= 5) {
				System.out.println("You are eligible for a bonus");
				
				System.out.println("Please enter salary");
	
				salary = scan.nextInt();
				
				if (salary >= 50000) {
					System.out.println("You will get the max bonus of 5000");
	
				} else {
					System.out.println("You will get the  bonus of 3000");
				}

		} else {
			
				System.out.println("Not eligible for a bonus just yet");

		}
	}
}
