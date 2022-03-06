
public class BankAccount {
	// instance variables
	private String acctOwner;
	private double balance;
	private double atmFee;

	// public constructor
	public BankAccount(String acctOwner, double balance, double atmFee) {
		this.acctOwner = acctOwner;
		this.balance = balance;
		this.atmFee = atmFee;
	}

	// mutators

	public void setAcctOwner(String acctOwner) {
		this.acctOwner = acctOwner;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAtmFee(double atmFee) {
		this.atmFee = atmFee;
	}

	// accessors

	public String getAcctOwner() {
		return acctOwner;
	}

	public double getBalance() {
		return balance;
	}

	public double getAtmFee() {
		return atmFee;
	}

	// methods

	public void withDraw(double amount) {
		double sum = amount + atmFee;

		if (balance >= sum) {
			balance = balance - sum;
		} else {
			balance = balance;
		}

	}

	public String toString() {
		String convert = "  Balance: " + balance;

		String convert2 = "  ATM Fee: " + atmFee;

		return "Account Owner: " + acctOwner + convert + convert2;
	}

	// main

	public static void main(String[] args) {
		BankAccount bank = new BankAccount("Smith", 500.00, 3.00);

		System.out.print(bank);

	}
}
