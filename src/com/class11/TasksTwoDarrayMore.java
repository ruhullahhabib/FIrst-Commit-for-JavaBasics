package com.class11;

public class TasksTwoDarrayMore {

	public static void main(String[] args) {
		// create 2d array first row contains names and second row is grades and print the ones that have above a b grade
		
		String [][] grades = {
				{"ruhullah", "sal", "jason"},
				{"F", "B", "A"}
		};


				System.out.println(grades[0][1]+"'s grade is a " +grades[1][1]);
				System.out.println(grades[0][2]+"'s grade is a " +grades[1][2]);
				
		}
	
	//some other tasks 
	
	int [][]num = {
			{11,12,13,14},
			{21,22,23},
			{31,32,33,34},
			
	};
	
	//length of rows
	int rows = num.length;
	System.out.println(rows);
	
	//to find the number of columns you have to start with the first column 0 within the first row. the bracket is which row
	int col = num[1].length;
	System.out.println(col);
	
	//will give you number of rows
	
	for (int row=0; row<num.length; row++) {
		
		//will give you number of columns based on how many rows you have and will loop by length 
		
		for (int col=0; col<num[row].length; col++)
			
			System.out.println(num[row][col]);
		
		
	}
	

	}
}

