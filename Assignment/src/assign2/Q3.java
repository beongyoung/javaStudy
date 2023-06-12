package assign2;
/**
 * The program Q3
 * This program > 연산자 우선순위가 없는 연산식 (왼쪽 -> 오른쪽의 순서만 존재)
 * 
 * @author Beongyoung Park
 * @version 1.0
 * @since 2023-04-15
 */

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a formula: ");
		String formula = scanner.nextLine();
		scanner.close();

		calculateFormula(formula);
	}

	public static void calculateFormula(String formula) {
		String[] tokens = formula.split(" ");
		double result = Double.parseDouble(tokens[0]);

		System.out.println();
		for (int i = 1; i < tokens.length; i += 2) {
			char operator = tokens[i].charAt(0);
			double operand = Double.parseDouble(tokens[i + 1]);
			
			System.out.print("Step " + (i / 2 + 1) + ": " + 
							result + operator + operand + " = ");
			
			switch (operator) {
			case '+':
				result += operand;
				break;
			case '-':
				result -= operand;
				break;
			case '*':
				result *= operand;
				break;
			case '/':
				result /= operand;
				break;
			}

			System.out.println(result);
		}
		System.out.println("\nThe result of the formula is " + result + ".");
		System.out.println("\nThe actual result of the compiler operation in Java is " + tokens.length/2 + ".");
	}
}