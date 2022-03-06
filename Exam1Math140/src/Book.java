
public class Book /*implements Comparable <Book>*/ {

//	private String title;
//	
//	private String author;
//	
//	public Book(String title, String author) {
//		this.title = title;
//		this.author = author;
//	}
//	
//	public int compareTo(Book b) {
//		return b.author.length() - this.author.length();
//	}
	private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //--------------------------------------------
    
    
    public static int  numAuthorLengthGreaterThanFive(Book[] bkArr) {
    	
    	int count = -1;
    	
    	if(bkArr != null) {
    		count = 0;
    		for(Book author: bkArr) {
    			if(author.getAuthor().length() > 5) {
    				count++;
    			}
    		}
    	}
    	return count;
    }
	
	public static void main(String[] args) {
		Book[] bk = {new Book("I Like Java", "Ess", 20.12), new Book("Advanced Java", "Monday", 10.01), new Book("Java 8", "Tuesday", 50.12)};		
		System.out.println(numAuthorLengthGreaterThanFive(bk));
		
	}
}
