import java.util.Scanner;

public class CricketStamp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if (n%2==0) {
			n+=1;
		}
		for (int i = 0; i < n * 2; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || j == (n / 2) || j == (n - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
		scanner.close();
	}

}
