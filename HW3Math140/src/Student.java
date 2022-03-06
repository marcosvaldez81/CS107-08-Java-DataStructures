//This java file is needed for the creation of Student objects as well as compare the students last names/first names
//Professor assisted me!
//Finished 3/27/2021

import java.util.ArrayList;

public class Student implements Comparable <Student> {
	private String firstName;
	private String lastName;
	private int[] grades;

	public Student(String firstName, String lastName, int[] grades) {
		this.firstName = firstName;
		this.lastName = lastName;
		setGrades(grades);  
	}

	/*  Copy constructor
	 *   This constructor allocates memory for a Student object where the 
	 *   instance variables have the same content as the input parameter.
	 *   
	 *   Use this to invoke the 1st constructor
	 */
	
	
	public Student(Student student) {
		this(student.firstName, student.lastName, student.grades); 
	}

	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// return a memory address that is not equal to this.grades
	public int[] getGrades() {
		int[] temp = new int[grades.length];
		System.arraycopy(grades, 0, temp, 0, grades.length);
		return temp;
	}

	// address of this.grades not equal to the address of the parameter
	public void setGrades(int[] grades) {
		this.grades = new int[grades.length];
		System.arraycopy(grades, 0, this.grades, 0, grades.length);
	}

	public boolean equals(Object o) {
		boolean flag = false;
		if (o != null && getClass() == o.getClass()) {
			if (this == o) {
				flag = true;
			} else {
				Student s = (Student) o;
				flag = firstName.equals(s.firstName) && lastName.equals(s.lastName)
						&& getHighestGrade() == s.getHighestGrade();
			}
		}
		return flag;
	}
	
	
	
	/*Purpose:  Compare which names are greater of inputted student and the students in getLastName()
	 * Parameters: The inputted parameter is the student object being passed in
	 * Return:  Will return which name is greater, and if the names are equal, they will compare first names.
	 * */
	
	public int compareTo(Student student) {
		
		int flag = 0;
		
		if(getLastName().compareTo(student.getLastName()) >0 ) {
			flag = getLastName().compareTo(student.getLastName());
		}
		if(getLastName().equals(student.getLastName())) {
			flag = getFirstName().compareTo(student.getFirstName());
		}
		
		return flag;
	}
	
	public String toString() {
		return "Name: " + firstName + " " + lastName + "    Highest Grade " + getHighestGrade() + "  Average Grade: "
				+ String.format("%1.2f", getAverageGrade());
	}

	public void incrementAllGradesByOne() {
		for (int i = 0; i < grades.length; i++) {
			grades[i] += 1;
		}
	}

	public double getAverageGrade() {
		int sum = 0;
		for (int x : grades) {
			sum += x;
		}
		return (double) sum / grades.length;
	}

	public int getHighestGrade() {
		int greatest = Integer.MIN_VALUE;   
		for (int x : grades) {
			if (x > greatest) {
				greatest = x;
			}
		}
		return greatest;
	}
}
