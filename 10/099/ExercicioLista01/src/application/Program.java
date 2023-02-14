package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + 1));
			System.out.print("Id: ");
			int id = sc.nextInt();
			while (idExist(id, list)) {
				System.out.println("Duplicate Id!");
				System.out.print("Id: ");
				id = sc.nextInt();
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary));
			System.out.println();
		}
		
		System.out.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();
		
		int position = -1;
		for (Employee e : list) {
			if (e.getId() == id) {
				position = list.indexOf(e);
			}
		}
		
		if (position != -1) {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			Employee e = list.get(position);
			e.increaseSalary(percentage);
		} else {
			System.out.println("This id does not exist!");
		}

		System.out.println();
		System.out.println("List of employees:");
		for (Employee e : list) {
			System.out.println(e);
		}
		
		sc.close();
		
	}
	
	public static boolean idExist(int id, List<Employee> list) {
		for (Employee e : list) {
			if (e.getId() == id) {
				return true;
			}
		}
		return false;
	}
	
}
