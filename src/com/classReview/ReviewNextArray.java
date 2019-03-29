package com.classReview;

public class ReviewNextArray {

	public static void main(String[] args) {
		// write a program to test if an array contains a specific value \
		// hit us a boolean flag
		
		int array [] = {1,2,3,4,5,6,7,8,9,10};
	
		boolean found = false;
		
		for (int counter=0; counter<array.length;counter++) {
			
			if (array[counter]==6) {
				found= true;
				break;
			}
		}
		
		if (found == true) {
				
				System.out.println("Value 6 is in array");
				
			}else {
			
			System.out.println("Value is not present in array");
		}

	}

}
