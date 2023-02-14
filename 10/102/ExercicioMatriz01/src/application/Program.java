package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Main diagonal: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (i == j) {
					System.out.print(mat[i][j] + " ");
				}
			}
		}
		
		System.out.println();
		
		int negativeNumbers = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					negativeNumbers++;
				}
			}
		}
		System.out.print("Negative numbers = " + negativeNumbers);

		sc.close();
		
	}
}
