
public class Loan {
	private double principal;
	private double interestRate;
	
	public  Loan(double principal, double interestRate) { //constructor
		this.principal = principal;
		this.interestRate = interestRate;
	}
	
	public double getPrincipal() {
		return principal;
	}
	public double getinterestRate() {
		return interestRate;
	}
	
	public void setPrincipal(double principal2) {
		this.principal = principal2;
	}
	public void setInterestRate(double interestRate2) {
		this.interestRate = interestRate2;
	}
	
	public double calculatePrincipal(int t) {
		double interest = principal * (1 + interestRate * t );
		return interest;
	}
	
}
