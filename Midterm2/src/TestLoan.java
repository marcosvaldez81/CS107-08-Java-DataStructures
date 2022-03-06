
public class TestLoan {

	public static void main(String[] args) {
		Loan loan = new Loan(5,2);
		Loan loan2 = new Loan(15,12);
		
		System.out.printf("%s%.2f\n","The principal is: ", loan.getPrincipal());
		System.out.printf("%s%.2f\n","The principal is: ", loan2.getPrincipal());
		
		
		System.out.printf("%s%.2f\n","The principal is: ", loan.calculatePrincipal(5));
		//System.out.printf("%s%.2f\n","The principal is: ", loan2.calculatePrincipal(5));

	}

}
