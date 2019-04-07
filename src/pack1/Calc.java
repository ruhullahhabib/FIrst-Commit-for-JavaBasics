package pack1;

public class Calc {
	
static int minOfValues(int [] x) {
		
		//Integer.MIN_VALUE
		
		int min = x[0];
		
		for (int y:x) {
			
			if (y<min) {
				min = y;
				
			}
		}
		
		return min;
}
	
	static int maxOfValues(int []x) {
		
		int max = x[0];
		
		for (int y:x) {
			
			if (y>max) {
				max = y;
			}
		}
		return max;
	}


	static int sumOfValues (int [] x) {
		
		int sum = 0;
		
		for (int i =0; i<=x.length; i++) {
			
			sum = sum + i;
			
		}
		
	}
	return sum;
		
		

}

	static int avgOfValues (int [] x) {
		
		int avg = 0;
		
		for (int i =0; i<=x.length; i++) {
			
			sum = sum + i;
			
			avg = sum/(i);
		
		
	}
		
	}
	return avg;
	
	
	}
