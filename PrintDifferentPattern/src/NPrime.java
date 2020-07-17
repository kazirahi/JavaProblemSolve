import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NPrime {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("inprime.txt"));
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		PrintWriter writer = new PrintWriter(new File("outprime.txt"));
		for (int p = x + 1; p < y; p++) {
			double root = Math.sqrt(p);
			boolean flug = true;
			for (int i = 2; i <= root; i++) {
				if (p % i == 0) {
					flug = false;
					break;
				}
			}
			if (flug == true) {
				writer.println(p);
			}
		}
		scanner.close();
		writer.close();
	}

}
