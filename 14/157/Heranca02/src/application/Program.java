package application;

import entities.Account;
import entities.BussinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		 
		Account acc = new Account(1001, "Fernando", 0.0);
		BussinessAccount bacc = new BussinessAccount(1002, "Bolacha", 0.0, 100.0);
		SavingsAccount sacc = new SavingsAccount(1003, "Xuxu", 0.0, 0.01);
		
		// UPCASTING
		Account acc1 = new BussinessAccount(1004, "Xule", 0.0, 100.0);
		Account acc2 = new SavingsAccount(1005, "Minhoca", 0.0, 0.01);
		
		// DOWNCASTING
		BussinessAccount bacc1 = (BussinessAccount) acc1;
		SavingsAccount sacc1 = (SavingsAccount) acc2;
		//SavingsAccount sacc1 = (SavingsAccount) acc1;
		
		// Teste de classes
		
		if (acc1 instanceof BussinessAccount) {
			System.out.println("acc1 é uma BussinessAccount");
		}
		
		if (acc1 instanceof SavingsAccount) {
			System.out.println("acc1 é uma SavingsAccount");
		}
		
		if (acc2 instanceof BussinessAccount) {
			System.out.println("acc2 é uma BussinessAccount");
		}
		
		if (acc2 instanceof SavingsAccount) {
			System.out.println("acc2 é uma SavingsAccount");
		}

	}
}
