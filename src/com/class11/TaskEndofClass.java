package com.class11;

public class TaskEndofClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [][] cars = {
				
				{"ford", "jeep", "chevy"},
				{"Hyundai", "kia"},
				{"bmw", "audi"},
				{"ferrari", "lambo"}};

		
		for (int r=0; r<cars.length; r++) {
			
			for (int c=0; c<cars[r].length; c++) {
				
				System.out.print(cars[r][c]+" ");
			}
			
			System.out.println();
			}
		}
	

	}

