
/*
 * Marcos Valdez   
 * Math 130-06
 * 10/03/2020
*/
import java.util.Scanner;

public class CountEvenDigits {

	public static void main(String[] args) {
		// basic scanner function
		Scanner in = new Scanner(System.in);
		int input1;

		// fetching user input
		System.out.print("Please enter an integer: ");
		input1 = in.nextInt();

		// variable storage for ints and later used for computation
		int evenCount = 0;
		int save = input1;
		int oddCount = 0;
		int zeroCount = 0;

		// while loop iterating through user input
		while (input1 > 0) {
			// these if-else if blocks are counting the even,odd, and zero counts
			if ((input1 % 2) == 0) {
				evenCount++;

			} else if ((input1 % 10) == 0) {
				zeroCount++;

			} else {
				oddCount++;
			}
			input1 /= 10;

		}
		
		// this if block below is the computation and delivers the desired output as
		// professor asks

		if ((input1 % 2) == 0) {

			if (evenCount == 1) {
				if (zeroCount == 1) {
					evenCount = evenCount + zeroCount;
					System.out.printf("%d %s%d%s", save, "has ", evenCount, " even digits.");
				} else {
					System.out.printf("%d %s%d%s", save, "has ", evenCount, " even digit.");
				}
			} else if (evenCount > 1) {
				if (zeroCount >= 1) {
					evenCount = evenCount + zeroCount;
					System.out.printf("%d %s%d%s", save, "has ", evenCount, " even digits.");
				} else {
					System.out.printf("%d %s%d%s", save, "has ", evenCount, " even digits.");
				}

			} else {
				System.out.printf("%d%s", save, " has no even digits.");
			}

		}

	}

}
