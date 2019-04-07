package pack1;

public class MaxMin {
	
	//* Write a program to find the maximum and minimum value of an array.
    //*/
	
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
}


