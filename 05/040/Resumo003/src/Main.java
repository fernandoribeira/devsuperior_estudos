
public class Main {
	public static void main(String[] args) {
		
		// Operadores de atribuição acumulativa
		
		int val = 10;
		
		System.out.println("val = 10");
		System.out.println("val += 2 e igual a " + (10 + 2));
		System.out.println("val -= 3 e igual a " + (10 - 3));
		System.out.println("val *= 4 e igual a " + (10 * 4));
		System.out.println("val /= 5 e igual a " + (10 / 5));
		System.out.println("val %= 6 e igual a " + (10 % 6));
		System.out.println();
		
		// Operadores comparativos
		
		int x = 10;
		int y = 5;
		int z = 2;
		
		System.out.println("x = 10");
		System.out.println("y = 5");
		System.out.println("z = 2");
		System.out.println("x > y é igual a " + (x > y));
		System.out.println("x >= y é igual a " + (x >= y));
		System.out.println("x < y é igual a " + (x < y));
		System.out.println("x <= y é igual a " + (x <= y));
		System.out.println("x == y é igual a " + (x == y));
		System.out.println("x != y é igual a " + (x != y));
		System.out.println();
		
		// Operadores lógicos
		
			System.out.println("Operador logico E");
			System.out.println("x > y && x > z é igual a " + (x > y && x > z));
			System.out.println("Operador logico OU");
			System.out.println("x > y || x < z e igual a " + (x > y || x < z));
			System.out.println("Operador logico NAO");
			System.out.println("!(x > y) e igual a " + (!(x > y)));
			System.out.println();
		
		// Estruturas de seleção
			
			if (x > y) {
				System.out.println("x > y");
			}
			
			if (x >= y) {
				System.out.println("x >= y");
			} else {
				System.out.println("Erro");
			}
			
			if (x < y) {
				System.out.println("x < y");
			} else if (x > y) {
				System.out.println("x > y");
			} else {
				System.out.println("Erro");
			}
			
			if (x > y) {
				System.out.println("x > y");
			} else if (x > y) {
				System.out.println("x > y");
			} else if (y > z) {
				System.out.println("y > z");
			} else {
				System.out.println("Erro");
			}
			
			switch (x) {
				case 1:
					System.out.println("1");
					break;
				case 10:
					System.out.println("10");
					break;
				default:
					System.out.println("Erro");
			}
			
			String animal = "cachorro";
			String nome = (animal == "cachorro") ? "Bolacha" : "Minhoca";
			System.out.println(nome);
			
		// Escopo
			
			if (true) {
				int w = 1;
			}
			
			//System.out.println(w); Fora do escopo
			
		// Inicialização de variáveis
		
	}
}
