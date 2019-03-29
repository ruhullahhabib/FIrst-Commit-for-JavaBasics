package com.classReview;

public class ReviewNestedPattern {

	public static void main(String[] args) {
		// Run 1 t0 5
		
		//print a dot 1 to 5-i
		
		//print i
		
		for(int i =1; i<=5; i++) {
            for(int k = 1; k<=(5-i); k++) {
                System.out.print(".");
            }
            for(int l = 1; l<=i; l++) {
                
                System.out.print(i);
            }
            
            System.out.println();
            
        }

}
		
	}
	

