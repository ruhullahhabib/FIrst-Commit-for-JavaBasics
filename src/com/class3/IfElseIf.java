package com.class3;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 23;
		int num2 = 23;

		if (num1 > num2) {
			System.out.println("Number 1 is larger than Number 2");
		} else if (num1 == num2) {
			System.out.println("Number 1 is equal to Number 2");
		} else {
			System.out.println("Number 1 is smaller Number 2");

		}

		int day = 10;

		if (day == 1) {
			System.out.println("monday");
		} else if (day == 2) {
			System.out.println("tuesday");
		} else if (day == 3) {
			System.out.println("wednesday");
		} else if (day == 4) {
			System.out.println("thursday");
		} else if (day == 5) {
			System.out.println("friday funday");
		} else if (day == 6) {
			System.out.println("saturday");
		} else if (day == 7) {
			System.out.println("sunday brunchday");
		} else {
			System.out.println("you not on earth my guy");

		}

		int month = 4;

		if (month == 1) {
			System.out.println("Jan");
		} else if (month == 2) {
			System.out.println("Feb");
		} else if (month == 3) {
			System.out.println("Mar");
		} else {
			System.out.println("the rest of the months dont matter thats my bday month");
		}

		int a = 142;

		if (a % 2 == 0) {
			System.out.println("EVEN");
		} else {
			System.out.println("ODD");

		}
		
		int c = 75;
		
		if (c<=-1) {
			System.out.println("negative");
		}else if (c>=1) {
			System.out.println("postive");
	}else {
		System.out.println("your number is neutral");
		

	

	}

}

}
