


public class BookTest {

	public static void main(String[] args) {
		Book bookOne = new Book("I Like Math", 10.00);
		
		System.out.println("Title = " + bookOne.getTitle());
		System.out.println("Price = " + bookOne.getPrice());
		
		
		bookOne.setTitle("I don't like math");
		bookOne.setPrice(5.00);
		
		System.out.println("Title = " + bookOne.getTitle());
		System.out.println("Price = " + bookOne.getPrice());

	}

}
