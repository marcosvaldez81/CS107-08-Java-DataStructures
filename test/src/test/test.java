package test;

import java.util.ArrayList;
import java.util.Arrays;

public class test {
	public static int getSumPositive(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            if (x > 0) {
                sum += x;
            }
        }
        return sum;
    }

    public static int getSumPositive(int[][] arr) {
        int sum = 0;
        for (int[] x : arr) {
            sum += getSumPositive(x);

        }
        return sum;
    }

    public static int getLargestPositive(int[] arr) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (largest <= 0) {
                largest = 0;

            }
        }
        return largest;
    }

    public static int getIndexOfLargestPositive(int[] arr) {
        int index = 0;
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] > arr[index]) {
                index = i;
            }

        }
        return index;
    }

    public static int getRowIndexOfLargestPositive(int[][] arr) {
        int largestIndex = 0;
        int largestValue = 0;
        for (int i = 0; i < arr.length - 1; ++i) {
            if (getLargestPositive(arr[i]) > largestValue) {
                largestValue = getLargestPositive(arr[i]);
                largestIndex = i;

            }
        }
        return largestIndex;

    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; ++i) {
            sum += arr[i];

        }
        return sum;

    }

    public static int[] getSum(int[][] arr) {
        int[] sum = new int[arr.length];
        for (int i = 0; i < arr.length; ++i) {
            sum[i] += getSum(arr[i]);
        }
        return sum;
    }
	
    public int getHighestGrade(int [] grades) {
		int high = 0;
		
		for(int i = 0; i < grades.length; i++) {
			if(grades[i] > grades[high]) {
				high = grades[i];
			}
		}
		
		return high;
	}
    
    
	public static void main(String[] args) {
		 int[][] arr = {{9, 11, 9,  8, 7, 99},
				 {2, 15},{3, 44, 8, 100, 10},{33, 20, 17}};// sum = 70
		 
		
		int [] arr2 = {1,2,3,4};
		
		int[][] arr3 = { {-9, -9 -1}, { }, {-8, -100} };
		
		
		int math = 725 % 5;
		
		System.out.println(725 % 5);
		System.out.println(922 % 5);
		System.out.println(1467 % 5);
		System.out.println(391 % 5);
		System.out.println(1317 % 5);
		
	}

}



/* 
 * 
1)Write a while loop that displays all the multiples of 7 from 14 to 105.
The first few lines of the output should appear as
14
21
28

CODE:
int num = 14;
while(num <= 105) {
	System.out.println(num);
	num = num + 7;
}
---------------------------------------------------------------------------------
2)Write a while loop that displays all powers of 5 from 5 to 3125. (3-pts)The output appears as
5
25
125
625
3125

CODE: 
int num = 5;
while(num <= 3125) {
	System.out.println(num);
	num = num * 5;
}

-------------------------------------------------------------------------------------
Write a Java code segment that implements the following itemsDeclares an int array with exactly 201 elements.
Write a for loop that assigns the following values to element i of the array from step 1


CODE:
int [] arr = new int[201];
for(int i = 0; i < arr.length; i++) {
	if(i %2 == 0) {
		arr[i] = 2* i + 3;
	}else {
		arr[i] = 3* i + 4;
	}
}
		
-------------------------------------------------------------------------------------	
Convert the mathematical expression to a Java expression
a*b + 9/ 7*a

CODE:
(a*b + 9)/(7*a)
-------------------------------------------------------------------------------------
Suppose x is an int variable that has been assigned a value.
Write an if / else if block that displays the following information

if x is a even value and x is not a multiple of 5 display
"Message One"

if x is an odd value and x is not a multiple of 3 display
"Message Two"for all other values display "Message Three"

CODE:
if(x% 2 == 0 && x% 5 != 0) {
	System.out.println("Message One");

}else if(x% 2 == 1 && x% 3 != 0) {
System.out.println("Message Two");

}else{
System.out.println("Message Three");}
-------------------------------------------------------------------------------------
Suppose strArr is an array of String values.
Write a for loop that counts the number of array values that stores the String "cat".

Hint:use the equals method instead of the == operator to compare values.
Suppose str has been assigned the following valueString str = new String("cat");

CODE:

String [] strArr = {"cat", "dog"};
		
		int num = 0;
		for(int i = 0; i < strArr.length; i++) {
			if(strArr[i].equals("cat")) {
				num++;
			}
		}
		System.out.print(num);
		
-------------------------------------------------------------------------------------

Suppose strArr is an array of String values.Write a for loop that counts the sum of the String lengths.
Example:IfString[] strArr = { "cat'", "door", "to", "floor"};
The sum of the String lengths =3 + 4 + 2 + 5 = 14.


CODE:
int sum = 0;
for(int i = 0; i < strArr.length; i++) {
	sum = sum + strArr[i].length();
	
}
System.out.print(sum);

-------------------------------------------------------------------------------------
Write the following method.
public static boolean allOdd(int[] x)
that returns true if every element of x is a odd number. Otherwise, return false.Assume x is not equal to null.

Use one return statement.Do not use break statements.Do not change the counter variable inside a loop.
Your loop should stop if it encounters an even value.
Example:
If x = {5, 9, 3,101}; then allOdd(x) returns true
If x = {7, 2, 3, 101}; then allOdd(x) returns false
CODE:

public static boolean allOdd(int[] x) {
		boolean flag = true;
		int index = 0;
		while(index < x.length && flag) {
			flag = x[index]%2 ==1;
			index++;
		}
		
		return flag;
	}
	
-------------------------------------------------------------------------------------
Write the following method.

public static boolean containsNegativeValue(int[] x)

that returns true if at least one element of x is less than zero. 
Otherwise, return false.
Assume x is not equal to null.
Use one return statement.
Do not use break statements.
Do not change the counter variable inside a loop.
Your loop should stop if it finds a negative value.

If x = {5, 9, 3,101}; then containsNegativeValue(x) returns false
If x = {7, 2, 9. 3, -6,101}; then containsNegativeValue(x) returns true

CODE:
public static boolean containsNegativeValue(int[] x) {
		boolean flag = false;
		int index = 0;
		while(index < x.length && !flag) {
			flag = x[index]<0;
			index++;
		}
		
		return flag;
	}

*/


