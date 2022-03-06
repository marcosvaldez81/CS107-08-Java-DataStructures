
public class Book {
	private String title;
	private double price;
	
	public Book(String initTitle, double initPrice) {
		title = initTitle;
		price = initPrice;
	}
	
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double newPrice) {
		price = newPrice;
	}
	
	public String getTitle() {
		
		
		return title;
	}
	
	
	public void setTitle(String newTitle) {
		title = newTitle;
	}
}
