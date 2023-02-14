package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		String path = "C:\\temp\\in.txt";
		File file = new File(path);
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
		
	}
}
