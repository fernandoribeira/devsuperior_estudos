package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		double somaPares = 0.0;
		int quantidadePares = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				somaPares += vect[i];
				quantidadePares++;
			}
		}
		
		if (quantidadePares > 0) {
			double mediaPares = (double) somaPares / quantidadePares;
			System.out.printf("MEDIA DOS PARES = %.1f%n", mediaPares);
		} else {
			System.out.println("NENHUM NUMERO PAR");
		}
		
		sc.close();

	}
}
