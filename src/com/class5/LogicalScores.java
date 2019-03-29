package com.class5;

import java.util.Scanner;

public class LogicalScores {

	public static void main(String[] args) {
		// Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules:
		//if the average score >=90 =>grade=A
		//		if the average score >= 70 and <90 => grade=B
		//		if the average score>=50 and <70 =>grade=C
		//		if the average score<50 =>grade=F
		
		Scanner scan;
		
		int quiz; 
		int midTerm; 
		int finalScore;
		
		int averageScore;
		
		
		
		scan = new Scanner (System.in);
		
		System.out.println("Please enter your quiz score");
		quiz = scan.nextInt();
		
		System.out.println("Please enter your midterm score");
		midTerm = scan.nextInt();
		
		System.out.println("Please enter your final score");
		finalScore = scan.nextInt();
		
		averageScore = ((quiz+midTerm+finalScore)/3);
		
		System.out.println("Average score is " + averageScore);
		
		if (averageScore>=90) {
			System.out.println("Grade A");
			
		}else if (averageScore>=70 && averageScore<90) {
			System.out.println("Grade B");
			
		}else if (averageScore >= 50 && averageScore < 70) {
			System.out.println("Grade C");
			
		}else {
			System.out.println("Grade F");
		}

	}

}
