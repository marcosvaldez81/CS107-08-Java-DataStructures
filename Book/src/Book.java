
public class Book implements Comparable <Book>  {
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		
		
	}
	public boolean equals(Object o) {
		boolean flag = false;
		
		
		if (o != null && getClass() == o.getClass()) {
			if (this == o) {
				flag = true;
				
			}
			else {
				Book b = (Book) o;
				flag = title.equals(b.title) && author.equals(b.author);
			}
		}
		return flag;
	}
	public int compareTo(Book b) {
		return author.length() - b.author.length();
	}
	
	public static void main(String[] args) {
		

	}

}
