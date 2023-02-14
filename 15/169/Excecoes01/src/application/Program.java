package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (InputMismatchException e) {
			System.out.println("Input error!");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Position error!");
			e.printStackTrace();
		}

		sc.close();

		System.out.println("End program.");

	}
}
