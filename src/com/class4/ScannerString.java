package com.class4;

import java.util.Scanner;

public class ScannerString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter your name.");
		
		String name = input.nextLine();
		
		System.out.println("Good morning " +name+ ", you better love Java!");
		
		

	}

}
