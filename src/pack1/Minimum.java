package pack1;

public class Minimum {
	
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
		

}
	



