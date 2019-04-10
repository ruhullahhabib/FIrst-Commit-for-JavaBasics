package pack1;

public class TaskArray {

	public static void main(String[] args) {
		// Create a method that will take a string and return array of words from that string. Method should be available only within same class.
		
		TaskArray obj = new TaskArray();
		
		String [] array = obj.getWords("Have a good night students");
		
		for (int i= 0; i<array.length;i++) {
			
			System.out.println(array[i]);
			
		}
		
		

	}
	
	private String [] getWords(String str) {
		
		String [] words = str.split(" ");
		
		return words;
	}

}
