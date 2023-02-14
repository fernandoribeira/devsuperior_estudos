import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeroFuncionario = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		double valorPorHora = sc.nextDouble();
		double salario = (double) horasTrabalhadas * valorPorHora;
		
		System.out.println("NUMBER = " + numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();

	}
}
