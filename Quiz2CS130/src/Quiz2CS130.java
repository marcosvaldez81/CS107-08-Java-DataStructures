import java.util.Arrays;

public class Quiz2CS130 {
	
	public static int getNumPositive(int[] x) {
		int count = 0;
		
		for(int num: x) {
			if(num > 0) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		String[] x = {"xy", "abc", "door", "hello", "two", "school", "plus", "zebra", "Michigan", "building"}; 
		String [] z = new String[40];
		System.arraycopy(x, 7, z, 37, 3);
		
		
		System.out.println(Arrays.toString(z));
	}
}





//This method returns the number of String objects in strArraywhose length is less than 4 or greater than 8.
//String[]strArray = {"cat", "books", "abc", "houses", "paintings", "to"};
//public static int getNumLessThan4OrMoreThan8(String[]strArray) {
//	int count = 0;
//	for(String x: strArray) {
//		if(x.length() < 4 || x.length() > 8) {
//			count++;
//		}
//	}
//	
//	return count;
//}
//

//---------------------------------------------------------------------------------

//This method returns the number of one dimensional arrays in x whose length equals 3
//public static int numLengthEqualTo3(int[][]x) {
//	int count = 0;
//	for(int[] single: x) {
//		if(single.length == 3) {
//			count++;
//		}
//	}
//	
//	return count;
//}

//---------------------------------------------------------------------------------
//Use System.arraycopy tocopy all elements of x into y.
//int[] x = new int[100];
//for (int i = 0; i < x.length; i++){
//	x[i] = i + 9;
//}
//int[] y = new int[100];
//
//System.arraycopy(x, 0, y, 0, x.length);
//---------------------------------------------------------------------------------

//Use System.arraycopy to copy elements 21 to 42of x into elements 11 to 32 of y.
//int[] x = new int[50];
//for (int i = 0; i < x.length; i++){
//	x[i] = i + 3;
//}
//int[] y = new int[50];
//System.arraycopy(x,21,y,11, 22);
//System.out.print(Arrays.toString(y));

//---------------------------------------------------------------------------------

//Use System.arraycopy to copy elements 57 to 61 of x into elements44 to 48 of x
//int[] x = new int[200];
//for (int i = 0; i < x.length; i++) {
//	x[i] = 2 * i;
//}
//System.arraycopy(x, 57, x, 44, 5);

//---------------------------------------------------------------------------------
//Determine if the following code segments satisfies one of the following conditions: 
//index out of bounds error or no error.

//int[] arr = {0, 0, 0, 5, 3, 2, 0, 9, 8, 3};
//int[] z = new int[arr.length];
//System.arraycopy(arr, 2, z, 5, 6);  --> solution out of bounds!

//---------------------------------------------------------------------------------
//Determine if the following code segments satisfies one of the following conditions: 
//index out of bounds error or no error.
//int[] arr = {0, 0, 0, 5, 3, 2, 0, 9, 8, 3};
//int[] z = new int[arr.length];
//System.arraycopy(arr, 2, z, 4, 6);
//Solution:  No error

//---------------------------------------------------------------------------------
//Determine if the following code segments satisfies one of the following conditions: 
//index out of bounds error or no error.
//int[] arr = {0, 0, 0, 5, 3, 2, 0, 9, 8, 3};
//int[] z = new int[arr.length];
//System.arraycopy(arr, 2, z, 0, 9);
//Solution:index out of bounds;  The method call tries to copy a value into arr[10] into z.  
//We get an error since arr[10] doesn’t exist.

//---------------------------------------------------------------------------------
//Determine if the following code segments satisfies one of the following conditions: 
//index out of bounds error or no error.

//int[] arr = {0, 0, 0, 5, 3, 2, 0, 9, 8, 3};
//int[] z = new int[15];
//System.arraycopy(arr, 5, z, 12, 3);
//Solution:  no error

//---------------------------------------------------------------------------------

// using--> String[]  strArray = {"cat", "Books", "Abc", "houses",  "Aim", "paintings", "to", "aaa", "Boat"};
//public static int numFirstCharAOrB(String[]  strArray) {
//
//int count = 0;
//for(String num: strArray) {
//	if(num.charAt(0) == 'A' || num.charAt(0) == 'B') {
//		count++;
//	}
//}
//
//return count;
//}

//---------------------------------------------------------------------------------
// using--> int[] x = {1001,  38,   13,   202,   105,  1880, 11021}; returns 5
//public static int  numOnesPlaceLessThan4(int[]   x) {
//int count = 0;
//
//for(int num: x) {	 
//	int ones = (num/1) %10;
//	
//	if(ones < 4) {
//		count++;
//	}
//}
//return count;
//}
