package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero inteiro entre 1 e 10: ");
		int n = sc.nextInt();
		
		while (n < 1 || n > 10) {
			System.out.println("O número deve estar entre 1 e 10 !");
			System.out.print("Digite um numero inteiro entre 1 e 10: ");
			n = sc.nextInt();
		}
		
		int[] vect = new int[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			int numero = sc.nextInt();
			vect[i] = numero;
		}
		
		System.out.println("NUMEROS NEGATIVOS:");
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();

	}
}
