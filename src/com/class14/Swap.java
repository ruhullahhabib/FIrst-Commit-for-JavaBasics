package com.class14;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int x,y,swap;
	        
	        x=5;
	        y=10;
	        System.out.println("X and Y before Swap:" + "x=" + x +" y=" + y);
	        swap = x;
	        x = y;
	        y = swap;
	        
	        System.out.println(" x=" + x +" y=" + y );
	        
	        String a,b,swap1;
	        
	        a="Do a first then b";
	        b="Do b first then a";
	        System.out.println("Before swap a and b: " + a + ", " + b);
	        
	        swap1 = a;
	        a = b;
	        b = swap1;
	        System.out.println("After swap a and b: " + a + ", " + b);
	        
	        System.out.println(y);
	        
	        int s=10;
	        int d=20;
	        
	        s=s+d;//30
	        d=s-d;//30-20=10
	        s=s-d;//30-10
	        
	        System.out.println(s+" "+d);
	        
	        
	        
	        
	        //attach two strings together 
	        
	        String str1= "Hello";
	        String str2= "World";
	        
	        str1=str1+str2;//hello world
	        str2=str1.substring(0, str1.length()-str2.length());//Hello
	        
	        str1=str1.substring(str2.length());
	        
	        System.out.println(str1);
	        System.out.println(str2);
	        
	        
	        
	        

	}

}
