
public class CollegeCourse {
	private String instructor;
	private String school;
	
	private int numStudents;
	
	public CollegeCourse(String instructor, String school, int numStudents) {
		this.instructor = instructor; 
		this.school = school;
		this.numStudents = numStudents;
		
	}
	
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	public void setNumStudents(int numStudents) {
		this.numStudents = numStudents;
	}
	
	public String getInstructor() {
		return instructor;
	}
	
	public String getSchool() {
		return school;
	}
	
	public int getNumStudents() {
		return numStudents;
	}
	
	public String toString() {
		return "Instructor: " + instructor + "   School: " + school + "   Number of Students: " + numStudents;
	}
	
	public boolean equals(Object obj) {
		CollegeCourse cc = (CollegeCourse) obj;
		return this.instructor.equals(cc.instructor) && this.school.equals(cc.school) && this.numStudents == cc.numStudents ; 
	}
	
}
