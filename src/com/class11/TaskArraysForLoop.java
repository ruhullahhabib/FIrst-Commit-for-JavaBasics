package com.class11;

public class TaskArraysForLoop {

	public static void main(String[] args) {
		//create an array of countries. while retrieving all values from an array print capital for each country
		
		String [] countries = new String[3];
		
		countries[0] = "usa";
		countries[1] = "pakistan";
		countries[2] = "afghanistan";
		
		//string uses .equals.. the int t will be in the if statement as it loops using this info
		
		
		for (int t=0; t<countries.length; t++) {
		
			
			if (countries[t].contentEquals("usa")) {
				System.out.println("D.C");
				
			}else if (countries[t].contentEquals("pakistan")) {
				System.out.println("islamabad");
				
			}else if (countries[t].contentEquals("afghanistan")) {
				System.out.println("kabul");
			}
	
		}
		
		String [] array= {"turkey", "england", "france"};
		
		for (String counter:array) {
			
			//looking at counter since it will have all variables as they loop through
			
			switch(counter) {
			case "turkey":
				System.out.println("Ankaras");
				break;
			case "england":
				System.out.println("london");
				break;
			case "france":
				System.out.println("Paris");
				break;
			}
		}
		
		//create array of int and find largest number
		
		//assume the first element in array is the largest 
		
		int [] nums = {1,4,6,3,9,5,8};
		
		int largest = 0;
		// assume first element is largest 
		//int largest = nums[0]
		
		//for (int i=0; i<nums.length; i++) {
		for (int i:nums) {
			
			//if(nums[i]>largest){
			
			if (i>largest) {
				largest=i;
			}
		}
			System.out.println(largest);
		}
		
		

	

}
