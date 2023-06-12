/**
 * File name : Ch5Progarm3.java
 * This is program to build function
 * getMin, getMax, getMean to main Function
 * 
 * @author	Beongyoung Park
 * @version	v0.1
 * @since	2023-03-27
 */

import java.util.Scanner;
public class Ch5Program3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int intArray[] = new int[5];
		
		System.out.println("Please input five numeric values. ");
		for(int i = 0; i < 5; i++) {
			intArray[i] = sc.nextInt();
		}
		
		System.out.println("Maximum value is: " + getMaximumValue(intArray));
		System.out.println("Minimun value is: " + getMinimumValue(intArray));
		System.out.println("# of elements: " + intArray.length);
		System.out.println("Mean of values: " + getMeanValue(intArray));
		sc.close();
	}
	
	private static int getMaximumValue(int[] array) {
		int max = 0;
		for(int i:array) {
			if(i > max)
				max = i;
		}
		return max;
	}

	private static int getMinimumValue(int[] array) {
		int min = 999999;
		for(int i:array) {
			if(i < min)
				min = i;
		}
		return min;
	}
	
	private static double getMeanValue(int[] array) {
		int sum = 0;
		double mean = 0.00;
		
		for(int i:array) sum += i;
		mean = sum / array.length;
		
		return mean;	
	}
	
	private static int[] checkUserInput(int[] array) {
		int[] userInput = array;
		return userInput;
	}
}