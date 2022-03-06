/*Marcos Valdez
 * Math 130-06
 * 11/07/2020
 * 
 */
import java.io.File;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class HWEight {
	
	// to display in console as desired
		public static void display(int[] arr) {
			int numPerRow = 6; // number of integers per row
			for (int i = 0; i < arr.length; i++) {
				System.out.printf("%-6d", arr[i]);
				if ( (i + 1) % numPerRow == 0) {
					System.out.println(); // new line
				}
			}
		}
		
		//fetching largest number in array 
		public static int getLargest(int[] arr) {
			int largest = arr[0];
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] > largest) {
					largest = arr[i];
				}
			}
			return largest;
		}
		
		//fetching smallest number in array 
		public static int getSmallest(int[] arr) {
			int smallest = arr[0];
			for(int i = 0; i < arr.length;i++) {
				if(arr[i] < smallest) {
					smallest = arr[i];
				}
			}
			return smallest;
		}
		
		//computing the sum of the array
		public static int getSum(int[] arr) {
			int sum = 0;
			for(int i = 0; i < arr.length; i++) {
				sum = sum + arr[i];
			}
			return sum;
		}
		
		//computing the average of the array 
		public static double getAverage(int[] arr) {
			double average = 0;
			double fetch = arr.length;
			for(int i = 0; i < arr.length; i++) {
				average = average + arr[i];
				
			}
			average = (average) /  ( fetch);
			average = Math.round(average * 100.0)/ 100.0;
			return average;
		}
		
		//copying original array as a copy
		public static int[] getCopy(int[] arr) {
			int [] tmp = new int [arr.length];
			
			for(int i = 0; i < arr.length; i++) {
				tmp[i] = arr[i];
				
			}
			return tmp;
		}
		
		//placing all odd numbers to the left and even to the right
		public static int[] partition(int[] arr) {
			
			int [] tmp = getCopy(arr); 
			int left = 0;
			int right = arr.length - 1;
			
		
			for(int i = 0; i < tmp.length; i++) {
				if(tmp[i] %2 != 0) {
					tmp[left] = arr[i];
					left++;
				}else {
					tmp[right] = tmp[i];
					right--;
				}
			}
			return tmp;
		} 
		
		// computing the median of the array 
		public static double getMedian(int[] arr) {
			int [] tmp = getCopy(arr);
			double median = 0;
			Arrays.sort(tmp);
			if(tmp.length %2 != 0) {
				median = ((double)tmp[tmp.length/2] + (double)tmp[tmp.length/2 - 1])/2;
				
			}
			if(tmp.length %2 == 0) {
				median = ((double)tmp[tmp.length/2] + (double)tmp[tmp.length/2 - 1])/2;
			}
			return median;
		} 
		
		// moving smallest number to the left [0]
		
		public static void moveSmallestToLeft(int[] arr) {
			
			int tmp = 0;
			for(int i = 1 ; i < arr.length; i++) {
				if(arr[i] < arr[tmp]) {
					tmp = i;
				}
			}
			int smallest = arr[tmp];
			arr[tmp] = arr[0];
			arr[0] = smallest;
			
		}
	
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
			for (int i = 0; i < numberInt; i++) {
				arr[i] = scnr.nextInt();
			}
			
			System.out.println("\nOriginal Values");
			
			/*  IMPORTANT 1: Do not change code in the main method that is above this comment */
			
			/* IMPORTANT 2:   convert the statements below to executable
			 *                code after writing the display and getLargest methods */
			
			
			//outputs below are to satisfy requirements as stated in hw instructions 
			
			display(arr); 
			System.out.println();
			System.out.println("\nLargest value in arr is " + getLargest(arr) + ".");
			
			System.out.println("Smallest value in arr is " + getSmallest(arr) + ".");
			System.out.println("The array sum is " + getSum(arr) + ".");
			System.out.println("The average value is " + getAverage(arr) + ".");
			System.out.println("The median value is " + getMedian(arr) + ".");
			
			System.out.println();
			System.out.println("Display the odd values and then the even values.");
			display(partition(arr));
			System.out.println();
			System.out.println();
			System.out.println("Display original values to verify the order hasn't been changed. ");
			display(getCopy(arr));
			
			System.out.println();
			System.out.println();
			System.out.println("Display after exchanging arr[0] with the smallest value.");
			moveSmallestToLeft(arr);
			display(arr);

			
			// ------------- Do not edit code below this line

			scnr.close(); 
		} catch (Exception e) {
			System.out.println("Input/Output Error");
		}

	}

}
