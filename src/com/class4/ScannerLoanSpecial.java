package com.class4;

import java.util.Scanner;

public class ScannerLoanSpecial {

	public static void main(String[] args) {
		//can you get a loan or no?
		
		Scanner scan=new Scanner (System.in);
		
		int loan;
		
		System.out.println("Please enter desired loan amount.");
		
		loan= scan.nextInt();
		
		if (loan>200000) {
			System.out.println("Unfortunately, we will have to Reject you as a possible client");
		}else {
			System.out.println("Yes sir, we can provide you that loan amount!");
			
		}
	}

}
