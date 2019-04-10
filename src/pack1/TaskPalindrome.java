package pack1;

public class TaskPalindrome {

	public static void main(String[] args) {
		// Create a method that will take a String and return whether String is palindrome or not. Method should available to all classes within your projects.
		
		TaskPalindrome object = new TaskPalindrome();
		
		boolean palin = object.isPalindrome("racecar");
		
		System.out.println(palin);

	}
		
	
	public boolean isPalindrome(String original) {
		
		String reverse = "";
		
		boolean flag = true;
		
		int length = original.length();
		
		
		for (int i =length-1; i>=0; i-- ) {
			
			reverse = reverse + original.charAt(i);
		}
		
		if (reverse.equalsIgnoreCase(original)) {
			
			flag = true;
		}
		return flag;
	}

}