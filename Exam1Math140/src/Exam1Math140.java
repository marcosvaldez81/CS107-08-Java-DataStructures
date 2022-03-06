import java.util.Arrays;

public class Exam1Math140 {
	
	public static int numAorZ(String[][] strArr) {
		int count = 0;
		
		for(String [] arr:strArr) {
			for(String word:arr) {
				if(word.charAt(0) == 'A' || word.charAt(0) == 'Z' ) {
					count++;
				}
			}
		}
		
		
		return count;
		
	}
	public static int numLengthGreater4AndLess10(String[][] strArr) {
		int count = 0;
		
		for(String [] arr: strArr) {
			for(String word: arr) {
				if(word.length() > 4 && word.length() < 10 ) {
					count++;
				}
			}
		}
		return count;
	}
	
	
	public static boolean allStringsEqualCat(String[] x) {
		boolean flag = true;
		
		int index = 0;
		
		while(index < x.length && flag) {
			flag = x[index] == "Cat";
			index++;
		}	
		return flag;
	}
	
	
	public static boolean greaterThanValue(int[] arr,  int value) {
		boolean flag = true;
		
		int holder = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > value) {
				holder = arr[i];
			}
		}
		flag = holder > value;
		return flag;
	}
	public static void main(String[] args) {
		
//		String [] [] x = { {"abc", "12345", "678912"},
//                {"to", "books", "123456789012"},
//                {"a", "story", "d"} };
		
		String [] arr =  {"Cat", "Dog",  "Cat"} ;
		int[] x = {9,  2,  34,   23, 11};
		//System.out.println(numLengthGreater4AndLess10(x));
		//System.out.println(allStringsEqualCat(arr));
		System.out.println(greaterThanValue(x, 44));
	}

}


/*
Write a while loop that displays all multiples 
of 6 from 330 down to 18
The first few lines of the output should appear as
330
324
318

int num = 330;

while(18 <= num) {
	System.out.println(num);
	num = num - 6;
}

*/

//---------------------------------------------------------------


/*
 * Write a while loop that displays all powers of
 * 4 from 4 to 16384 except for 256.
 * 
 */

//int num = 4;
//
//while(num <= 16384) {
//	System.out.println(num);
//	num = num * 4;
//	if(num == 256) {
//		num = num * 4;
//	}
//	
//}


//---------------------------------------------------------------

/*
Write a Java code segment that implements the following items 
Declares an int array with exactly 1000 elements.
2.Write a for loop that assigns the following values to element i of the array from step 1

2i if i is greater than or equal to 50 and less than 100

6 if i is less than 50 or greater than or equal to 100
int[] arr = new int [1000];

for(int i = 0; i < arr.length; i++) {
	if(i >= 50 && i <100) {
		arr[i] = i * 2;
	}
	if(i < 50 || i >= 100) {
		arr[i] = 6;
	}
}
*/

//---------------------------------------------------------------

//Suppose x is an int variable that has been assigned a value.
//Write an if / else if block that displays the following information:
//
//	if the digit inthe 1's place is equal to 1 or 2 display "1 or 2" 
//	if the digit in the 1's place is equal to 3 or 4 
//	display "3 or 4"otherwise display "greater than 4"

//int x = 5701;
//
//if (x %10 == 1 || x %10 == 2 ) {
//	System.out.println("1 or 2");
//}else if(x % 10 == 3 || x % 10 == 4 ) {
//	System.out.println("3 or 4");
//}else {
//	System.out.println("greater than 4");
//}


//---------------------------------------------------------------
//Suppose strArr is an array of String values.
//Write a for loop that counts the number of String values whose length is greater than 5.

//String[] strArr = { "cat'", "tomorrow", "to", "schools", "red", "seventh"};
//
//int count = 0;
//for(int i = 0; i < strArr.length; i++) {
//	if(strArr[i].length() > 5) {
//		count++;
//	}
//
//}
//System.out.println(count);

//---------------------------------------------------------------

//Suppose strArr is an array of String values.
//Write a for loop that counts the number of String values whose first character is equal to 'B'

//String[] strArr = { "cat", "Boat", "to", "floor", "Bring", "bbb"};
//int count = 0;
//for(int i = 0; i < strArr.length; i++) {
//	if(strArr[i].charAt(0) == 'B') {
//		count++;
//	}
//}
//System.out.println(count);

//---------------------------------------------------------------

//Write the following method.
//public static boolean allEvenOrFive(int[] x)
//that returns true if every element of x is an even integer or equal to 5. 
//Otherwise, return false.Assume x is not equal to null.
//Use one return statement.Do not use break or continue statements.
//Do not change the counter variable inside a loop.
//Your loop should stop if it encounters an odd value not equal to 5.


//public static boolean allEvenOrFive(int[] x) {
//	boolean flag = true;
//	
//	int index = 0;
//	
//	while(index < x.length && flag) {
//		flag = x[index] %2 == 0 || x[index] ==5;
//		index++;
//	}
//	
//	return flag;
//}


//---------------------------------------------------------------

//Write the following method.
//public static boolean containsMultipleOfSeven(int[] x)
//that returns true if at least one element of x is a multiple of seven. 
//Otherwise, return false.Assume x is not equal to null.
//Use one return statement.Do not use break or continue statements.
//Do not change the counter variable inside a loop.
//Your loop should stop if it finds a value that is a multiple of 7.
//public static boolean containsMultipleOfSeven(int[] x) {
//	boolean flag = true;
//	
//	int index = 0;
//	
//	while(index < x.length) {
//		flag = x[index] %7 ==0;
//		index++;
//	}
//	
//	return flag;
//}


//---------------------------------------------------------------

/*
This method returns the number of String objects in strArray whose first character is 'A' or 'B'
Example:IfString[]strArray = {"cat", "Books", "Abc", "houses","Aim", "paintings", "to", "aaa", "Boat"};
then your method returns 4 since the 1st character of "Books", "Abc", "Aim", and "Boat" is either 'A' or 'B'.


public static int numFirstCharAOrB(String[]strArray) {
	int count = 0;
	
	for(String word:strArray) {
		if(word.charAt(0) == 'A' || word.charAt(0) == 'B' ) {
			count++;
		}
	}
	
	return count;
	
}
*/

//---------------------------------------------------------------


/*
//This method returns the number of elements in x where the digit in the 1's place is less than 4.
public static int numOnesPlaceLessThan4(int[]x) {
	int count = 0;
	
	for(int num: x) {
		if(num %10 < 4) {
			count++;
		}
	}
	return count;
	
} */