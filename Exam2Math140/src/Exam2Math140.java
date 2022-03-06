
public class Exam2Math140 {

	
	public static double methodA(double x) {
		double sum = 4.0;
		
		double base = 8 * x * x * x * x;
		double multi = 2 * x * x * x * x;
		
		for( int i = 1; i <= 5; i ++) {
			sum = -sum + base;
			base = base * multi;
		}
		
		return sum/100; // makes the cleaner output
		
	}
	
	public static double methodC(double x){

		double sum = -3;

		double base = ( 6 * x * x * x);

		double multiplier = (  - 2 * x * x * x);

		for( int i = 1; i <= 5; i++) {

		sum = sum + base;

		base = base * multiplier;

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
		
		System.out.println(methodA(2));
		System.out.println(methodC(2));
	}

}
