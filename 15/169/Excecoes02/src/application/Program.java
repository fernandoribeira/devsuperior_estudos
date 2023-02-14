package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		System.out.println("Program init.");
		method1();		
		System.out.println("Program end.");
	}
	public static void method1() {
		System.out.println("Method1 init.");
		method2();
		System.out.println("Method1 end.");
	}
	public static void method2() {
		System.out.println("Method2 init.");
//		try {
			Scanner sc = new Scanner(System.in);
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
			sc.close();
//		} catch (InputMismatchException e) {
//			System.out.println("Input error!");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Position error!");
//		}
		System.out.println("Method2 end.");
	}
}
