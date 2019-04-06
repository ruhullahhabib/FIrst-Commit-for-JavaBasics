package com.class17_2;

public class NestedLoopDemo {

	public static void main(String[] args) {
		// no return data, just executes the method 
		
		printNumbers();
		
		
			}

	
		public static void printNumbers() {
			
			for(int i=1; i<=3; i++) {
				
				for (int y=1; y<=3; y++) {
					
					System.out.println(i+" "+y);
				}

			}

		}
	}
