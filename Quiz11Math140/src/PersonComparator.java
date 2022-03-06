import java.util.Comparator;

public class PersonComparator implements Comparator<Person>{
	
	
	public int compare(Person pOne, Person pTwo){
		
		
		int nameOneSum = pOne.getFirstName().length() + pOne.getLastName().length();
		int nameTwoSum = pTwo.getFirstName().length() + pTwo.getLastName().length();
		
        return (nameOneSum)- (nameTwoSum);


    }


}
