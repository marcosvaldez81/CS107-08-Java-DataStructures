
public class TestStudent {

	public static void main(String[] args) {
		Student sOne = new Student("Marcos", "Valdez", 25,25,50); //calling 
		Student sTwo = new Student("Michael", "Scott", 100,75,60);
		
		System.out.printf("%s%1.2f\n", "Grade Average of student one: ", sOne.getAverageGrade()); // terrible grades marcos!
		System.out.printf("%s%1.2f", "Grade Average of student two: ", sTwo.getAverageGrade());

	}

}
