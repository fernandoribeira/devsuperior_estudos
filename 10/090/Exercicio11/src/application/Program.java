package application;

import java.util.Locale;
import java.util.Scanner;

import model.Aluno;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		
		Aluno[] vect = new Aluno[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite nome, primeira e segunda nota do "+ (i + 1) + "o aluno:");
			sc.nextLine();
			String nome = sc.nextLine();
			double primeiraNota = sc.nextDouble();
			double segundaNota = sc.nextDouble();
			vect[i] = new Aluno(nome, primeiraNota, segundaNota);
		}
		
		System.out.println("Alunos aprovados:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].media() >= 6.0) {
				System.out.println(vect[i].getNome());
			}
		}
		
		sc.close();

	}
}
