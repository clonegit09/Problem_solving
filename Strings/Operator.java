import java.util.Scanner;

public class Operator {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first and the Second number - ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.print(
			"Choose and Enter the type of operation you want to perform (+, -, *, /, %) - ");
		char op = sc.next().charAt(0);
		int ans = 0;
		if (op == '+') {
			ans = a + b;
		}
		else if (op == '-') {
			ans = a - b;
		}
		else if (op == '*') {
			ans = a * b;
		}
		else if (op == '%') {
			ans = a % b;
		}
		else if (op == '/') {
			ans = a / b;
		}
		System.out.println("Your answer is - " + ans);
        sc.close();
		
	}
}
