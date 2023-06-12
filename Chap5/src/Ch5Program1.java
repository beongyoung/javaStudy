/**
 * File name : Ch5Progarm1.java
 * This is program to find a maximun values that input 5 values
 * 
 * @author	Beongyoung Park
 * @version	v0.1
 * @since	2023-03-27
 */

import java.util.Scanner;

public class Ch5Program1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double doubleArray[] = new double[5];
		
		double max = doubleArray[0];
		System.out.println("Please input five real values: ");
		
		for(double i:doubleArray) {
			i = sc.nextDouble();
			if(i > max)
				max = i;
		}
		
		System.out.println("Maximun value is: " + max);
		sc.close();
	}
}