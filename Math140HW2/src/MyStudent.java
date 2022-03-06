

/*
Author: Marcos Valdez. You assisted me on this project sir! Thank you sir!
Date: 2/28/2021.
*/

public class MyStudent extends Student{
	private String major;
	
	/*
	 Purpose: This method is calling the parameters in the Student.java file. I did this with "Super"
	 Parameters: I am taking the original parameters in Student.java, I also initialized major variable here
	 Return: Well, it will return the initialized vars
	*/

	public MyStudent(String firstName, String lastName, int[] grades, String major) {
		super(firstName,lastName,grades);
		this.major = major;
	}
	
	/*
	 Purpose: Taking the original parameters again, as well as declaring major variable to "Economics"
	 Parameters: Taking original variables with super and set major as "Economics"
	 Return: It will return the variables that have been set to.
	*/

	public MyStudent(String firstName, String lastName, int[] grades) {
		super(firstName, lastName, grades);
		major = "Economics";
		
	}
	
	/*
	 Purpose: This is a mutator, 
	 Parameters: Setting the String major
	 Return: returns final major variable
	*/


	public void setMajor(String major) {
		this.major = major;
	}
	
	/*
	 Purpose: A accessor variable, meaning, in the main, we call the getMajor() for printing
	 Parameters: no parameters in the getMajor() it will cause compiler errors
	 Return: returns final major variable
	*/

	
	public String getMajor() {
		return major;
	}
	
	
	/*
	 Purpose: 
		 	Overriding the original boolean method in Student.java, returns true if
		 parameters of this object are the same current object. I used "super" to get the parameters
		 from student.java, and added the "this.major.equals..."
	 
	 Parameters: Parameter is Object o which then gets casted to "MyStudent" -- line 74
	 Return: Will either return true or false. We want true to ensure the parameters are all the same
	*/

	
	@Override
	public boolean equals(Object o) {
		boolean flag = false;
		
		if(o != null && getClass() == o.getClass()) {
			if (this == o) {
				flag = true;            
			}else {
				MyStudent student = (MyStudent) o;
				flag = super.equals(o) && this.major.equals(student.major) ;
			
			}
			
		}
		return flag;
	
	}
	/*
	 Purpose: 
		 	Override the original toString() in Student.java. I convert all the methods 
		 return variables to a String. Regardless of data type.
		 
	 Parameters: No parameters, just calling return variables from methods
	 Return: Returns the final output
	*/

	@Override
	 public String toString() {
		 return "Name: " + getFirstName() + " " + getLastName() + "  " + "Average Grade: " + String.format("%1.2f", getAverageGrade()) + "  " + "Major: " + getMajor();
	 }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
