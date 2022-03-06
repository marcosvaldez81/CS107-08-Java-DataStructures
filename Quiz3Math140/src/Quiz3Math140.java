import java.util.Arrays;

public class Quiz3Math140 {
	
//	public static int numAorZ(String[][] strArr) {
//		
//		int count = 0;
//		for(String[] word: strArr) {
//			for(String word2: word) {
//				if(word2.charAt(0) == 'A' || word2.charAt(0) == 'Z') {
//					count++;
//				}
//			}
//		}
//		
//		return count;
//	}
	
	
//	 public static int sumOnesPlace(int[][] arr) {
//		 
//		 int sum = 0;
//		 
//		 for(int [] row: arr) {
//			 for(int num: row) {
//				 sum = sum + (num/1)%10;
//			 }
//		 }
//		 return sum;
//		 
//	 }
	
//	public static int numEqualToCatOrLength4(String[][] strArr) {
//		int num = -1;
//		
//		for(String [] row: strArr) {
//			for(String word: row) {
//				if(word == "Cat" || word.length() == 4) {
//					num++;
//				}
//			}
//		}
//		
//		return num;
//
//	}
	
	
	
	public static void main(String[] args) {
		
	}

}

/*
 * 
 * Use the System.arraycopymethod to perform the following operationsa.
 * Copy all the elements of s into t.  
 *  b.Copy elements 11 to 29 of s into elements 3 to 21 of t.c.
 *  Copy elements  8 to 14 of s into elements 5 to 11 of s.d.
 *  Copy elements  5to 11of s into elements 8to 14of s.(new problem)

int[] s = new int[30];
for (int i = 0; i < s.length; i++){
	s[i] = 2*i;
}     
int[] t = new int[30];

System.arraycopy(s,0 , t, 0, s.length);

System.out.println(Arrays.toString(t));

System.arraycopy(s, 11, t, 3, 19);

System.out.println(Arrays.toString(t));

System.arraycopy(s, 5, s, 8, 7);


------------------------------------------------------------
// public static double getAverage(int[] x) –return the average of the values stored in x
public static double getAverage(int[] x) {
		int avg = 0;
		
		for(int num: x) {
			avg = (avg + num);
		}
		avg = avg/x.length;
		return avg;
	}
	
	
	int [] arr = {1,2,3,4,5,6,7};
	System.out.println(getAverage(arr));
------------------------------------------------------------
Write a method with the header --> get largest value in x

public static int getLargest(int[] x) {
		int large = x[0];
		
		for(int num: x) {
			if(num > large) {
				large = num;
			}
		}
		return large;
	}
------------------------------------------------------------
public static int getLargestRowLength(int[][] x) –return the length of the largest row.  
Assume x is not set to null and all rows of x not set to null.

public static int getLargestRowLength(int[][] x) {
		
		int row1 = 0;
		
		for(int [] row:x) {
			if(row.length > row1) {
				row1 = row.length;
			}
		}
		
		return row1;
	}
	
------------------------------------------------------------
If arr is set to null then return -1. 
Otherwise, the method returns the total number of elements in the two-dimensional array. 
Do not use a nested loop to compute the correct value. 
 Instead, use a single loopand the length property for each row in the array. 
  Use a for each loop.

public static int numElements(Object[][] arr) {
	
	int sum = -1;
	
	if(arr != null) {
		sum = 0;
		for(Object [] obj: arr) {
			sum = sum + obj.length;
		}
	}
	
	return sum;
}
*/