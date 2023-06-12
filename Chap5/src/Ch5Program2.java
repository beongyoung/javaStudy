/**
 * File name : Ch5Progarm2.java
 * This is program to find a minimum values that input 5 values
 * 
 * @author	Beongyoung Park
 * @version	v0.1
 * @since	2023-03-27
 */

import java.util.Scanner;
public class Ch5Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double userInput;
		double min = 9999;
		
		System.out.println("Please input five real values. ");
		for(int i = 0; i < 5; i++) {
			userInput = sc.nextDouble();
			min = userInput < min ? userInput:min;
		}
		System.out.println("Min values is: " + min);
		sc.close();
	}
}