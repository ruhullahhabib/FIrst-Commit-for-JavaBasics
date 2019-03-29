package com.class4;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		//take a number from a user and print that number 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		
		int myNum = scan.nextInt();
		
		System.out.println("The number you entered is " +myNum);
	
		
	}

}
