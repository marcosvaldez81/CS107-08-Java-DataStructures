package test2;

import java.util.ArrayList;
import java.util.Arrays;

public class test2 {
	
//	public static int getSumPositive(int[][] arr) {
//		int sum = 0;
//		for(int[] array: arr) {
//			for(int num: array) {
//				if(num > 0) {
//					sum = sum + num;
//				}
//			}
//		}
//		
//		return sum;
//	}
	
//	public static int getRowIndexOfLargestPositive(int[][] arr) {
//		int high = 0;
//		for(int[] array: arr) {
//			for(int num:array) {
//				if(num > high) {
//					high = num;
//				}
//			
//			}
//			
//		}
//		
//	
//	}
	
//	public static int[] getSum(int[][]arr){
//		ArrayList<Integer>array = new ArrayList<>();
//	
//		for(int[] array2: arr) {
//			int sum = 0;
//			for(int num: array2) {
//				sum = sum + num;	
//			}
//			array.add(sum);
//		}
//		
//		int [] finalArray = new int[array.size()];
//		
//		for(int i = 0; i< finalArray.length; i++) {
//			finalArray[i] = array.get(i);
//		}
//		return finalArray;
//	}
	
	
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
	
	public static void main(String[] args) {
		int[][] arr = { {9, 11, 9, 8, 7, 999},
				{2,1500},
				{3,44,8,1000,10},
				{33,20,17} };
		
		int[] arr2 = {1, 2, 3,5,2};
		
		
		
		System.out.println(getLargestPositive(arr2));
		
		System.out.println(getRowIndexOfLargestPositive(arr));
		
		//System.out.println(Arrays.toString(getSum(arr)));
		
//		ArrayList<Integer>array = new ArrayList<>();
//		
//		for(int[] array2: arr) {
//			int sum = 0;
//			for(int num: array2) {
//				sum = sum + num;	
//			}
//			array.add(sum);
//		}
//		Integer num = array.get(0);
//		Integer num2 = array.get(1);
//		Integer num3 = array.get(2);
//		Integer num4 = array.get(3);
//		System.out.println(num);
//		System.out.println(num2);
//		System.out.println(num3);
//		System.out.println(num4);
		

	}

}
