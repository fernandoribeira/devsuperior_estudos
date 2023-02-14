package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double maiorValor = 0.0;
		int posicaoMaiorValor = 0;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			double numero = sc.nextDouble();
			vect[i] = numero;
			if (vect[i] > maiorValor) {
				maiorValor = vect[i];
				posicaoMaiorValor = i;
			}
		}
		
		System.out.println();
		
		System.out.printf("MAIOR VALOR = %.1f%n", maiorValor);
		System.out.println("POSICAO DO MAIOR VALOR = " + posicaoMaiorValor);
		
		sc.close();

	}
}
