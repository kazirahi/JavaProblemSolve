import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class tictactoe {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner= new Scanner(new File("tictactoe.txt"));
		
		int [][] matrix = new int [3][3];
		for (int i=0; i<3;i++) {
			for (int j=0; j<3; j++) {
				matrix[i][j]=scanner.nextInt();
			}
		}
		for (int i=0; i<3;i++) {
			int flag = 0;
			boolean rowsFlag=true;
			boolean columnFlag=true;
			boolean diagonalFlag=true;
			boolean rdiagonalFlag=true;
			for (int j=0; j<3; j++) {
				if (matrix[i][j] != 1) {
					rowsFlag=false;
				}
				if (matrix[j][i] != 1) {
					columnFlag=false;
				}
				if ((i==j) && matrix[i][j] != 1 ) {
					diagonalFlag=false;
				}
				if (i+j==2 && matrix[i][j]!=1 ) {
					rdiagonalFlag=false;
				}
				
				
			}
			if (rowsFlag) {
				System.out.println("PLAYER 1 WIN");
				return;
			}
			if (columnFlag) {
				System.out.println("PLAYER 1 WIN");
				return;
			}
			if (diagonalFlag) {
				System.out.println("PLAYER 1 WIN");
				return;
			}
			if (rdiagonalFlag) {
				System.out.println("PLAYER 1 WIN");
				return;
			}
			
		}
	}
}
