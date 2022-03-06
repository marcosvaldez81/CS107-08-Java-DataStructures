import java.util.Arrays;

public class Quiz1CS140 {

//	public static boolean containsMultipleOfSeven(int[] x) {
//		boolean flag = false;
//		int index = 0;
//		while(index < x.length && !flag) {
//			flag = x[index]%7==0;
//			index++;
//		}
//		return flag;
//	}
	

	
	public static void main(String[] args) {
		
		int num = 4;
		
		while (num <= 16384) {
			System.out.println(num);
			num = num * 4;
			if(num == 256) {

				num = num * 4;
			}
			
			
		}
		
	
	}

}

//
//int x = 104;
//int ones = (x/1)%10;
//if(ones == 1 || ones ==2) {
//	System.out.print("1 or 2");
//}else if(ones == 3 || ones == 4) {
//	System.out.print("3 or 4");
//}else {
//	System.out.print("greater than 4");
//}


//public static boolean allEvenOrFive(int[] x) {
//boolean flag = true;
//
//int index = 0;
//while(index < x.length && flag) {
//	if(flag = x[index]%2 ==0 || x[index] == 5) {
//		index++;
//	}
//}
//
//return flag;
//}

//int [] arr = new int [1000];
//
//for(int i = 0; i < arr.length; i++) {
//	if(i >= 50 && i < 100 ) {
//		arr[i] = 2* i;
//	}
//	if(i < 50 || i >= 100) {
//		arr[i] = 6;
//	}
//}
