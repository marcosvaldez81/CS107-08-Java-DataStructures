
public class Student {
	
	private String firstName;
	private String lastName;
	
	private int grade1;
	private int grade2;
	private int grade3;
	
	public Student (String firstName, String lastName, int grade1, int grade2, int grade3) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
	}
	public Student(String firstName, String lastName){
		this(firstName, lastName, 100,50, 10);
		
	}
	
	public double getAverageGrade() {
		double sum = 0;
		
		sum = (grade1 + grade2+ grade3) / 3.0;
		return sum;
	}
	
	public static void main(String[] args) {
		Student sOne = new Student("MArcos", "Valdez", 25,25,50 );
		Student sTwo = new Student("Ysenia", "Hernandez", 100, 75, 80);
		
		System.out.printf("%s%.2f", "Marcos Avg: " ,sOne.getAverageGrade());
		System.out.println();
		System.out.printf("%s%.2f", "Ysenia Avg: ",sTwo.getAverageGrade());
	}

}
