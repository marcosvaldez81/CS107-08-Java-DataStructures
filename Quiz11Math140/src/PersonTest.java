import java.util.Arrays;
public class PersonTest {
    public static void main(String[] args){

        Person[] arr = { new Person("Mas", "Ess"), 
        		
                        new Person("Pilar","Monday")
                        
        };
        

        
        // Sort String objects in ascending order by length
        
        Arrays.sort(arr, new PersonComparator()); 
        for(Person s: arr){
            System.out.println(s);
        }
        

        
    }
}