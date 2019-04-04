package com.class16;

public class ReviewClassReverseString {

	public static void main(String[] args) {
		
	        String str="ruhullaH";
	        String reverse="";
	        
	        for(int i=str.length()-1;i>=0;i--) {
	        	
	            reverse=reverse+str.charAt(i);
	            
	        }
	            
	            System.out.println(reverse);
	        
	        //System.out.println(reverse);
	        
		}
}
