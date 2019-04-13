package com.class22;

public class Students {
	
	//write a java program of Class students that takes students name and 3 subject grades.
	//Inside your class also have a method to calculate average grade. Test Student class for 5 different students with
	//different marks. Your program should print an average mark of each students name.
	
	public String name;
	
	public int biology;
	public int algebra;
	public int physics;
	
	public Students (String name) {
		System.out.println("My name is "+name+" and my average is ");
		
	}
	

	int getAvg(int a, int b, int c) {
	
	return (a+b+c)/3;
	
	
}

}

