package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the measures of triangle X:");
		double xA = sc.nextDouble();
		double xB = sc.nextDouble();
		double xC = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y:");
		double yA = sc.nextDouble();
		double yB = sc.nextDouble();
		double yC = sc.nextDouble();
		
		double xP = (xA + xB + xC) / 2;
		double xArea = Math.sqrt(xP * (xP - xA) * (xP - xB) * (xP - xC));
		
		double yP = (yA + yB + yC) / 2;
		double yArea = Math.sqrt(yP * (yP - yA) * (yP - yB) * (yP - yC));
		
		System.out.printf("Triangle X area: %.4f%n", xArea);
		System.out.printf("Triangle Y area: %.4f%n", yArea);
		
		if (xArea > yArea) {
			System.out.println("Larger area: X");
		} else if (xArea < yArea) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: same area");
		}
		
		sc.close();
		
	}
}
