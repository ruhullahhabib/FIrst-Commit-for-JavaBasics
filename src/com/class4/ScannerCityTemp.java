package com.class4;

import java.util.Scanner;

public class ScannerCityTemp {

	public static void main(String[] args) {

		String cityName;
		int temp;
		//convert F to C (x-32)*(5/9)
		
		Scanner myScan = new Scanner (System.in);
		System.out.println("Please enter your city");
		
		cityName = myScan.nextLine();
		
		System.out.println("Please enter temperature in Farenheit");
		
		temp= myScan.nextInt();
		
		int convertedTempf= (temp-32)*5/9;
		
		System.out.println("The temp in the city "+cityName+ " is " +convertedTempf+ " degrees Celcius!");
		
		
		
		
	}

}
