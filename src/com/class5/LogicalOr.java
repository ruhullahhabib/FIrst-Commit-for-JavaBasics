package com.class5;

public class LogicalOr {

	public static void main(String[] args) {
		// we have 7 days a week//if days are from 1-5= weekday..//if days are from 6-7 weekend..//else not valid
		
		
		int day = 7;
		
		//if any condition below is true, the or operator will give you true 
		if (day==1 || day ==2 || day==3||day==4||day==5) {
			System.out.println("Weekday");
			
		}else if(day==6||day==7) {
			System.out.println("Weekend");
			
		}else {
			System.out.println("Not a valid day");
		}

	}

}
