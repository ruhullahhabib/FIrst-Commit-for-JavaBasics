package com.class11;

public class MoreArrays {

	public static void main(String[] args) {
		// lets create an array of names that will hold 5 elements and retrieve all values from it
		
		
		String [] names = new String [7];
		
		names[0] = "zero";
		names[1] = "one";
		names[2] = "two";
		names[3] = "three";
		names[4] = "four";
		names[5] = "five";
		//name 5 will be runtime exception index out of bounds due to being out of storing elements of five.
		names[6] = "six";
		
		for(int x=0; x<names.length; x++) {
			
			System.out.println(names[x]);
		}
		
		//2. create an array using array literal
		
		String [] studentNames = {"Ruhullah", "Sal", "Jason"};
		
			for(int i=0; i<=studentNames.length-1; i++) {
				//.length-1 is needed for this type of array due to not having an index assigned like the first one.
			
			System.out.println(studentNames[i]);

	}
			
			//retrieve values using: adv loop, for each loop****************************only works with array or collection
			
			for (String p:studentNames) {
				//so this will take studentNames and assign it to p or what ever variable you have. Then you can print p
				
				System.out.println(p);
			}
			
		//create an array of cars and store 6 elements into it. using two different loops print all values from the array
			
			String [] cars = {"toyota","evo", "bmw", "mercedes", "amg", "porsche"};
			
			for(int k=0; k<=5; k++) {
				
				System.out.print(cars[k] + " ");
				
		
			}
			
			System.out.println();
			
	
			
			for (String all:cars) {
				System.out.print(all + " ");
				
			}
	}
	
	//create an array of countries. while retrieving all values from an array print capital for each country
	
	String [] country= {"usa", "pakistan", "afghanistan"}
	
	
	for (int o=0; o<=2; o++) {
		
		if (usa) {
			System.out.println("D.C");
			
		}else if (pakistan) {
			System.out.println("islamabad");
			
		}else if (afghanistan) {
			System.out.println("kabul");
	
		}
	}

	
}
