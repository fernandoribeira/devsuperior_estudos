package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CompanyTaxPayer;
import model.entities.IndividualTaxPayer;
import model.entities.TaxPayer;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();
		int n;
		double totalTaxes;
		
		System.out.print("Enter the number of tax payers: ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			char type;
			String name;
			double anualIncome;
			
			System.out.println("Tax payer #" + (i + 1) + " data:");
			System.out.print("Individual or company (i/c)? ");
			type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.print("Anual income: ");
			anualIncome = sc.nextDouble();
			
			if (type == 'i') {
				double healthExpenditures;
				System.out.print("Health expenditures: ");
				healthExpenditures = sc.nextDouble();
				list.add(new IndividualTaxPayer(name, anualIncome, healthExpenditures));
			} else {
				int numberOfEmployees;
				System.out.print("Number of employees: ");
				numberOfEmployees = sc.nextInt();
				list.add(new CompanyTaxPayer(name, anualIncome, numberOfEmployees));
			}
			
		}
		
		System.out.println();
		
		System.out.println("TAXES PAID:");
		for (TaxPayer p : list) {
			System.out.println(p.taxesDisplay());
		}
		
		System.out.println();
		
		totalTaxes = 0.00;
		for (TaxPayer p : list) {
			totalTaxes += p.taxesPaid();
		}
		System.out.printf("TOTAL TAXES: $ %.2f%n", totalTaxes);
		
		sc.close();
		
	}
}
