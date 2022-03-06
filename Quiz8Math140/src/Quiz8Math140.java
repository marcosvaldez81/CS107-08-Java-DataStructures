import java.util.Scanner;
public class Quiz8Math140 {
	
	
	public static int methodA(int x) {
		
		int sum = 1;
		
		int base = 4 * x * x * x * x * x;
		int multi = 2 * x * x;
		
		for( int i = 1; i <= 5; i ++) {
			sum = sum + base;
			base = base * multi;
		}
		return sum;
	}
	public static double methodB(double x) {
		double sum = 1.0;
		
		double base = -(x*x) /2.0;
		double multi = -(x*x)/(2.0);
		for(int i = 1; i <= 6; i ++) {
			sum = sum + base;
			base = base * multi;
		}
				
		return sum;
		
	}
	public static int binarySearch(int[] numbers, int numbersSize, int key) { // 0 < numbersSize <= numbers.length
		int mid = 0;
		int low = 0;
		int high = numbersSize - 1;   // position of the last value

		while (high >= low) {
			mid = (high + low) / 2;
			if (numbers[mid] < key) { // all values to the left of mid are less than key; look in the right-side of
										// the array
				low = mid + 1;
			} else if (numbers[mid] > key) { // all values to the right of mid are greater than key; look in the
												// left-side of the array
				high = mid - 1;
			} else {
				return mid;
			}
		}

		return -1; // not found
	}
	
	
	public static void main(String[] args) {
//		String [] arr = {"aaa", "aat", "cat", "dog" ,"ee", "erer", "f", "green", "in", "it", "jta", 
//                "kite", "low", "moat", "nothing", "nsa", "only", "oz",  "pink","plane",
//"sb", "sss", "story", "t", "twelve", "tx", "u", "when", "x", "y", "zebra" };
//		Scanner scnr = new Scanner(System.in);
//		System.out.println("\nEnter an search key\n");
//		int key = scnr.nextInt();
//		int keyIndex = binarySearch(arr, arr.length, key);
//
//		if (keyIndex == -1) {
//			System.out.println(key + " was not found.");
//		} else {
//			System.out.println("Found " + key + " at index " + keyIndex + ".");
//		}
//		scnr.close();
//
//	}
		
		System.out.println(methodB(2));
		System.out.println(methodA(2));
	}
	
}
