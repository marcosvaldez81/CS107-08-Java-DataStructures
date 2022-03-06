
/* Marcos Valdez  
 * Math 130-06
 * 10/12/2020
 * 
 * */
import java.util.Scanner;

public class HWSix {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);// scanner

		int quarts;
		
		//fetches the input
		System.out.print("Please enter the number of quarts purchased:  "); 
		quarts = in.nextInt();
		
		//conversions below for gallons and quarts
		
		int gallons = quarts / 4;
		int quart = quarts % 4;
		
		//below is the if and else if code tree to sort and send output fitting correct conversion

		if (quarts == 0) {
			System.out.printf("%s%d%s", "A job that needs ", quarts, " quarts requires 0 gallons plus 0 quarts.");
			
		} else if (quarts == 1) {
			System.out.printf("%s%d%s%d%s%d%s", "A job that needs ", quarts, " quart requires ", gallons,
					" gallons plus ", quart, " quart.");
			
		} else if (quarts <= 3 && quarts > 1) {
			System.out.printf("%s%d%s%d%s%d%s", "A job that needs ", quarts, " quarts requires ", gallons,
					" gallons plus ", quart, " quarts.");
			
		} else if (quarts == 4) {
			System.out.printf("%s%d%s%d%s%d%s", "A job that needs ", quarts, " quarts requires ", gallons,
					" gallon plus ", quart, " quarts.");
			
		} else {
			
			if (quart == 1) {
				System.out.printf("%s%d%s%d%s%d%s", "A job that needs ", quarts, " quarts requires ", gallons,
						" gallons plus ", quart, " quart.");
				
			} else {
				System.out.printf("%s%d%s%d%s%d%s", "A job that needs ", quarts, " quarts requires ", gallons,
						" gallons plus ", quart, " quarts.");
			}
		}

	}

}
