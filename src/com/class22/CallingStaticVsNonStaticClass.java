package com.class22;

public class CallingStaticVsNonStaticClass {

	public static void main(String[] args) {
		
		StaticVsNonStatic obj = new StaticVsNonStatic();
		
		//accessing non static members___through obj only
		obj.getInfo();
		System.out.println(obj.name);
		
		//access static members by using class name they belong to. 
		System.out.println(StaticVsNonStatic.lastName);
		
		StaticVsNonStatic.getInfo1();
		
		

	}

}
