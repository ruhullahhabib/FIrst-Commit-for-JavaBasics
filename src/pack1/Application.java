package pack1;

public class Application {
	
	//main method is the entry point for animals 
	public static void main (String [] args) {
	
	Animal species = new Animal();
	
	System.out.println("this is species 1");
	
	System.out.println(species.breed);
	System.out.println(species.weight);
	System.out.println(species.age);
	System.out.println(species.name);
	
	//static so everything changes beyond this point to Joe
	species.name= "Joe";
	
	System.out.println(Animal.canBark());
	
	Animal species2 = new Animal();
	
	System.out.println("This is species 2");
	
	System.out.println(species2.breed);
	System.out.println(species2.weight);
	System.out.println(species2.age);
	System.out.println(species2.name);
	
	int my_array[] = { 0, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	System.out.println("Printing the minimum value");
	
	System.out.println(Minimum.minOfValues(my_array));
	System.out.println(Minimum.maxOfValues(my_array));
	
	
	
	
	

}
	
}
