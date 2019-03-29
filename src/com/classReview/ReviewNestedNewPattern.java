package com.classReview;

public class ReviewNestedNewPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=1; i<=5; i++) {
			
			for (int k=1; k<=(5-i); k++) {
				
				System.out.print(".");
			}
			
			System.out.println(i);
			
		}
		
		
	}


}

/**
 * Write a program to produce the following pattern
 *
....1
...2.
..3..
.4...
5....

 *
 */


