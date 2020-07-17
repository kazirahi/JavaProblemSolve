import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		double root = Math.sqrt(n);
		boolean flug = true;
		for (int i = 2; i <= root; i++) {
			if (n % i == 0) {
				flug = false;
				break;
			}
		}
		if (flug == true) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
		scanner.close();
	}

}
