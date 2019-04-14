package com.class23_2;

import com.class23.Employee;

//imported class 23 Employee from different package

public class WaterFallTeam extends Employee{
	
	public static void main (String [] args) {
		
		WaterFallTeam wt = new WaterFallTeam();
		wt.salary1= 90000;//can access protected values from different package only through inheritance 
		//wt.salary;// default values cannot be accessed in different package
		wt.test(); //available because it is protected//testOne would not be available due to accessmodifier being default
		//wt.testOne();
	
		
	}

}
