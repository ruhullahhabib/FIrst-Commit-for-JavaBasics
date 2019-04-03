package com.class16;

public class Computer {
	
	boolean mouse, keyboard;
	int screen, ram;
	String OS, brand;
	
	public static void main (String [] args) {
		
		Computer com1 = new Computer();
		
		com1.mouse= true;
		com1.keyboard= true;
		com1.screen= 2;
		com1.ram= 8;
		com1.OS= "Windows";
		com1.brand="HP";
		
		com1.watchMovies();
		com1.doJavaCoding();
		com1.playMusic();
		
		Computer com2 = new Computer();
		
		com2.mouse= false;
		com2.keyboard= false;
		com2.screen= 4;
		com2.ram= 6;
		com2.OS= "Mac OS";
		com2.brand= "Apple";
		
		com2.watchMovies();
		com2.doJavaCoding();
		com2.playMusic();
	}
	
	void watchMovies () {
		System.out.println("We can watch movies on a computer "+brand );
	}
	
	void doJavaCoding () {
		System.out.println("We can do Java Coding on our computer "+brand);
	}
	
	void playMusic () {
		System.out.println("We can play music on our computer "+brand);
	}

}
