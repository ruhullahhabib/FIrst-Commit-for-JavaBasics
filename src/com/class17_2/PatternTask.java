package com.class17_2;

import java.util.Scanner;

public class PatternTask {

	public static void main(String[] args) {
		// TODO Write a program that reads a set of int and then prints the sum of the even and odd intergers
		
		scanNum();
		
		
	}
		
		
		
		public static void scanNum () {
		
		Scanner scan;
		
		int start, end, sumOdd = 0, sumEven = 0;
		
		scan = new Scanner (System.in);
		
		
		System.out.println("Please enter the range of two integers (start and endpoint)");
		start = scan.nextInt();
		end = scan.nextInt();
		
		for (int i=start; i<=end; i++) {
		
		if (i%2==0) {
			
			sumEven+=i;
			
		}
		
		else{
			
			sumOdd+=i;
		}
		
		}
				
		
	System.out.println("The sum of the odd numbers in range " +start+ " and " +end+ " is equal to: " +sumOdd);		
	System.out.println("The sum of the even numbers in range " +start+ " and " +end+ " is equal to: " +sumEven);		

	}
	}
	
