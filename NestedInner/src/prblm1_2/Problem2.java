package prblm1_2;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		int tarnary= a>b ? (a>c ? a:c) : (b>c ? b:c);
		System.out.println(tarnary);
		scanner.close();

	}

}
