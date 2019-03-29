package com.class4;

public class NestedIfGPA {

	public static void main(String[] args) {
		// declare variable for gpa and having a diploma
		//if user has a diploma.. congrats if gpa is higher than 3.5.. youre hired. else do not hire
		
		double gpa = 3.3;
		double expectedGpa= 3.5;
		
		boolean hasDiploma= true;
		
		if (hasDiploma) {
			System.out.println("Congrats");
			
			if (gpa>expectedGpa) {
				System.out.println("You are hired");
			}else {
				System.out.println("Unfortunately, you will need to keep looking for a job.");
			}
			
		}else {
			System.out.println("Go get your degree loser");
			
			
		}

	}

}
