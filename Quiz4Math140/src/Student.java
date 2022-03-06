
public class Student {
	private String firstName;
	private String lastName;
	private int grade1;
	private int grade2; //declaring
	private int grade3;
	
	
	public Student (String firstName, String lastName, int grade1, int grade2, int grade3) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade1 = grade1;	//initializing
		this.grade2 = grade2;
		this.grade3 = grade3;
		
	}
	
	public  Student(String firstName, String lastName) {
		this(firstName,lastName,100,50,10); //using "this" method to call 1st constructor 
		
		
	}
	
	public double getAverageGrade() {
		double avg = 0;
		
		avg = avg + grade1 + grade2 + grade3; //gets precise avg
		avg = avg /3;
		return avg;
		
	}
	
	
}
