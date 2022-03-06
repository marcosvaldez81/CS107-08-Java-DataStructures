
public class MyCollegCourse extends CollegeCourse {
	
	private String subject;
	
	public MyCollegCourse(String instructor, String school, int numStudents, String subject) {
		super(instructor,school,numStudents);
		this.subject =subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public String toString() {
		return super.toString() + "   Subject: " + subject;
	}
	
	public static void main(String[] args) {
		MyCollegCourse coll = new MyCollegCourse("Freja Monday", "UCSD", 31, "Circuits");
		
		System.out.println(coll.toString());
	}
	
	
	
}
