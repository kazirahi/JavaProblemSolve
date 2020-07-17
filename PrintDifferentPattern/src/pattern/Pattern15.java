package pattern;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter row size:");
		int n = scanner.nextInt();
		System.out.println("Enter coloumn size:");
		int x = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < x; j++) {
				if (i == 0 || i == n - 1 || j == 0 || j == x - 1) {
					System.out.print("0");
				} else {
					System.out.print("1");
				}

			}
			System.out.println();
		}
		scanner.close();

	}

}
