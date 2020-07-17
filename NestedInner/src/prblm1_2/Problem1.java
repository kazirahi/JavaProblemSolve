package prblm1_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("in1.txt"));
		int dimension = scanner.nextInt();
		int[][] matrix = new int[dimension][dimension];
		int p=0;
		int check[] = new int[100];
		for (int i = 0; i < dimension; i++) {
			for (int j = 0; j < dimension; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		for (int i = 0; i < dimension; i++) {
			System.out.print((char) (65 + i));
			System.out.print("-->");
			
			for (int j = 0; j < dimension; j++) {
				
				if (matrix[i][j] == 1) {
					check[p] = 65 + j;
					p++;
					check[p] = 44;
					p++;

				}
				
			}
				for (int k = 0; k < p-1; k++) {
					System.out.print( (char) (check[k]));
				}
				p = 0;
			
			
			System.out.println("");
		}

		scanner.close();
	}

}
