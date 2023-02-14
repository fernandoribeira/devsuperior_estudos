package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Employee;
import model.entities.OutsourcedEmployee;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		List<Employee> employees  = new ArrayList<>();
		int n;
		
		System.out.print("Enter the number of employees: ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			char type;
			String name;
			int hours;
			double valuePerHour;
			double additionalCharge;
			
			System.out.println("Employee #" + (i + 1 ) + " data:");
			System.out.print("Outsourced (y/n)? ");
			type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.print("Hours: ");
			hours = sc.nextInt();
			System.out.print("Value per hour: ");
			valuePerHour = sc.nextDouble();
			
			if (type == 'y') {
				System.out.print("Additional charge: ");
				additionalCharge = sc.nextDouble();
				employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else {
				employees.add(new Employee(name, hours, valuePerHour));
			}

		}
		
		System.out.println();
		
		System.out.println("PAYMENTS:");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		sc.close();
		
	}
}
