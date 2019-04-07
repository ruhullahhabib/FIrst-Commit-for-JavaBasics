package pack1;

public class Calculator {
	
	int sum (int a, int b, int c) {
		return(a+b+c);
	}
	
	int avg (int a, int b, int c) {
		return(a+b+c/3);
	}
	
	int min (int a, int b, int c) {
		
		int min =a;
		
		if (b<a) {
			min = b;
			
		}
		
		if (c<min) {
			min = c;
		}
		
		return(c);
	}
	
	int max (int a, int b, int c) {
		
        int max =a;
		
		if (b>a) {
			max = b;
			
		}
		
		if (c>b) {
			max = c;
		}
		
		return(c);
	
	}
	

}
