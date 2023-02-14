package application;

import entities.BussinessAccount;

public class Program {

	public static void main(String[] args) {
		 
		BussinessAccount ba = new BussinessAccount(1, "Fernando", 0.0, 100.0);
		System.out.println(ba.getBalance());

	}
}
