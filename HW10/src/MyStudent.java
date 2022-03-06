/*
 * Marcos Valdez
 * 
 * Math-130
 * 
 */

public class MyStudent extends Student {
	
	private String major;
	
	//constructors
	public MyStudent(String firstName, String lastName, int age, int[] grades, String major) {
		super(firstName, lastName, age, grades);
		this.major = major;
	}

	public MyStudent(String firstName, String lastName, int age, int[] grades) {
		super(firstName, lastName, age, grades);
		major = "Physics";
	}
	
	
	//mutator
	public void setMajor(String major) {
		this.major = major;
	}
	
	
	//accessors
	public String getMajor() {
		return major;
	}

	public double getGPA() {
		int[] grades = getGrades();
		int sum = 0;
		int divide;

		for (int i = 0; i < grades.length; i++) {
			sum = sum + grades[i];
		}
		sum = sum - getLowestGrade();

		divide = sum / (grades.length - 1);
		return divide;
	}
	//to string method 
	public String toString() {
		return "Name: " + getFirstName() + " " + getLastName() + "\n" + "Age: " + getAge() + "\n" + "GPA: "
				+ String.format("%1.2f", getGPA()) + "\n" + "Major: " + major;
	}
	
	//boolean
	public boolean equals(Object o) {
		MyStudent student = (MyStudent) o;
		return getFirstName().equals(student.getFirstName()) && getLastName().equals(student.getLastName())
				&& getAge() == student.getAge() && this.major.equals(student.major);

	}

}
