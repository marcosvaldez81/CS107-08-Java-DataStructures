
/*Write a class called Rectangle with the following features
		• private instance variables
		• double length, double width
		• constructors with the headers
		• public Rectangle (double length, double width)
		- initializes the instance variables
		• accessor and mutator methods for each instance variable
		• a method with the header
		 public double getArea() //returns the area
		• a method with the header doubles the width
		 public void doubleWidth() 
 
 */

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	
	public void setLength(double length2) {
		this.length = length2;
	}
	
	public void setWidth(double width2) {
		this.width = width2;
	}
	
	public double getArea() {
		
		return length * width;
	}
	
	public void doubleWidth() {
		width = 2 * width;
	}
	
	
}
