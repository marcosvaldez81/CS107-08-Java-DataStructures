/*
 * Marcos Valdez
 * 
 * Math-130
 * 
 */


public class Student {
	
	//private instance variables 
	private String firstName;
	private String lastName;
	private int age;
	private int[] grades;
	
	
	//public constructor
	public Student(String firstName, String lastName, int age, int[] grades) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.grades = grades;
		this.age = age;

	}
	
	//mutators

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGrade(int[] grades) {
		this.grades = grades;
	}
	
	
	//accessors
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public int[] getGrades() {
		return grades;
	}

	public double getGPA() {
		double sum = 0.0;
		for (int i = 0; i < grades.length; i++) {
			sum = sum + grades[i];

		}
		sum = sum / grades.length ;
		return sum;
	}
	
	//methods
	public String toString() {
		return "Name: " + firstName + " " + lastName + "\n" + "Age: " + age +  "\n" + "GPA: "
				+ String.format("%1.2f", getGPA());
	}

	public int getHighestGrade() {
		int largest = grades[0]; 
		for(int i= 1; i< grades.length; i++){
			if (grades[i] > largest) {
				largest = grades[i];
			}
		}
		return largest;
	}

	public int getLowestGrade() {
		int count = 0;
		int low = grades [0];

		for (int i = 0; i < grades.length; i++) {
			if (grades[i] < low) {
				low = grades[i];
				
			}
		}
		return low;
	}
	
	//boolean
	public boolean equals(Object o) {
		Student s = (Student) o;
		return this.firstName.equals(s.firstName) &&  this.lastName.equals(s.lastName) && this.age == s.age && this.grades == s.grades;
		
	}

	public boolean setGrade(int i, int score) {
		if (0 <= i && i < grades.length) {
			score = grades[i];
			return true;
		} else {
			return false;
		}
	}

}
