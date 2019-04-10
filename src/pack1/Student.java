package pack1;

public class Student {

	public static void main(String[] args) {
		// create class student that will have method getGrade// your method should accept the scored of the student and return
		//grade. Score > 90 -A
		//score >80 -B
		//score >70 -c
		//score >50 -D
		//anything else -F
		
		
		Student obj = new Student();
		
		char grade = obj.getGrade(49);
		
		System.out.println("Your grade is "+grade);

	}
	
	char getGrade(int score) {
		
		char grade = 0;
		
		if (score>=90) {
			grade = 'A';
			
		}else if (score>=80) {
			grade = 'B';
			
		}else if (score>=70) {
			grade = 'C';
			
		}else if (score>=50) {
			grade = 'D';
			
		}else if (score<50)
			grade = 'F';
		
		return grade;
		
	}

}
