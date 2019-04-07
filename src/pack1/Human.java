package pack1;

public class Human {
	
	//Instance variables...properties
	
	String eyeColor = "brown";
	int height = 6;
	int weight = 180;
	String gender = "F";
	
	//can be used within the class since it is an instance variable within the class.
	String programmingLanguage = "java";
	
	//behavior/methods
	void speak() {
		
		//language is a local variable not accessible outside this method
		String language = "English";
		
		System.out.println("Humans can speak");
	}
	
	void coding () {
		System.out.println("Syntax students can code");
	}

}
