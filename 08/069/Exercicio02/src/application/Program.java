package application;

import java.util.Locale;
import java.util.Scanner;

import model.Employee;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Gross salary: ");
		double grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		double tax = sc.nextDouble();
		
		Employee e = new Employee(name, grossSalary, tax);
		
		System.out.println();
		System.out.println("Employee: " + e);
		System.out.println();
		
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		e.increaseSalary(percentage);
		System.out.println();
		System.out.println("Updated data: " + e);
		
		sc.close();
		
	}
}
