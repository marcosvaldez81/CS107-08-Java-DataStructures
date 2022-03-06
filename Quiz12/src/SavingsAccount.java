
public class SavingsAccount extends BankAccount {
	private int rate;

	public SavingsAccount(String acctOwner, double balance, double atmFee, int rate) {
		super(acctOwner, balance, atmFee);
		this.rate = rate;
	}

	// mutator

	public void setRate(int rate) {
		this.rate = rate;
	}

	// accessor

	public int getRate() {
		return rate;
	}

	public String toString() {
		return super.toString() + " Rate: " + rate + " percent";
	}

	
	//main
	public static void main(String[] args) {
		BankAccount bank = new BankAccount("Smith", 500.00, 3.00);
		SavingsAccount savings = new SavingsAccount("Drost", 891.00, 1.00, 1);

		System.out.println(bank.toString());
		System.out.println(savings.toString());
	}

}
