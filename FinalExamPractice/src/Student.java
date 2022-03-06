
public class Student {
	
	private String firstName;
    private String lastName;
    private int[] grades;

    public Student(String firstName, String lastName, int[] grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        setGrades(grades);  
    }
    
    public double getAverageGrade() {
        int sum = 0;
        for (int x : grades) {
            sum += x;
        }
        return (double) sum / grades.length;
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


    public int[] getGrades() {
        int[] temp = new int[grades.length];
        System.arraycopy(grades, 0, temp, 0, grades.length);
        return temp;
    }

    public void setGrades(int[] grades) {
        this.grades = new int[grades.length];
        System.arraycopy(grades, 0, this.grades, 0, grades.length);
    }

}
