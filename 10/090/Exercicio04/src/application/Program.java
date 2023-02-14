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
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vect[i] = new Pessoa(nome, idade, altura);
		}
		
		System.out.println();
		
		double soma = 0.0;
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i].getAltura();
		}
		double alturamedia = soma / vect.length;
		System.out.printf("Altura media: %.2f%n", alturamedia);
		
		int menorDeIdade = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				menorDeIdade++;
			}
		}
		double porcentagemMenorDeIdade = (menorDeIdade * 100) / vect.length;
		System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", porcentagemMenorDeIdade) + "%");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				System.out.println(vect[i].getNome());
			}
		}
		
		sc.close();

	}
}
