/*
 * Marcos Valdez
 * 
 * Math 130
 * 
 */


public class TestMyEmployee {

	public static void main(String[] args) {
		
		//declaring objects
		MyEmployee employeeOne = new MyEmployee("Marcos Valdez", "1234", "Programmer", 67000.90);
		MyEmployee employeeTwo = new MyEmployee("Janett Smith", "2468", "CE Engineer");

		System.out.println("Data for employeeOne:");
		System.out.printf("%s  \n", employeeOne.toString());
		System.out.println();

		System.out.println("Data for employeeTwo:");
		System.out.println(employeeTwo.toString());
		
		//setting up objects
		employeeOne.setName("John Jones");
		employeeOne.setJobTitle("Retail");
		employeeOne.setEmployeeID("7890");
		employeeOne.setYearlySalary(51000.11);

		System.out.println();
		
		// data for employeeOne
		System.out.println("Data for employeeOne after applying the set methods:");
		System.out.println(employeeOne.toString());
		
		employeeOne.setYearlySalary(-75.0);
		System.out.println();
		System.out.println("Data for employeeOne after calling yearlySalary with a negative value:");
		System.out.println(employeeOne.toString());

		System.out.println();
		
		//getting data for employeeTwo
		System.out.println("Use the get methods to display data for employeeTwo:");
		System.out.println(employeeTwo.getName() + " " + employeeTwo.getEmployeeID() + " " + employeeTwo.getJobTitle()
				+ " " + employeeTwo.getYearlySalary());

		System.out.println();
		
		//incrementing salary
		System.out.println("Salary History for " + employeeOne.getName());

		employeeOne.incrementSalary(-100);

		employeeOne.incrementSalary(1000);

		employeeOne.incrementSalary(1000);

		employeeOne.incrementSalary(1000);

		employeeOne.incrementSalary(1000);

		employeeOne.displaySalaryHistory();

		System.out.println();
		//applying raises for employeeTwo
		System.out.println("Salary History for " + employeeTwo.getName());

		employeeTwo.applyRaise(-109);
		employeeTwo.applyRaise(200);
		employeeTwo.applyRaise(100);
		employeeTwo.applyRaise(75);
		employeeTwo.applyRaise(50);
		employeeTwo.applyRaise(25);

		employeeTwo.displaySalaryHistory();

	}

}
