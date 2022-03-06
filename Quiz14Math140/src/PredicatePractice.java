import java.util.function.Predicate;


public class PredicatePractice implements Predicate<Person>{
	
	public boolean test(Person p) {
		return p.getFirstName().charAt(0) == p.getLastName().charAt(0); 
	}
	
//	public boolean test(Person p) {
//		return p.getAge() %5 == 0 || p.getAge() %7 == 0;
//	}
	
	
	public static void main(String[] args) {
		
		
		PredicatePractice pp = new PredicatePractice();
		
		Person [] pList= { new Person("Max", "Monday", 80), 
				new Person("Pilar", "Ess", 42)
				
				
				
		};		
		
		
		for(Person p: pList) {
			if(pp.test(p)) {
				System.out.println(p.getFirstName());
			}
		}
//		Person [] pList = {new Person("Max", "Monday",  28),
//						new Person("Pilar", "Ess", 40),
//						new Person("Amie", "Wednesday", 31)
//						
//		};
//		
//		for(Person l: pList) {
//			if(pp.test(l)) {
//				System.out.println(l.getFirstName());
//			}
//		}
		
		
		

	}

}
