import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1 = sc.nextInt();
		int numeroDePecas1 = sc.nextInt();
		double valorUnitario1 = sc.nextDouble();
		
		int codigoPeca2 = sc.nextInt();
		int numeroDePecas2 = sc.nextInt();
		double valorUnitario2 = sc.nextDouble();
		
		double valorAPagar = (numeroDePecas1 * valorUnitario1) + (numeroDePecas2 * valorUnitario2);
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorAPagar);
		
		sc.close();

	}
}
