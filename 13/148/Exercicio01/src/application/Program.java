package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Department;
import model.entities.HourContract;
import model.entities.Worker;
import model.enums.WorkerLevel;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String departmentName;
		Department department;
		String name;
		String level;
		WorkerLevel workerLevel;	
		Double baseSalary;
		Worker worker;
		Integer contractsQuantity;
		String monthAndYear;
		Integer month;
		Integer year;

		System.out.print("Enter department's name: ");
		departmentName = sc.nextLine();
		department = new Department(departmentName);
		
		System.out.println("Enter worker data:");
		
		System.out.print("Name: ");
		name = sc.nextLine();
		
		System.out.print("Level: ");
		level = sc.next();
		workerLevel = WorkerLevel.valueOf(level);
		
		System.out.print("Base salary: ");
		baseSalary = sc.nextDouble();
		
		worker = new Worker(name, workerLevel, baseSalary, department);
		
		System.out.print("How many contracts to this worker? ");
		contractsQuantity = sc.nextInt();
		
		for (int i = 0; i < contractsQuantity; i++) {
			
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			
			String contractDate;
			LocalDate date;
			Double valuePerHour;
			Integer hours;
			HourContract contract;
			
			System.out.println("Enter contract #" + (i + 1) + " data:");
			
			System.out.print("Date (DD/MM/YYYY): ");
			contractDate = sc.next();
			date = LocalDate.parse(contractDate, dtf);
			
			System.out.print("Value per hour: ");
			valuePerHour = sc.nextDouble();
			
			System.out.print("Duration (hours): ");
			hours = sc.nextInt();
			
			contract = new HourContract(date, valuePerHour, hours);
			worker.addContracts(contract);
		}
		
		System.out.println();
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		monthAndYear = sc.next();
		month = Integer.parseInt(monthAndYear.substring(0, 2));
		year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		sc.close();
		
	}
}
