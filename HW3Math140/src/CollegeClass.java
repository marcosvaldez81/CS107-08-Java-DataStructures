// Marcos Valdez 
// Math 140
// Finished 3/27/2021
//Professor Scarbnick assisted me!

// Purpose is to create college class objects such as students, instructors etc needed for comparison in the main java (HWThree.java)

import java.util.ArrayList;
import java.util.Arrays;

public class CollegeClass implements Comparable <CollegeClass> {
	
	//this code block is needed to initiate variables
	private Person instructor;
	private int section;
	private Student[] students;
	private String subject;
	private String school;
	
	/*Purpose:  This is setting up the scene basically by setting the this... variables to their correct info
	 * Parameters: The parameters are taking information from other methods in other classes (student.java / person.java)
	 * Return:  Will return the initiated variables that will later be utilized in further methods below
	 * 
	 * */
	public CollegeClass(Person instructor, int section, Student[] students, String subject, String school) {
		//this.instructor = new Person(instructor.getFirstName(),instructor.getLastName(), instructor.getAge());
		this.section = section;
		setInstructor(instructor);
		setStudents(students);
		this.subject = subject;
		this.school = school;
		
		
	}
	
	/*Purpose: This class sets a unique college class method and it is set for a certain instructor... used the first instructor did that by using "this(...)"
	 * Parameters: The parameters are taking information from other methods in other classes (student.java / person.java), and setting in our own info needed for HW (botany, MSU...)
	 * Return: this(instructor...)
	 * 
	 * */

	public CollegeClass(Person instructor, int section,Student[] students) {
		this(instructor, section, students, "Botany", "Michigan State University" );
	}
	
	/*Purpose:  Gets the instructor info
	 * Parameters: No parameters needed in accessor methods
	 * Return:  returns the copy of the instructor var, and not the same address!
	 * 
	 * */
	public Person getInstructor() {
		Person ins = new Person (instructor.getFirstName(), instructor.getLastName(), instructor.getAge());
		
		return ins;
	}
	
	/*Purpose: This is a mutator method for instructor, sets the instructor for future calls
	 * Parameters: A person object that resembles instructor
	 * Return:  Will return correct instructor variable
	 * 
	 * */
	
	public void setInstructor(Person instructor) {
		this.instructor =  new Person(instructor.getFirstName(),instructor.getLastName(),instructor.getAge()) ;
	}
	
	/*Purpose: Get section accessor method
	 * Parameters: No parameter needed for accessor methods
	 * Return: section variable
	 * 
	 * */
	
	public int getSection() {
		return section;
	}
	
	/*Purpose: Setting the section variable that will be used in later methods
	 * Parameters: int variable for section 
	 * Return: Will return correct section address
	 * 
	 * */
	
	public void setSection(int section) {
		this.section = section;
	}
	
	/*Purpose: This gets student array, copies length of students to new temp var
	 * Parameters: No parameter needed for accessor methods
	 * Return:Will return the copy of students array
	 * 
	 * */
	
	public Student [] getStudents(){
		Student [] temp = new Student[students.length];
		
		for(int i = 0; i < students.length; i++) {
			temp[i] = new Student(students[i]);
		}
		return temp;
	}
	
	/*Purpose: This method essentially sets the student object array, makes a copy
	 * Parameters: The parameter is a students object that is copied
	 * Return: return this.students
	 * 
	 * */
	public void setStudents(Student [] students) {
		this.students = new Student[students.length];
		for(int i = 0; i < students.length;i++) {
			this.students[i] = (students[i]);
		}
		
	}
	
	/*Purpose: This method essentially gets the subject of the college class
	 * Parameters: no parameter due to being a accessor method
	 * Return: returns subject
	 * 
	 * */
	public String getSubject() {
		return subject;
	}
	
	/*Purpose: This method essentially gets the subject of the college class
	 * Parameters: a string for subject, this.subject is assigned the subject
	 * Return: returns subject
	 * 
	 * */
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	/*Purpose: This method essentially gets the school of the object in college class
	 * Parameters: no parameter due to being a accessor method
	 * Return: returns school
	 * 
	 * */
	
	public String getSchool(){
		return school;
	}
	
	/*Purpose: This method essentiallysets the school var
	 * Parameters: String school parameter to be set to the this.school var
	 * Return: returns school
	 * 
	 * */
	
	public void setSchool(String school) {
		this.school = school;
		
	}
	
	/*Purpose: equals() method is to return true if Object o is the same as instructor, section, subject and school
	 * Parameters: Object o
	 * Return: returns if the object is the same as the flag var on line 164
	 * 
	 * */
	
	public boolean equals(Object o) {
		boolean flag = false;
		
		if(o != null && getClass() == o.getClass()) {
			if(this == o) {
				flag = true;
			}else {
				CollegeClass c = (CollegeClass) o;
				flag = instructor.equals(c.instructor) && section == c.section 
						&& subject.equals(c.subject) && school.equals(c.school);
			}
			
		}
		
		return flag;
	}
	
	/*Purpose: To print a string that cointains instructor,school,subject and section
	 * Parameters: no parameters needed for toString() methods
	 * Return: returns the proper string
	 * 
	 * */
	public String toString() {
		return "Instructor: " + instructor.getFirstName() + " " + instructor.getLastName() + "\n"
				+"School: " + school + "\nSubject: " + subject + "\n" + "Section: "+ String.format("%d", section);
	}
	
	/*Purpose: This compareTo() method essentially compares highest grade of a student ion course
	 * Parameters: CollegeCLass uc object
	 * Return: returns highest grade to be largest in college class object
	 * 
	 * */
	
	public int compareTo(CollegeClass uc) {
		
		Student str = uc.getStudentWithHighestGrade();

		
		int hold =getStudentWithHighestGrade().getHighestGrade();
		return hold - str.getHighestGrade();
	}
	
	/*Purpose: return a string that contains list of students in collegeClass.java
	 * Parameters: no parameters for accessor method
	 * Return: returns list of students in college class
	 * 
	 * */
	public String getStudentList() {
		
		
		String str = "";
		
		for(int i = 0; i < students.length; i++) {
			str += students[i].toString() +"\n";
		}
		
		
		return str;
	}
	
	/*Purpose: fetches student object with the highest average
	 * Parameters: no parameter due to being a accessor method
	 * Return: returns student object with highest avg
	 * 
	 * */
	public Student getStudentWithHighestAverage () {
		Student topStudent = new Student(students[0]);
		
		for(int i = 0; i < students.length; i++) {
			if(students[i].getAverageGrade() > topStudent.getAverageGrade()) {
				topStudent = students[i];
			}
		}
		
		return topStudent =new Student(topStudent.getFirstName(), topStudent.getLastName(), topStudent.getGrades());
	}
	
	/*Purpose: This method essentially gets the student object with highest grade in college class 
	 * Parameters: no parameter due to being a accessor method
	 * Return: returns student object with highest grade
	 * 
	 * */
	public Student getStudentWithHighestGrade () {
		Student studentHigh = new Student(students[0]);
		
		for(int i = 0; i < students.length; i++) {
			if(students[i].getHighestGrade() > studentHigh.getHighestGrade()) {
				studentHigh = new Student(students[i]);
			}
		}
		return studentHigh = new Student(studentHigh.getFirstName(), studentHigh.getLastName(), studentHigh.getGrades());
	}
	
	/*Purpose: This method essentially get the number of students in collegeclass.java
	 * Parameters: no parameter due to being a accessor method
	 * Return: returns list of students
	 * 
	 * */
	
	public int getNumberOfStudents() {
		
		return students.length;
	}
	
	/*Purpose: This method essentially compares the students in the college class and stores students greater than input parameter and puts them in array
	 * Parameters:Student object that is being compared to as you can see in forloop
	 * Return: returns arr, the list of students greater than inputted student object
	 * 
	 * */
	public ArrayList <Student> greaterThan(Student student){
		ArrayList <Student> arr = new ArrayList<>();
		
		for(int i = 0; i < students.length; i++) {
			if(students[i].compareTo(student) > 0) {
				arr.add(new Student(students[i]));
			}
		}
		
		return (arr);			
	}
	
	
	
	public static void main(String[] args) {
		
	}

}
