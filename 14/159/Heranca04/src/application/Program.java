package application;

import entities.Account;
import entities.BussinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		 
		Account acc1 = new Account(1001, "Xuxu", 1000.0);
		acc1.withdraw(100.0);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new BussinessAccount(1002, "Xule", 1000.0, 100.0);
		acc2.withdraw(100.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new SavingsAccount(1003, "Minhoca", 1000.0, 0.01);
		acc3.withdraw(100.0);
		System.out.println(acc3.getBalance());

	}
}
