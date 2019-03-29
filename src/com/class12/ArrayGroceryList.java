package com.class12;

public class ArrayGroceryList {

	public static void main(String[] args) {
		//create a list: fruits{}, veggies{}, dairy{}.. retrieve all values using 2 different loops
		
				String [][] food = {
						{"mango","peach","berry"},
						{"tomatoes","celery","potato"},
						{"milk","cheese"}};
				
				//for (int x=0; x<food.length; x++) {
				//	for (int p=0; p<=food[x].length; p++) {
				//		System.out.println(food[x][p]+ " ");
				//	}
				//	System.out.println();
			//	}
	
				
				//string has a bracket for array on first for loop. :food->array new variable grocery->:
				//2nd loop String has no array because it is looping through first array new variable list where all items are being pushed from grocery 
				
				for (String [] grocery:food) {
					for(String list:grocery) {
				
					
					System.out.print(list+ " ");
			}
				System.out.println();

		}


	}

}
