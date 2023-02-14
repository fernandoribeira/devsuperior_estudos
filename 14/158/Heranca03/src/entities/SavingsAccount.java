package entities;

public class SavingsAccount extends Account {

	protected Double interestRate;
	
	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		deposit(getBalance() * interestRate);
	}
	
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
	
}
