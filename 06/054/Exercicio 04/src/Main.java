import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			double valor1 = sc.nextDouble();
			double valor2 = sc.nextDouble();
			double resultado = valor1 / valor2;
			if (valor2 != 0.0) {
				System.out.printf("%.1f%n", resultado);
			} else {
				System.out.println("divisão impossivel");
			}
		}
		
		sc.close();
		
	}
	
}
