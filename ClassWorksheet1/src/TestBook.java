
/*
 * Write a class called TestBook with a main method
		a. Create a Book object call bookOne. Select any name and any positive number
		for the price.
		b. Create a Book object call bookTwo. Select any name and any positive number
		for the price.
		c. Use the accessor methods to display the name and price for each object.
		Example
		bookOne: Name = I Like Java Price = 22.00
		d. Use the mutator methods to change the name and price for bookOne.
		e. Use the accessor methods to display the name and price for bookOne.

 */

public class TestBook {

	public static void main(String[] args) {
		Book bookOne = new Book("Hello World", 10.00);
		Book bookTwo = new Book("Java is cool", 5.00);
		
		System.out.println("Title: " + bookOne.getTitle() + "  Price: "+ bookOne.getPrice());
		System.out.println("Title: " + bookTwo.getTitle() + "  Price: "+ bookTwo.getPrice());
		
		bookOne.setTitle("GoodBye World");
		bookOne.setPrice(15.00);
		
		System.out.println("Title: " + bookOne.getTitle() + "  Price: "+ bookOne.getPrice());
		System.out.println("Title: " + bookTwo.getTitle() + "  Price: "+ bookTwo.getPrice());
	}

}
