package com.class14;

import java.util.Scanner;

public class IfPrime {

	public static void main(String[] args) {
		
		//Check if prime number 
		
		boolean isPrime = true;
		int number = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your number");
		number = scan.nextInt();
		
		for(int i=2; i <=number/2; i++) 
        {
            if ((number%i) ==0) 
            { 
                isPrime =false; 
                break;
            }
        }
		
        if(isPrime) {
        	
        	System.out.println("Your number is a prime number");
        	
        }else { 
        	
        	System.out.println("Your number is not a prime number");
        }
        scan.close();
    }
}
		
		
		
