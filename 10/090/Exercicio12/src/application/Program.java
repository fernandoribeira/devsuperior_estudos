package application;

import java.util.Locale;
import java.util.Scanner;

import model.Pessoa;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		Pessoa[] vect = new Pessoa[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			double altura = sc.nextDouble();
			System.out.print("Genero da " + (i + 1) + "a pessoa: ");
			char genero = sc.next().charAt(0);
			vect[i] = new Pessoa(altura, genero);
		}

		double menorAltura = vect[0].getAltura();
		double maiorAltura = 0.0;
		int quantidadeMulheres = 0;
		double somaAlturaMulheres = 0.0;
		double mediaAlturaMulheres = 0.0;
		int quantidadeHomens = 0;
		
		for (int i = 0; i < vect.length; i++) {
			
			if (vect[i].getAltura() < menorAltura) {
				menorAltura = vect[i].getAltura();
			}
			
			if (vect[i].getAltura() > maiorAltura) {
				maiorAltura = vect[i].getAltura();
			}
			
			if (vect[i].getGenero() == 'F') {
				somaAlturaMulheres += vect[i].getAltura();
				quantidadeMulheres++;
			} else {
				quantidadeHomens++;
			}
			
		}
		
		mediaAlturaMulheres = (double) somaAlturaMulheres / quantidadeMulheres;
		
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAlturaMulheres);
		System.out.printf("Numero de homens = %d", quantidadeHomens);
		
		sc.close();

	}
}
