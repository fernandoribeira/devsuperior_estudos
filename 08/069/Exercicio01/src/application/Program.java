package application;

import java.util.Locale;
import java.util.Scanner;

import model.Rectangle;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height:");
		double width = sc.nextDouble();
		double height = sc.nextDouble();
		Rectangle r = new Rectangle(width, height);
		
		System.out.println();
		System.out.println("Rectangle measures: " + r);
		System.out.printf("AREA = %.2f%n", r.area());
		System.out.printf("PERIMETER = %.2f%n", r.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", r.diagonal());
		
		sc.close();
		
	}
}
