package com.class17_2;

import java.util.Scanner;

public class ScannerMethod {

	public static void main(String[] args) {
		// how scanner works with methods
		
		ScannerMethod obj = new ScannerMethod();
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println(obj.sum(a, b));
		
		
		obj.sum(12, 13);
		obj.sum(100, 123);
		
		obj.sub();
		

	}
	
	//this is not void which will allow int to be returned as a value 
	
	int sum(int x, int y) {
		
		return x+y;
	}
	
	void sub() {
		
		int a = 10, b = 12;
	}

}
