import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("inputrquareroot.txt"));
		int n = scanner.nextInt();
		PrintWriter writer = new PrintWriter(new File("outputsquare.txt"));
		writer.println(n * n);
		scanner.close();
		writer.close();
	}
}