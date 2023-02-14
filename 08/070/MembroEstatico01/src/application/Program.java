package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double pi = 3.1415;
		double circumference = 2.0 * pi * radius;
		double volume = 4.0 * pi * Math.pow(radius, 3) / 3.0;
		
		System.out.printf("Circumference: %.2f%n", circumference);
		System.out.printf("Volume: %.2f%n", volume);
		System.out.printf("PI value: %.2f%n", pi);
		
		sc.close();
		
	}	
}
