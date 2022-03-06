import java.util.ArrayList;

public class Math140HWOne {
	
	public static int getSumPositive(int[] arr) {
		int sum = 0;
		
		for(int number: arr) {
			if(number >=0 ) {
				sum = sum + number;
			}
		}
		return sum;
	}
	
	public static int getSumPositive(int[][] arr) {
		int sum = 0;
		
		for(int [] array: arr) {
			sum = sum + getSumPositive(array);
		}
		
		return sum;
	}
	
	public static int getLargestPositive(int[] arr) {
		int max = arr[0];
		
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < 0) {
				count++;
			}
		}
		if(count == arr.length) {
			max = 0;
		}
		return max;
	}
	
	public static int getIndexOfLargestPositive(int[] arr) {
		int num = arr[0];
		int index = 0;
		
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > num) {
				index = i;
				num = arr[i];
				
			}if(arr[i] < 0) {
				count++;
			}
		}
		if(count == arr.length) {
			index = -1;
		}
		return index;
	}
	
	public static int getRowIndexOfLargestPositive(int[][] arr) {
		int largestIndex = 0;
		int largestValue = 0;
		
		for(int i = 0; i< arr.length -1; i++) {
			if(getLargestPositive(arr[i]) > largestValue) {
				largestValue = getLargestPositive(arr[i]);
				largestIndex = i;
			}
			
		}
	
		return largestIndex;
	}
	
	
	public static int getSum(int[] arr) {
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > 0 || arr[i] < 0) {
				sum = sum + arr[i];
			}
		}
		
		return sum;
	}
	
	public static int[] getSum(int[][]arr){
		
		int[] arr2 = new int [arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			int sum = 0;
			sum = sum + getSum(arr[i]);
			arr2[i] = sum;
		}
		
		return arr2;
	}
	
	

	public static void displayLargestPositive(String arrayName, int[] arr) {
		int largest = getLargestPositive(arr);
		if (largest == 0) {
			System.out.println(arrayName + " doesn't contain positive values");
		}
		else {
			System.out.println("Largest positive value in " + arrayName + " is " + largest);
		}
	}
	public static void displayIndexLargestPositive(String arrayName, int[] arr) {
		int index = getIndexOfLargestPositive(arr);
		if (index == -1) {
			System.out.println(arrayName + " doesn't contain positive values");
		}
		else {
			System.out.println("Index of largest positive value in " + arrayName + " is " + index);
		}
	}
	
	public static void displayRowIndexOfLargestPositive(String arrayName, int[][] arr) {
		int index = getRowIndexOfLargestPositive(arr);
		if (index == -1) {
			System.out.println(arrayName + ": return -1 since the array doesn't contain positive values");
		}
		else {
			System.out.println("Row containing the largest positive value in " + arrayName + " is " + index);
		}
	}
	
	
	public static void main(String[] args) {
		int[] arrOne = {0, -9, -10,  -11, 0, -51};
		
		int[] arrTwo = {11, -11, 2, -1, -1, 20, -10,  -10, 2, 100, 0};
		System.out.println("Test 1-D getSumPositive method:");
		System.out.println("Sum of the positive values in arrOne: " + getSumPositive(arrOne));
		System.out.println("Sum of the positive values in arrTwo: " + getSumPositive(arrTwo) + "\n");
		
		int[][] arr2DOne = {arrOne, {-99}, {0, 0, 0, -1, -40}};
		
		int[][] arr2DTwo = {{13, -9, 11, -9, 9,  8, 7, -15, -90,  99},
                {-4, 2, 500, 15},
                {0, -1, -9},
                {3, 44, 8, 100, -8, 10},
                {33, 20, 17}};
		System.out.println("\nTest 2-D getSumPositive method:");
		System.out.println("Sum of the positive values in arr2DOne: " + getSumPositive(arr2DOne));
		System.out.println("Sum of the positive values in arr2DTwo: " + getSumPositive(arr2DTwo) + "\n");
	
		System.out.println("\nTest getLargestPositive method:");
		displayLargestPositive("arrOne", arrOne);
		displayLargestPositive("arrTwo", arrTwo);
		System.out.println("\nTest getIndexOfLargestPositive method:");
		displayIndexLargestPositive("arrOne", arrOne);
		displayIndexLargestPositive("arrTwo", arrTwo);
		System.out.println("\nTest getRowIndexOfLargestPositive method:");
		displayRowIndexOfLargestPositive("arr2DOne", arr2DOne);
		displayRowIndexOfLargestPositive("arr2DTwo", arr2DTwo);
		arr2DTwo[1] = arrOne;
		displayRowIndexOfLargestPositive("arr2DTwo", arr2DTwo);
		
		
		System.out.println("\nDisplaying row sums of arr2DTwo with 1-D getSum method:");
		for(int i = 0; i < arr2DTwo.length; i++) {
			System.out.println("Sum of row " + i + " in arr2DTwo = " + getSum(arr2DTwo[i]));
		}
		
		System.out.println("\nDisplaying row sums of arr2DTwo with 2-D getSum method:");
		int[] arrSum = getSum(arr2DTwo);
		for(int i = 0; i < arrSum.length; i++) {
			System.out.println("Sum of the values in row " + i + " = " + arrSum[i]);
		}

	}

}
