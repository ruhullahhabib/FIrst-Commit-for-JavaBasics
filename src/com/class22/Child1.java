package com.class22;

public class Child1 extends ParentExtends{

	public static void main(String[] args) {
		
		Child1 childObj = new Child1();
		
		System.out.println("Child one eye color " +childObj.eyeColor);
		System.out.println("Child one hair color " +childObj.hairColor);
		System.out.println("Child one has a " +childObj.nose+ " nose");
		childObj.sing();
		
		ParentExtends parentObject = new ParentExtends();
		//parentObject.hairType -> not accessible in Parent Class
		

	}
	
	public void playTennis() {
		System.out.println("Child1 can play tennis");
	}

}
