package pattern;

import java.util.Scanner;

public class Pattern25 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter row size:");
		int n = scanner.nextInt();
		System.out.println("Enter coloumn size:");
		int x = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < x; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();

	}

}
