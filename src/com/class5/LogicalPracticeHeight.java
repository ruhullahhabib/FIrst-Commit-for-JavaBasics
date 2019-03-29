package com.class5;

import java.util.Scanner;

public class LogicalPracticeHeight {

	public static void main(String[] args) {
		// Prompt the user to enter two people's heights in inches. Each person should be classified as one of the following: 
		//short (under 5 feet)
		//medium(5 to 6 feet)
		// tall (6 feet and over)
		
		int height;
		int feet;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter height in inches");
		height = scan.nextInt();
		
		feet = height / 12;
		
		
		if (feet<5) {
			System.out.println("short");
		}else if (feet >=5 && feet < 6) {
			System.out.println("medium");
		}else {
			System.out.println("tall");
			
		}
		
		

	}

}
