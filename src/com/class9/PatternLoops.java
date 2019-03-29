package com.class9;

public class PatternLoops {

	public static void main(String[] args) {
		// TODO print pattern 12345 5 times
		
		for (int i = 1; i<5; i++) {
			
			for (int y=1; y<6; y++) {
				
				System.out.print(y);
			}
			
			System.out.println();
		}
		
		//print pattern 1111111/2222222/3333333/4444444/555555/
		
		for (int r =0; r<7; r++) {
			for (int c= 0; c<7; c++) {
				System.out.print(r);
			}
			System.out.println();
		}
		
		//print pattern 54321 4 times. 4 rows 5 columns
		
		for (int d=0; d<4; d++) {
			for (int p=5; p>0; p--) {
				
				System.out.print(p);
			}
			System.out.println();
		}
		
		//print pattern 55555/44444/33333/22222/11111 5 rows 5 columns
		
		for (int x=5; x>0; x--) {
			for (int z=0; z<=4; z++) {
				
				System.out.print(x);
			}
			System.out.println();
			
		}
		
		//4 rows columns are changing 1/1c 2/2c 3/3c 4/4c 5/5c * ** *** ****
		
		for (int l=0; l<=4; l++) {
				
				for (int u=1; u<=l; u++) {
					
				System.out.print("*");
				}
				System.out.println();
			}
		
		//print ******
		//      *    *
		//      *    *
		//      ******
		// as long as the column is equal to 1 and 6... rows 4 columns 6 outer loop controls rows
		
		for (int t=0; t<=3; t++) {
			
			for (int p=0; p<6; p++) {
				
				if (t==0||t==3||p==0||p==5) {
				
				
				System.out.print("*");
			
				}else {
			
				System.out.print(" ");
				}
			
			}
			
			System.out.println();
		}
	}
}
		
		
		
		
	
