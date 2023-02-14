public class Main {
	public static void main(String[] args) {

		int x;
		
		// while
		x = 0;
		while (x < 10) {
			System.out.print(x + " ");
			x++;
		}
		System.out.println();
		
		// for
		x = 10;
		for (int i = 0; i < x; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// do while
		x = 0;
		do {
			System.out.print(x + " ");
			x++;
		} while (x < 10);
	}
	
}
