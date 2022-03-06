
public class TwoDArray {

	public static void main(String[] args) {
		//This code is from lecture
		
					
		int[][] twoD = { {8,4,9,0}, //length =4
				         {9,8}, //length =2
				         {100,50,-2,1,1001}, 
				         {99,44,12,6, 1} };
		
		
		int sum = 0;
		
		//find sum of values in twoD 
		
		for(int row = 0; row <twoD.length; row++) {
			for(int col = 0; col < twoD[row].length; col++) {
				sum = sum + twoD[row][col];
			}
		}
		System.out.println("Sum of all values = " + sum + " . ");

	}

}
