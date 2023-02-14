package application;

import java.io.File;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String filePath;
		File file;
		
		System.out.print("Enter a file path: ");
		filePath = sc.nextLine();
		file = new File(filePath);
		
		System.out.println("getName: " + file.getName());
		System.out.println("getParent: " + file.getParent());
		System.out.println("getPath: " + file.getPath());
	
		sc.close();
		
	}
}
