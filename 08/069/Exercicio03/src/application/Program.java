package application;

import java.util.Locale;
import java.util.Scanner;

import model.Aluno;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.nextLine();
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double nota3 = sc.nextDouble();
		
		Aluno a = new Aluno(nome, nota1, nota2, nota3);
		
		System.out.println();
		System.out.printf("FINAL GRADE = %.2f%n", a.notaFinal());
		System.out.println(a.statusAluno());
		if (a.statusAluno() == "FAILED") {
			System.out.printf("MISSING %.2f POINTS%n", (60.00 - a.notaFinal()));
		}
		
		sc.close();
		
	}
}
