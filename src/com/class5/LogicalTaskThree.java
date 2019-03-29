package com.class5;

import java.util.Scanner;

public class LogicalTaskThree {

	public static void main(String[] args) {
		/*
		 * print out if its is good weather to go for any activity
		 * 
		 * if the temp is beweent 40 deg and 80 deg inclusive and no rain we will go
		 * ELSE we will not go hiking
		 * 
		 * if temp is between 25 and 40 inclusive and snowing -> going snowboarding
		 * otherwise we are not going snowboarding
		 * 
		 * if temp is more than 80 & sunny _>go to beach ELSE dont go to the beach
		 * 
		 * raining, snowing, sunny
		 * 
		 */

		Scanner scan;

		boolean sunny;
		boolean raining;
		boolean snowing;

		int temp;

		String activity;

		scan = new Scanner(System.in);

		System.out.println("Please enter the temperature in F");
		temp = scan.nextInt();
		

		if (temp >= 40 && temp <= 80) {
			
			System.out.println("Is it raining? True or False?");
			raining = scan.nextBoolean();
			
			if (raining) {
				activity = "watch movie";
				
			} else {
				activity = "go hiking";
			}

		} else if (temp >= 25 && temp < 40) {
			
			System.out.println("Is it snowing? True or False?");
			snowing = scan.nextBoolean();
			
			if (snowing) {
				activity = "snowboarding";
			} else {
				activity = "do some coding since its cold and no snow";

			}

		} else if (temp > 80) {
			
			System.out.println("Is it sunny? True or False?");
			sunny = scan.nextBoolean();
			
			if (sunny) {
				activity = "go to the beach";
			} else {
				activity = "probably cloudy, do some more coding";
			}

		} else {
			System.out.println("Please enter different temp");
			activity = "unknown";

		}
		
		System.out.println(activity);
		
	}

}
