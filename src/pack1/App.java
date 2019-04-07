package pack1;

public class App {

	public static void main(String[] args) {
		
		//person is an object of human class
		
		Human person1 = new Human();
		
		//changes color locally to pink but does not change the original 
		person1.eyeColor = "yellow";
		
		//these are copies from Human class
		System.out.println(person1.eyeColor);
		System.out.println(person1.height);
		System.out.println(person1.weight);
		System.out.println(person1.gender);
		

	}

}
