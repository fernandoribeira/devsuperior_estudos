import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valA = sc.nextDouble();
		double valB = sc.nextDouble();
		double valC = sc.nextDouble();
		
		System.out.printf("TRIANGULO: %.2f%n", ((valA * valC) / 2.0));
		System.out.printf("CIRCULO: %.2f%n", (Math.PI * Math.pow(valC, 2)));
		System.out.printf("TRAPEZIO: %.2f%n", (((valA + valB) * valC) / 2.0));
		System.out.printf("QUADRADO: %.2f%n", (Math.pow(valB, 2)));
		System.out.printf("RETANGULO: %.2f%n", (valA * valB));
		
		sc.close();
	}
}
