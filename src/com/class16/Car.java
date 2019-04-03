package com.class16;

public class Car {
	
	//features..attributes..state
	String make, model, color;
	int doors, wheels; 
	
	//behaviors..actions//make sure they are within the class
	
	public static void main (String [] args) {
		
		//ClassName variableName = new ClassName ();
		//car1 is a type of Car
		//first object
		Car car1 =  new Car();
		car1.make="Honda";
		car1.model="Civic";
		car1.color="Black";
		car1.doors=4;
		car1.wheels=4;
		
		System.out.println("Car " +car1.make+" "+car1.model+ " has " +car1.wheels+ " wheels");
		//define behavior using methods created out side of this 
		car1.drive();
		car1.reverse();
		car1.stop();
		
		//second object
		Car car2 = new Car();
		car2.make="Tesla";
		car2.model="X";
		car2.color="Blue";
		car2.doors=4;
		car2.wheels=4;
		
		System.out.println("Car " +car2.make+" "+car2.model+ " has " +car2.wheels+ " wheels");
		car2.drive();
		car2.reverse();
		car2.stop();
		
		
	}
	
	//behavior of the car//method void 
	void drive() {
		System.out.println("Car can drive");
		
	}
	
	void reverse () {
		System.out.println("Car can reverse");
		
	}
	
	void stop() {
		System.out.println("Car can stop");
	}

}
