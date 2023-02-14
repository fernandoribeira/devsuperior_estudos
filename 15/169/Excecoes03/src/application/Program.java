package application;

import java.io.File;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		System.out.println("Inicio do programa");
		
		File file = new File("C:\\temp\\in.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (Exception e) {
			System.out.println("Error opening file!");
			e.getStackTrace();
		} finally {
			System.out.println("Fechando o scanner");
			if (sc != null) {
				sc.close();
			}
		}

		System.out.println("Fim do programa");
		
	}
}
