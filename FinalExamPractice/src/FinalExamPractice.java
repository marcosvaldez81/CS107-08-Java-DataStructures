
public class FinalExamPractice {
	
	
	public static int numLengthGreater4AndLess10(String[][] strArr) {
		//that return the number of String values in strArr with a length greater than 4 and less than 10
		
		int count = 0;
		
		for(int row = 0; row < strArr.length; row++) {
			
			for(int col = 0; col < strArr[row].length; col++) {
				
				if(strArr[row][col].length() > 4 && strArr[row][col].length() < 10) {
					count++;
				}
				
			}
			
		}
		
		return count;
		
		
	}
	//---------------------
	
	
	public static boolean allStringsEqualCat(String[] x) {
		
		boolean flag = true;
		
		int count = 0;
		
		while(count < x.length && flag) {
			flag = x[count] == "Cat";
			count++;
		}
		
		
		
		return flag;
		
		
	}
	//------------------------------
	
	
	public static boolean greaterThanValue(int[] arr, int value) {
		
		boolean flag = false;
		
		int count = 0;
		for(int i = 0; i< arr.length &&!flag; i++) {
			if(arr[i] > value) {
				count++;
			}
			
			
		}
		if(count >= 1) {
			flag = true;
		}
		return flag;
		
	}
	
	//--------------------
	
	public static double methodA(double x) { //-4 + 8x^4- 16x^8 + 32x^12 - 64x^16 + 128x^20
		
		double sum = -4.0;
		double base = 8 *x*x*x*x;
		double multiplier = -2 *x*x*x*x;
		
		for(int i = 1; i<=5; i++) {
			
			sum+= base;
			base = base * multiplier;
			
		}
		
		
		
		return sum;
		
		
		
	}
	//-------------
	
	
	public static int methodB(int x) { // 1 + 4x^5+ 8x^7+ 16x^9+ 32x^11+ 64x^13
		
		int sum = 1;
		int base = 4*x*x*x*x*x;
		int multiplier = 2*x*x;
		for(int i = 0;  i< 5; i++){
			sum = sum + base; 
			base = base* multiplier;
			}
		return sum;
		
	}
	
	
	// --------------
	
	public static double methodC(double x) { // 1.0-x^2/2.0 + x^4/4.0 - x^6/8.0 + x^8/16.0 - x^10/32.0 + x^12/64.0
		double sum = 1;
		double base = -x*x/2.0;
		double multiplier = base;
		
		for(int i = 0;  i< 6; i++){
			sum = sum + base; 
			base = base* multiplier;
			
		}
		
		return sum;
		
		
	}
	public static int numOnesPlaceLessThan4(int[]x) {
		
		int count = 0;
		
		for(int num: x) {
			if((num/1) %10 < 4) {
				count++;
			}
		}
		return count;
		
		
	}
	
	//--------------------
	
	public static int numEqualT(String[][] strArr) {
		
		int count = 0;
		
		for(int row = 0; row < strArr.length; row++) {
			for(int col = 0; col <strArr[row].length; col++) {
				
				if(strArr[row][col].charAt(0) == 'T') {
					count++;
				}
				
			}
		}
		
		
		return count;

	}
	
	
	
	public static void main(String[] args) {
		String[][] x = { {"abc", "12345", "678912"},
				{"to", "books", "123456789012"},
				{"a", "story", "d"} };
		
		
		System.out.println(numLengthGreater4AndLess10(x)); // correct
		
		String[] xCatTrue = {"Cat", "Cat", "Cat"};
		
		String[] xCatFalse = {"Cat", "Dog", "Cat"};
		System.out.println(allStringsEqualCat(xCatTrue)); // this is true
		System.out.println(allStringsEqualCat(xCatFalse)); // this is false (which is correct)
		
		
		
		
		int[] xGreaterValueFalse = {9, 2, 34, 23, 11}; //value 44
		int[] xGreaterValueTrue = {9, 2, 34, 88, 23, 199, 11} ;//and value = 44
		
		System.out.println(greaterThanValue(xGreaterValueFalse, 44)); // returns false (which is correct)
		System.out.println(greaterThanValue(xGreaterValueTrue, 44)); // returns true (which is correct)
		
		
		//This code block below does Array copy, but this does the whole array being copied!!
		
		int [] arrToCopy = new int[1000];
		for (int i = 0; i < arrToCopy.length; i++){
			arrToCopy[i] = i + 9;
			
		}
		int[] arrCopy = new int[arrToCopy.length];
		
		
		System.arraycopy(arrToCopy, 0, arrCopy, 0, arrToCopy.length);
		
		
		//------
		
		//Consider the following code:
		int [] copyFew = new int[40];
		for (int i = 0; i < copyFew.length; i++){
			copyFew[i] = i + 3;
			}
		
		int[] copiedArrayFewElements = new int[40];
		
		//Use System.arraycopy to copy elements 19 to 37 of copyFew into elements 6 to 24 of copiedArrayFewElements
		
		System.arraycopy(copyFew, 19, copiedArrayFewElements, 6, 19);
		
		
		//-----
		
		
		//Consider the following code:
		
		int[] arr = new int[1000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 3 * i;
			
		}
		
		//Use System.arraycopy to copy elements 5 to 60 of arr into elements44 to 99 of arr
		
		
		System.arraycopy(arr, 5, arr,44, 56);
		
		//-------------------------
		
		
		
		
	}

}
