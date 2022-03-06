
public class ArrayClassWorkSheet {

	public static void main(String[] args) {

		/*
		 * 1. Write a for loop that counts the number of values in arr that are greater than 10.
		 * 2.Write a for loop that increases every array element by 1.
		 * 
		 * 3. Write a loop that prints all the values in arr that are multiples of 4.
		 * 
		 * 4. Write a for loop that counts the number of String values whose length equals 4.
		 * 
		 * 5. Write a for loop that appends the character ‘s’ to every String in the array.
		 * 
		 */

		
		
		
		/*1. Write a for loop that counts the number of values in arr that are greater than 10.
		
		int [] arr = {3,4,99,1,100,10,11,10,3,-1,0,70,-2};
		
		int count = 0;
		
		for(int i =0; i < arr.length; i++) {
			if (arr[i] > 10) { 					// i is the location in the array, so when i is ++, and gets to array[2], the statement is true, get it bruh, 
												its the place holder in array, going 1 by 1 inside the array...
				count++;
			}
		}
		System.out.println("Number greater than 10 is: " + count);
		
		*/
		
		
		/* 2.Write a for loop that increases every array element by 1.
		int [] arr = {3,4,99,1,100,10,11,10,3,-1,0,70,-2};
		
		int [] arrTwo = {3,4,99,1,100,10,11,10,3,-1,0,70,-2};
		
		for (int i =0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		for(int i = 0; i < arrTwo.length; i++) {
			arrTwo[i]++;
		}
		
		System.out.println();
		
		for(int i =0; i < arrTwo.length; i++) {
			System.out.print(arrTwo[i] + " ");
		}
		
		*/
		
		
		// 3. Write a loop that prints all the values in arr that are multiples of 4.
		
		
		
		
		
		/* 4. Write a for loop that counts the number of String values whose length equals 4.
		
		String[] arrWords = { "bob", "door", "hello", "wash", "joe", "hi"};
		//int count = 0;
		for(int i = 0; i < arrWords.length; i++) {
			if(arrWords[i].length() == 4) {
				System.out.println(arrWords[i]);
				//count = count+1;
				
				
			}
			
		}
		
		*/
		
		
		/*5. Write a for loop that appends the character ‘s’ to every String in the array.
		
		String [] arrWords  = { "shoe", "door", "shoot", "fall" };
		
		for(int i = 0; i < arrWords.length; i++) {
			System.out.print(arrWords[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < arrWords.length; i++) {
			arrWords[i] = arrWords[i] + "s";
			System.out.print(arrWords[i] + " ");
		}
		
		*/
		
	}

}
