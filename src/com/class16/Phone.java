package com.class16;

public class Phone {
	
	String brand, model, carrier;
	int camera;
	boolean bluetooth;
	
	
	public static void main(String[] args) {
		
		//attributes
		
		Phone phone1 = new Phone();
		
		phone1.brand= "Apple";
		phone1.model= "iPhone";
		phone1.carrier= "Sprint";
		phone1.camera = 2;
		phone1.bluetooth= true;
		
		phone1.canText();
		phone1.pic();
		phone1.carrier();
		
		
		Phone phone2 = new Phone();
		
		phone2.brand= "Andriod";
		phone2.model= "Galaxy s10";
		phone2.carrier= "T-Mobile";
		phone2.camera = 1;
		phone2.bluetooth= true;
		
		phone2.canText();
		phone2.pic();
		phone2.carrier();
		
		Phone phone3 =  new Phone();
		
		phone3.brand= "Nokia";
		phone3.model= "3310";
		phone3.carrier= "Verizon";
		phone3.camera = 1;
		phone3.bluetooth = true;
		
		phone3.canText();
		phone3.pic();
		phone3.carrier();
		
		

	}
	//behaviors
	
	void canText() {
		System.out.println(brand+ " has unlimited text");
		
	}
	
	void pic() {
		System.out.println(model+ " can take a picture with "+camera+ " camera(s)");
		
	}
	
	void carrier () {
		System.out.println("My carrier is "+carrier);
		
	}
	

}
