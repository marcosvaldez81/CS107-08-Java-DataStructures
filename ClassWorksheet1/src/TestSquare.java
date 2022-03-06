/*
 * . Write a class called TestSquare with a main method that,
		a. creates a Square object and initializes its length to 1.2.
		b. uses the mutator method to change the length stored in the Square object to 8.8.
		c. then uses the accessor method to display the length stored in the Square object
 * 
 * 
 */
public class TestSquare {

	public static void main(String[] args) {
		Square square = new Square(1.2);
		
		square.setLength(8.8);
		
		System.out.println("Length: " + square.getLength());

	}

}
