package pack1;

public class Task {

	public static void main(String[] args) {
		// first and last name and email domain. createEmail() method should return complete email address
		
		Task obj = new Task();
		
		String email= obj.createEmail("jOhn", "snow", "gmail");
		
		System.out.println(email);
		
		//need a syso to print what we have
		
		

	}
	//we know this is a return type and we are returning a string
	
	String createEmail(String name, String lastName, String emailType) {
		
		String email = name+lastName+"@"+emailType+".com";
		
		return email.toLowerCase();
		
	}

}
