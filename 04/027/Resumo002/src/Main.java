import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		// Comentario de uma linha
		
		/*
		 * Comentario
		 * em 
		 * bloco
		 */
		
		/**
		 * Comentario
		 * em
		 * bloco
		 * JavaDoc
		 */
		 
		// Casting
		
		int val1 = 2;
		double val2 = 4.0;
		int result = (int) (val2 - val1);
		
		// Entrada de dados
		// Três operações básicas de programação
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira um byte: ");
		byte byteVal = sc.nextByte();
		System.out.print("Insira um short: ");
		short shortVal = sc.nextShort();
		System.out.print("Insira um int: ");
		int intVal= sc.nextInt();
		System.out.print("Insira um long: ");
		long longval= sc.nextLong();
		System.out.print("Insira um float: ");
		float floatVal = sc.nextFloat();
		System.out.print("Insira um double: ");
		double doubleVal = sc.nextDouble();
		System.out.print("Insira um char: ");
		char charVal = sc.next().charAt(0);
		System.out.print("Insira um boolean: ");
		boolean booleanVal = sc.nextBoolean();
		System.out.print("Insira uma palavra: ");
		String palavra = sc.next();
		System.out.print("Insira uma frase: ");
		sc.nextLine();
		String frase = sc.nextLine();
		System.out.print("Insira um int v1: ");
		int v1= sc.nextInt();
		System.out.print("Insira um int v2: ");
		int v2= sc.nextInt();
		int r = v1 + v2;
		
		System.out.println(byteVal);
		System.out.println(shortVal);
		System.out.println(intVal);
		System.out.println(longval);
		System.out.println(floatVal);
		System.out.println(doubleVal);
		System.out.println(charVal);
		System.out.println(booleanVal);
		System.out.println(palavra);
		System.out.println(frase);
		System.out.printf("A soma de %d e %d é igual a %d%n", v1, v2, r);
		
		sc.close();
		
		// Funções matemáticas
		
		System.out.println("Raiz quadrada de 4 é " + Math.sqrt(4));
		System.out.println("2 elevado a 3 é " + Math.pow(2, 3));
		System.out.println("PI é " + Math.PI);

	}
}
