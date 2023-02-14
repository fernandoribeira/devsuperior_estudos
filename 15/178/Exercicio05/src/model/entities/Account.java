package model.entities;

import model.exceptions.AccountException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		validateNumber(number);
		validateHolder(holder);
		validateBalance(balance);
		validateWithdrawLimit(withdrawLimit);
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

//	public void setNumber(Integer number) {
//		this.number = number;
//	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		validateHolder(holder);
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

//	public void setBalance(Double balance) {
//		this.balance = balance;
//	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		validateWithdrawLimit(withdrawLimit);
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(Double amount) {
		validateDeposit(amount);
		balance += amount;
	}
	
	public void withdraw(Double amount) {
		validateWithdraw(amount);
		balance -= amount;
	}

	private void validateNumber(Integer number) {
		if (number < 0.) {
			throw new AccountException("Create account error: Number cannot be less than zero!");
		}
	}
	
	private void validateHolder(String holder) {
		if (holder == "" || holder == null) {
			throw new AccountException("Create account error: Holder cannot be empty!");
		}
	}
	
	private void validateBalance(Double balance) {
		if (balance < 0.0) {
			throw new AccountException("Create account error: Balance cannot be less than zero!");
		}
	}
	
	private void validateWithdrawLimit (Double withdrawLimit) {
		if (withdrawLimit < 0.0) {
			throw new AccountException("Create account error: Withdraw limit cannot be less than zero!");
		}
	}
	
	private void validateDeposit(Double amount) {
		if (amount < 0.0) {
			throw new AccountException("Deposit error: Amount cannot be less than zero!");
		}
	}
	
	private void validateWithdraw(Double amount) {
		if (amount < 0.0) {
			throw new AccountException("Withdraw error: Amount cannot be less than zero!");
		}
		if (amount > withdrawLimit) {
			throw new AccountException("Withdraw error: Amount exceeds withdraw limit!");
		}
		if (amount > balance) {
			throw new AccountException("Withdraw error: Not enough balance!");
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Account number: ");
		sb.append(number);
		sb.append(", holder: ");
		sb.append(holder);
		sb.append(", balance: $");
		sb.append(String.format("%.2f", balance));
		sb.append(", withdraw limit: $");
		sb.append(String.format("%.2f", withdrawLimit));
		return sb.toString();
	}
	
}
