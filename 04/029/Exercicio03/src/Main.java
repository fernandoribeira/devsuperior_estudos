import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int valA = sc.nextInt();
		int valB = sc.nextInt();
		int valC = sc.nextInt();
		int valD = sc.nextInt();
		int diferenca = valA * valB - valC * valD;
		System.out.println("DIFERENCA = " + diferenca);
		
		sc.close();

	}
}
