import java.util.Arrays;

public class Midterm2 {
	
	/*HARD PROb
	 * 
	 * Write a method with the header

  		public static int  sumLastDigit4(int[] arr)

		that returns the sum of the values in arr with 4 as the number in the one's place.  
		
		( Find the number in the one's place by computing the remainder when dividing by 10)
		
		 
		
		Example: 
		
		if arr = {100,  24,  1,  49, 52, 34, 9,  54}     //  24, 34, and 54 satisfy the condition
		
		then
		
		sumLastDigit4(arr) = 24 + 34 + 54 = 112
		----------------------------------------------
		
		
	 * 
	 * 
	 */
	
	
	  public static int  sumLastDigit4(int[] arr) {
		  int sum = 0;
		  
		  for(int i = 0; i < arr.length; i++) {
			  if (arr[i] %10 == 4) {
				  sum = sum + arr[i];
			  }
		  }
		  return sum;
	  }
	

	public static void main(String[] args) {
		
		int [] arr = {100,  24,  1,  49, 52, 34, 9,  54};
		
		System.out.println(sumLastDigit4(arr));
	}
}


/*
 * PROBLEM 1
 * Write a method that converts meters and kilometers to centimeters. The method header is

public static int convertToCentimeters(int meters, int kilometers)

 

Example:  There are 100 centimeters in a  meter and 100,000 centimeters in a kilometer.

Therefore convertToCentimeters(3, 5) returns 100*3 + 100000*5 = 500300

 
 */

/* ANSWER
public static int convertToCentimeters(int meters, int kilometers) {
	int meterC = 100;
	int kiloC = 100000;
	
	int conversion = (meters * meterC ) + (kilometers* kiloC);
	
	return conversion;
}

*/






/* Problem 2
 * Write a method with the header

public static double distance(int x1, int y1, int x2, int y2)

that returns the distance between the ordered pairs.

 
public static double distance(int x1, int y1, int x2, int y2) {
		
		double conversion = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1-y2,2));
		
		return conversion;
	}


*/





/* PROBLEM 7
 * Write a method with the header

    public static int  numOneorTwo(int[][] arrTwoD)   // two-dim array

that returns the number of values in arrTwoD that are equal to 1 or 2.

 

Example:  

If arrTwoD = { {2, 7, 2, 9},

                       {0,  5, 2, 1},

                      {1, 2, 4, 3, 1}};

 

then numOneorTwo(arrTwoD)  returns 7  since there are three 1's and  four 2's.
------------------------------------------------------------------------------------



public static int  numOneorTwo(int[][] arrTwoD) {
		int count = 0;
		for(int row = 0; row < arrTwoD.length; row++) {
			for(int col = 0; col < arrTwoD[row].length; col++) {
				if(arrTwoD[row][col] == 1) {
					count++;
				}
				
				if(arrTwoD[row][col] == 2) {
					count++;
				} 
				
			}
		}
		
		return count;
	}


*/




/* P 8

Write a method with the header

public static int  numLessThan5orGreaterThan80(int[] arr)

that returns the number of values in arr that are less than 5 or greater than 80



Example: 

if arr = {100,  2,  -3,  49, 52, 34, 4}     // 100, 2, -3, and 4 satisfies the condition

then

numLessThan5orGreaterThan80((arr) returns 4 

--------------------------------------------------------------------------------------------------


public static int  numLessThan5orGreaterThan80(int[] arr) {

int count = 0;
for(int i = 0; i < arr.length; i++) {
	if (arr[i] < 5) {
		count++;
	}
	
	if (arr[i] > 80) {
		count++;
	}
}

return count;
}

*/

/*
 * Problem 11
 * 
 * Write a for loop that adds 5 to the values stored at odd numbered  indices.

		Example: If
		int[] arr = {7, 1, 3, 51, 1, 11, 5, 8, 1, 10, 8};
		
		then the loop changes the values of arr to
		
		{7, 6, 3, 56, 1, 16, 5, 13, 1, 15, 8}
		
		
		----Code starts here; Write the loop in the textbox.
		
		int[] arr = {7, 1, 3, 51, 1, 11, 5, 8, 1, 10, 8};
	---------------------------------------------------------------------
 * 

 * int[] arr = {7, 1, 3, 51, 1, 11, 5, 8, 1, 10, 8};
		for(int i = 0; i < arr.length; i++) {
			if (i %2 != 0) {
				arr[i] = arr[i] + 5;
			}
		}
		System.out.print(Arrays.toString(arr));

 */




/* HARD PROBLEM 
 * Write a for loop that counts the number of Strings whose first character or  last character is 'A'.

	Example: If
	String[] strArr = {"yxA", "bat", "ABC", "television", "At", "zebras", "cat", "XYZA", "one"};
	then count = 4 since the first or last character of "xyA", "ABC", "At", and "XYZA" is the character 'A'
	
	Reminder: 
	
	the 1st character of a String at index i is given by strArr[i].charAt(0)
	
	the last character of a String at index i is given by strArr[i].charAt(strArr[i].length() -1)
	
	-------------------------------------------------------------------------------------------------------
	
	String[] strArr = {"yxA", "bat", "ABC", "television", "At", "zebras", "cat", "XYZA", "one"};
		
		int count = 0;
		
		for(int i = 0; i < strArr.length;i++) {
			char a = 'A';
			if(a == strArr[i].charAt(0) || a == strArr[i].charAt(strArr[i].length() -1)) {
				count++;
			}
		}
		System.out.print(count);

 * 
 * 
 */





