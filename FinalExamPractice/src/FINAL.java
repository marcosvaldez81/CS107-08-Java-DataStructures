import java.util.ArrayList;

public class FINAL {
	
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
	
	
	public static boolean containsFirstEqualsLast(ArrayList<String> arrS) {
		boolean flag = false;
		
		int count = 0;
		for(int i = 0; i < arrS.size(); i++) {
			int arrayLength= arrS.get(i).length();

			if(arrS.get(i).charAt(0) == arrS.get(i).charAt(arrayLength - 1)) {
				count++;
				
			}
			
			
		}
		
		if(count >= 1) {
			flag = true;
		}
		return flag;
		
		
	}
	
	
	public static boolean allEven(ArrayList<Integer> x) {
		
		boolean flag = true;
		
		int index = 0;
		
		while(index < x.size() && flag) {
			flag = x.get(index) %2 == 0;
			index++;
			
		}
		
		return flag;
		
	}
	
	
	public static int  numGradeA(Student[] sArr) {
		
		int count = -1;

		for(int i =0; i< sArr.length;i++) {
			
			if(sArr[i].getAverageGrade() >= 90.0) {
				count++;
			}
			
		}
		
		return count;
		
	}

	public static void main(String[] args) {
//		String[][] strArr = { {"Time", "hello", "Ten"}, {"Six", "cat", "a", "Today"}, {"blue", "one"}};
//		
//		
//		System.out.println(numEqualT(strArr));
//		
//		
//		ArrayList<String> arrS = new ArrayList<>();
//		
//		
//		arrS.add("CAT");
//		arrS.add("dog");
//		arrS.add("hello");
//		arrS.add("NabN");
//		
//		System.out.println(containsFirstEqualsLast(arrS));
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(2);
		arr.add(7);
		arr.add(10);
		
		System.out.println(allEven(arr));
		
		
		

	}

}
