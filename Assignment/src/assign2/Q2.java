package assign2;
/**
 * The Q2 program
 * This program > 10개의 정수를 입력받아 최대값과 평균을 출력하는 CUI 프로그램 
 * 
 * @author Beongyoung Park
 * @version 1.0
 * @since 2023-04-15
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        
        System.out.println("Please enter 10 integers:");
        for (int i = 0; i < numbers.length; i++) {
            while (true) {
                try {
                    System.out.print((i+1) + "th value >> ");
                    numbers[i] = sc.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Input value is not Integer. Please try it again!");
                    sc.nextLine();
                }
            }
            sum += numbers[i];
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        sc.close();
        
        double average = (double) sum / numbers.length;
        System.out.println("Maximum value: " + max);
        System.out.println("Average value: " + average);
    }
}