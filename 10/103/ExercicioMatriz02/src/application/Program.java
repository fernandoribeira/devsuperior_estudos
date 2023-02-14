package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		System.out.println();
		
		int[][] mat = new int[m][n];
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		
		int x = sc.nextInt();
		
		System.out.println();
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("X find in position: " + i + ", " + j);
					
					// Left
					if (j > 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}

					// Up
					if (i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
					
					// Right
					if (j < (n - 1)) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					
					// Down
					if (i < (m - 1)) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
					
					System.out.println();
				}
			}
		}

		sc.close();
		
	}
}

//for (int i = 0; i < mat.length; i++) {
//for (int j = 0; j < mat[i].length; j++) {
//	System.out.print(mat[i][j] + " ");
//}
//System.out.println();
//}