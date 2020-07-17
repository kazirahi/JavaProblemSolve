import java.util.Scanner;

public class FactorialValue {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int factorial = getFactorial(n);
		System.out.println(factorial);
		scanner.close();
	}

	private static int getFactorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * getFactorial(n - 1);
		}
	}

}
