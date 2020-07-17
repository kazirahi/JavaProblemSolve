import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args)throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("inhello.txt"));
		int n = scanner.nextInt();
		PrintWriter writer = new PrintWriter(new File("outhello.txt"));
		for(int i=1; i<=n; i++) {
			writer.println("Hello World");
		}
scanner.close();
writer.close();
	}

}
