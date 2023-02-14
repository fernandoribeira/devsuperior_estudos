package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.AccountException;

public class Program {
	public static void main(String[] args) {
		
//		Um saque não pode ocorrer se não houver saldo na conta
//		Um saque não pode ocorrer se o valor do saque for superior ao limite de saque da conta
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		int number;
		String holder;
		double initialBalance;
		double withdrawLimit;
		Account account;
		double amount;

		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			holder= sc.nextLine();
			System.out.print("Initial balance: ");
			initialBalance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			withdrawLimit = sc.nextDouble();
			account = new Account(number, holder, initialBalance, withdrawLimit);
			System.out.println(account);
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			amount = sc.nextDouble();
			account.withdraw(amount);
			System.out.printf("New balance: $%.2f%n", account.getBalance());
		} catch (InputMismatchException e) {
			System.out.println("Invalid data!");
		} catch (AccountException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
		
	}
}
