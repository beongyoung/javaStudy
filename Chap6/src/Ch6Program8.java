/**
 * Ch6Program8
 * Resolve ArrayIndexOutOfBoundsException
 * 
 * @author	Beongyoung Park
 * @version	v0.1
 * @since	2023-03-29
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ch6Program8 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter three integers: ");
		int sum = 0, n = 0;
		for (int i = 0; i < 3; i++) {
			System.out.print((i+1) + "th value >>");
			try {
				n = scanner.nextInt();
				
			} catch (InputMismatchException e) {
				
				System.out.println("Input value is not integer. Please try it again!");
				scanner.next();
				i--;
				continue;
			}
			sum += n;
		}
		
		System.out.println("Sum of input values: " + sum);
		scanner.close();
	}
	
}
