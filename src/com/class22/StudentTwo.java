package com.class22;

public class StudentTwo {
	
	String studentName;
	
	int grade1, grade2, grade3;
	
	//constructor
	public StudentTwo(String name, int a, int b, int c) {
		studentName = name;
		grade1=a;
		grade2=b;
		grade3=c;
		
	}
	
	
	public void getAverage() {
		int average = (grade1+grade2+grade3)/3;
		
		//studentname is the reference to the instance variable 
		System.out.println("my name is "+studentName+" and my average is "+average);
	}

}
