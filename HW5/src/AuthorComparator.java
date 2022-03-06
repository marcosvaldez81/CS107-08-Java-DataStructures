/* Author:  Marcos Valdez, Professor assisted me!
 * Date:  05/17/2021
 * 
 * Purpose:  Implement comparator library to compare authors names
 * 
 * */


import java.util.Comparator;
import java.util.Arrays;

public class AuthorComparator implements Comparator <Book>{
	
	
	/*
	 * Purpose: Compare authors of books
	 * Parameters: bOne and bTwo are inputted values from a array in the main method
	 * Return:  orders Book objects by author name in ascending order
	 * 
	 * */
	
	public int compare(Book bOne, Book bTwo) {
		int holder = 0;


		holder = bOne.getAuthor().compareTo(bTwo.getAuthor());
		

		return holder;
	}
	

}
