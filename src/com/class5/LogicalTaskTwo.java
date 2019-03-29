package com.class5;

import java.util.Scanner;

public class LogicalTaskTwo {

	public static void main(String[] args) {
		// Program to find largest number among three numbers using nested if provided by a user (numbers must be distinct)
		
		Scanner scan;
		
		int num1;
		int num2;
		int num3;
		
		scan = new Scanner (System.in);
		
		System.out.println("Please enter 3 distinct double values");
		
		num1=scan.nextInt();
		num2=scan.nextInt();
		num3=scan.nextInt();
		
		if (num1>num2) {
			if (num1>num3) {
				System.out.println(num1+" is the largest");
			}else {
				System.out.println(num3+" is the largest");
				
			}
				
			}else {
				
			
			}
				
				if (num2>num3) {
					System.out.println(num2+" is the largest");
				}else {
					System.out.println(num3+" is the largest");
				}
			
	}
	
}
		

	


