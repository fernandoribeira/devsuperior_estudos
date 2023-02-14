package application;

import java.util.Locale;
import java.util.Scanner;

import model.Product;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double sum = 0.0;
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for (int i = 0; i < vect.length; i++) {
			String name = sc.next();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double averagePrice = sum / vect.length; 
		
		System.out.printf("AVERAGE PRICE = %.2f%n", averagePrice);
		
		sc.close();
	}
}
