
/*
 * . Write a class called Square by following steps.
		a. Write the class header.
		b. Declare a private double instance variable called length.
		c. Write a constructor that initializes the instance variable in the class.
		d. Write an accessor method for the instance variable.
		e. Write a mutator method for the instance variable.
 */


public class Square {
	private double length; //instance variable
	
	public Square(double iLength) { //constructor
		this.length = iLength;
	}
	
	public double getLength() { // accessor method
		return length;
	}
	
	public void setLength (double nLength) { //mutator method
		this.length = nLength;
	}
}
