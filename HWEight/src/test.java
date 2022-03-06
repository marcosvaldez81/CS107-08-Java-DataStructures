/*Marcos Valdez
 * Math 130-06
 * 11/07/2020
 * 
 */
import java.io.File;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class test {
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
			System.out.println();
			int tmp = 0;
			for(int i = 1 ; i < arr.length; i++) {
				if(arr[i] < arr[tmp]) {
					tmp = i;
					
				}
				int smallest = arr[tmp];
				arr[0] = arr[tmp];
				smallest = arr[0];
				
			}
			System.out.println(Arrays.toString(arr));
			
			/*
			int tmp = arr[0];
			arr[0] = arr[24];
			arr[24] = tmp;
			*/
			/*
			for(int i = 1 ; i < arr.length; i++) {
				if(arr[i] < arr[tmp]) {
					tmp = i;
					
				}
				arr[0] = arr[tmp];
				arr[i] = tmp;
				
			}*/
			System.out.println(Arrays.toString(arr));
		
			// ------------- Do not edit code below this line

			scnr.close(); 
		} catch (Exception e) {
			System.out.println("Input/Output Error");
		}
	}

	

}
