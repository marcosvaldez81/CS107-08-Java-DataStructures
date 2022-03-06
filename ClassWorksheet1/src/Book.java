

/*
 * Write a class called Book by following steps.
		a. Write the class header.
		b. Declare a String instance variable called title
		c. Declare a double instance variable called price
		d. Write a constructor that initializes the instance variables
		e. Write accessor methods for the instance variables.
		f. Write mutator methods for the instance variables
 * 
 */
public class Book {
	private String title;
	private double price;
	
	public Book(String title1, double price1) {
		this.title = title1;
		this.price = price1;
	}
	public String getTitle() {
		return title;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price2) {
		this.price = price2; 
	}
	
	public void setTitle(String newTitle) {
		this.title = newTitle;
	}
	
}
