package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String folderPath;
		File path;
		boolean success;
		
		System.out.print("Enter a folder path: ");
		folderPath = sc.nextLine();
		path = new File(folderPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("Folders:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("Files:");
		for (File file : files) {
			System.out.println(file);
		}
		
		System.out.println();
		
		try {
			success = new File(folderPath + "\\pasta01").mkdir();
			if (success) {
				System.out.println("Pasta criada com sucesso");
			} else {
				System.out.println("Erro na criação da pasta");
			}
					
			success = new File(folderPath + "\\arquivo01.txt").createNewFile();
			if (success) {
				System.out.println("Arquivo criado com sucesso");
			} else {
				System.out.println("Erro na criação do arquivo");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		sc.close();
		
	}
}
