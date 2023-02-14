package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			double numero = sc.nextDouble();
			vect[i] = numero;
		}
		
		System.out.println();
		
		System.out.print("VALORES =");
		for (int i = 0; i < vect.length; i++) {
			System.out.printf(" %.1f", vect[i]);
		}
		System.out.println();
		
		double soma = 0.0;
		for (int i = 0; i < vect.length; i++) {
			soma+= vect[i];
		}
		System.out.printf("SOMA = %.1f%n", soma);
		
		double media = soma / vect.length;
		System.out.printf("MEDIA = %.1f%n", media);
		
		sc.close();

	}
}
