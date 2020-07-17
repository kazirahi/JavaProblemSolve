import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("inttriangle.txt"));
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		PrintWriter writer = new PrintWriter(new File("outtriangle.txt"));
		if (x == y && y == z) {
			writer.println("Equilateral triangle");
		} else if (x * x == y * y + z * z || y * y == x * x + z * z || z * z == x * x + y * y) {
			writer.println("Right angled triangle");
		} else if (x == y || y == z || x == z) {
			writer.println("Isosceles triangle");
		} else {
			writer.println("None");
		}
		scanner.close();
		writer.close();
	}

}
