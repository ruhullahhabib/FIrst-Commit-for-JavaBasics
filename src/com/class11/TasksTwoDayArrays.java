package com.class11;

public class TasksTwoDayArrays {

	public static void main(String[] args) {
		// 2D array store values mr mrs ms miss and smith jordan jackson obama //print mrs smith mr obama ms jackson miss jordan
		
		String [][] names = {
				{"mr","mrs","ms","miss"},
				{"smith","jordan","jackson","obama"}
		};
		
		System.out.print(names[0][1]+" ");
		System.out.println(names[1][0]);
		
		System.out.print(names[0][0]+" ");
		System.out.println(names[1][3]);
		
		System.out.print(names[0][2]+" ");
		System.out.println(names[1][2]);
		
		System.out.print(names[0][3]+" ");
		System.out.println(names[1][1]);
		
	}
	


String [][] grades = {
		{"ruhullah", "sal", "jason"},
		{"F", "B", "A"}
};


		System.out.println(grades[0][1]+" " +grades[1][1]);
		
}

