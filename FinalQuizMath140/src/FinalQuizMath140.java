import java.util.ArrayList;

public class FinalQuizMath140 {
	
	
	public static boolean allLengthGreaterThan6(ArrayList<String> s) {
		boolean flag = true;
		int count = 0;
		
		while(count < s.size() && flag) {
			if(s.get(count).length() <=6) {
				flag = false;
			}
			count++;
		}
		
		return flag;
	}
	
	public static boolean containsLengthGreaterThanValueLength(ArrayList<String> s, String value) {
		boolean flag = false;
		
		for(int i = 0; i < s.size() && !flag; i++) {
			if(s.get(i).length() > value.length()) {
				flag = true;
			}
		}
		
		return flag;
		
	}
	
	public static boolean allHundredsPlaceEquals7(ArrayList<Integer> arr) {
		boolean flag = true;
		
		for(int i = 0; i < arr.size(); i++) {
			flag = (arr.get(i) /100) %10 == 7;
		}
			
		return flag;
	}
	
	public static boolean atLeastOneOddandGreaterThan40(ArrayList<Integer> arr) {
		boolean flag = false;
		
		int count = 0;
		for(int i = 0; i< arr.size(); i++) {
			if(arr.get(i) %2 !=0 && arr.get(i) > 40 ) {
				count++;
			}
			
			
		}
		
		if(count >=1) {
			flag = true;
		}
		
		
		return flag;
		
		
	}
	public static boolean allGreaterThan(ArrayList<String> strArr, String str) {
		boolean flag = false;
		
		int count = 0;
		while(count < strArr.size() && !flag) {
			flag =  strArr.get(count).compareTo(str)> 0;
		}
		
		return flag;
		
		
	}
	
	
	public static boolean atLeastOneEqual(ArrayList<String> strArr, String str) {
		
		boolean flag = false;
		
		int count = 0;
		for(int i = 0; i< strArr.size(); i++) {
			if(strArr.get(i) == str ) {
				count++;
			}
		}
		
		if(count >=1) {
			flag = true;
		}
		return flag;
		
		
		
	}
	
	
	public static boolean allLastCharZ(ArrayList<String> strArr) {
		boolean flag = false;
		
		int count = 0;
		while(count < strArr.size() && !flag ) {
			flag = strArr.get(count).charAt(strArr.get(count).length() -1).equals("Z");
		}
		return flag;
		
	}
	
	public static boolean atLeastOneLengthEqual(ArrayList<String> strArr, int num) {
		boolean flag = false;
		
		int count = 0;
		for(int i = 0; i < strArr.size(); i++) {
			if(strArr.get(i).length() == num) {
				count++;
			}
		}
		if(count >= 1) {
			flag = true;
		}
		
		return flag;
	}
	
	public static boolean  allProperties(ArrayList<Integer> intArr) {
		boolean flag = true;
		

		
		int count = 0;
		
		while(count < intArr.size() && flag) {
			if(intArr.get(count) < 10 && intArr.get(count) % 2 == 0 && (intArr.get(count) /10) %10 == 6) {
				flag = false;
				
			}
		}
		
		
		return flag;
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> strArr = new ArrayList<>();
		
		strArr.add("aaaZ");
		strArr.add("catZ");
		strArr.add("fourZ");
		
//		
//		System.out.println(atLeastOneLengthEqual(strArr, 6));
		
		
		ArrayList<Integer> intArr = new ArrayList<>();
		
		
//		intArr.add(1061);
//		intArr.add(763);  //works
//		intArr.add(267);
		
		intArr.add(1061);
		intArr.add(762);
		intArr.add(267);
//		
//		intArr.add(1051);
//		intArr.add(763);
//		intArr.add(267);
//	
		
		System.out.println(allProperties(intArr));
		
		
		System.out.println(allLastCharZ(strArr));
		
		
	}

}
