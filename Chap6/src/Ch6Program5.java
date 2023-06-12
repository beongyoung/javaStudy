/**
 * Ch6Program5
 * Resolve ArithmeticException
 * 
 * @author	Beongyoung Park
 * @version	v0.1
 * @since	2023-03-29
 */

import java.util.Scanner;

public class Ch6Program5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int dividend;
		int divisor;

		System.out.print("Dividend:");
		dividend = scanner.nextInt();
		
		System.out.print("Divisor:");
		divisor = scanner.nextInt();
		
		System.out.println(dividend + "/" + divisor + " =  " + dividend / divisor);
		scanner.close();

	}

}
