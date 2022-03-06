

/*  Use this file to test your code.
 *  
 *  You can run your code even if some of the methods are incomplete.
 *  
 *  Example:  If you haven't written the toString method then use the following code:
 *  
 *       public String toString(){
 *            return null;
 *       }
 *       
 *       Example:  If you haven't written the getGPA method then use the following code:
 *       
 *       public double getGPA(){
 *           return 0;
 *       }
 *       
 */

public class HWTen {

	public static void main(String[] args) {
		int[] gradesStudent = {39, 94, 87, 23, 77, 92, 54};
		
		Student stuOne = new Student( new String("Savannah"), new String("Flores"), 41, gradesStudent);
		Student stuTwo = new Student( new String("Savannah"), new String("Flores"), 41, gradesStudent);
		
		System.out.println("toString method for stuOne: \n" + stuOne.toString());
		System.out.println("stuOne and stuTwo are equal: " + stuOne.equals(stuTwo));  // true
		System.out.println("Change 1st name of stuTwo: ");
		stuTwo.setFirstName("Joanna");
		System.out.println("stuOne and stuTwo are equal: " + stuOne.equals(stuTwo));  // false
		
	    System.out.println("\nChange name and age for stuOne");
	    stuOne.setFirstName("Max");
	    stuOne.setLastName("Monday");
	    stuOne.setAge(42);
	    
	    System.out.println("\ntoString method for stuOne: \n" + stuOne.toString());
	    System.out.println("\nDisplay results from the get methods for stuOne: ");
	    System.out.println("stuOne Name, age, and gpa: " + stuOne.getFirstName() + " "
	                        + stuOne.getLastName() + ", " + stuOne.getAge() + ", " +
	                        String.format("%1.2f", stuOne.getGPA()));   // GPA = 66.57
	    System.out.println("\nGrade changed for stuOne: " + stuOne.setGrade(-3, 77));
	    System.out.println("\nDisplay highest and lowest grade for stuOne: " + 
	                       stuOne.getHighestGrade() + " " + stuOne.getLowestGrade());
	    System.out.println("\nGrade changed for stuOne: " + stuOne.setGrade(2, 95));
	    System.out.println("\nGrade changed for stuOne: " + stuOne.setGrade(1, 22));
	    System.out.println("\nDisplay highest and lowest grade for stuOne: " + 
                           stuOne.getHighestGrade() + " " + stuOne.getLowestGrade());
	   
	    // allocate new memory and values for the grades array
	    gradesStudent = new int[]{64, 94, 72, 23, 77, 100, 45};
	    MyStudent myStuOne = new MyStudent( new String("William"), new String("Monday"), 
	    		                               52, gradesStudent, new String("Physics"));
		MyStudent myStuTwo = new MyStudent( new String("William"), new String("Monday"), 52, gradesStudent);
		System.out.println("\ntoString method for myStuOne: \n" + myStuOne.toString());
		System.out.println("\nmyStuOne and myStuTwo are equal: " + myStuOne.equals(myStuTwo));  //true
		System.out.println("\nChange major of myStuTwo");
		myStuTwo.setMajor("Music");
		System.out.println("\nMajor for myStuTwo " + myStuTwo.getMajor());
		System.out.println("\nmyStuOne and myStuTwo are equal: " + myStuOne.equals(myStuTwo));  // false
		System.out.println("\nGPA for myStuOne after dropping lowest score: " + 
		                            String.format("%1.2f", myStuOne.getGPA()));   // 75.33
		
	    
		
		
		
	}

}
