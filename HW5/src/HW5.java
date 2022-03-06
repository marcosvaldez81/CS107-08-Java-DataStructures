/* Author:  Marcos Valdez, Professor assisted me!
 * Date:  05/17/2021
 * 
 * Purpose:  Main class that brings all comparator java classes into one for final run
 * 
 * */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class HW5 {

	
	public static Book createBook(String title, String author, int price, int numPages) {
		return new Book(new String(title), new String(author), price, numPages);
	}

	public static void displayBookArray(Book[] arr) {
		for (Book bk : arr) {
			System.out.println(bk);
		}
	}
	/*
	 * Purpose: Iterate through arr arraylist for largest object
	 * 
	 * Parameters: arr is a inputted arraylist in the main, and comparator<E>c is the java library
	 * we use to compare objects within the arr array list. 
	 * 
	 * Return:  largest object value in array list
	 * 
	 * */
	
	public static<E> E getLargest(ArrayList<E> arr, Comparator<E> c) { // –return the largest value in the ArrayList.  
		
		E largest = arr.get(0);
		
		for(int i = 0; i < arr.size(); i++) {
			if(c.compare(arr.get(i), largest) >0) {
				largest = arr.get(i);
			}
		}
		
		return largest;
		
	}
	
	/*
	 * Purpose: Iterate through arr arraylist for largest object
	 * 
	 * Parameters: arr is a inputted arraylist in the main, and comparator<E>c is the java library
	 * we use to compare objects within the arr array list. 
	 * 
	 * Return:  largest object value in array list
	 * 
	 * */
	
	
	public static<E> E getSmallest(ArrayList<E> arr, Comparator<E> c) {
				//–return the smallestvalue in the ArrayList. 
		
		
		E smallest = arr.get(0);
		
		for(int i = 0; i < arr.size(); i++) {
			if(c.compare(arr.get(i), smallest) < 0) {
				smallest = arr.get(i);
			}
		}
		
		return smallest;
	}
	
	/*
	 * Purpose: Iterate through arr arraylist for largest object
	 * 
	 * Parameters: arr is a inputted arraylist in the main, and comparator<E>c is the java library
	 * we use to compare objects within the arr array list. 
	 * 
	 * Return:  largest object value in array list
	 * 
	 * */
	
	public static<E> boolean greaterThan(E x, E y, Comparator<E> c) { //returns true if x is greater than y.
		
		boolean flag = true;
		
		if(c.compare(x, y) > 0) {
			
			flag = c.compare(x, y) > 0;
		}else {
			flag = false;
		}
		
		return flag;
	}
	
	
	/*
	 * Purpose: Iterate through arr arraylist and append all values in arr that are greater than value, append to my tmpArr
	 * 
	 * Parameters: arr is a inputted arraylist in the main, and comparator<E>c is the java library
	 * we use to compare objects within the arr array list, value is the object comparing to 
	 * 
	 * Return:  tmpArr array list of objects containing all elements in arr array list > than value
	 * 
	 * */
	public static<E> ArrayList<E> greaterThan(ArrayList<E> arr, Comparator<E> c, E value) {

		
		ArrayList<E> tmpArr = new ArrayList<>();
		
		for(int i = 0; i < arr.size(); i ++) {
			if(c.compare(arr.get(i), value) > 0) {
				tmpArr.add(arr.get(i));
			}
		}
		return tmpArr;
		
		
	}
	
	

	
	/*
	 * Purpose: Iterate through arr arraylist to verify if all objects in the list is > than value, no exception!
	 * 
	 * Parameters: arr is a inputted arraylist in the main, and comparator<E>c is the java library
	 * we use to compare objects within the arr array list and value.
	 * 
	 * Return: return true if all elements in arr arraylist is > value, else... false
	 * 
	 * */
	public static<E> boolean allGreaterThan(ArrayList<E> arr, Comparator<E> c, E value){ 
	
		boolean flag = true;
		int count = 0;
		
		while(count < arr.size() && flag) {
			flag = c.compare(arr.get(count), value) >= 0;
			count++;
		}

		return flag;
		
		
	}
	
	
	/*
	 * Purpose: Iterate through arr arraylist to check if at least one object in arr is greater than value
	 * 
	 * Parameters: arr is a inputted arraylist in the main, and comparator<E>c is the java library
	 * we use to compare objects within the arr array list. and value.
	 * 
	 * Return: return true if at least one value in arr is greater than value; otherwise return false.
	 * 
	 * */
	
	
	public static<E> boolean atLeastOneGreaterThan(ArrayList<E> arr, Comparator<E> c, E value) { 

		boolean flag = true;
		
		int count = 0;
		for(int i = 0; i < arr.size() && flag; i ++) {
			if(c.compare(arr.get(i), value) > 0) {
				count++;
			}
		}
		
		if (count >=1){
			flag = true;
		}else {
			flag = false;
		}
		
		return flag;
		
	}
	public static void main(String[] args) {

		Book[] bkArr = { createBook("Concrete Mathematics", "Knuth", 100, 451),
				createBook("Introduction to Algorithms", "Cormen", 100, 934),
				createBook("Artificial Intelligence", "Norvig", 46, 310),
				createBook("HTML in 21 Days", "Lemay", 25, 240),
				createBook("C Programming Language", "Ritchie", 34, 320),
				createBook("Computer Networks", "Tanenbaum", 67, 431),
				createBook("Modern Operating Systems", "Tanenbaum", 82, 501),
				createBook("Python programming fundamentals", "Lee", 171, 900),
				createBook("Android Programming Unleashed", "Harwani", 102, 801),
				createBook("FORTRAN 90 for engineers and scientists", "Nyhoff", 25, 300),
				createBook("Java for Everyone", "Horstmann", 63, 450),
				createBook("Windows Programming", "Petzold", 171, 670) };

		Comparator<Book> cTitle = new TitleComparator();
		Comparator<Book> cAuthor = new AuthorComparator();
		Comparator<Book> cPrice = new PriceComparator();

		ArrayList<Book> bkList = new ArrayList<>();
		for (Book bk : bkArr) {
			bkList.add(bk);
		}

		System.out.println("\nLargest Book by Title");
		System.out.println(getLargest(bkList, cTitle));
		System.out.println("\nLargest Book by Author");
		System.out.println(getLargest(bkList, cAuthor));
		System.out.println("\nLargest Book by Price/Pages");
		System.out.println(getLargest(bkList, cPrice));

		System.out.println("\nSmallest Book by Title");
		System.out.println(getSmallest(bkList, cTitle));
		System.out.println("\nSmallest Book by Author");
		System.out.println(getSmallest(bkList, cAuthor));
		System.out.println("\nSmallest Book by Price/Pages");
		System.out.println(getSmallest(bkList, cPrice));

		System.out.println("\nCompare Book 0 and Book 1");
		System.out.println("Book 0: " + bkArr[0]);
		System.out.println("Book 1: " + bkArr[1]);

		System.out.println("\n(1) Compare by title");
		if (greaterThan(bkArr[0], bkArr[1], cTitle)) {
			System.out.println("Book 0 is greater than Book 1");
		} else {
			System.out.println("Book 0 is less than or equal to Book 1");
		}

		System.out.println("\n(2)Compare by author");
		if (greaterThan(bkArr[0], bkArr[1], cAuthor)) {
			System.out.println("Book 0 is greater than Book 1");
		} else {
			System.out.println("Book 0 is less than or equal to Book 1");
		}

		System.out.println("\n(3) Compare by price/number of pages");
		if (greaterThan(bkArr[0], bkArr[1], cPrice)) {
			System.out.println("Book 0 is greater than Book 1");
		} else {
			System.out.println("Book 0 is less than or equal to Book 1");
		}

		System.out.println("\nTest allGreaterThan");
		Book tmp = createBook("Windows Programming Edition 2", "Petzold", 173, 674);
		System.out.println("(1) Compare by author");
		if (allGreaterThan(bkList, cTitle, tmp)) {
			System.out.println("All books in the list are greater than " + tmp);
		} else {
			System.out.println("At least book in the list is less than or equal to " + tmp);
		}
		System.out.println("\n(2) Compare by author");
		if (allGreaterThan(bkList, cAuthor, tmp)) {
			System.out.println("All books in the list are greater than " + tmp);
		} else {
			System.out.println("At least book in the list is less than or equal to " + tmp);
		}
		System.out.println("\n(3) Compare by price/number of pages");
		if (allGreaterThan(bkList, cPrice, tmp)) {
			System.out.println("All books in the list are greater than " + tmp);
		} else {
			System.out.println("At least book in the list is less than or equal to " + tmp);
		}

		System.out.println("\nTest atLeastOneGreaterThan");
		tmp = createBook("Algorithms", "Sedgewick", 200, 500);
		System.out.println("(1) Compare by author");
		if (atLeastOneGreaterThan(bkList, cTitle, tmp)) {
			System.out.println("At least one  in the list is greater than " + tmp);
		} else {
			System.out.println("All books in the list are less than or equal to " + tmp);
		}
		System.out.println("\n(2) Compare by author");
		if (atLeastOneGreaterThan(bkList, cAuthor, tmp)) {
			System.out.println("At least one  in the list is greater than " + tmp);
		} else {
			System.out.println("All books in the list are less than or equal to " + tmp);
		}
		System.out.println("\n(3) Compare by price/number of pages");
		if (atLeastOneGreaterThan(bkList, cPrice, tmp)) {
			System.out.println("At least one  in the list is greater than " + tmp);
		} else {
			System.out.println("All books in the list are less than or equal to " + tmp);
		}

		System.out.println("\nDisplay the list of books greater than " + bkArr[9]);
		System.out.println("(1) Compare by title:");
		for (Book b : greaterThan(bkList, cTitle, bkArr[9])) {
			System.out.println(" " + b);
		}
		System.out.println("\n(2) Compare by author:");
		for (Book b : greaterThan(bkList, cAuthor, bkArr[9])) {
			System.out.println(" " + b);
		}
		System.out.println("\n(3) Compare by price/number of pages:");
		for (Book b : greaterThan(bkList, cPrice, bkArr[9])) {
			System.out.println(" " + b);
		}

		System.out.println();
		System.out.println("Display Book List in Descending Order By Title");
		Arrays.sort(bkArr, cTitle);
		displayBookArray(bkArr);

		System.out.println("\nDisplay Book List in Ascending Order By Author");
		Arrays.sort(bkArr, cAuthor);
		displayBookArray(bkArr);
		System.out.println("\nDisplay Book List in Ascending Order By Price/Pages");
		Arrays.sort(bkArr, cPrice);
		displayBookArray(bkArr);
		
		
		

	}
}
