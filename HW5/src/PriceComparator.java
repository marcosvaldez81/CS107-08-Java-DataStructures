/* Author:  Marcos Valdez, Professor assisted me!
 * Date:  05/17/2021
 * 
 * Purpose:  Implement comparator library to compare Prices
 * 
 * */

import java.util.Comparator;

public class PriceComparator implements Comparator <Book>{
	/*
	 * Purpose: Compare Prices of books
	 * Parameters: bOne and bTwo are inputted values from a array in the main method
	 * Return:  orders Book objects by price in ascending order, and or book pages
	 * 
	 * */
	
	public int compare(Book bOne, Book bTwo) {
		
		int holder = 0;
		holder = bOne.getPrice() - bTwo.getPrice();
		
		
		// this if block will do ascending order by numPages if the prices are the same. 
		if(bOne.getPrice() - bTwo.getPrice() == 0) {
			holder = bOne.getNumPages() - bTwo.getNumPages();
		}

		return holder;
	}

	public static void main(String[] args) {
	

	}

}
