import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.util.Scanner;

public class Problem82 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("input.txt"));
		String inputString = "";
		String output = "";
		StringBuilder result = new StringBuilder(inputString.length());
		boolean capital = true;
		while (scanner.hasNextLine()) {
			String input = scanner.nextLine();

			inputString += input + "\n";
		}

		int i;

		for (i = 0; i < inputString.length(); i++) {

			if (inputString.charAt(i) == '.' || inputString.charAt(i) == ',' || inputString.charAt(i) == '!') {
				output += inputString.charAt(i) + " ";

			}

			else {
				output += inputString.charAt(i);
			}
		}
		
		System.out.println(output.split("\\."));
		for (int j = 0; j < output.length(); j++) {
			char c = output.charAt(j);
			if (c == '.') {
				capital = true;
			} else if (capital && Character.isAlphabetic(c)) {
				c = Character.toUpperCase(c);
				capital = false;
			}
			result.append(c);
		}
		/*int q=result.length();
		if (result.charAt(q-1) != '.') {
			result=result.insert(q-1, '.');
			System.out.println("Aahan");
		}*/
		
		System.out.println(result);
		

		scanner.close();

	}

}
