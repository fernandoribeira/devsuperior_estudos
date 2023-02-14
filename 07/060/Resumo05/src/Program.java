public class Program {
	public static void main(String[] args) {
		
		// Operadores bitwise
		
		int n1 = 89;
		int n2 = 60;
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		// Funções para string
		
		String original = " abcde FGHIJ ABC abc DEFG  ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(3);
		String s05 = original.substring(3, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(3): -" + s04 + "-");
		System.out.println("substring(3, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace(\"abc\", \"xy\"): -" + s07 + "-");
		System.out.println("indexOf(\"bc\"): " + i);
		System.out.println("lastIndexOf(\"bc\"): " + j);
		
		// Funções
		
		imprime("xuxu");
		System.out.println(soma(1, 2));
		
	}
	
	public static void imprime(String texto) {
		System.out.println(texto);
	}
	
	public static int soma(int n1, int n2) {
		return n1 + n2;
	}
	
}
