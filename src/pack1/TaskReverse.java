package pack1;

public class TaskReverse {

	public static void main(String[] args) {
		// Create a method that will take 1 parameter as a String and return reversed String. Method should be visibly only within same package.

		TaskReverse obj = new TaskReverse();
		
		String rev = obj.reverse("pocket");
		
		System.out.println(rev);

	}
	
	//modifier datatype method name parameters
	protected String reverse(String original) {
		
		String reverse = "";
		
		
		int length = original.length();
		
		
		for (int i =length-1; i>=0; i-- ) {
			
			reverse = reverse + original.charAt(i);
		}
		
		return reverse;

	}

}