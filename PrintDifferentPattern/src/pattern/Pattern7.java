package pattern;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < Math.pow(2,i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();

	}

}
