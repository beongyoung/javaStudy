package assign2;
/**
 * The program Q9
 * This program > 정수나 실수를 입력받아 합 표현해주는 프로그램
 * 
 * @author Beongyoung Park
 * @version 1.0
 * @since 2023-04-15
 */

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) throws NumberFormatException {
	    Scanner sc = new Scanner(System.in);

	    System.out.println("Enter integer or double values (separated by spaces):");
	    String input = sc.nextLine();
	    sc.close();
	    
	    String[] values = input.split("\\s+");

	    int intSum = 0;
	    double doubleSum = 0.0;

	    for (String value : values) {
	        try {
	            int intValue = Integer.parseInt(value);
	            intSum += intValue;
	        } catch (NumberFormatException e) {
	            try {
	                double doubleValue = Double.parseDouble(value);
	                doubleSum += doubleValue;
	            } catch (NumberFormatException ex) {
	                System.out.println("Invalid input: " + value);
	            }
	        }
	    }

	    if (doubleSum == 0.0) {
	        if (values.length == 2) {
	            int firstNum = Integer.parseInt(values[0]);
	            int secondNum = Integer.parseInt(values[1]);
	            System.out.println(getSum(firstNum, secondNum));
	        } else if (values.length == 3) {
	            int firstNum = Integer.parseInt(values[0]);
	            int secondNum = Integer.parseInt(values[1]);
	            int thirdNum = Integer.parseInt(values[2]);
	            System.out.println(getSum(firstNum, secondNum, thirdNum));
	        } else {
	            int[] numbers = new int[values.length];
	            for (int i = 0; i < values.length; i++) {
	                numbers[i] = Integer.parseInt(values[i]);
	            }
	            System.out.println(getSum(numbers));
	        }
	    } else {
	        double[] numbers = new double[values.length];
	        for (int i = 0; i < values.length; i++) {
	            numbers[i] = Double.parseDouble(values[i]);
	        }
	        System.out.println(getSum(numbers));
	    }
	}

	// Overloaded method to calculate sum of two integers
	public static int getSum(int firstNum, int secondNum) {
		return firstNum + secondNum;
	}

	// Overloaded method to calculate sum of three integers
	public static int getSum(int firstNum, int secondNum, int thirdNum) {
		return firstNum + secondNum + thirdNum;
	}

	// Overloaded method to calculate sum of an array of integers
	public static int getSum(int[] numbers) {
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		return sum;
	}

	// Overloaded method to calculate sum of an array of doubles
	public static double getSum(double[] numbers) {
		double sum = 0.0;
		for (double num : numbers) {
			sum += num;
		}
		return sum;
	}
}