import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		
		// Separador decimal
		
		Locale.setDefault(Locale.US);
		
		// Variáveis
		// Tipos primitivos
		
		byte byteVal;
		short shortVal;
		int intVal;
		long longVal;
		float floatVal;
		double doubleVal;
		char charVal;
		boolean booleanVal;
		
		byteVal = 1;
		shortVal = 2;
		intVal = 3;
		longVal = 4L;
		floatVal = 5.5f;
		doubleVal = 6.6;
		charVal = '7';
		booleanVal = true;
		
		// Escrevendo na tela Sem quebra de linha
		// Escrevendo na tela Com quebra de linha
		// Escrevendo na tela Com formatação
		// Concatenação de texto
		
		System.out.println(byteVal);
		System.out.print("Bom ");
		System.out.println("dia!");
		System.out.println("Valor de shortVal é igual a " + shortVal);
		System.out.printf("O valor de int é %d, o valor de doubleVal é %.2f, o valor de charVal é %c e o valor de booleanVal é %b%n",
				intVal, doubleVal, charVal, booleanVal);
		
		// Operadores aritméticos
		
		System.out.println("shortVal + byteVal é igual a " + (shortVal + byteVal));
		System.out.println("shortVal - byteVal é igual a " + (shortVal - byteVal));
		System.out.println("shortVal * byteVal é igual a " + (shortVal * byteVal));
		System.out.println("shortVal / byteVal é igual a " + (shortVal / byteVal));
		System.out.println("shortVal % byteVal é igual a " + (shortVal % byteVal));

		// Precedência dos operadores
		// Agrupamento de expressões

		System.out.println("3 + 2 * 4 é igual a " + (3 + 2 * 4));
		System.out.println("(3 + 2) * 4 é igual a " + ((3 + 2) * 4));

	}
}
