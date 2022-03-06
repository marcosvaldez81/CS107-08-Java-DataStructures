import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;




// this c;ass is showing lambda 
public class Quiz14TestCode implements Comparator <Person>{
	 
	
	public int compare(Person pOne, Person pTwo){ 
		
		String person1 = pOne.getFirstName() + pOne.getLastName();
		String person2 = pTwo.getFirstName() + pTwo.getLastName();
		
		
		 return person1.length() - person2.length();              
		 
	 }

	
	public static void main(String[] args) {
		
		Person [] pList= {
				new Person("Amie", "Monday", 38),
		 new Person("Pilar", "Ess", 42)
	
		};

		Arrays.sort(pList, (pOne,  pTwo) -> pOne.getAge() - pTwo.getAge())    ;

		for(Person x: pList) {
		 System.out.println(x.getFirstName());
		 }
		
		
		
		
		
		Person [] pList= {
				new Person("Amie", "Monday", 38),
		 new Person("Pilar", "Ess", 42)
	
		};
		
		Arrays.sort(pList, (pOne,  pTwo) -> pOne.getAge() - pTwo.getAge())    ;
		
		 for(Person x: pList) {
			 System.out.println(x.getFirstName());
		 }
		
		Person [] pList= {
				new Person("J", "Sat", 43),
				new Person("Tuesday", "Hayes", 42)
				
				
		};
//		
//		//sort Strings in descending order by length       
		Arrays.sort(pList, (pOne, pTwo) -> (pTwo.getFirstName().length() + pTwo.getLastName().length())
				- (pOne.getFirstName().length() + pOne.getLastName().length())) ;
		
		//pTwo.getFirstName().length() + pTwo.getLastName().length() - pOne.getFirstName().length() + pOne.getLastName().length()) ;
		
		for(Person p: pList) {
			System.out.println(p.getFirstName());
		}
//		Arrays.sort(pList, (pOne,  pTwo) -> pOne.getAge() - pTwo.getAge())    ;
//		
//		 for(Person x: pList) {
//			 System.out.println(x.getFirstName());
//		 }

		
		
		
//		String[] a = {"set", "dog", "apple", "tvw", "airplane", "to","ocean", "giraffe", "biology", "staircase", "so", "too"};
//		
//		// sort Strings in descending order by length       
//		 Arrays.sort(a, (s, t) -> t.length() - s.length());
//		
//		
//		 for(String x: a) {
//			 System.out.println(x);
//		 }
//		 System.out.println();
//		 
//		 
//		 
//		 String[] b = {"set", "dog", "apple", "tvw", "airplane", "to","ocean", "giraffe", "biology", "staircase", "so", "too"};
//		 
//		// sort Strings in ascending order by length       
//		 Arrays.sort(b, (s, t) -> s.length() - t.length());
//		 
//		 
//		 for(String x: b) {
//			 System.out.println(x);
//		 }
		 
	}
}


//-s.compareTo(t)); 
