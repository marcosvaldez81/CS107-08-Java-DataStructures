/*
 * In the main method,
		• Create at least two additional Rectangle objects.
		• Use the getArea() method to display the area of each Rectangle
		• Use the doubleWidth() method to double the width of one of the Rectangle
		objects. 
 * 
 * 
 */


public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(10,10);
		Rectangle rectangle2 = new Rectangle(5,5);
		
		System.out.println("Area of rectangle 1 = " + rectangle1.getArea());
		System.out.println("Area of rectangle 2 = " + rectangle2.getArea());
		
		rectangle2.getWidth();
		System.out.println("Area of rTwo after doubling the width: " + rectangle2.getArea());
		

	}

}
