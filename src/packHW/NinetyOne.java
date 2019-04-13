package packHW;

public class NinetyOne {

	int addTwo (int x, int y){
		
		return x+y;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		
		NinetyOne add = new NinetyOne();
		
		int addTwo = add.addTwo(3, 4);
		
		System.out.println(addTwo); //should be 7
	}
}