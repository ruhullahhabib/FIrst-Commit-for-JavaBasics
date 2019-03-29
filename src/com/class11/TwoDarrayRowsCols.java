package com.class11;

public class TwoDarrayRowsCols {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
	String [][] food= {
				{"burger","fries","hot dog","meatloaf"},
				{"lo mein", "fried rice"},
				{"biriyani","korma", "naan", "chick peas"}
				
		};
		
		for (int i=0; i<food.length; i++) {
			
			for (int j=0; j<food[i].length; j++) {
			
			//have to makes sure you loop through both row and columns so you have to use [][] for both int created 
			
			System.out.print(food[i][j]+ " ");
			
		}
		
		System.out.println();
		
		
		
		}
	}
	
	{
	
	String [][] cars = {
			
			{"ford", "jeep", "chevy"},
			{"Hyundai", "kia"},
			{"bmw", "audi"},
			{"ferrari", "lambo"}};

	
	for (int r=0; r<cars.length; r++) {
		
		for (int c=0; c<cars[r].length; c++) {
			
			System.out.print(cars[r][c]);
		}
		
		System.out.println();
		}
	}
}


