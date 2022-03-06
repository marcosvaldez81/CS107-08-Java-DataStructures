
public class Quiz6Math140 {

	public static int numFirstEqualsLast(String[][] strArr) {
		int count = 0;
		for(int row = 0; row < strArr.length; row++) {
			for(int col = 0; col < strArr[row].length -1; col++) {
				if(strArr[row][col].charAt(0) == strArr[row][col].charAt(0)) {
					count++;
				}
			}
		}
		
		return count;
	}
	
	public static int  oddMinusEven(int[][] arr) {
		
		int posSum = 0;
		int oddSum = 0;
		int total = 0;
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++) {
				if(arr[row][col] % 2 == 0) {
					posSum = posSum + arr[row][col]; 
				}
				if(arr[row][col] % 2 != 0) {
					oddSum = oddSum + arr[row][col];
				}
				
			}
			
		}
		total = oddSum - posSum;
		return total;
		
	}
	
	public static void main(String[] args) {
		
		String[][]  str = { {"aa", "d", "eeh"},

                {"ZbbAZ", "AZ"} };
		int[][] arr = { { 10, 0, 3,  15 , 2},

                {9, 4} };
		
		
		//System.out.println(oddMinusEven(arr));
		
		System.out.println(numFirstEqualsLast(str));
		
	}

}
