
public class Quiz5Math140 {
	
	
	public static int priceGreaterThan20(Book[][] bkArr) {
		int count = 0;
		
		 for(Book [] arr: bkArr) {
			 for(Book b: arr) {
				 if(b.getPrice() > 20) {
					 count++;
				 }
			 }
		 }
		 
		 return count;
	 }
	
	public static void main(String[] args) {
		
		Book[][] bk = {{new Book("I Like Java", "Ess", 20.12), new Book("Advanced Java", "Monday", 10.01), new Book("Java 8", "Tuesday", 50.12)},
				 {new Book("Biology", "Miller", 110.13), new Book("History of SWC", "Bruce", 8.70)},
				  {new Book("Windows Programming", "Epps", 99.22), new Book("History of SWC Vol 2", "Bruce", 11.60)}};
		
		
		System.out.println(priceGreaterThan20(bk));
	}

}
