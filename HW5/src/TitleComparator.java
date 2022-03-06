/* Author:  Marcos Valdez, Professor assisted me!
 * Date:  05/17/2021
 * 
 * Purpose:  Implement comparator library to compare Titles of books
 * 
 * */


import java.util.Comparator;

public class TitleComparator implements Comparator <Book> {
	
	/*
	 * Purpose: Compare titles of books
	 * Parameters: bOne and bTwo are inputted values from a array in the main method
	 * Return:  orders Book objects by book titles in descending order
	 * */
	
	public int compare(Book bOne, Book bTwo) {
		int holder = 0;
		
		holder = bTwo.getTitle().compareTo(bOne.getTitle()) ;
			
		return holder;
	}


}
