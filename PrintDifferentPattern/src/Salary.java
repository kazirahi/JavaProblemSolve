import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float salary = scanner.nextInt();
		float finalsalary;
		if (salary < 10000) {
			finalsalary = (salary - (salary * 0.1f));
			System.out.println(finalsalary);
		} else if (salary < 20000) {
			finalsalary = (salary - (salary * 0.15f));
			System.out.println(finalsalary);
		} else if (salary >= 20000) {
			finalsalary = (salary - (salary * .2f));
			System.out.println(finalsalary);
		}

		scanner.close();
	}

}
