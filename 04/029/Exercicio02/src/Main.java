import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		System.out.printf("A=%.4f%n", (Math.PI * Math.pow(raio, 2)));
		
		sc.close();

	}
}
