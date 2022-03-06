
import java.io.File; 
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class HWSeven {

	public static void main(String[] args) {
		try {
			Scanner scnr = new Scanner(new File("data.txt"));
			int numberInt = scnr.nextInt();
			if (numberInt == 1) {
				System.out.println("Read in " + numberInt + " number");
			} else {
				System.out.println("Read in " + numberInt + " numbers");
			}

			// Declare array whose length = numberInt
			int[] arr = new int[numberInt];
			int sum = 0;
			for (int i = 0; i < numberInt; i++) {
				arr[i] = scnr.nextInt();
			}

			System.out.println("Display the list of numbers\n");
			int numPerRow = 5; // number of integers per row
			for (int i = 0; i < numberInt; i++) {
				System.out.printf("%-5d", arr[i]);
				if ( (i + 1) % numPerRow == 0) {
					System.out.println(); // new line
				}
			}
			
			
			//---------------   Your code should be written between the dashed lines.   
			//                  Do not change any code above the dashed line.
			
			
			//I used these two println() statements to give some output space from data.txt 
			
			System.out.println();
			System.out.println();
			
			
			// This for loop here is finding the largest number in the array "arr"
			
			int maxVal = arr[0];
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] > maxVal) {
					maxVal = arr[i];
				}
			}
			System.out.printf("%s%d%s","The largest value is ", maxVal,".");
			System.out.println();
			
			
			
			// This for loop here is finding the lowest number in the array "arr"
			int lowVal = arr[0];
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] < lowVal) {
					lowVal = arr[i];
				}
			}
			System.out.printf("%s%d%s", "The smallest value is ", lowVal, ".");
			System.out.println();

			
			
			// This for loop here is finding the sum of numbers in the array "arr"
			int totalSum = 0;
			for(int i = 0; i < arr.length; i++) {
				totalSum = totalSum + arr[i];
			}
			System.out.printf("%s%d%s", "The array sum is ", totalSum, ".");
			System.out.println();


			
			//This code section below is computing the average of the array
			double average = 0;
			for(int i = 0; i < arr.length; i++) {
				average = (average + arr[i]);
				
			}
			average = average / (1.0 * arr.length); // Need to divide average by the length outside the loop, thanks for the tip Professor! 
			System.out.printf("%s%.2f%s","The average value is ",average,".");
			System.out.println();
			
			
			
			//The if else tree below is fetching the totalSum variable and checking the condition on if array sum is >100 
			//This totalSum variable was already found doing for loop 2 code blocks above. 
			
			if(totalSum > 100) {
				System.out.printf("%s%s","The array sum is greater than 100: ", "true");
			}else {
				System.out.printf("%s%s","The array sum is greater than 100: ", "false");
			}
			System.out.println();
			
			
			
			//Array below sorts the array so it can be in order and perform the median computations in the if-else blocks
			Arrays.sort(arr);
			
			double median = 0.0;
			
			for(int i =0; i < arr.length; i++) {
				if (arr.length %2==0 ) {
					median = ((double)arr[arr.length/2] + (double)arr[arr.length/2 - 1])/2;
				}else {
					median = (double) arr[arr.length/2];
				}
			}
			System.out.printf("%s%.2f%s","The median value is ", median, ".");
			System.out.println();
			
			
			
			//    ----------------  Do not change code below this line ----------------
			
			scnr.close();
		} catch (Exception e) {
			System.out.println("Input/Output Error");
		}


	}

}
