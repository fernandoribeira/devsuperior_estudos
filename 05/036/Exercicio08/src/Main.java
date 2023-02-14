import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		double imposto = 0.0;
		
		if (salario >= 0.00 && salario <= 2000.00) {
			System.out.println("Isento");
			imposto = 0.00;
			
		} else if (salario > 2000.00 && salario <= 3000.00) {
			System.out.println("Tributado");
			imposto = (salario - 2000.00) * 0.08 + (0.00);
			
			
		} else if (salario > 3000.00 && salario <= 4500.00) {
			System.out.println("Tributado");
			imposto = (salario - 3000.00) * 0.18 + (80.00) + (0.00);
			
			
		} else {
			System.out.println("Tributado");
			imposto = (salario - 4500.00) * 0.28 + (270.00) + (80.00) + (0.00);
			
		}
		
		System.out.printf("R$ %.2f%n", imposto);
		
		sc.close();
		
	}
}
