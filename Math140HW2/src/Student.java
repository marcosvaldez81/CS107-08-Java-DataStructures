

/*
Author: Marcos Valdez. You assisted me on this project sir! Thank you!
Date: 2/28/2021.
*/

public class Student {
	
	private String firstName;
	private String lastName;
	private int [] grades;
	
	/*
	 Purpose: First step to create a Student object. This constructor initializes the private variables 
	 
	 Parameters: firstName intializes the first name, last name = lastName, grades are copied. We want this to 
	 prevent incorrect output. This prevents the main method activity to prevent change of variables. 
	 
	 Return: Initialized variables
	*/

	
	
	public Student(String firstName, String lastName, int[] grades){
		this.firstName = firstName;
		this.lastName = lastName;
		this.grades = new int[grades.length];
		
		System.arraycopy(grades,0, this.grades,0, grades.length);
	}
	
	
	/*
	 Purpose: Assigning the initalized variables to a student object
	 Parameters: The student object that will be used in the main
	 Return: initialized variables and assigning it to the student object
	*/

	
	public Student(Student student) {
		this(student.firstName, student.lastName, student.grades);

	}
	
	
	/*
	 Purpose: These get() methods are accessors. We use these methods to get the final vars
	 Parameters: No parameters in get() methods
	 Return: Returns the finalized variables basically
	*/

	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	
	
	/*
	 Purpose: 
		 	getGrades() is to get the final grades in the main. However, to prevent incorrect output/change of variables in main
		 I have to set a tmp var to grades.length. Then copied those elements into tmp, then return final grades array.
		 
	 Parameters: No parameters in get() methods
	 
	 Return: final array of grades. Main can't change the variable
	*/

	
	public int[] getGrades() {
		int [] tmp = new int[grades.length];
		
		System.arraycopy(grades,0, tmp,0, grades.length);
		return tmp;
	}
	
	
	/*
	 Purpose: Setting the first name (mutator method)
	 Parameters: firstName is needed for the main and for student object
	 Return: final firstName var
	*/

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	/*
	 Purpose: setting last name var (mutator)
	 Parameters: String lastName is needed for  final lastName var
	 Return: returns the final lastName var
	*/

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	/*
	 Purpose: mutator method sets the grades array
	 
	 Parameters: int [] grades is the parameter, we need to prevent possible errors in output so 
	 have to set this.grades to the grades.length. Then copied the grades elements to this.grades
	 
	 Return: final grades array basically
	*/

	public void setGrades(int [] grades) {
		this.grades = new int[grades.length];
		System.arraycopy(grades,0, this.grades,0, grades.length);
	}
	
	
	/*
	 Purpose: Accessor method for getting highest grade. Really easy with for each loop
	 Parameters: No parameters for accessor methods
	 Return: Basically returns highest grade for student object
	*/

	public int getHighestGrade() {
		int high = 0;
		
		for(int num: grades) {
			if(num > high) {
				high = num;
			}
		}
		return high;
	}
	
	/*
	 Purpose: Accessor method to compute grade average of MyStudent object
	 Parameters: No parameters for accessor methods or else compiler error or incorrect output
	 Return: avg of the mystudent object grades (the array)
	*/

	
	public double getAverageGrade() {
		double avg = 0;
		
		for(double num: grades) {
			avg = avg + num;
		}
		avg = avg/grades.length;
		
		return avg;
	}
	
	/*
	 Purpose: increments grades array by 1
	 Parameters: No parameters needed
	 Return: returns updated grades, by adding 1
	*/
	public void incrementAllGradesByOne() { 
		
		for (int i = 0; i < grades.length; i++){
			grades[i]++; //increments the index by 1 as desired
		}
	}
	
	/*
	 Purpose: To string method to convert all data types in the getmethods to strings
	 Parameters: No paramters needed here
	 Return: returns correct output. Calls get methods, then prints
	*/

	
	public String toString () {
		return "Name: " + getFirstName() + "  " + getLastName() + " " + "Average Grade: " + String.format("%1.2f", getAverageGrade());
	}
	
	/*
	 Purpose: 
		 	Original equals method. The one in MyStudent.java overrides this one. This equals method basically returns true if all paramters
		 equal the same as student object, if not its false!
		 
	 Parameters: Object o, which gets casted as Student as you see on line 191 
	 Return: true or false and continues on with correct output.
	*/

	public boolean equals(Object o) {
		boolean flag = false;
		
		if(o != null && getClass() == o.getClass()) {
			if(this == o) {
				flag = true;
			}else {
				Student s = (Student) o;
				flag = firstName.equals(s.firstName) && lastName.equals(s.lastName) && getHighestGrade() == s.getHighestGrade();
			}
			
		}
		
		return flag;
	}
	
	
	
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

	}

}
