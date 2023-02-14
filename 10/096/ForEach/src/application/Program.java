package application;

public class Program {
	public static void main(String[] args) {
		
		String[] vect = new String[] {"Bolacha", "Minhoca", "Xuxu"};
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println();
		
		for (String item : vect) {
			System.out.println(item);
		}
	}
}
