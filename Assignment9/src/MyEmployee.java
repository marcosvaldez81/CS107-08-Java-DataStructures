/*
 * Marcos Valdez
 * 
 * Math 130
 * 
 */

import java.util.ArrayList;
import java.util.Arrays;

public class MyEmployee {

	// private instance variables
	private String name;
	private String employeeID;
	private String jobTitle;
	private double yearlySalary;
	ArrayList<Double> salaryHistory = new ArrayList<>();

	// constructors

	public MyEmployee(String name, String employeeID, String jobTitle, double yearlySalary) {
		this.name = name;
		this.employeeID = employeeID;
		this.jobTitle = jobTitle;

		if (yearlySalary <= 0) {
			this.yearlySalary = 20000.00;
		} else {
			this.yearlySalary = yearlySalary;
		}

		salaryHistory.add(yearlySalary);
	}

	public MyEmployee(String name, String employeeID, String jobTitle) {
		this.name = name;
		this.employeeID = employeeID;
		this.jobTitle = jobTitle;

		yearlySalary = 98000.50;

		salaryHistory.add(98000.50);

	}

	// accessors
	public String getName() {
		return name;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public Double getYearlySalary() {
		return yearlySalary;
	}

	// mutators
	public void setName(String name) {
		this.name = name;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public void setYearlySalary(Double yearlySalary2) {
		if (yearlySalary2 <= 0) {
			yearlySalary = yearlySalary;
		} else {
			this.yearlySalary = yearlySalary2;
		}

	}

	// methods
	public String toString() {
		String salary = "  Yearly Salary: " + String.format("%1.2f", yearlySalary);

		return "Name:" + name + "  ID: " + employeeID + "  Job Title: " + jobTitle + salary;

	}

	public void incrementSalary(double amount) {
		if (amount <= 0) {
			amount = amount;
		}
		if (amount > 0) {
			yearlySalary = yearlySalary + amount;
		}
		salaryHistory.add(yearlySalary);
	}

	public void applyRaise(int percent) {

		if ((percent > 0) && (percent <= 100)) {
			this.yearlySalary = yearlySalary * (1 + percent / 100.0);
		}

		salaryHistory.add(yearlySalary);
	}

	public void displaySalaryHistory() {
		for (int i = 0; i < salaryHistory.size(); i++) {
			System.out.printf("$%1.2f\n", salaryHistory.get(i));
		}
	}

}
